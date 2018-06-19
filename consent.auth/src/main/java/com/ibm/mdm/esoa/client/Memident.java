
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for memident complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memident">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}baseRecordAttribute">
 *       &lt;sequence>
 *         &lt;element name="idExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSrcRecno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memident", propOrder = {
    "idExpDate",
    "idIssuer",
    "idNumber",
    "idSrcRecno"
})
public class Memident
    extends BaseRecordAttribute
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar idExpDate;
    protected String idIssuer;
    protected String idNumber;
    protected Integer idSrcRecno;

    /**
     * Gets the value of the idExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdExpDate() {
        return idExpDate;
    }

    /**
     * Sets the value of the idExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdExpDate(XMLGregorianCalendar value) {
        this.idExpDate = value;
    }

    /**
     * Gets the value of the idIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdIssuer() {
        return idIssuer;
    }

    /**
     * Sets the value of the idIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdIssuer(String value) {
        this.idIssuer = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the idSrcRecno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSrcRecno() {
        return idSrcRecno;
    }

    /**
     * Sets the value of the idSrcRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSrcRecno(Integer value) {
        this.idSrcRecno = value;
    }

}
