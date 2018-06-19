
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memprovphn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memprovphn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}baseRecordAttribute">
 *       &lt;sequence>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumberDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneTollFreeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memprovphn", propOrder = {
    "phoneNumber",
    "phoneNumberDescription",
    "phoneNumberType",
    "phoneTollFreeIndicator"
})
public class Memprovphn
    extends BaseRecordAttribute
{

    protected String phoneNumber;
    protected String phoneNumberDescription;
    protected String phoneNumberType;
    protected String phoneTollFreeIndicator;

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the phoneNumberDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberDescription() {
        return phoneNumberDescription;
    }

    /**
     * Sets the value of the phoneNumberDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberDescription(String value) {
        this.phoneNumberDescription = value;
    }

    /**
     * Gets the value of the phoneNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    /**
     * Sets the value of the phoneNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumberType(String value) {
        this.phoneNumberType = value;
    }

    /**
     * Gets the value of the phoneTollFreeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneTollFreeIndicator() {
        return phoneTollFreeIndicator;
    }

    /**
     * Sets the value of the phoneTollFreeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneTollFreeIndicator(String value) {
        this.phoneTollFreeIndicator = value;
    }

}
