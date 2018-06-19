
package com.ibm.mdm.esoa.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProvEntityListByProvEntityIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProvEntityListByProvEntityIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://client.esoa.mdm.ibm.com/}provEntityId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cvwName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://client.esoa.mdm.ibm.com/}providerSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://client.esoa.mdm.ibm.com/}providerAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProvEntityListByProvEntityIds", propOrder = {
    "id",
    "cvwName",
    "source",
    "attribute"
})
public class GetProvEntityListByProvEntityIds {

    protected List<ProvEntityId> id;
    protected String cvwName;
    @XmlSchemaType(name = "string")
    protected List<ProviderSource> source;
    @XmlSchemaType(name = "string")
    protected List<ProviderAttribute> attribute;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvEntityId }
     * 
     * 
     */
    public List<ProvEntityId> getId() {
        if (id == null) {
            id = new ArrayList<ProvEntityId>();
        }
        return this.id;
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
     * {@link ProviderSource }
     * 
     * 
     */
    public List<ProviderSource> getSource() {
        if (source == null) {
            source = new ArrayList<ProviderSource>();
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
     * {@link ProviderAttribute }
     * 
     * 
     */
    public List<ProviderAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<ProviderAttribute>();
        }
        return this.attribute;
    }

}
