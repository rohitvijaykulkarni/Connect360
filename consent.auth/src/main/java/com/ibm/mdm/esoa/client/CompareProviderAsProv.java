
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compareProviderAsProv complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compareProviderAsProv">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id1" type="{http://client.esoa.mdm.ibm.com/}providerId" minOccurs="0"/>
 *         &lt;element name="id2" type="{http://client.esoa.mdm.ibm.com/}providerId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compareProviderAsProv", propOrder = {
    "id1",
    "id2"
})
public class CompareProviderAsProv {

    protected ProviderId id1;
    protected ProviderId id2;

    /**
     * Gets the value of the id1 property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderId }
     *     
     */
    public ProviderId getId1() {
        return id1;
    }

    /**
     * Sets the value of the id1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderId }
     *     
     */
    public void setId1(ProviderId value) {
        this.id1 = value;
    }

    /**
     * Gets the value of the id2 property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderId }
     *     
     */
    public ProviderId getId2() {
        return id2;
    }

    /**
     * Sets the value of the id2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderId }
     *     
     */
    public void setId2(ProviderId value) {
        this.id2 = value;
    }

}
