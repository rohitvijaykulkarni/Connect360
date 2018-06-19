
package com.initiate.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getIdEntityListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getIdEntityListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdEntity" type="{http://client.initiate.com/}idEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIdEntityListResponse", propOrder = {
    "idEntity"
})
public class GetIdEntityListResponse {

    @XmlElement(name = "IdEntity")
    protected List<IdEntity> idEntity;

    /**
     * Gets the value of the idEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdEntity }
     * 
     * 
     */
    public List<IdEntity> getIdEntity() {
        if (idEntity == null) {
            idEntity = new ArrayList<IdEntity>();
        }
        return this.idEntity;
    }

}
