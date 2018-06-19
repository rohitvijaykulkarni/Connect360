
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for textSearchProviderListAsProvResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="textSearchProviderListAsProvResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderTextSearchResult" type="{http://client.initiate.com/}providerTextSearchResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textSearchProviderListAsProvResponse", propOrder = {
    "providerTextSearchResult"
})
public class TextSearchProviderListAsProvResponse {

    @XmlElement(name = "ProviderTextSearchResult")
    protected ProviderTextSearchResult providerTextSearchResult;

    /**
     * Gets the value of the providerTextSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderTextSearchResult }
     *     
     */
    public ProviderTextSearchResult getProviderTextSearchResult() {
        return providerTextSearchResult;
    }

    /**
     * Sets the value of the providerTextSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderTextSearchResult }
     *     
     */
    public void setProviderTextSearchResult(ProviderTextSearchResult value) {
        this.providerTextSearchResult = value;
    }

}
