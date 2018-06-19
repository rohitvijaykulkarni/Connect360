
package com.ibm.mdm.esoa.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientTask">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.esoa.mdm.ibm.com/}task">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://client.esoa.mdm.ibm.com/}client" minOccurs="0"/>
 *         &lt;element name="clientTaskId" type="{http://client.esoa.mdm.ibm.com/}clientTaskId" minOccurs="0"/>
 *         &lt;element name="RelatedClientList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelatedClient" type="{http://client.esoa.mdm.ibm.com/}client" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientTask", propOrder = {
    "client",
    "clientTaskId",
    "relatedClientList"
})
@XmlSeeAlso({
    IdEntityTask.class,
    ClientRecordTask.class,
    ClientCustomTask.class
})
public class ClientTask
    extends Task
{

    protected Client client;
    protected ClientTaskId clientTaskId;
    @XmlElement(name = "RelatedClientList")
    protected ClientTask.RelatedClientList relatedClientList;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Gets the value of the clientTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link ClientTaskId }
     *     
     */
    public ClientTaskId getClientTaskId() {
        return clientTaskId;
    }

    /**
     * Sets the value of the clientTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientTaskId }
     *     
     */
    public void setClientTaskId(ClientTaskId value) {
        this.clientTaskId = value;
    }

    /**
     * Gets the value of the relatedClientList property.
     * 
     * @return
     *     possible object is
     *     {@link ClientTask.RelatedClientList }
     *     
     */
    public ClientTask.RelatedClientList getRelatedClientList() {
        return relatedClientList;
    }

    /**
     * Sets the value of the relatedClientList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientTask.RelatedClientList }
     *     
     */
    public void setRelatedClientList(ClientTask.RelatedClientList value) {
        this.relatedClientList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RelatedClient" type="{http://client.esoa.mdm.ibm.com/}client" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "relatedClient"
    })
    public static class RelatedClientList {

        @XmlElement(name = "RelatedClient")
        protected List<Client> relatedClient;

        /**
         * Gets the value of the relatedClient property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedClient property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedClient().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Client }
         * 
         * 
         */
        public List<Client> getRelatedClient() {
            if (relatedClient == null) {
                relatedClient = new ArrayList<Client>();
            }
            return this.relatedClient;
        }

    }

}
