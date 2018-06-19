
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateProvEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateProvEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bean" type="{http://client.initiate.com/}provEntity" minOccurs="0"/>
 *         &lt;element name="modifySource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://client.initiate.com/}updateEntityType" minOccurs="0"/>
 *         &lt;element name="updateMode" type="{http://client.initiate.com/}updateMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateProvEntity", propOrder = {
    "bean",
    "modifySource",
    "mode",
    "updateMode"
})
public class UpdateProvEntity {

    protected ProvEntity bean;
    protected String modifySource;
    @XmlSchemaType(name = "string")
    protected UpdateEntityType mode;
    @XmlSchemaType(name = "string")
    protected UpdateMode updateMode;

    /**
     * Gets the value of the bean property.
     * 
     * @return
     *     possible object is
     *     {@link ProvEntity }
     *     
     */
    public ProvEntity getBean() {
        return bean;
    }

    /**
     * Sets the value of the bean property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvEntity }
     *     
     */
    public void setBean(ProvEntity value) {
        this.bean = value;
    }

    /**
     * Gets the value of the modifySource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifySource() {
        return modifySource;
    }

    /**
     * Sets the value of the modifySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifySource(String value) {
        this.modifySource = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateEntityType }
     *     
     */
    public UpdateEntityType getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateEntityType }
     *     
     */
    public void setMode(UpdateEntityType value) {
        this.mode = value;
    }

    /**
     * Gets the value of the updateMode property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateMode }
     *     
     */
    public UpdateMode getUpdateMode() {
        return updateMode;
    }

    /**
     * Sets the value of the updateMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateMode }
     *     
     */
    public void setUpdateMode(UpdateMode value) {
        this.updateMode = value;
    }

}
