
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for textSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="textSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnedHitCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalHitCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textSearchResult", propOrder = {
    "returnedHitCount",
    "totalHitCount"
})
@XmlSeeAlso({
    ClientTextSearchResult.class,
    ProviderTextSearchResult.class
})
public abstract class TextSearchResult {

    protected int returnedHitCount;
    protected long totalHitCount;

    /**
     * Gets the value of the returnedHitCount property.
     * 
     */
    public int getReturnedHitCount() {
        return returnedHitCount;
    }

    /**
     * Sets the value of the returnedHitCount property.
     * 
     */
    public void setReturnedHitCount(int value) {
        this.returnedHitCount = value;
    }

    /**
     * Gets the value of the totalHitCount property.
     * 
     */
    public long getTotalHitCount() {
        return totalHitCount;
    }

    /**
     * Sets the value of the totalHitCount property.
     * 
     */
    public void setTotalHitCount(long value) {
        this.totalHitCount = value;
    }

}
