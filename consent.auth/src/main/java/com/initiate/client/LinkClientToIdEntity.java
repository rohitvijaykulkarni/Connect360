
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linkClientToIdEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkClientToIdEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordId" type="{http://client.initiate.com/}clientId" minOccurs="0"/>
 *         &lt;element name="entityIdId" type="{http://client.initiate.com/}idEntityId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkClientToIdEntity", propOrder = {
    "recordId",
    "entityIdId"
})
public class LinkClientToIdEntity {

    protected ClientId recordId;
    protected IdEntityId entityIdId;

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link ClientId }
     *     
     */
    public ClientId getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientId }
     *     
     */
    public void setRecordId(ClientId value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the entityIdId property.
     * 
     * @return
     *     possible object is
     *     {@link IdEntityId }
     *     
     */
    public IdEntityId getEntityIdId() {
        return entityIdId;
    }

    /**
     * Sets the value of the entityIdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdEntityId }
     *     
     */
    public void setEntityIdId(IdEntityId value) {
        this.entityIdId = value;
    }

}
