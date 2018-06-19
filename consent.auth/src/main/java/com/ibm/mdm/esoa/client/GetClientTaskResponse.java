
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getClientTaskResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getClientTaskResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientTask" type="{http://client.esoa.mdm.ibm.com/}clientTask" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClientTaskResponse", propOrder = {
    "clientTask"
})
public class GetClientTaskResponse {

    @XmlElement(name = "ClientTask")
    protected ClientTask clientTask;

    /**
     * Gets the value of the clientTask property.
     * 
     * @return
     *     possible object is
     *     {@link ClientTask }
     *     
     */
    public ClientTask getClientTask() {
        return clientTask;
    }

    /**
     * Sets the value of the clientTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientTask }
     *     
     */
    public void setClientTask(ClientTask value) {
        this.clientTask = value;
    }

}
