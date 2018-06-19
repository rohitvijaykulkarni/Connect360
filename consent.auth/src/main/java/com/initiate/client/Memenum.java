
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memenum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memenum">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}baseRecordAttribute">
 *       &lt;sequence>
 *         &lt;element name="elemRecno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="elemVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memenum", propOrder = {
    "elemRecno",
    "elemVal"
})
public class Memenum
    extends BaseRecordAttribute
{

    protected Integer elemRecno;
    protected String elemVal;

    /**
     * Gets the value of the elemRecno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElemRecno() {
        return elemRecno;
    }

    /**
     * Sets the value of the elemRecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElemRecno(Integer value) {
        this.elemRecno = value;
    }

    /**
     * Gets the value of the elemVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElemVal() {
        return elemVal;
    }

    /**
     * Sets the value of the elemVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElemVal(String value) {
        this.elemVal = value;
    }

}
