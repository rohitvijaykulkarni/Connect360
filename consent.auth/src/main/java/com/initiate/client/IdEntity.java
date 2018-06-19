
package com.initiate.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for idEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="idEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}entity">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://client.initiate.com/}client" minOccurs="0"/>
 *         &lt;element name="ClientIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClientId" type="{http://client.initiate.com/}clientId" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="entityId" type="{http://client.initiate.com/}idEntityId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idEntity", propOrder = {
    "client",
    "clientIdList",
    "entityId"
})
public class IdEntity
    extends Entity
{

    protected Client client;
    @XmlElement(name = "ClientIdList")
    protected IdEntity.ClientIdList clientIdList;
    protected IdEntityId entityId;

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
     * Gets the value of the clientIdList property.
     * 
     * @return
     *     possible object is
     *     {@link IdEntity.ClientIdList }
     *     
     */
    public IdEntity.ClientIdList getClientIdList() {
        return clientIdList;
    }

    /**
     * Sets the value of the clientIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdEntity.ClientIdList }
     *     
     */
    public void setClientIdList(IdEntity.ClientIdList value) {
        this.clientIdList = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link IdEntityId }
     *     
     */
    public IdEntityId getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdEntityId }
     *     
     */
    public void setEntityId(IdEntityId value) {
        this.entityId = value;
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
     *         &lt;element name="ClientId" type="{http://client.initiate.com/}clientId" maxOccurs="unbounded" minOccurs="0"/>
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
        "clientId"
    })
    public static class ClientIdList {

        @XmlElement(name = "ClientId")
        protected List<ClientId> clientId;

        /**
         * Gets the value of the clientId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clientId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClientId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClientId }
         * 
         * 
         */
        public List<ClientId> getClientId() {
            if (clientId == null) {
                clientId = new ArrayList<ClientId>();
            }
            return this.clientId;
        }

    }

}
