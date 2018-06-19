
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getIdEntityTaskResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getIdEntityTaskResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdEntityTask" type="{http://client.esoa.mdm.ibm.com/}idEntityTask" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIdEntityTaskResponse", propOrder = {
    "idEntityTask"
})
public class GetIdEntityTaskResponse {

    @XmlElement(name = "IdEntityTask")
    protected IdEntityTask idEntityTask;

    /**
     * Gets the value of the idEntityTask property.
     * 
     * @return
     *     possible object is
     *     {@link IdEntityTask }
     *     
     */
    public IdEntityTask getIdEntityTask() {
        return idEntityTask;
    }

    /**
     * Sets the value of the idEntityTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdEntityTask }
     *     
     */
    public void setIdEntityTask(IdEntityTask value) {
        this.idEntityTask = value;
    }

}
