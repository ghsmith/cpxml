package cpxml;

import cpxml.data.generated.CDClientContainer;
import cpxml.data.generated.CDParttypeContainer;
import cpxml.data.generated.CDSprotypeContainer;
import cpxml.data.generated.CDSynopticCategoryContainer;
import cpxml.data.generated.CDSynopticValueContainer;
import cpxml.data.generated.CDSynopticWsContainer;
import cpxml.data.generated.CDTexttypeContainer;
import cpxml.data.generated.CSpecSynopticDxContainer;
import cpxml.data.generated.CSpecSynopticWsContainer;
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
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author ghsmith
 */
public class CasePartSynoptic {

    static Map<String, CDClientContainer.DboCDClient> cDClientMap = new HashMap<>();
    static Map<String, CDSprotypeContainer.DboCDSprotype> cDSprotypeMap = new HashMap<>();
    static Map<String, CDTexttypeContainer.DboCDTexttype> cDTexttypeMap = new HashMap<>();
    static Map<String, CSpecimenContainer.DboCSpecimen> cSpecimenMap = new HashMap<>();
    static Map<String, PSpecialProcContainer.DboPSpecialProc> pSpecialProcMap = new HashMap<>();
    static Map<String, RPatDemographContainer.DboRPatDemograph> rPatDemographMap = new HashMap<>();
    static Map<String, List<RMedrecContainer.DboRMedrec>> rMedrecMap = new HashMap<>();
    static Map<String, CDParttypeContainer.DboCDParttype> cDParttypeMap = new HashMap<>();
    static Map<String, List<PPartContainer.DboPPart>> pPartMap = new HashMap<>();

    static Map<String, CDSynopticCategoryContainer.DboCDSynopticCategory> cDSynopticCategoryMap = new HashMap<>();
    static Map<String, CDSynopticValueContainer.DboCDSynopticValue> cDSynopticValueMap = new HashMap<>();
    static Map<String, CDSynopticWsContainer.DboCDSynopticWs> cDSynopticWsMap = new HashMap<>();
    static Map<String, CSpecSynopticDxContainer.DboCSpecSynopticDx> cSpecSynopticDxMap = new HashMap<>();
    static Map<String, CSpecSynopticWsContainer.DboCSpecSynopticWs> cSpecSynopticWsMap = new HashMap<>();
    
    public static void main(String[] args) throws Exception {

        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        /*CDClientContainer cDClientContainer = (CDClientContainer)loadFromXml(CDClientContainer.class, "c_d_client");
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
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));*/

        CDSynopticCategoryContainer cDSynopticCategoryContainer = (CDSynopticCategoryContainer)loadFromXml(CDSynopticCategoryContainer.class, "c_d_synoptic_category");
        for(CDSynopticCategoryContainer.DboCDSynopticCategory e : cDSynopticCategoryContainer.getDboCDSynopticCategory()) { cDSynopticCategoryMap.put(e.getId(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));
        
        CDSynopticValueContainer cDSynopticValueContainer = (CDSynopticValueContainer)loadFromXml(CDSynopticValueContainer.class, "c_d_synoptic_value");
        for(CDSynopticValueContainer.DboCDSynopticValue e : cDSynopticValueContainer.getDboCDSynopticValue()) { cDSynopticValueMap.put(e.getId(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        CDSynopticWsContainer cDSynopticWsContainer = (CDSynopticWsContainer)loadFromXml(CDSynopticWsContainer.class, "c_d_synoptic_ws");
        for(CDSynopticWsContainer.DboCDSynopticWs e : cDSynopticWsContainer.getDboCDSynopticWs()) { cDSynopticWsMap.put(e.getId(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        CSpecSynopticDxContainer cSpecSynopticDxContainer = (CSpecSynopticDxContainer)loadFromXml(CSpecSynopticDxContainer.class, "c_spec_synoptic_dx");
        for(CSpecSynopticDxContainer.DboCSpecSynopticDx e : cSpecSynopticDxContainer.getDboCSpecSynopticDx()) { cSpecSynopticDxMap.put(e.getSpecimenId(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));

        CSpecSynopticWsContainer cSpecSynopticWsContainer = (CSpecSynopticWsContainer)loadFromXml(CSpecSynopticWsContainer.class, "c_spec_synoptic_ws");
        for(CSpecSynopticWsContainer.DboCSpecSynopticWs e : cSpecSynopticWsContainer.getDboCSpecSynopticWs()) { cSpecSynopticWsMap.put(e.getSpecimenId(), e); }
        System.err.println(String.format("Java heap available [bytes] = %,15d", Runtime.getRuntime().freeMemory()));
        
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

}
