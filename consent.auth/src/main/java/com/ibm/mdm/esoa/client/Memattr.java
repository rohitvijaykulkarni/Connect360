
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memattr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memattr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}baseRecordAttribute">
 *       &lt;sequence>
 *         &lt;element name="attrVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elemdesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memattr", propOrder = {
    "attrVal",
    "elemdesc"
})
public class Memattr
    extends BaseRecordAttribute
{

    protected String attrVal;
    protected String elemdesc;

    /**
     * Gets the value of the attrVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrVal() {
        return attrVal;
    }

    /**
     * Sets the value of the attrVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrVal(String value) {
        this.attrVal = value;
    }

    /**
     * Gets the value of the elemdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElemdesc() {
        return elemdesc;
    }

    /**
     * Sets the value of the elemdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElemdesc(String value) {
        this.elemdesc = value;
    }

}
