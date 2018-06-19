
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mergeClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mergeClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="survivorId" type="{http://client.initiate.com/}clientId" minOccurs="0"/>
 *         &lt;element name="obsoleteId" type="{http://client.initiate.com/}clientId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergeClient", propOrder = {
    "survivorId",
    "obsoleteId"
})
public class MergeClient {

    protected ClientId survivorId;
    protected ClientId obsoleteId;

    /**
     * Gets the value of the survivorId property.
     * 
     * @return
     *     possible object is
     *     {@link ClientId }
     *     
     */
    public ClientId getSurvivorId() {
        return survivorId;
    }

    /**
     * Sets the value of the survivorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientId }
     *     
     */
    public void setSurvivorId(ClientId value) {
        this.survivorId = value;
    }

    /**
     * Gets the value of the obsoleteId property.
     * 
     * @return
     *     possible object is
     *     {@link ClientId }
     *     
     */
    public ClientId getObsoleteId() {
        return obsoleteId;
    }

    /**
     * Sets the value of the obsoleteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientId }
     *     
     */
    public void setObsoleteId(ClientId value) {
        this.obsoleteId = value;
    }

}
