
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memphone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memphone">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}baseRecordAttribute">
 *       &lt;sequence>
 *         &lt;element name="phArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phCmnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phExtn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phIcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memphone", propOrder = {
    "phArea",
    "phCmnt",
    "phExtn",
    "phIcc",
    "phNumber"
})
public class Memphone
    extends BaseRecordAttribute
{

    protected String phArea;
    protected String phCmnt;
    protected String phExtn;
    protected String phIcc;
    protected String phNumber;

    /**
     * Gets the value of the phArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhArea() {
        return phArea;
    }

    /**
     * Sets the value of the phArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhArea(String value) {
        this.phArea = value;
    }

    /**
     * Gets the value of the phCmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhCmnt() {
        return phCmnt;
    }

    /**
     * Sets the value of the phCmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhCmnt(String value) {
        this.phCmnt = value;
    }

    /**
     * Gets the value of the phExtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhExtn() {
        return phExtn;
    }

    /**
     * Sets the value of the phExtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhExtn(String value) {
        this.phExtn = value;
    }

    /**
     * Gets the value of the phIcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhIcc() {
        return phIcc;
    }

    /**
     * Sets the value of the phIcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhIcc(String value) {
        this.phIcc = value;
    }

    /**
     * Gets the value of the phNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhNumber() {
        return phNumber;
    }

    /**
     * Sets the value of the phNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhNumber(String value) {
        this.phNumber = value;
    }

}
