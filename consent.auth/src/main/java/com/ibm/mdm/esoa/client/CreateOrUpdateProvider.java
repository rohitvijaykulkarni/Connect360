
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createOrUpdateProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createOrUpdateProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bean" type="{http://client.esoa.mdm.ibm.com/}provider" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://client.esoa.mdm.ibm.com/}updateMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOrUpdateProvider", propOrder = {
    "bean",
    "mode"
})
public class CreateOrUpdateProvider {

    protected Provider bean;
    @XmlSchemaType(name = "string")
    protected UpdateMode mode;

    /**
     * Gets the value of the bean property.
     * 
     * @return
     *     possible object is
     *     {@link Provider }
     *     
     */
    public Provider getBean() {
        return bean;
    }

    /**
     * Sets the value of the bean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider }
     *     
     */
    public void setBean(Provider value) {
        this.bean = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMode }
     *     
     */
    public UpdateMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMode }
     *     
     */
    public void setMode(UpdateMode value) {
        this.mode = value;
    }

}
