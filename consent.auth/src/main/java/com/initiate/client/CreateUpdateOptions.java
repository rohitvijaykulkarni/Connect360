
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createUpdateOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createUpdateOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doNothing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entPriority" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUpdateOptions", propOrder = {
    "doNothing",
    "entPriority"
})
public class CreateUpdateOptions {

    protected boolean doNothing;
    protected short entPriority;

    /**
     * Gets the value of the doNothing property.
     * 
     */
    public boolean isDoNothing() {
        return doNothing;
    }

    /**
     * Sets the value of the doNothing property.
     * 
     */
    public void setDoNothing(boolean value) {
        this.doNothing = value;
    }

    /**
     * Gets the value of the entPriority property.
     * 
     */
    public short getEntPriority() {
        return entPriority;
    }

    /**
     * Sets the value of the entPriority property.
     * 
     */
    public void setEntPriority(short value) {
        this.entPriority = value;
    }

}
