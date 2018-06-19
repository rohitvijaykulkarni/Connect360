
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provEntityTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provEntityTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}providerTask">
 *       &lt;sequence>
 *         &lt;element name="supProvEntity" type="{http://client.esoa.mdm.ibm.com/}provEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provEntityTask", propOrder = {
    "supProvEntity"
})
public class ProvEntityTask
    extends ProviderTask
{

    protected ProvEntity supProvEntity;

    /**
     * Gets the value of the supProvEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ProvEntity }
     *     
     */
    public ProvEntity getSupProvEntity() {
        return supProvEntity;
    }

    /**
     * Sets the value of the supProvEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvEntity }
     *     
     */
    public void setSupProvEntity(ProvEntity value) {
        this.supProvEntity = value;
    }

}
