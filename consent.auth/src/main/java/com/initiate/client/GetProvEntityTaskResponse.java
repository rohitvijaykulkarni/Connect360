
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProvEntityTaskResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProvEntityTaskResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProvEntityTask" type="{http://client.initiate.com/}provEntityTask" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProvEntityTaskResponse", propOrder = {
    "provEntityTask"
})
public class GetProvEntityTaskResponse {

    @XmlElement(name = "ProvEntityTask")
    protected ProvEntityTask provEntityTask;

    /**
     * Gets the value of the provEntityTask property.
     * 
     * @return
     *     possible object is
     *     {@link ProvEntityTask }
     *     
     */
    public ProvEntityTask getProvEntityTask() {
        return provEntityTask;
    }

    /**
     * Sets the value of the provEntityTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvEntityTask }
     *     
     */
    public void setProvEntityTask(ProvEntityTask value) {
        this.provEntityTask = value;
    }

}
