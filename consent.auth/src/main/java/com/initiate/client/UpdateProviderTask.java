
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateProviderTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateProviderTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskId" type="{http://client.initiate.com/}providerTaskId" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credentialId" type="{http://client.initiate.com/}credentialId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateProviderTask", propOrder = {
    "taskId",
    "status",
    "credentialId"
})
public class UpdateProviderTask {

    protected ProviderTaskId taskId;
    protected String status;
    protected CredentialId credentialId;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the credentialId property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialId }
     *     
     */
    public CredentialId getCredentialId() {
        return credentialId;
    }

    /**
     * Sets the value of the credentialId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialId }
     *     
     */
    public void setCredentialId(CredentialId value) {
        this.credentialId = value;
    }

}
