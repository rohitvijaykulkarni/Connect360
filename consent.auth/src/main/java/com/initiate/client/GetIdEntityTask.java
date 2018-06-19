
package com.initiate.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getIdEntityTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getIdEntityTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskId" type="{http://client.initiate.com/}clientTaskId" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://client.initiate.com/}clientAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIdEntityTask", propOrder = {
    "taskId",
    "attributes"
})
public class GetIdEntityTask {

    protected ClientTaskId taskId;
    @XmlSchemaType(name = "string")
    protected List<ClientAttribute> attributes;

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link ClientTaskId }
     *     
     */
    public ClientTaskId getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientTaskId }
     *     
     */
    public void setTaskId(ClientTaskId value) {
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
