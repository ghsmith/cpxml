//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.06 at 02:40:26 PM EST 
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
 *         &lt;element name="dbo.c_specimen" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="specimen_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="specnum_formatted" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="specstatus_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="accession_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="signout_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="patdemog_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="client_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "dboCSpecimen"
})
@XmlRootElement(name = "c_specimen_container")
public class CSpecimenContainer
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "dbo.c_specimen", required = true)
    protected List<CSpecimenContainer.DboCSpecimen> dboCSpecimen;

    /**
     * Gets the value of the dboCSpecimen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dboCSpecimen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDboCSpecimen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CSpecimenContainer.DboCSpecimen }
     * 
     * 
     */
    public List<CSpecimenContainer.DboCSpecimen> getDboCSpecimen() {
        if (dboCSpecimen == null) {
            dboCSpecimen = new ArrayList<CSpecimenContainer.DboCSpecimen>();
        }
        return this.dboCSpecimen;
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
     *       &lt;attribute name="specnum_formatted" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="specstatus_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="accession_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="signout_date" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="patdemog_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="client_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DboCSpecimen
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "specimen_id")
        protected String specimenId;
        @XmlAttribute(name = "specnum_formatted")
        protected String specnumFormatted;
        @XmlAttribute(name = "specstatus_id")
        protected String specstatusId;
        @XmlAttribute(name = "accession_date")
        protected String accessionDate;
        @XmlAttribute(name = "signout_date")
        protected String signoutDate;
        @XmlAttribute(name = "patdemog_id")
        protected String patdemogId;
        @XmlAttribute(name = "client_id")
        protected String clientId;

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
         * Gets the value of the specnumFormatted property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecnumFormatted() {
            return specnumFormatted;
        }

        /**
         * Sets the value of the specnumFormatted property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecnumFormatted(String value) {
            this.specnumFormatted = value;
        }

        /**
         * Gets the value of the specstatusId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecstatusId() {
            return specstatusId;
        }

        /**
         * Sets the value of the specstatusId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecstatusId(String value) {
            this.specstatusId = value;
        }

        /**
         * Gets the value of the accessionDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccessionDate() {
            return accessionDate;
        }

        /**
         * Sets the value of the accessionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccessionDate(String value) {
            this.accessionDate = value;
        }

        /**
         * Gets the value of the signoutDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignoutDate() {
            return signoutDate;
        }

        /**
         * Sets the value of the signoutDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignoutDate(String value) {
            this.signoutDate = value;
        }

        /**
         * Gets the value of the patdemogId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPatdemogId() {
            return patdemogId;
        }

        /**
         * Sets the value of the patdemogId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPatdemogId(String value) {
            this.patdemogId = value;
        }

        /**
         * Gets the value of the clientId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClientId() {
            return clientId;
        }

        /**
         * Sets the value of the clientId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClientId(String value) {
            this.clientId = value;
        }

    }

}