
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for idEntityTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="idEntityTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}clientTask">
 *       &lt;sequence>
 *         &lt;element name="supIdEntity" type="{http://client.initiate.com/}idEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idEntityTask", propOrder = {
    "supIdEntity"
})
public class IdEntityTask
    extends ClientTask
{

    protected IdEntity supIdEntity;

    /**
     * Gets the value of the supIdEntity property.
     * 
     * @return
     *     possible object is
     *     {@link IdEntity }
     *     
     */
    public IdEntity getSupIdEntity() {
        return supIdEntity;
    }

    /**
     * Sets the value of the supIdEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdEntity }
     *     
     */
    public void setSupIdEntity(IdEntity value) {
        this.supIdEntity = value;
    }

}
