
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for provEntitySearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provEntitySearchResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}searchResult">
 *       &lt;sequence>
 *         &lt;element name="provEntity" type="{http://client.esoa.mdm.ibm.com/}provEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provEntitySearchResult", propOrder = {
    "provEntity"
})
public class ProvEntitySearchResult
    extends SearchResult
{

    protected ProvEntity provEntity;

    /**
     * Gets the value of the provEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ProvEntity }
     *     
     */
    public ProvEntity getProvEntity() {
        return provEntity;
    }

    /**
     * Sets the value of the provEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvEntity }
     *     
     */
    public void setProvEntity(ProvEntity value) {
        this.provEntity = value;
    }

}
