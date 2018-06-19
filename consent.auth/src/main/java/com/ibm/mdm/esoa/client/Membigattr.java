
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for membigattr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="membigattr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}baseRecordAttribute">
 *       &lt;sequence>
 *         &lt;element name="attrval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "membigattr", propOrder = {
    "attrval"
})
public class Membigattr
    extends BaseRecordAttribute
{

    protected String attrval;

    /**
     * Gets the value of the attrval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrval() {
        return attrval;
    }

    /**
     * Sets the value of the attrval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrval(String value) {
        this.attrval = value;
    }

}
