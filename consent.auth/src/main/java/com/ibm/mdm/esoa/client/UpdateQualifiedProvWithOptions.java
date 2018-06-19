
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateQualifiedProvWithOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateQualifiedProvWithOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bean" type="{http://client.esoa.mdm.ibm.com/}provider" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://client.esoa.mdm.ibm.com/}updateMode" minOccurs="0"/>
 *         &lt;element name="defaultWinner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="createUpdateOptions" type="{http://client.esoa.mdm.ibm.com/}createUpdateOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateQualifiedProvWithOptions", propOrder = {
    "bean",
    "mode",
    "defaultWinner",
    "createUpdateOptions"
})
public class UpdateQualifiedProvWithOptions {

    protected Provider bean;
    @XmlSchemaType(name = "string")
    protected UpdateMode mode;
    protected boolean defaultWinner;
    protected CreateUpdateOptions createUpdateOptions;

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

    /**
     * Gets the value of the createUpdateOptions property.
     * 
     * @return
     *     possible object is
     *     {@link CreateUpdateOptions }
     *     
     */
    public CreateUpdateOptions getCreateUpdateOptions() {
        return createUpdateOptions;
    }

    /**
     * Sets the value of the createUpdateOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateUpdateOptions }
     *     
     */
    public void setCreateUpdateOptions(CreateUpdateOptions value) {
        this.createUpdateOptions = value;
    }

}
