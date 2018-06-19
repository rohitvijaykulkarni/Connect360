
package com.initiate.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}entity">
 *       &lt;sequence>
 *         &lt;element name="entityId" type="{http://client.initiate.com/}provEntityId" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://client.initiate.com/}provider" minOccurs="0"/>
 *         &lt;element name="ProviderIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderId" type="{http://client.initiate.com/}providerId" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "provEntity", propOrder = {
    "entityId",
    "provider",
    "providerIdList"
})
public class ProvEntity
    extends Entity
{

    protected ProvEntityId entityId;
    protected Provider provider;
    @XmlElement(name = "ProviderIdList")
    protected ProvEntity.ProviderIdList providerIdList;

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link ProvEntityId }
     *     
     */
    public ProvEntityId getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvEntityId }
     *     
     */
    public void setEntityId(ProvEntityId value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link Provider }
     *     
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider }
     *     
     */
    public void setProvider(Provider value) {
        this.provider = value;
    }

    /**
     * Gets the value of the providerIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ProvEntity.ProviderIdList }
     *     
     */
    public ProvEntity.ProviderIdList getProviderIdList() {
        return providerIdList;
    }

    /**
     * Sets the value of the providerIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvEntity.ProviderIdList }
     *     
     */
    public void setProviderIdList(ProvEntity.ProviderIdList value) {
        this.providerIdList = value;
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
     *         &lt;element name="ProviderId" type="{http://client.initiate.com/}providerId" maxOccurs="unbounded" minOccurs="0"/>
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
        "providerId"
    })
    public static class ProviderIdList {

        @XmlElement(name = "ProviderId")
        protected List<ProviderId> providerId;

        /**
         * Gets the value of the providerId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the providerId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProviderId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProviderId }
         * 
         * 
         */
        public List<ProviderId> getProviderId() {
            if (providerId == null) {
                providerId = new ArrayList<ProviderId>();
            }
            return this.providerId;
        }

    }

}
