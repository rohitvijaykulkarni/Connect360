
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for task complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="task">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caudRecno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maudRecno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="maxScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ownerId" type="{http://client.initiate.com/}credentialId" minOccurs="0"/>
 *         &lt;element name="prevOwnerId" type="{http://client.initiate.com/}credentialId" minOccurs="0"/>
 *         &lt;element name="recCTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="recMTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="setRecno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="taskStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "task", propOrder = {
    "caudRecno",
    "description",
    "maudRecno",
    "maxScore",
    "ownerId",
    "prevOwnerId",
    "recCTime",
    "recMTime",
    "setRecno",
    "taskStatus",
    "taskType"
})
@XmlSeeAlso({
    ProviderTask.class,
    ClientTask.class
})
public abstract class Task {

    protected long caudRecno;
    protected String description;
    protected long maudRecno;
    protected int maxScore;
    protected CredentialId ownerId;
    protected CredentialId prevOwnerId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recCTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recMTime;
    protected long setRecno;
    protected String taskStatus;
    protected String taskType;

    /**
     * Gets the value of the caudRecno property.
     * 
     */
    public long getCaudRecno() {
        return caudRecno;
    }

    /**
     * Sets the value of the caudRecno property.
     * 
     */
    public void setCaudRecno(long value) {
        this.caudRecno = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the maudRecno property.
     * 
     */
    public long getMaudRecno() {
        return maudRecno;
    }

    /**
     * Sets the value of the maudRecno property.
     * 
     */
    public void setMaudRecno(long value) {
        this.maudRecno = value;
    }

    /**
     * Gets the value of the maxScore property.
     * 
     */
    public int getMaxScore() {
        return maxScore;
    }

    /**
     * Sets the value of the maxScore property.
     * 
     */
    public void setMaxScore(int value) {
        this.maxScore = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialId }
     *     
     */
    public CredentialId getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialId }
     *     
     */
    public void setOwnerId(CredentialId value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the prevOwnerId property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialId }
     *     
     */
    public CredentialId getPrevOwnerId() {
        return prevOwnerId;
    }

    /**
     * Sets the value of the prevOwnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialId }
     *     
     */
    public void setPrevOwnerId(CredentialId value) {
        this.prevOwnerId = value;
    }

    /**
     * Gets the value of the recCTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecCTime() {
        return recCTime;
    }

    /**
     * Sets the value of the recCTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecCTime(XMLGregorianCalendar value) {
        this.recCTime = value;
    }

    /**
     * Gets the value of the recMTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecMTime() {
        return recMTime;
    }

    /**
     * Sets the value of the recMTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecMTime(XMLGregorianCalendar value) {
        this.recMTime = value;
    }

    /**
     * Gets the value of the setRecno property.
     * 
     */
    public long getSetRecno() {
        return setRecno;
    }

    /**
     * Sets the value of the setRecno property.
     * 
     */
    public void setSetRecno(long value) {
        this.setRecno = value;
    }

    /**
     * Gets the value of the taskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * Sets the value of the taskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatus(String value) {
        this.taskStatus = value;
    }

    /**
     * Gets the value of the taskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * Sets the value of the taskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskType(String value) {
        this.taskType = value;
    }

}
