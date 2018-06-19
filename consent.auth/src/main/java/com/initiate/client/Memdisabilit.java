
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memdisabilit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memdisabilit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}baseRecordAttribute">
 *       &lt;sequence>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabilityEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabilityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabilityStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memdisabilit", propOrder = {
    "caseId",
    "disabilityEndDate",
    "disabilityName",
    "disabilityStartDate",
    "lastUpdate"
})
public class Memdisabilit
    extends BaseRecordAttribute
{

    protected String caseId;
    protected String disabilityEndDate;
    protected String disabilityName;
    protected String disabilityStartDate;
    protected String lastUpdate;

    /**
     * Gets the value of the caseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseId(String value) {
        this.caseId = value;
    }

    /**
     * Gets the value of the disabilityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityEndDate() {
        return disabilityEndDate;
    }

    /**
     * Sets the value of the disabilityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityEndDate(String value) {
        this.disabilityEndDate = value;
    }

    /**
     * Gets the value of the disabilityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityName() {
        return disabilityName;
    }

    /**
     * Sets the value of the disabilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityName(String value) {
        this.disabilityName = value;
    }

    /**
     * Gets the value of the disabilityStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityStartDate() {
        return disabilityStartDate;
    }

    /**
     * Sets the value of the disabilityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityStartDate(String value) {
        this.disabilityStartDate = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdate(String value) {
        this.lastUpdate = value;
    }

}
