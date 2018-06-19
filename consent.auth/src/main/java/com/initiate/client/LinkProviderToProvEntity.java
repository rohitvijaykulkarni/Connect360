
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linkProviderToProvEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkProviderToProvEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordId" type="{http://client.initiate.com/}providerId" minOccurs="0"/>
 *         &lt;element name="entityIdId" type="{http://client.initiate.com/}provEntityId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkProviderToProvEntity", propOrder = {
    "recordId",
    "entityIdId"
})
public class LinkProviderToProvEntity {

    protected ProviderId recordId;
    protected ProvEntityId entityIdId;

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderId }
     *     
     */
    public ProviderId getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderId }
     *     
     */
    public void setRecordId(ProviderId value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the entityIdId property.
     * 
     * @return
     *     possible object is
     *     {@link ProvEntityId }
     *     
     */
    public ProvEntityId getEntityIdId() {
        return entityIdId;
    }

    /**
     * Sets the value of the entityIdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvEntityId }
     *     
     */
    public void setEntityIdId(ProvEntityId value) {
        this.entityIdId = value;
    }

}
