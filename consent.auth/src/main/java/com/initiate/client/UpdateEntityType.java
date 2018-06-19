
package com.initiate.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="updateEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ModifySourceExplicit"/>
 *     &lt;enumeration value="ModifySourceHardLink"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "updateEntityType")
@XmlEnum
public enum UpdateEntityType {

    @XmlEnumValue("ModifySourceExplicit")
    MODIFY_SOURCE_EXPLICIT("ModifySourceExplicit"),
    @XmlEnumValue("ModifySourceHardLink")
    MODIFY_SOURCE_HARD_LINK("ModifySourceHardLink");
    private final String value;

    UpdateEntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateEntityType fromValue(String v) {
        for (UpdateEntityType c: UpdateEntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
