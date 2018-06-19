
package com.ibm.mdm.esoa.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for textSearchForProvListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="textSearchForProvListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProvEntitySearchResult" type="{http://client.esoa.mdm.ibm.com/}provEntitySearchResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textSearchForProvListResponse", propOrder = {
    "provEntitySearchResult"
})
public class TextSearchForProvListResponse {

    @XmlElement(name = "ProvEntitySearchResult")
    protected List<ProvEntitySearchResult> provEntitySearchResult;

    /**
     * Gets the value of the provEntitySearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provEntitySearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvEntitySearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvEntitySearchResult }
     * 
     * 
     */
    public List<ProvEntitySearchResult> getProvEntitySearchResult() {
        if (provEntitySearchResult == null) {
            provEntitySearchResult = new ArrayList<ProvEntitySearchResult>();
        }
        return this.provEntitySearchResult;
    }

}
