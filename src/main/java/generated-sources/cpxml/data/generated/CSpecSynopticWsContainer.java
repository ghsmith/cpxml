//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.08 at 06:54:06 PM EST 
//


package cpxml.data.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dbo.c_spec_synoptic_ws" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="specimen_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ws_inst" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="worksheet_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="sp_inst" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dboCSpecSynopticWs"
})
@XmlRootElement(name = "c_spec_synoptic_ws_container")
public class CSpecSynopticWsContainer
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "dbo.c_spec_synoptic_ws", required = true)
    protected List<CSpecSynopticWsContainer.DboCSpecSynopticWs> dboCSpecSynopticWs;

    /**
     * Gets the value of the dboCSpecSynopticWs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dboCSpecSynopticWs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDboCSpecSynopticWs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSpecSynopticWsContainer.DboCSpecSynopticWs }
     * 
     * 
     */
    public List<CSpecSynopticWsContainer.DboCSpecSynopticWs> getDboCSpecSynopticWs() {
        if (dboCSpecSynopticWs == null) {
            dboCSpecSynopticWs = new ArrayList<CSpecSynopticWsContainer.DboCSpecSynopticWs>();
        }
        return this.dboCSpecSynopticWs;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="specimen_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ws_inst" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="worksheet_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="sp_inst" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DboCSpecSynopticWs
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "specimen_id")
        protected String specimenId;
        @XmlAttribute(name = "ws_inst")
        protected String wsInst;
        @XmlAttribute(name = "worksheet_id")
        protected String worksheetId;
        @XmlAttribute(name = "sp_inst")
        protected String spInst;

        /**
         * Gets the value of the specimenId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecimenId() {
            return specimenId;
        }

        /**
         * Sets the value of the specimenId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecimenId(String value) {
            this.specimenId = value;
        }

        /**
         * Gets the value of the wsInst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWsInst() {
            return wsInst;
        }

        /**
         * Sets the value of the wsInst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWsInst(String value) {
            this.wsInst = value;
        }

        /**
         * Gets the value of the worksheetId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorksheetId() {
            return worksheetId;
        }

        /**
         * Sets the value of the worksheetId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWorksheetId(String value) {
            this.worksheetId = value;
        }

        /**
         * Gets the value of the spInst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpInst() {
            return spInst;
        }

        /**
         * Sets the value of the spInst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpInst(String value) {
            this.spInst = value;
        }

    }

}