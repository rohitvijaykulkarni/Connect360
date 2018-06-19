
package com.ibm.mdm.esoa.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for idEntitySearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="idEntitySearchResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}searchResult">
 *       &lt;sequence>
 *         &lt;element name="idEntity" type="{http://client.esoa.mdm.ibm.com/}idEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idEntitySearchResult", propOrder = {
    "idEntity"
})
public class IdEntitySearchResult
    extends SearchResult
{

    protected IdEntity idEntity;

    /**
     * Gets the value of the idEntity property.
     * 
     * @return
     *     possible object is
     *     {@link IdEntity }
     *     
     */
    public IdEntity getIdEntity() {
        return idEntity;
    }

    /**
     * Sets the value of the idEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdEntity }
     *     
     */
    public void setIdEntity(IdEntity value) {
        this.idEntity = value;
    }

}
