
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for undoProviderRecordOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="undoProviderRecordOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auditData" type="{http://client.initiate.com/}auditData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "undoProviderRecordOperation", propOrder = {
    "auditData"
})
public class UndoProviderRecordOperation {

    protected AuditData auditData;

    /**
     * Gets the value of the auditData property.
     * 
     * @return
     *     possible object is
     *     {@link AuditData }
     *     
     */
    public AuditData getAuditData() {
        return auditData;
    }

    /**
     * Sets the value of the auditData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditData }
     *     
     */
    public void setAuditData(AuditData value) {
        this.auditData = value;
    }

}
