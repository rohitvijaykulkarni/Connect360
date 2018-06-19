
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateIdEntityWithOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateIdEntityWithOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bean" type="{http://client.initiate.com/}idEntity" minOccurs="0"/>
 *         &lt;element name="modifySource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateEntityType" type="{http://client.initiate.com/}updateEntityType" minOccurs="0"/>
 *         &lt;element name="updateMode" type="{http://client.initiate.com/}updateMode" minOccurs="0"/>
 *         &lt;element name="createUpdateOptions" type="{http://client.initiate.com/}createUpdateOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateIdEntityWithOptions", propOrder = {
    "bean",
    "modifySource",
    "updateEntityType",
    "updateMode",
    "createUpdateOptions"
})
public class UpdateIdEntityWithOptions {

    protected IdEntity bean;
    protected String modifySource;
    @XmlSchemaType(name = "string")
    protected UpdateEntityType updateEntityType;
    @XmlSchemaType(name = "string")
    protected UpdateMode updateMode;
    protected CreateUpdateOptions createUpdateOptions;

    /**
     * Gets the value of the bean property.
     * 
     * @return
     *     possible object is
     *     {@link IdEntity }
     *     
     */
    public IdEntity getBean() {
        return bean;
    }

    /**
     * Sets the value of the bean property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdEntity }
     *     
     */
    public void setBean(IdEntity value) {
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
     * Gets the value of the updateEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateEntityType }
     *     
     */
    public UpdateEntityType getUpdateEntityType() {
        return updateEntityType;
    }

    /**
     * Sets the value of the updateEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateEntityType }
     *     
     */
    public void setUpdateEntityType(UpdateEntityType value) {
        this.updateEntityType = value;
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
