
package com.initiate.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="updateMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="AttrComp"/>
 *     &lt;enumeration value="Partial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "updateMode")
@XmlEnum
public enum UpdateMode {

    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("AttrComp")
    ATTR_COMP("AttrComp"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial");
    private final String value;

    UpdateMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateMode fromValue(String v) {
        for (UpdateMode c: UpdateMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
