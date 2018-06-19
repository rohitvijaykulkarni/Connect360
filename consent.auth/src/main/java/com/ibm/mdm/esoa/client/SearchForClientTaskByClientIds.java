
package com.ibm.mdm.esoa.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchForClientTaskByClientIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchForClientTaskByClientIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordIds" type="{http://client.esoa.mdm.ibm.com/}clientId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://client.esoa.mdm.ibm.com/}clientAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchForClientTaskByClientIds", propOrder = {
    "recordIds",
    "attributes"
})
public class SearchForClientTaskByClientIds {

    protected List<ClientId> recordIds;
    @XmlSchemaType(name = "string")
    protected List<ClientAttribute> attributes;

    /**
     * Gets the value of the recordIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientId }
     * 
     * 
     */
    public List<ClientId> getRecordIds() {
        if (recordIds == null) {
            recordIds = new ArrayList<ClientId>();
        }
        return this.recordIds;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientAttribute }
     * 
     * 
     */
    public List<ClientAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<ClientAttribute>();
        }
        return this.attributes;
    }

}
