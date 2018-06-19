
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unlinkProviderFromProvEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unlinkProviderFromProvEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordId" type="{http://client.esoa.mdm.ibm.com/}providerId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unlinkProviderFromProvEntity", propOrder = {
    "recordId"
})
public class UnlinkProviderFromProvEntity {

    protected ProviderId recordId;

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

}
