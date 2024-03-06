package cpxml;

import cpxml.data.generated.CDClientContainer;
import cpxml.data.generated.CDParttypeContainer;
import cpxml.data.generated.CDSprotypeContainer;
import cpxml.data.generated.CDTexttypeContainer;
import cpxml.data.generated.CSpecimenContainer;
import cpxml.data.generated.PPartContainer;
import cpxml.data.generated.PSpecialProcContainer;
import cpxml.data.generated.RMedrecContainer;
import cpxml.data.generated.RPatDemographContainer;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author ghsmith
 */
public class XmlUtil {

    static Map<String, CDClientContainer.DboCDClient> cDClientMap = new HashMap<>();
    static Map<String, CDSprotypeContainer.DboCDSprotype> cDSprotypeMap = new HashMap<>();
    static Map<String, CDTexttypeContainer.DboCDTexttype> cDTexttypeMap = new HashMap<>();
    static Map<String, CSpecimenContainer.DboCSpecimen> cSpecimenMap = new HashMap<>();
    static Map<String, PSpecialProcContainer.DboPSpecialProc> pSpecialProcMap = new HashMap<>();
    static Map<String, RPatDemographContainer.DboRPatDemograph> rPatDemographMap = new HashMap<>();
    static Map<String, List<RMedrecContainer.DboRMedrec>> rMedrecMap = new HashMap<>();
    static Map<String, CDParttypeContainer.DboCDParttype> cDParttypeMap = new HashMap<>();
    static Map<String, List<PPartContainer.DboPPart>> pPartMap = new HashMap<>();
    
    public static void main(String[] args) throws Exception {

        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        CDClientContainer cDClientContainer = (CDClientContainer)loadFromXml(CDClientContainer.class, "c_d_client");
        for(CDClientContainer.DboCDClient e : cDClientContainer.getDboCDClient()) { cDClientMap.put(e.getId(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        CDSprotypeContainer cDSprotypeContainer = (CDSprotypeContainer)loadFromXml(CDSprotypeContainer.class, "c_d_sprotype");
        for(CDSprotypeContainer.DboCDSprotype e : cDSprotypeContainer.getDboCDSprotype()) { cDSprotypeMap.put(e.getId(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        CDTexttypeContainer cDTexttypeContainer = (CDTexttypeContainer)loadFromXml(CDTexttypeContainer.class, "c_d_texttype");
        for(CDTexttypeContainer.DboCDTexttype e : cDTexttypeContainer.getDboCDTexttype()) { cDTexttypeMap.put(e.getId(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        CSpecimenContainer cSpecimenContainer = (CSpecimenContainer)loadFromXml(CSpecimenContainer.class, "c_specimen");
        for(CSpecimenContainer.DboCSpecimen e : cSpecimenContainer.getDboCSpecimen()) { cSpecimenMap.put(e.getSpecimenId(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        PSpecialProcContainer pSpecialProcContainer = (PSpecialProcContainer)loadFromXml(PSpecialProcContainer.class, "p_special_proc");
        for(PSpecialProcContainer.DboPSpecialProc e : pSpecialProcContainer.getDboPSpecialProc()) { pSpecialProcMap.put(e.getSpecimenId() + "|" + e.getSpInst(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        RPatDemographContainer rPatDemographContainer = (RPatDemographContainer)loadFromXml(RPatDemographContainer.class, "r_pat_demograph");
        for(RPatDemographContainer.DboRPatDemograph e : rPatDemographContainer.getDboRPatDemograph()) { rPatDemographMap.put(e.getPatdemogId(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        RMedrecContainer rMedrecContainer = (RMedrecContainer)loadFromXml(RMedrecContainer.class, "r_medrec");
        for(RMedrecContainer.DboRMedrec e : rMedrecContainer.getDboRMedrec()) {
            List rMedrecList = rMedrecMap.get(e.getPatdemogId());
            if(rMedrecList == null) {
                rMedrecList = new ArrayList<RMedrecContainer.DboRMedrec>();
                rMedrecMap.put(e.getPatdemogId(), rMedrecList);
            }
            rMedrecList.add(e);
        }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        CDParttypeContainer cDParttypeContainer = (CDParttypeContainer)loadFromXml(CDParttypeContainer.class, "c_d_parttype");
        for(CDParttypeContainer.DboCDParttype e : cDParttypeContainer.getDboCDParttype()) { cDParttypeMap.put(e.getId(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        PPartContainer pPartContainer = (PPartContainer)loadFromXml(PPartContainer.class, "p_part");
        for(PPartContainer.DboPPart e : pPartContainer.getDboPPart()) {
            List pPartList = pPartMap.get(e.getSpecimenId());
            if(pPartList == null) {
                pPartList = new ArrayList<PPartContainer.DboPPart>();
                pPartMap.put(e.getSpecimenId(), pPartList);
            }
            pPartList.add(e);
            pPartList.sort(new Comparator<PPartContainer.DboPPart>() {
                @Override
                public int compare(PPartContainer.DboPPart o1, PPartContainer.DboPPart o2) {
                    return Integer.valueOf(o1.getPartInst()).compareTo(Integer.valueOf(o2.getPartInst()));
                }
            });
        }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        List<InputStream> streams = Arrays.asList(
            new ByteArrayInputStream("<?xml version='1.1' encoding='UTF-8'?><c_spec_text_container>".getBytes()),
            new XmlFileInputStream("c_spec_text.xml"),
            new ByteArrayInputStream("</c_spec_text_container>".getBytes())
        );
        
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        SAXParser saxParser = spf.newSAXParser();
        XMLReader xmlReader = saxParser.getXMLReader();
        xmlReader.setContentHandler(new SAXHandler());
        xmlReader.parse(new InputSource(new SequenceInputStream(Collections.enumeration(streams))));
        
    }
    
    public static Object loadFromXml(Class c, String elementName) throws JAXBException, FileNotFoundException {
        JAXBContext jc = JAXBContext.newInstance(new Class[] { c });
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        List<InputStream> streams = Arrays.asList(
            new ByteArrayInputStream(String.format("<?xml version='1.1' encoding='UTF-8'?><%s_container>", elementName).getBytes()),
            new XmlFileInputStream(String.format("%s.xml", elementName)),
            new ByteArrayInputStream(String.format("</%s_container>", elementName).getBytes())
        );
        return unmarshaller.unmarshal(new SequenceInputStream(Collections.enumeration(streams)));
    }
    
    public static class SAXHandler extends DefaultHandler {

        @Override
        public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {

            if (localName.endsWith("_container")) { return; }

            if(atts.getValue("text_data") == null && atts.getValue("text_data_long") == null) {
                return;
            }
            
            CSpecimenContainer.DboCSpecimen specimen = cSpecimenMap.get(atts.getValue("specimen_id"));
//if(specimen == null) { return; }
            PSpecialProcContainer.DboPSpecialProc specialProc = null;
            if(atts.getValue("link_inst") != null) {
                specialProc = pSpecialProcMap.get(atts.getValue("specimen_id") + "|" + atts.getValue("link_inst"));
            }
            CDTexttypeContainer.DboCDTexttype texttype = cDTexttypeMap.get(atts.getValue("texttype_id"));
            RPatDemographContainer.DboRPatDemograph patdemog = rPatDemographMap.get(specimen.getPatdemogId());
//if(patdemog == null) { return; }
            List<RMedrecContainer.DboRMedrec> medrecList = rMedrecMap.get(specimen.getPatdemogId());
//if(medrecList == null) { return; }
            StringBuffer mrns = new StringBuffer();
            if(medrecList != null) {
                for(RMedrecContainer.DboRMedrec e : medrecList) {
                    if(mrns.length() > 0) { mrns.append("; "); }
                    mrns.append("[");
                    mrns.append(cDClientMap.get(e.getClientId()).getName());
                    mrns.append("] ");
                    mrns.append(e.getMedrecNumStripped());
                }
            }
            
            System.out.print(String.format("%s|%s|%s|%s|%s|%s|%s|%s|%s|%s",
                atts.getValue("specimen_id"),
                atts.getValue("text_inst"),
                cDClientMap.get(specimen.getClientId()).getName(),
                specimen.getSpecnumFormatted(),
                patdemog.getLastname(),
                patdemog.getUniversalMednumStripped(),
                mrns,
                specialProc == null ? "Main Case" : cDSprotypeMap.get(specialProc.getSprotypeId()).getName(),
                specialProc == null ? specimen.getSignoutDate() : specialProc.getSignoutDate(),
                texttype != null ? texttype.getName() : atts.getValue("texttype_id")
            ));

            System.out.print("|");
            String plainText = atts.getValue("text_data");
            if(plainText == null || plainText.startsWith("{")) {
                try {
                    RTFEditorKit rtfParser = new RTFEditorKit();
                    Document document = rtfParser.createDefaultDocument();
                    rtfParser.read(new ByteArrayInputStream(atts.getValue("text_data_long").getBytes()), document, 0);
                    plainText = document.getText(0, document.getLength());
                }
                catch(Exception e1) {
                    try {
                        RTFEditorKit rtfParser = new RTFEditorKit();
                        Document document = rtfParser.createDefaultDocument();
                        rtfParser.read(new ByteArrayInputStream(atts.getValue("text_data").getBytes()), document, 0);
                        plainText = document.getText(0, document.getLength());
                    }
                    catch(Exception e2) {
                        if(atts.getValue("text_data") == null && atts.getValue("text_data_long") == null) {
                            plainText = "*** NULL ***";
                        }
                        else {
                            plainText = "*** RTF-to-TXT conversion error ***";
                        }
                    }
                }
            }
            System.out.print(plainText.replace("|", "_").replace("\r\n", "<br/>").replace("\n", "<br/>"));

            List<PPartContainer.DboPPart> partList = pPartMap.get(atts.getValue("specimen_id"));
            if(partList != null) {
                for(PPartContainer.DboPPart part : partList) {
                    System.out.print(String.format("|%s|%s|%s",
                        part.getPartDesignator(),
                        cDParttypeMap.get(part.getParttypeId()).getName(),
                        part.getPartDescription().replace("|", "_").replace("\r\n", "<br/>").replace("\n", "<br/>")
                    ));
                }
            }
            
            System.out.println("|");

        }

    }

}
