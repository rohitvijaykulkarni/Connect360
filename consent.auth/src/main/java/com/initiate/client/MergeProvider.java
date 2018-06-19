
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mergeProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mergeProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="survivorId" type="{http://client.initiate.com/}providerId" minOccurs="0"/>
 *         &lt;element name="obsoleteId" type="{http://client.initiate.com/}providerId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergeProvider", propOrder = {
    "survivorId",
    "obsoleteId"
})
public class MergeProvider {

    protected ProviderId survivorId;
    protected ProviderId obsoleteId;

    /**
     * Gets the value of the survivorId property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderId }
     *     
     */
    public ProviderId getSurvivorId() {
        return survivorId;
    }

    /**
     * Sets the value of the survivorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderId }
     *     
     */
    public void setSurvivorId(ProviderId value) {
        this.survivorId = value;
    }

    /**
     * Gets the value of the obsoleteId property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderId }
     *     
     */
    public ProviderId getObsoleteId() {
        return obsoleteId;
    }

    /**
     * Sets the value of the obsoleteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderId }
     *     
     */
    public void setObsoleteId(ProviderId value) {
        this.obsoleteId = value;
    }

}
