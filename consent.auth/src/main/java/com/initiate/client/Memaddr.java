
package com.initiate.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memaddr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="memaddr">
 *   &lt;complexContent>
 *     &lt;extension base="{http://client.initiate.com/}baseRecordAttribute">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoText1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memaddr", propOrder = {
    "city",
    "country",
    "geoCode1",
    "geoCode2",
    "geoText1",
    "stLine1",
    "stLine2",
    "stLine3",
    "stLine4",
    "state",
    "zipCode"
})
public class Memaddr
    extends BaseRecordAttribute
{

    protected String city;
    protected String country;
    protected String geoCode1;
    protected String geoCode2;
    protected String geoText1;
    protected String stLine1;
    protected String stLine2;
    protected String stLine3;
    protected String stLine4;
    protected String state;
    protected String zipCode;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the geoCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoCode1() {
        return geoCode1;
    }

    /**
     * Sets the value of the geoCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoCode1(String value) {
        this.geoCode1 = value;
    }

    /**
     * Gets the value of the geoCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoCode2() {
        return geoCode2;
    }

    /**
     * Sets the value of the geoCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoCode2(String value) {
        this.geoCode2 = value;
    }

    /**
     * Gets the value of the geoText1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoText1() {
        return geoText1;
    }

    /**
     * Sets the value of the geoText1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoText1(String value) {
        this.geoText1 = value;
    }

    /**
     * Gets the value of the stLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStLine1() {
        return stLine1;
    }

    /**
     * Sets the value of the stLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStLine1(String value) {
        this.stLine1 = value;
    }

    /**
     * Gets the value of the stLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStLine2() {
        return stLine2;
    }

    /**
     * Sets the value of the stLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStLine2(String value) {
        this.stLine2 = value;
    }

    /**
     * Gets the value of the stLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStLine3() {
        return stLine3;
    }

    /**
     * Sets the value of the stLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStLine3(String value) {
        this.stLine3 = value;
    }

    /**
     * Gets the value of the stLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStLine4() {
        return stLine4;
    }

    /**
     * Sets the value of the stLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStLine4(String value) {
        this.stLine4 = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
