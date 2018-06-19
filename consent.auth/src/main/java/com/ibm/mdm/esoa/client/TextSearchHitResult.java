
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for textSearchHitResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="textSearchHitResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}searchResult">
 *       &lt;sequence>
 *         &lt;element name="fullTextScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="storedValues" type="{http://client.esoa.mdm.ibm.com/}storedValuesListMap" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textSearchHitResult", propOrder = {
    "fullTextScore",
    "storedValues"
})
@XmlSeeAlso({
    ProviderTextSearchHitResult.class,
    ClientTextSearchHitResult.class
})
public abstract class TextSearchHitResult
    extends SearchResult
{

    protected double fullTextScore;
    protected StoredValuesListMap storedValues;

    /**
     * Gets the value of the fullTextScore property.
     * 
     */
    public double getFullTextScore() {
        return fullTextScore;
    }

    /**
     * Sets the value of the fullTextScore property.
     * 
     */
    public void setFullTextScore(double value) {
        this.fullTextScore = value;
    }

    /**
     * Gets the value of the storedValues property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValuesListMap }
     *     
     */
    public StoredValuesListMap getStoredValues() {
        return storedValues;
    }

    /**
     * Sets the value of the storedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValuesListMap }
     *     
     */
    public void setStoredValues(StoredValuesListMap value) {
        this.storedValues = value;
    }

}
