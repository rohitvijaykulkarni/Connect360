
package com.initiate.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="providerAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ProviderName"/>
 *     &lt;enumeration value="ProviderDescription"/>
 *     &lt;enumeration value="ProviderAKA"/>
 *     &lt;enumeration value="ProviderPhysicalAddress"/>
 *     &lt;enumeration value="ProviderMailingAddress"/>
 *     &lt;enumeration value="ProviderDisabilityAccess"/>
 *     &lt;enumeration value="ProviderBusServiceAccess"/>
 *     &lt;enumeration value="ProviderPhone"/>
 *     &lt;enumeration value="ProviderWebAddress"/>
 *     &lt;enumeration value="ProviderEmailAddress"/>
 *     &lt;enumeration value="ProviderContact"/>
 *     &lt;enumeration value="ProviderAvailableforDirectory"/>
 *     &lt;enumeration value="ProviderLastUpdateDateTime"/>
 *     &lt;enumeration value="ProviderProgram"/>
 *     &lt;enumeration value="ProviderSite"/>
 *     &lt;enumeration value="ProviderSiteServicesProgram"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "providerAttribute")
@XmlEnum
public enum ProviderAttribute {

    @XmlEnumValue("ProviderName")
    PROVIDER_NAME("ProviderName"),
    @XmlEnumValue("ProviderDescription")
    PROVIDER_DESCRIPTION("ProviderDescription"),
    @XmlEnumValue("ProviderAKA")
    PROVIDER_AKA("ProviderAKA"),
    @XmlEnumValue("ProviderPhysicalAddress")
    PROVIDER_PHYSICAL_ADDRESS("ProviderPhysicalAddress"),
    @XmlEnumValue("ProviderMailingAddress")
    PROVIDER_MAILING_ADDRESS("ProviderMailingAddress"),
    @XmlEnumValue("ProviderDisabilityAccess")
    PROVIDER_DISABILITY_ACCESS("ProviderDisabilityAccess"),
    @XmlEnumValue("ProviderBusServiceAccess")
    PROVIDER_BUS_SERVICE_ACCESS("ProviderBusServiceAccess"),
    @XmlEnumValue("ProviderPhone")
    PROVIDER_PHONE("ProviderPhone"),
    @XmlEnumValue("ProviderWebAddress")
    PROVIDER_WEB_ADDRESS("ProviderWebAddress"),
    @XmlEnumValue("ProviderEmailAddress")
    PROVIDER_EMAIL_ADDRESS("ProviderEmailAddress"),
    @XmlEnumValue("ProviderContact")
    PROVIDER_CONTACT("ProviderContact"),
    @XmlEnumValue("ProviderAvailableforDirectory")
    PROVIDER_AVAILABLEFOR_DIRECTORY("ProviderAvailableforDirectory"),
    @XmlEnumValue("ProviderLastUpdateDateTime")
    PROVIDER_LAST_UPDATE_DATE_TIME("ProviderLastUpdateDateTime"),
    @XmlEnumValue("ProviderProgram")
    PROVIDER_PROGRAM("ProviderProgram"),
    @XmlEnumValue("ProviderSite")
    PROVIDER_SITE("ProviderSite"),
    @XmlEnumValue("ProviderSiteServicesProgram")
    PROVIDER_SITE_SERVICES_PROGRAM("ProviderSiteServicesProgram");
    private final String value;

    ProviderAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProviderAttribute fromValue(String v) {
        for (ProviderAttribute c: ProviderAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
