//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.24 at 11:30:43 AM IST 
//


package com.example.demo.schemas.crip;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdentificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IDENTITY_IN_HOUSE"/&gt;
 *     &lt;enumeration value="IDENTITY_IN_STREET"/&gt;
 *     &lt;enumeration value="IDENTITY_IN_CITY"/&gt;
 *     &lt;enumeration value="IDENTITY_IN_UNIVERSE"/&gt;
 *     &lt;enumeration value="OWNER"/&gt;
 *     &lt;enumeration value="LASTNAME_IN_HOUSE"/&gt;
 *     &lt;enumeration value="COMPANY_GROUP"/&gt;
 *     &lt;enumeration value="NOT_IDENTIFIED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IdentificationType")
@XmlEnum
public enum IdentificationType {

    IDENTITY_IN_HOUSE,
    IDENTITY_IN_STREET,
    IDENTITY_IN_CITY,
    IDENTITY_IN_UNIVERSE,
    OWNER,
    LASTNAME_IN_HOUSE,
    COMPANY_GROUP,
    NOT_IDENTIFIED;

    public String value() {
        return name();
    }

    public static IdentificationType fromValue(String v) {
        return valueOf(v);
    }

}
