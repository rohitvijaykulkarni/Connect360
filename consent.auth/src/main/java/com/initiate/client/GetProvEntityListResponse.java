
package com.initiate.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProvEntityListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProvEntityListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProvEntity" type="{http://client.initiate.com/}provEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProvEntityListResponse", propOrder = {
    "provEntity"
})
public class GetProvEntityListResponse {

    @XmlElement(name = "ProvEntity")
    protected List<ProvEntity> provEntity;

    /**
     * Gets the value of the provEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvEntity }
     * 
     * 
     */
    public List<ProvEntity> getProvEntity() {
        if (provEntity == null) {
            provEntity = new ArrayList<ProvEntity>();
        }
        return this.provEntity;
    }

}
