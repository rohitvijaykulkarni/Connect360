
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memIdnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordId", propOrder = {
    "memIdnum",
    "srcCode"
})
@XmlSeeAlso({
    ClientId.class,
    ProviderId.class
})
public abstract class RecordId {

    protected String memIdnum;
    protected String srcCode;

    /**
     * Gets the value of the memIdnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemIdnum() {
        return memIdnum;
    }

    /**
     * Sets the value of the memIdnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemIdnum(String value) {
        this.memIdnum = value;
    }

    /**
     * Gets the value of the srcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcCode() {
        return srcCode;
    }

    /**
     * Sets the value of the srcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcCode(String value) {
        this.srcCode = value;
    }

}
