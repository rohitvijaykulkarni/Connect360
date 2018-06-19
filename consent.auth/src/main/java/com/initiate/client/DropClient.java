
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dropClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dropClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beanId" type="{http://client.initiate.com/}clientId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dropClient", propOrder = {
    "beanId"
})
public class DropClient {

    protected ClientId beanId;

    /**
     * Gets the value of the beanId property.
     * 
     * @return
     *     possible object is
     *     {@link ClientId }
     *     
     */
    public ClientId getBeanId() {
        return beanId;
    }

    /**
     * Sets the value of the beanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientId }
     *     
     */
    public void setBeanId(ClientId value) {
        this.beanId = value;
    }

}
