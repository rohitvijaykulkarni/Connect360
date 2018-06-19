
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerRecordTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerRecordTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}providerTask">
 *       &lt;sequence>
 *         &lt;element name="supProvider" type="{http://client.esoa.mdm.ibm.com/}provider" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerRecordTask", propOrder = {
    "supProvider"
})
public class ProviderRecordTask
    extends ProviderTask
{

    protected Provider supProvider;

    /**
     * Gets the value of the supProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Provider }
     *     
     */
    public Provider getSupProvider() {
        return supProvider;
    }

    /**
     * Sets the value of the supProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Provider }
     *     
     */
    public void setSupProvider(Provider value) {
        this.supProvider = value;
    }

}
