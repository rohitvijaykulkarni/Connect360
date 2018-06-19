
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseRecordAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseRecordAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}baseAttribute">
 *       &lt;sequence>
 *         &lt;element name="asaIdxno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="memSeqno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseRecordAttribute", propOrder = {
    "asaIdxno",
    "memSeqno"
})
@XmlSeeAlso({
    Memprovste.class,
    Memident.class,
    Memphone.class,
    Memlgaddr.class,
    Memprovctnt.class,
    Membigattr.class,
    Memlngnm.class,
    Memprovphn.class,
    Memlanguage.class,
    Memdate.class,
    Memstesvcprg.class,
    Memprogram.class,
    Memprovprog.class,
    Memattr.class,
    Memdisabilit.class,
    Mememcntct.class
})
public abstract class BaseRecordAttribute
    extends BaseAttribute
{

    protected int asaIdxno;
    protected int memSeqno;

    /**
     * Gets the value of the asaIdxno property.
     * 
     */
    public int getAsaIdxno() {
        return asaIdxno;
    }

    /**
     * Sets the value of the asaIdxno property.
     * 
     */
    public void setAsaIdxno(int value) {
        this.asaIdxno = value;
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

}
