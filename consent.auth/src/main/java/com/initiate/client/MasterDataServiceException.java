
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MasterDataServiceException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterDataServiceException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smtErrCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usrErrCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterDataServiceException", propOrder = {
    "errCode",
    "errText",
    "smtErrCode",
    "usrErrCode"
})
public class MasterDataServiceException {

    @XmlElement(required = true, nillable = true)
    protected String errCode;
    @XmlElement(required = true, nillable = true)
    protected String errText;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer smtErrCode;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer usrErrCode;

    /**
     * Gets the value of the errCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrCode(String value) {
        this.errCode = value;
    }

    /**
     * Gets the value of the errText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrText() {
        return errText;
    }

    /**
     * Sets the value of the errText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrText(String value) {
        this.errText = value;
    }

    /**
     * Gets the value of the smtErrCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSmtErrCode() {
        return smtErrCode;
    }

    /**
     * Sets the value of the smtErrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSmtErrCode(Integer value) {
        this.smtErrCode = value;
    }

    /**
     * Gets the value of the usrErrCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsrErrCode() {
        return usrErrCode;
    }

    /**
     * Sets the value of the usrErrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsrErrCode(Integer value) {
        this.usrErrCode = value;
    }

}
