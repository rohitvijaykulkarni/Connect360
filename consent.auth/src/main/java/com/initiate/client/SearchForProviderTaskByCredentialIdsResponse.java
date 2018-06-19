
package com.initiate.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchForProviderTaskByCredentialIdsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchForProviderTaskByCredentialIdsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderTask" type="{http://client.initiate.com/}providerTask" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchForProviderTaskByCredentialIdsResponse", propOrder = {
    "providerTask"
})
public class SearchForProviderTaskByCredentialIdsResponse {

    @XmlElement(name = "ProviderTask")
    protected List<ProviderTask> providerTask;

    /**
     * Gets the value of the providerTask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerTask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderTask }
     * 
     * 
     */
    public List<ProviderTask> getProviderTask() {
        if (providerTask == null) {
            providerTask = new ArrayList<ProviderTask>();
        }
        return this.providerTask;
    }

}
