
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mememcntct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mememcntct">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}baseRecordAttribute">
 *       &lt;sequence>
 *         &lt;element name="emergecnyContactPhoneNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyContactExtentionPhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyContactExtentionPhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyContactPhoneNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyContactRelationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mememcntct", propOrder = {
    "emergecnyContactPhoneNumber2",
    "emergencyContactExtentionPhone1",
    "emergencyContactExtentionPhone2",
    "emergencyContactPhoneNumber1",
    "emergencyContactRelationship",
    "firstName",
    "lastName"
})
public class Mememcntct
    extends BaseRecordAttribute
{

    protected String emergecnyContactPhoneNumber2;
    protected String emergencyContactExtentionPhone1;
    protected String emergencyContactExtentionPhone2;
    protected String emergencyContactPhoneNumber1;
    protected String emergencyContactRelationship;
    protected String firstName;
    protected String lastName;

    /**
     * Gets the value of the emergecnyContactPhoneNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergecnyContactPhoneNumber2() {
        return emergecnyContactPhoneNumber2;
    }

    /**
     * Sets the value of the emergecnyContactPhoneNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergecnyContactPhoneNumber2(String value) {
        this.emergecnyContactPhoneNumber2 = value;
    }

    /**
     * Gets the value of the emergencyContactExtentionPhone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactExtentionPhone1() {
        return emergencyContactExtentionPhone1;
    }

    /**
     * Sets the value of the emergencyContactExtentionPhone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactExtentionPhone1(String value) {
        this.emergencyContactExtentionPhone1 = value;
    }

    /**
     * Gets the value of the emergencyContactExtentionPhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactExtentionPhone2() {
        return emergencyContactExtentionPhone2;
    }

    /**
     * Sets the value of the emergencyContactExtentionPhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactExtentionPhone2(String value) {
        this.emergencyContactExtentionPhone2 = value;
    }

    /**
     * Gets the value of the emergencyContactPhoneNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactPhoneNumber1() {
        return emergencyContactPhoneNumber1;
    }

    /**
     * Sets the value of the emergencyContactPhoneNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactPhoneNumber1(String value) {
        this.emergencyContactPhoneNumber1 = value;
    }

    /**
     * Gets the value of the emergencyContactRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactRelationship() {
        return emergencyContactRelationship;
    }

    /**
     * Sets the value of the emergencyContactRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactRelationship(String value) {
        this.emergencyContactRelationship = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

}
