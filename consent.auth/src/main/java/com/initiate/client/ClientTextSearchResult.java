
package com.initiate.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientTextSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientTextSearchResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}textSearchResult">
 *       &lt;sequence>
 *         &lt;element name="results" type="{http://client.initiate.com/}clientTextSearchHitResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientTextSearchResult", propOrder = {
    "results"
})
public class ClientTextSearchResult
    extends TextSearchResult
{

    protected List<ClientTextSearchHitResult> results;

    /**
     * Gets the value of the results property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the results property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientTextSearchHitResult }
     * 
     * 
     */
    public List<ClientTextSearchHitResult> getResults() {
        if (results == null) {
            results = new ArrayList<ClientTextSearchHitResult>();
        }
        return this.results;
    }

}
