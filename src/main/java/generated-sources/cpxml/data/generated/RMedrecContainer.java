//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.08 at 06:54:01 PM EST 
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
 *         &lt;element name="dbo.r_medrec" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="patdemog_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="medrec_inst" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="medrec_num_stripped" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "dboRMedrec"
})
@XmlRootElement(name = "r_medrec_container")
public class RMedrecContainer
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "dbo.r_medrec", required = true)
    protected List<RMedrecContainer.DboRMedrec> dboRMedrec;

    /**
     * Gets the value of the dboRMedrec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dboRMedrec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDboRMedrec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RMedrecContainer.DboRMedrec }
     * 
     * 
     */
    public List<RMedrecContainer.DboRMedrec> getDboRMedrec() {
        if (dboRMedrec == null) {
            dboRMedrec = new ArrayList<RMedrecContainer.DboRMedrec>();
        }
        return this.dboRMedrec;
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
     *       &lt;attribute name="patdemog_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="medrec_inst" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="medrec_num_stripped" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    public static class DboRMedrec
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlAttribute(name = "patdemog_id")
        protected String patdemogId;
        @XmlAttribute(name = "medrec_inst")
        protected String medrecInst;
        @XmlAttribute(name = "medrec_num_stripped")
        protected String medrecNumStripped;
        @XmlAttribute(name = "client_id")
        protected String clientId;

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
         * Gets the value of the medrecInst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMedrecInst() {
            return medrecInst;
        }

        /**
         * Sets the value of the medrecInst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMedrecInst(String value) {
            this.medrecInst = value;
        }

        /**
         * Gets the value of the medrecNumStripped property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMedrecNumStripped() {
            return medrecNumStripped;
        }

        /**
         * Sets the value of the medrecNumStripped property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMedrecNumStripped(String value) {
            this.medrecNumStripped = value;
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
