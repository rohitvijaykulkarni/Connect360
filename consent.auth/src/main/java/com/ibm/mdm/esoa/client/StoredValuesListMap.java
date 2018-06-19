
package com.ibm.mdm.esoa.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storedValuesListMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storedValuesListMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="storedValuesList" type="{http://client.esoa.mdm.ibm.com/}storedValuesListMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storedValuesListMap", propOrder = {
    "storedValuesList"
})
public class StoredValuesListMap {

    protected List<StoredValuesListMapEntry> storedValuesList;

    /**
     * Gets the value of the storedValuesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storedValuesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoredValuesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValuesListMapEntry }
     * 
     * 
     */
    public List<StoredValuesListMapEntry> getStoredValuesList() {
        if (storedValuesList == null) {
            storedValuesList = new ArrayList<StoredValuesListMapEntry>();
        }
        return this.storedValuesList;
    }

}
