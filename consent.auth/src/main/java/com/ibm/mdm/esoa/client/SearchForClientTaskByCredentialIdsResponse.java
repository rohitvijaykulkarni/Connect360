
package com.ibm.mdm.esoa.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchForClientTaskByCredentialIdsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchForClientTaskByCredentialIdsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientTask" type="{http://client.esoa.mdm.ibm.com/}clientTask" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchForClientTaskByCredentialIdsResponse", propOrder = {
    "clientTask"
})
public class SearchForClientTaskByCredentialIdsResponse {

    @XmlElement(name = "ClientTask")
    protected List<ClientTask> clientTask;

    /**
     * Gets the value of the clientTask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientTask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientTask }
     * 
     * 
     */
    public List<ClientTask> getClientTask() {
        if (clientTask == null) {
            clientTask = new ArrayList<ClientTask>();
        }
        return this.clientTask;
    }

}
