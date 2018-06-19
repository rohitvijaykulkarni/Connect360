
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for textSearchClientListAsIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="textSearchClientListAsIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientTextSearchResult" type="{http://client.initiate.com/}clientTextSearchResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textSearchClientListAsIdResponse", propOrder = {
    "clientTextSearchResult"
})
public class TextSearchClientListAsIdResponse {

    @XmlElement(name = "ClientTextSearchResult")
    protected ClientTextSearchResult clientTextSearchResult;

    /**
     * Gets the value of the clientTextSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link ClientTextSearchResult }
     *     
     */
    public ClientTextSearchResult getClientTextSearchResult() {
        return clientTextSearchResult;
    }

    /**
     * Sets the value of the clientTextSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientTextSearchResult }
     *     
     */
    public void setClientTextSearchResult(ClientTextSearchResult value) {
        this.clientTextSearchResult = value;
    }

}
