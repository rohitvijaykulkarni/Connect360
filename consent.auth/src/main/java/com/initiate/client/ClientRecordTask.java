
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientRecordTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientRecordTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}clientTask">
 *       &lt;sequence>
 *         &lt;element name="supClient" type="{http://client.initiate.com/}client" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientRecordTask", propOrder = {
    "supClient"
})
public class ClientRecordTask
    extends ClientTask
{

    protected Client supClient;

    /**
     * Gets the value of the supClient property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getSupClient() {
        return supClient;
    }

    /**
     * Sets the value of the supClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setSupClient(Client value) {
        this.supClient = value;
    }

}
