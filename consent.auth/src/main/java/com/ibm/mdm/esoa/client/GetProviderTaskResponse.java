
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProviderTaskResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProviderTaskResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderTask" type="{http://client.esoa.mdm.ibm.com/}providerTask" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProviderTaskResponse", propOrder = {
    "providerTask"
})
public class GetProviderTaskResponse {

    @XmlElement(name = "ProviderTask")
    protected ProviderTask providerTask;

    /**
     * Gets the value of the providerTask property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderTask }
     *     
     */
    public ProviderTask getProviderTask() {
        return providerTask;
    }

    /**
     * Sets the value of the providerTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderTask }
     *     
     */
    public void setProviderTask(ProviderTask value) {
        this.providerTask = value;
    }

}
