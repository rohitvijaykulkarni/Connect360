
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateQualifiedId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateQualifiedId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bean" type="{http://client.esoa.mdm.ibm.com/}client" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://client.esoa.mdm.ibm.com/}updateMode" minOccurs="0"/>
 *         &lt;element name="defaultWinner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateQualifiedId", propOrder = {
    "bean",
    "mode",
    "defaultWinner"
})
public class UpdateQualifiedId {

    protected Client bean;
    @XmlSchemaType(name = "string")
    protected UpdateMode mode;
    protected boolean defaultWinner;

    /**
     * Gets the value of the bean property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getBean() {
        return bean;
    }

    /**
     * Sets the value of the bean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setBean(Client value) {
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

    /**
     * Gets the value of the defaultWinner property.
     * 
     */
    public boolean isDefaultWinner() {
        return defaultWinner;
    }

    /**
     * Sets the value of the defaultWinner property.
     * 
     */
    public void setDefaultWinner(boolean value) {
        this.defaultWinner = value;
    }

}
