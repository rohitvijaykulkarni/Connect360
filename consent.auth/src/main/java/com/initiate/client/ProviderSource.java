
package com.initiate.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="providerSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AIRSSD211"/>
 *     &lt;enumeration value="PCRD"/>
 *     &lt;enumeration value="CURAMPROV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "providerSource")
@XmlEnum
public enum ProviderSource {

    @XmlEnumValue("AIRSSD211")
    AIRSSD_211("AIRSSD211"),
    PCRD("PCRD"),
    CURAMPROV("CURAMPROV");
    private final String value;

    ProviderSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProviderSource fromValue(String v) {
        for (ProviderSource c: ProviderSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
