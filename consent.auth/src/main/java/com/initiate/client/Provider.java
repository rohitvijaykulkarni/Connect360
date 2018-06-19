
package com.initiate.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provider">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}record">
 *       &lt;sequence>
 *         &lt;element name="ProviderAKAList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderAKA" type="{http://client.initiate.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderAvailableforDirectoryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderAvailableforDirectory" type="{http://client.initiate.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderBusServiceAccessList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderBusServiceAccess" type="{http://client.initiate.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderContactList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderContact" type="{http://client.initiate.com/}memprovctnt" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderDescriptionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderDescription" type="{http://client.initiate.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderDisabilityAccessList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderDisabilityAccess" type="{http://client.initiate.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderEmailAddressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderEmailAddress" type="{http://client.initiate.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="providerId" type="{http://client.initiate.com/}providerId" minOccurs="0"/>
 *         &lt;element name="ProviderLastUpdateDateTimeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderLastUpdateDateTime" type="{http://client.initiate.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderMailingAddressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderMailingAddress" type="{http://client.initiate.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderNameList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderName" type="{http://client.initiate.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderPhoneList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderPhone" type="{http://client.initiate.com/}memprovphn" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderPhysicalAddressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderPhysicalAddress" type="{http://client.initiate.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderProgramList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderProgram" type="{http://client.initiate.com/}memprovprog" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderSiteList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderSite" type="{http://client.initiate.com/}memprovste" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderSiteServicesProgramList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderSiteServicesProgram" type="{http://client.initiate.com/}memstesvcprg" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProviderWebAddressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderWebAddress" type="{http://client.initiate.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provider", propOrder = {
    "providerAKAList",
    "providerAvailableforDirectoryList",
    "providerBusServiceAccessList",
    "providerContactList",
    "providerDescriptionList",
    "providerDisabilityAccessList",
    "providerEmailAddressList",
    "providerId",
    "providerLastUpdateDateTimeList",
    "providerMailingAddressList",
    "providerNameList",
    "providerPhoneList",
    "providerPhysicalAddressList",
    "providerProgramList",
    "providerSiteList",
    "providerSiteServicesProgramList",
    "providerWebAddressList"
})
public class Provider
    extends Record
{

    @XmlElement(name = "ProviderAKAList")
    protected Provider.ProviderAKAList providerAKAList;
    @XmlElement(name = "ProviderAvailableforDirectoryList")
    protected Provider.ProviderAvailableforDirectoryList providerAvailableforDirectoryList;
    @XmlElement(name = "ProviderBusServiceAccessList")
    protected Provider.ProviderBusServiceAccessList providerBusServiceAccessList;
    @XmlElement(name = "ProviderContactList")
    protected Provider.ProviderContactList providerContactList;
    @XmlElement(name = "ProviderDescriptionList")
    protected Provider.ProviderDescriptionList providerDescriptionList;
    @XmlElement(name = "ProviderDisabilityAccessList")
    protected Provider.ProviderDisabilityAccessList providerDisabilityAccessList;
    @XmlElement(name = "ProviderEmailAddressList")
    protected Provider.ProviderEmailAddressList providerEmailAddressList;
    protected ProviderId providerId;
    @XmlElement(name = "ProviderLastUpdateDateTimeList")
    protected Provider.ProviderLastUpdateDateTimeList providerLastUpdateDateTimeList;
    @XmlElement(name = "ProviderMailingAddressList")
    protected Provider.ProviderMailingAddressList providerMailingAddressList;
    @XmlElement(name = "ProviderNameList")
    protected Provider.ProviderNameList providerNameList;
    @XmlElement(name = "ProviderPhoneList")
    protected Provider.ProviderPhoneList providerPhoneList;
    @XmlElement(name = "ProviderPhysicalAddressList")
    protected Provider.ProviderPhysicalAddressList providerPhysicalAddressList;
    @XmlElement(name = "ProviderProgramList")
    protected Provider.ProviderProgramList providerProgramList;
    @XmlElement(name = "ProviderSiteList")
    protected Provider.ProviderSiteList providerSiteList;
    @XmlElement(name = "ProviderSiteServicesProgramList")
    protected Provider.ProviderSiteServicesProgramList providerSiteServicesProgramList;
    @XmlElement(name = "ProviderWebAddressList")
    protected Provider.ProviderWebAddressList providerWebAddressList;

    /**
     * Gets the value of the providerAKAList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderAKAList }
     *     
     */
    public Provider.ProviderAKAList getProviderAKAList() {
        return providerAKAList;
    }

    /**
     * Sets the value of the providerAKAList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderAKAList }
     *     
     */
    public void setProviderAKAList(Provider.ProviderAKAList value) {
        this.providerAKAList = value;
    }

    /**
     * Gets the value of the providerAvailableforDirectoryList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderAvailableforDirectoryList }
     *     
     */
    public Provider.ProviderAvailableforDirectoryList getProviderAvailableforDirectoryList() {
        return providerAvailableforDirectoryList;
    }

    /**
     * Sets the value of the providerAvailableforDirectoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderAvailableforDirectoryList }
     *     
     */
    public void setProviderAvailableforDirectoryList(Provider.ProviderAvailableforDirectoryList value) {
        this.providerAvailableforDirectoryList = value;
    }

    /**
     * Gets the value of the providerBusServiceAccessList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderBusServiceAccessList }
     *     
     */
    public Provider.ProviderBusServiceAccessList getProviderBusServiceAccessList() {
        return providerBusServiceAccessList;
    }

    /**
     * Sets the value of the providerBusServiceAccessList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderBusServiceAccessList }
     *     
     */
    public void setProviderBusServiceAccessList(Provider.ProviderBusServiceAccessList value) {
        this.providerBusServiceAccessList = value;
    }

    /**
     * Gets the value of the providerContactList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderContactList }
     *     
     */
    public Provider.ProviderContactList getProviderContactList() {
        return providerContactList;
    }

    /**
     * Sets the value of the providerContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderContactList }
     *     
     */
    public void setProviderContactList(Provider.ProviderContactList value) {
        this.providerContactList = value;
    }

    /**
     * Gets the value of the providerDescriptionList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderDescriptionList }
     *     
     */
    public Provider.ProviderDescriptionList getProviderDescriptionList() {
        return providerDescriptionList;
    }

    /**
     * Sets the value of the providerDescriptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderDescriptionList }
     *     
     */
    public void setProviderDescriptionList(Provider.ProviderDescriptionList value) {
        this.providerDescriptionList = value;
    }

    /**
     * Gets the value of the providerDisabilityAccessList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderDisabilityAccessList }
     *     
     */
    public Provider.ProviderDisabilityAccessList getProviderDisabilityAccessList() {
        return providerDisabilityAccessList;
    }

    /**
     * Sets the value of the providerDisabilityAccessList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderDisabilityAccessList }
     *     
     */
    public void setProviderDisabilityAccessList(Provider.ProviderDisabilityAccessList value) {
        this.providerDisabilityAccessList = value;
    }

    /**
     * Gets the value of the providerEmailAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderEmailAddressList }
     *     
     */
    public Provider.ProviderEmailAddressList getProviderEmailAddressList() {
        return providerEmailAddressList;
    }

    /**
     * Sets the value of the providerEmailAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderEmailAddressList }
     *     
     */
    public void setProviderEmailAddressList(Provider.ProviderEmailAddressList value) {
        this.providerEmailAddressList = value;
    }

    /**
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderId }
     *     
     */
    public ProviderId getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderId }
     *     
     */
    public void setProviderId(ProviderId value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the providerLastUpdateDateTimeList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderLastUpdateDateTimeList }
     *     
     */
    public Provider.ProviderLastUpdateDateTimeList getProviderLastUpdateDateTimeList() {
        return providerLastUpdateDateTimeList;
    }

    /**
     * Sets the value of the providerLastUpdateDateTimeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderLastUpdateDateTimeList }
     *     
     */
    public void setProviderLastUpdateDateTimeList(Provider.ProviderLastUpdateDateTimeList value) {
        this.providerLastUpdateDateTimeList = value;
    }

    /**
     * Gets the value of the providerMailingAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderMailingAddressList }
     *     
     */
    public Provider.ProviderMailingAddressList getProviderMailingAddressList() {
        return providerMailingAddressList;
    }

    /**
     * Sets the value of the providerMailingAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderMailingAddressList }
     *     
     */
    public void setProviderMailingAddressList(Provider.ProviderMailingAddressList value) {
        this.providerMailingAddressList = value;
    }

    /**
     * Gets the value of the providerNameList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderNameList }
     *     
     */
    public Provider.ProviderNameList getProviderNameList() {
        return providerNameList;
    }

    /**
     * Sets the value of the providerNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderNameList }
     *     
     */
    public void setProviderNameList(Provider.ProviderNameList value) {
        this.providerNameList = value;
    }

    /**
     * Gets the value of the providerPhoneList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderPhoneList }
     *     
     */
    public Provider.ProviderPhoneList getProviderPhoneList() {
        return providerPhoneList;
    }

    /**
     * Sets the value of the providerPhoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderPhoneList }
     *     
     */
    public void setProviderPhoneList(Provider.ProviderPhoneList value) {
        this.providerPhoneList = value;
    }

    /**
     * Gets the value of the providerPhysicalAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderPhysicalAddressList }
     *     
     */
    public Provider.ProviderPhysicalAddressList getProviderPhysicalAddressList() {
        return providerPhysicalAddressList;
    }

    /**
     * Sets the value of the providerPhysicalAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderPhysicalAddressList }
     *     
     */
    public void setProviderPhysicalAddressList(Provider.ProviderPhysicalAddressList value) {
        this.providerPhysicalAddressList = value;
    }

    /**
     * Gets the value of the providerProgramList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderProgramList }
     *     
     */
    public Provider.ProviderProgramList getProviderProgramList() {
        return providerProgramList;
    }

    /**
     * Sets the value of the providerProgramList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderProgramList }
     *     
     */
    public void setProviderProgramList(Provider.ProviderProgramList value) {
        this.providerProgramList = value;
    }

    /**
     * Gets the value of the providerSiteList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderSiteList }
     *     
     */
    public Provider.ProviderSiteList getProviderSiteList() {
        return providerSiteList;
    }

    /**
     * Sets the value of the providerSiteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderSiteList }
     *     
     */
    public void setProviderSiteList(Provider.ProviderSiteList value) {
        this.providerSiteList = value;
    }

    /**
     * Gets the value of the providerSiteServicesProgramList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderSiteServicesProgramList }
     *     
     */
    public Provider.ProviderSiteServicesProgramList getProviderSiteServicesProgramList() {
        return providerSiteServicesProgramList;
    }

    /**
     * Sets the value of the providerSiteServicesProgramList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderSiteServicesProgramList }
     *     
     */
    public void setProviderSiteServicesProgramList(Provider.ProviderSiteServicesProgramList value) {
        this.providerSiteServicesProgramList = value;
    }

    /**
     * Gets the value of the providerWebAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link Provider.ProviderWebAddressList }
     *     
     */
    public Provider.ProviderWebAddressList getProviderWebAddressList() {
        return providerWebAddressList;
    }

    /**
     * Sets the value of the providerWebAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider.ProviderWebAddressList }
     *     
     */
    public void setProviderWebAddressList(Provider.ProviderWebAddressList value) {
        this.providerWebAddressList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderAKA" type="{http://client.initiate.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerAKA"
    })
    public static class ProviderAKAList {

        @XmlElement(name = "ProviderAKA")
        protected List<Membigattr> providerAKA;

        /**
         * Gets the value of the providerAKA property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerAKA property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderAKA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Membigattr }
         * 
         * 
         */
        public List<Membigattr> getProviderAKA() {
            if (providerAKA == null) {
                providerAKA = new ArrayList<Membigattr>();
            }
            return this.providerAKA;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderAvailableforDirectory" type="{http://client.initiate.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerAvailableforDirectory"
    })
    public static class ProviderAvailableforDirectoryList {

        @XmlElement(name = "ProviderAvailableforDirectory")
        protected List<Memattr> providerAvailableforDirectory;

        /**
         * Gets the value of the providerAvailableforDirectory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerAvailableforDirectory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderAvailableforDirectory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getProviderAvailableforDirectory() {
            if (providerAvailableforDirectory == null) {
                providerAvailableforDirectory = new ArrayList<Memattr>();
            }
            return this.providerAvailableforDirectory;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderBusServiceAccess" type="{http://client.initiate.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerBusServiceAccess"
    })
    public static class ProviderBusServiceAccessList {

        @XmlElement(name = "ProviderBusServiceAccess")
        protected List<Membigattr> providerBusServiceAccess;

        /**
         * Gets the value of the providerBusServiceAccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerBusServiceAccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderBusServiceAccess().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Membigattr }
         * 
         * 
         */
        public List<Membigattr> getProviderBusServiceAccess() {
            if (providerBusServiceAccess == null) {
                providerBusServiceAccess = new ArrayList<Membigattr>();
            }
            return this.providerBusServiceAccess;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderContact" type="{http://client.initiate.com/}memprovctnt" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerContact"
    })
    public static class ProviderContactList {

        @XmlElement(name = "ProviderContact")
        protected List<Memprovctnt> providerContact;

        /**
         * Gets the value of the providerContact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerContact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memprovctnt }
         * 
         * 
         */
        public List<Memprovctnt> getProviderContact() {
            if (providerContact == null) {
                providerContact = new ArrayList<Memprovctnt>();
            }
            return this.providerContact;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderDescription" type="{http://client.initiate.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerDescription"
    })
    public static class ProviderDescriptionList {

        @XmlElement(name = "ProviderDescription")
        protected List<Membigattr> providerDescription;

        /**
         * Gets the value of the providerDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Membigattr }
         * 
         * 
         */
        public List<Membigattr> getProviderDescription() {
            if (providerDescription == null) {
                providerDescription = new ArrayList<Membigattr>();
            }
            return this.providerDescription;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderDisabilityAccess" type="{http://client.initiate.com/}membigattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerDisabilityAccess"
    })
    public static class ProviderDisabilityAccessList {

        @XmlElement(name = "ProviderDisabilityAccess")
        protected List<Membigattr> providerDisabilityAccess;

        /**
         * Gets the value of the providerDisabilityAccess property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerDisabilityAccess property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderDisabilityAccess().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Membigattr }
         * 
         * 
         */
        public List<Membigattr> getProviderDisabilityAccess() {
            if (providerDisabilityAccess == null) {
                providerDisabilityAccess = new ArrayList<Membigattr>();
            }
            return this.providerDisabilityAccess;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderEmailAddress" type="{http://client.initiate.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerEmailAddress"
    })
    public static class ProviderEmailAddressList {

        @XmlElement(name = "ProviderEmailAddress")
        protected List<Memattr> providerEmailAddress;

        /**
         * Gets the value of the providerEmailAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerEmailAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderEmailAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getProviderEmailAddress() {
            if (providerEmailAddress == null) {
                providerEmailAddress = new ArrayList<Memattr>();
            }
            return this.providerEmailAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderLastUpdateDateTime" type="{http://client.initiate.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerLastUpdateDateTime"
    })
    public static class ProviderLastUpdateDateTimeList {

        @XmlElement(name = "ProviderLastUpdateDateTime")
        protected List<Memattr> providerLastUpdateDateTime;

        /**
         * Gets the value of the providerLastUpdateDateTime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerLastUpdateDateTime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderLastUpdateDateTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getProviderLastUpdateDateTime() {
            if (providerLastUpdateDateTime == null) {
                providerLastUpdateDateTime = new ArrayList<Memattr>();
            }
            return this.providerLastUpdateDateTime;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderMailingAddress" type="{http://client.initiate.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerMailingAddress"
    })
    public static class ProviderMailingAddressList {

        @XmlElement(name = "ProviderMailingAddress")
        protected List<Memlgaddr> providerMailingAddress;

        /**
         * Gets the value of the providerMailingAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerMailingAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderMailingAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memlgaddr }
         * 
         * 
         */
        public List<Memlgaddr> getProviderMailingAddress() {
            if (providerMailingAddress == null) {
                providerMailingAddress = new ArrayList<Memlgaddr>();
            }
            return this.providerMailingAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderName" type="{http://client.initiate.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerName"
    })
    public static class ProviderNameList {

        @XmlElement(name = "ProviderName")
        protected List<Memattr> providerName;

        /**
         * Gets the value of the providerName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getProviderName() {
            if (providerName == null) {
                providerName = new ArrayList<Memattr>();
            }
            return this.providerName;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderPhone" type="{http://client.initiate.com/}memprovphn" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerPhone"
    })
    public static class ProviderPhoneList {

        @XmlElement(name = "ProviderPhone")
        protected List<Memprovphn> providerPhone;

        /**
         * Gets the value of the providerPhone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerPhone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderPhone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memprovphn }
         * 
         * 
         */
        public List<Memprovphn> getProviderPhone() {
            if (providerPhone == null) {
                providerPhone = new ArrayList<Memprovphn>();
            }
            return this.providerPhone;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderPhysicalAddress" type="{http://client.initiate.com/}memlgaddr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerPhysicalAddress"
    })
    public static class ProviderPhysicalAddressList {

        @XmlElement(name = "ProviderPhysicalAddress")
        protected List<Memlgaddr> providerPhysicalAddress;

        /**
         * Gets the value of the providerPhysicalAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerPhysicalAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderPhysicalAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memlgaddr }
         * 
         * 
         */
        public List<Memlgaddr> getProviderPhysicalAddress() {
            if (providerPhysicalAddress == null) {
                providerPhysicalAddress = new ArrayList<Memlgaddr>();
            }
            return this.providerPhysicalAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderProgram" type="{http://client.initiate.com/}memprovprog" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerProgram"
    })
    public static class ProviderProgramList {

        @XmlElement(name = "ProviderProgram")
        protected List<Memprovprog> providerProgram;

        /**
         * Gets the value of the providerProgram property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerProgram property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderProgram().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memprovprog }
         * 
         * 
         */
        public List<Memprovprog> getProviderProgram() {
            if (providerProgram == null) {
                providerProgram = new ArrayList<Memprovprog>();
            }
            return this.providerProgram;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderSite" type="{http://client.initiate.com/}memprovste" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerSite"
    })
    public static class ProviderSiteList {

        @XmlElement(name = "ProviderSite")
        protected List<Memprovste> providerSite;

        /**
         * Gets the value of the providerSite property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerSite property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderSite().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memprovste }
         * 
         * 
         */
        public List<Memprovste> getProviderSite() {
            if (providerSite == null) {
                providerSite = new ArrayList<Memprovste>();
            }
            return this.providerSite;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderSiteServicesProgram" type="{http://client.initiate.com/}memstesvcprg" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerSiteServicesProgram"
    })
    public static class ProviderSiteServicesProgramList {

        @XmlElement(name = "ProviderSiteServicesProgram")
        protected List<Memstesvcprg> providerSiteServicesProgram;

        /**
         * Gets the value of the providerSiteServicesProgram property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerSiteServicesProgram property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderSiteServicesProgram().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memstesvcprg }
         * 
         * 
         */
        public List<Memstesvcprg> getProviderSiteServicesProgram() {
            if (providerSiteServicesProgram == null) {
                providerSiteServicesProgram = new ArrayList<Memstesvcprg>();
            }
            return this.providerSiteServicesProgram;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProviderWebAddress" type="{http://client.initiate.com/}memattr" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerWebAddress"
    })
    public static class ProviderWebAddressList {

        @XmlElement(name = "ProviderWebAddress")
        protected List<Memattr> providerWebAddress;

        /**
         * Gets the value of the providerWebAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerWebAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderWebAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Memattr }
         * 
         * 
         */
        public List<Memattr> getProviderWebAddress() {
            if (providerWebAddress == null) {
                providerWebAddress = new ArrayList<Memattr>();
            }
            return this.providerWebAddress;
        }

    }

}
