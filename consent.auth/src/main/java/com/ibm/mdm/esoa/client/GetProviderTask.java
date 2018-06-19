
package com.ibm.mdm.esoa.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProviderTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProviderTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskId" type="{http://client.esoa.mdm.ibm.com/}providerTaskId" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://client.esoa.mdm.ibm.com/}providerAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProviderTask", propOrder = {
    "taskId",
    "attributes"
})
public class GetProviderTask {

    protected ProviderTaskId taskId;
    @XmlSchemaType(name = "string")
    protected List<ProviderAttribute> attributes;

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderTaskId }
     *     
     */
    public ProviderTaskId getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderTaskId }
     *     
     */
    public void setTaskId(ProviderTaskId value) {
        this.taskId = value;
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
     * {@link ProviderAttribute }
     * 
     * 
     */
    public List<ProviderAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<ProviderAttribute>();
        }
        return this.attributes;
    }

}
