
package com.initiate.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}task">
 *       &lt;sequence>
 *         &lt;element name="provider" type="{http://client.initiate.com/}provider" minOccurs="0"/>
 *         &lt;element name="providerTaskId" type="{http://client.initiate.com/}providerTaskId" minOccurs="0"/>
 *         &lt;element name="RelatedProviderList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelatedProvider" type="{http://client.initiate.com/}provider" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "providerTask", propOrder = {
    "provider",
    "providerTaskId",
    "relatedProviderList"
})
@XmlSeeAlso({
    ProviderCustomTask.class,
    ProvEntityTask.class,
    ProviderRecordTask.class
})
public class ProviderTask
    extends Task
{

    protected Provider provider;
    protected ProviderTaskId providerTaskId;
    @XmlElement(name = "RelatedProviderList")
    protected ProviderTask.RelatedProviderList relatedProviderList;

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
     * Gets the value of the providerTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderTaskId }
     *     
     */
    public ProviderTaskId getProviderTaskId() {
        return providerTaskId;
    }

    /**
     * Sets the value of the providerTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderTaskId }
     *     
     */
    public void setProviderTaskId(ProviderTaskId value) {
        this.providerTaskId = value;
    }

    /**
     * Gets the value of the relatedProviderList property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderTask.RelatedProviderList }
     *     
     */
    public ProviderTask.RelatedProviderList getRelatedProviderList() {
        return relatedProviderList;
    }

    /**
     * Sets the value of the relatedProviderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderTask.RelatedProviderList }
     *     
     */
    public void setRelatedProviderList(ProviderTask.RelatedProviderList value) {
        this.relatedProviderList = value;
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
     *         &lt;element name="RelatedProvider" type="{http://client.initiate.com/}provider" maxOccurs="unbounded" minOccurs="0"/>
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
        "relatedProvider"
    })
    public static class RelatedProviderList {

        @XmlElement(name = "RelatedProvider")
        protected List<Provider> relatedProvider;

        /**
         * Gets the value of the relatedProvider property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedProvider property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedProvider().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Provider }
         * 
         * 
         */
        public List<Provider> getRelatedProvider() {
            if (relatedProvider == null) {
                relatedProvider = new ArrayList<Provider>();
            }
            return this.relatedProvider;
        }

    }

}
