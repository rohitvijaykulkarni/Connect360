
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for markIdEntityLinkResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="markIdEntityLinkResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientTaskId" type="{http://client.esoa.mdm.ibm.com/}clientTaskId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "markIdEntityLinkResponse", propOrder = {
    "clientTaskId"
})
public class MarkIdEntityLinkResponse {

    @XmlElement(name = "ClientTaskId")
    protected ClientTaskId clientTaskId;

    /**
     * Gets the value of the clientTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link ClientTaskId }
     *     
     */
    public ClientTaskId getClientTaskId() {
        return clientTaskId;
    }

    /**
     * Sets the value of the clientTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientTaskId }
     *     
     */
    public void setClientTaskId(ClientTaskId value) {
        this.clientTaskId = value;
    }

}
