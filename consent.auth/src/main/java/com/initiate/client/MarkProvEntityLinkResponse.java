
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for markProvEntityLinkResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="markProvEntityLinkResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderTaskId" type="{http://client.initiate.com/}providerTaskId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markProvEntityLinkResponse", propOrder = {
    "providerTaskId"
})
public class MarkProvEntityLinkResponse {

    @XmlElement(name = "ProviderTaskId")
    protected ProviderTaskId providerTaskId;

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

}
