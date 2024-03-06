package cpxml;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ghsmith
 */
public class XmlFileInputStream extends FileInputStream {

    String name = null;
    boolean showStatus = true;
    long offsetInFile = 0;
    long offsetInXml = 0;
    int elementClosures = 0;
    boolean truncating = false;
    
    public XmlFileInputStream(String filepath) throws FileNotFoundException {
        super(filepath);
        name = filepath;
    }

    public XmlFileInputStream(File file) throws FileNotFoundException {
        super(file);
    }

    public XmlFileInputStream(FileDescriptor filedescriptor) {
        super(filedescriptor);
    }

    @Override
    public int read(byte[] b) throws IOException {
        return this.read(b, 0, b.length);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        byte[] bPreSuper = new byte[b.length];
        int lenSuper = 0;
        int lenReturn;
        if(truncating) {
            lenReturn = -1;
        }
        else {
            System.arraycopy(b, 0, bPreSuper, 0, b.length);
            lenSuper = super.read(b, off, len);
            lenReturn = lenSuper;
        }
        if(lenReturn != -1) {
            int idxPreSuper = off;
            offsetInFile += lenSuper;
            for(int idx = off; idx < off + lenSuper; idx++) {
                if(b[idx] != '\n' && b[idx] != '\r' && !truncating) {
                    bPreSuper[idxPreSuper] = ((b[idx] & (byte)0x80) == 0 && b[idx] != (byte)0x15  && b[idx] != (byte)0x7f ? b[idx] : (byte)'_');
                    offsetInXml++;
                    idxPreSuper++;
                    if(b[idx] == (byte)'>') {
                        elementClosures++;
                        if(elementClosures % 100000 == 0) { showStatus = true; }
//if(elementClosures > 500000) { truncating = true; }
                    }
                }
                else {
                    lenReturn--;
                }
            }
            System.arraycopy(bPreSuper, 0, b, 0, bPreSuper.length);
        }
        if(showStatus || lenReturn == -1) {
            System.err.println(String.format("%30s: XML-closures=%,15d XML-bytes=%,15d file-bytes=%,15d", name, elementClosures, offsetInXml, offsetInFile));
            showStatus = false;
        }
        return lenReturn;
    }

    @Override
    public int read() throws IOException {
        throw new RuntimeException("not implemented");
        //int c;
        //do {
        //    c = super.read();
        //} while(c != -1 && (c == '\n' || c == '\r'));
        //return ((c & (byte)0x80) == 0 && c != (byte)0x15 && c != (byte)0x7f ? c : (byte)'_');
    }    

}