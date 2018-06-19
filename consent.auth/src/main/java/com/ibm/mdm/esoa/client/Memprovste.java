
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memprovste complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memprovste">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}baseRecordAttribute">
 *       &lt;sequence>
 *         &lt;element name="availableForDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessServiceAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPhoneDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPhoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabilityAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hoursofOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailingAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailingAddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailingAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailingAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailingAddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mailingAddressZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneTollFree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalAddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalAddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalAddressZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteAKA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memprovste", propOrder = {
    "availableForDirectory",
    "businessServiceAccess",
    "contactEmail",
    "contactName",
    "contactPhoneDescription",
    "contactPhoneNumber",
    "contactPhoneType",
    "contactTitle",
    "contactType",
    "disabilityAccess",
    "emailAddress",
    "hoursofOperation",
    "languages",
    "mailingAddressCity",
    "mailingAddressCounty",
    "mailingAddressLine1",
    "mailingAddressLine2",
    "mailingAddressState",
    "mailingAddressZip",
    "phoneDescription",
    "phoneNumber",
    "phoneTollFree",
    "phoneType",
    "physicalAddressCity",
    "physicalAddressCounty",
    "physicalAddressLine1",
    "physicalAddressLine2",
    "physicalAddressState",
    "physicalAddressZip",
    "siteAKA",
    "siteDescription",
    "siteId",
    "siteName",
    "webAddress"
})
public class Memprovste
    extends BaseRecordAttribute
{

    protected String availableForDirectory;
    protected String businessServiceAccess;
    protected String contactEmail;
    protected String contactName;
    protected String contactPhoneDescription;
    protected String contactPhoneNumber;
    protected String contactPhoneType;
    protected String contactTitle;
    protected String contactType;
    protected String disabilityAccess;
    protected String emailAddress;
    protected String hoursofOperation;
    protected String languages;
    protected String mailingAddressCity;
    protected String mailingAddressCounty;
    protected String mailingAddressLine1;
    protected String mailingAddressLine2;
    protected String mailingAddressState;
    protected String mailingAddressZip;
    protected String phoneDescription;
    protected String phoneNumber;
    protected String phoneTollFree;
    protected String phoneType;
    protected String physicalAddressCity;
    protected String physicalAddressCounty;
    protected String physicalAddressLine1;
    protected String physicalAddressLine2;
    protected String physicalAddressState;
    protected String physicalAddressZip;
    protected String siteAKA;
    protected String siteDescription;
    protected String siteId;
    protected String siteName;
    protected String webAddress;

    /**
     * Gets the value of the availableForDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableForDirectory() {
        return availableForDirectory;
    }

    /**
     * Sets the value of the availableForDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableForDirectory(String value) {
        this.availableForDirectory = value;
    }

    /**
     * Gets the value of the businessServiceAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessServiceAccess() {
        return businessServiceAccess;
    }

    /**
     * Sets the value of the businessServiceAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessServiceAccess(String value) {
        this.businessServiceAccess = value;
    }

    /**
     * Gets the value of the contactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhoneDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhoneDescription() {
        return contactPhoneDescription;
    }

    /**
     * Sets the value of the contactPhoneDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhoneDescription(String value) {
        this.contactPhoneDescription = value;
    }

    /**
     * Gets the value of the contactPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    /**
     * Sets the value of the contactPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhoneNumber(String value) {
        this.contactPhoneNumber = value;
    }

    /**
     * Gets the value of the contactPhoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhoneType() {
        return contactPhoneType;
    }

    /**
     * Sets the value of the contactPhoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhoneType(String value) {
        this.contactPhoneType = value;
    }

    /**
     * Gets the value of the contactTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTitle() {
        return contactTitle;
    }

    /**
     * Sets the value of the contactTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTitle(String value) {
        this.contactTitle = value;
    }

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the disabilityAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityAccess() {
        return disabilityAccess;
    }

    /**
     * Sets the value of the disabilityAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityAccess(String value) {
        this.disabilityAccess = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the hoursofOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursofOperation() {
        return hoursofOperation;
    }

    /**
     * Sets the value of the hoursofOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursofOperation(String value) {
        this.hoursofOperation = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguages(String value) {
        this.languages = value;
    }

    /**
     * Gets the value of the mailingAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingAddressCity() {
        return mailingAddressCity;
    }

    /**
     * Sets the value of the mailingAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingAddressCity(String value) {
        this.mailingAddressCity = value;
    }

    /**
     * Gets the value of the mailingAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingAddressCounty() {
        return mailingAddressCounty;
    }

    /**
     * Sets the value of the mailingAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingAddressCounty(String value) {
        this.mailingAddressCounty = value;
    }

    /**
     * Gets the value of the mailingAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingAddressLine1() {
        return mailingAddressLine1;
    }

    /**
     * Sets the value of the mailingAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingAddressLine1(String value) {
        this.mailingAddressLine1 = value;
    }

    /**
     * Gets the value of the mailingAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingAddressLine2() {
        return mailingAddressLine2;
    }

    /**
     * Sets the value of the mailingAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingAddressLine2(String value) {
        this.mailingAddressLine2 = value;
    }

    /**
     * Gets the value of the mailingAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingAddressState() {
        return mailingAddressState;
    }

    /**
     * Sets the value of the mailingAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingAddressState(String value) {
        this.mailingAddressState = value;
    }

    /**
     * Gets the value of the mailingAddressZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingAddressZip() {
        return mailingAddressZip;
    }

    /**
     * Sets the value of the mailingAddressZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingAddressZip(String value) {
        this.mailingAddressZip = value;
    }

    /**
     * Gets the value of the phoneDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneDescription() {
        return phoneDescription;
    }

    /**
     * Sets the value of the phoneDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneDescription(String value) {
        this.phoneDescription = value;
    }

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
     * Gets the value of the phoneTollFree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneTollFree() {
        return phoneTollFree;
    }

    /**
     * Sets the value of the phoneTollFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneTollFree(String value) {
        this.phoneTollFree = value;
    }

    /**
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the physicalAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddressCity() {
        return physicalAddressCity;
    }

    /**
     * Sets the value of the physicalAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddressCity(String value) {
        this.physicalAddressCity = value;
    }

    /**
     * Gets the value of the physicalAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddressCounty() {
        return physicalAddressCounty;
    }

    /**
     * Sets the value of the physicalAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddressCounty(String value) {
        this.physicalAddressCounty = value;
    }

    /**
     * Gets the value of the physicalAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddressLine1() {
        return physicalAddressLine1;
    }

    /**
     * Sets the value of the physicalAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddressLine1(String value) {
        this.physicalAddressLine1 = value;
    }

    /**
     * Gets the value of the physicalAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddressLine2() {
        return physicalAddressLine2;
    }

    /**
     * Sets the value of the physicalAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddressLine2(String value) {
        this.physicalAddressLine2 = value;
    }

    /**
     * Gets the value of the physicalAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddressState() {
        return physicalAddressState;
    }

    /**
     * Sets the value of the physicalAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddressState(String value) {
        this.physicalAddressState = value;
    }

    /**
     * Gets the value of the physicalAddressZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalAddressZip() {
        return physicalAddressZip;
    }

    /**
     * Sets the value of the physicalAddressZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalAddressZip(String value) {
        this.physicalAddressZip = value;
    }

    /**
     * Gets the value of the siteAKA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteAKA() {
        return siteAKA;
    }

    /**
     * Sets the value of the siteAKA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteAKA(String value) {
        this.siteAKA = value;
    }

    /**
     * Gets the value of the siteDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteDescription() {
        return siteDescription;
    }

    /**
     * Sets the value of the siteDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteDescription(String value) {
        this.siteDescription = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteId(String value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the webAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddress() {
        return webAddress;
    }

    /**
     * Sets the value of the webAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddress(String value) {
        this.webAddress = value;
    }

}
