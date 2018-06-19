
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caudRecno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="maudRecno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseAttribute", propOrder = {
    "caudRecno",
    "maudRecno"
})
@XmlSeeAlso({
    BaseRecordAttribute.class
})
public abstract class BaseAttribute {

    protected long caudRecno;
    protected long maudRecno;

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

}
