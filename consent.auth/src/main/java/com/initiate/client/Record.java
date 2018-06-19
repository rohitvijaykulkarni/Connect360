
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="record">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caudRecno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="maudRecno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="memSeqno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="memStat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memVerno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "record", propOrder = {
    "caudRecno",
    "maudRecno",
    "memSeqno",
    "memStat",
    "memVerno"
})
@XmlSeeAlso({
    Provider.class,
    Client.class
})
public abstract class Record {

    protected long caudRecno;
    protected long maudRecno;
    protected int memSeqno;
    protected String memStat;
    protected int memVerno;

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

    /**
     * Gets the value of the memSeqno property.
     * 
     */
    public int getMemSeqno() {
        return memSeqno;
    }

    /**
     * Sets the value of the memSeqno property.
     * 
     */
    public void setMemSeqno(int value) {
        this.memSeqno = value;
    }

    /**
     * Gets the value of the memStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemStat() {
        return memStat;
    }

    /**
     * Sets the value of the memStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemStat(String value) {
        this.memStat = value;
    }

    /**
     * Gets the value of the memVerno property.
     * 
     */
    public int getMemVerno() {
        return memVerno;
    }

    /**
     * Sets the value of the memVerno property.
     * 
     */
    public void setMemVerno(int value) {
        this.memVerno = value;
    }

}
