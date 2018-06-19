
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unlinkClientFromIdEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unlinkClientFromIdEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordId" type="{http://client.esoa.mdm.ibm.com/}clientId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unlinkClientFromIdEntity", propOrder = {
    "recordId"
})
public class UnlinkClientFromIdEntity {

    protected ClientId recordId;

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

}
