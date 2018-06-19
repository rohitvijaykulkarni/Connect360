
package com.ibm.mdm.esoa.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchForIdList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchForIdList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bean" type="{http://client.esoa.mdm.ibm.com/}client" minOccurs="0"/>
 *         &lt;element name="minScore" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cvwName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://client.esoa.mdm.ibm.com/}clientSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://client.esoa.mdm.ibm.com/}clientAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchForIdList", propOrder = {
    "bean",
    "minScore",
    "maxResults",
    "cvwName",
    "source",
    "attribute"
})
public class SearchForIdList {

    protected Client bean;
    protected short minScore;
    protected int maxResults;
    protected String cvwName;
    @XmlSchemaType(name = "string")
    protected List<ClientSource> source;
    @XmlSchemaType(name = "string")
    protected List<ClientAttribute> attribute;

    /**
     * Gets the value of the bean property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getBean() {
        return bean;
    }

    /**
     * Sets the value of the bean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setBean(Client value) {
        this.bean = value;
    }

    /**
     * Gets the value of the minScore property.
     * 
     */
    public short getMinScore() {
        return minScore;
    }

    /**
     * Sets the value of the minScore property.
     * 
     */
    public void setMinScore(short value) {
        this.minScore = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     */
    public int getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     */
    public void setMaxResults(int value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the cvwName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvwName() {
        return cvwName;
    }

    /**
     * Sets the value of the cvwName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvwName(String value) {
        this.cvwName = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientSource }
     * 
     * 
     */
    public List<ClientSource> getSource() {
        if (source == null) {
            source = new ArrayList<ClientSource>();
        }
        return this.source;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientAttribute }
     * 
     * 
     */
    public List<ClientAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<ClientAttribute>();
        }
        return this.attribute;
    }

}
