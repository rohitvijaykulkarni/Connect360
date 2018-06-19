
package com.initiate.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clientSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PCMS"/>
 *     &lt;enumeration value="CALWIN"/>
 *     &lt;enumeration value="SANWITS"/>
 *     &lt;enumeration value="CURAM"/>
 *     &lt;enumeration value="PHIS"/>
 *     &lt;enumeration value="ALEX"/>
 *     &lt;enumeration value="CMS"/>
 *     &lt;enumeration value="ELITE"/>
 *     &lt;enumeration value="CCBH"/>
 *     &lt;enumeration value="CWSCMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clientSource")
@XmlEnum
public enum ClientSource {

    PCMS,
    CALWIN,
    SANWITS,
    CURAM,
    PHIS,
    ALEX,
    CMS,
    ELITE,
    CCBH,
    CWSCMS;

    public String value() {
        return name();
    }

    public static ClientSource fromValue(String v) {
        return valueOf(v);
    }

}
