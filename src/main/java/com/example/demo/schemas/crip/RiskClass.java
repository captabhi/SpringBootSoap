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
 * <p>Java class for RiskClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RiskClass"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_NEGATIVE"/&gt;
 *     &lt;enumeration value="PRE_LEGAL"/&gt;
 *     &lt;enumeration value="LEGAL_INITIAL"/&gt;
 *     &lt;enumeration value="LEGAL_ESCALATION"/&gt;
 *     &lt;enumeration value="LEGAL_DEFAULTED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RiskClass")
@XmlEnum
public enum RiskClass {

    NO_NEGATIVE,
    PRE_LEGAL,
    LEGAL_INITIAL,
    LEGAL_ESCALATION,
    LEGAL_DEFAULTED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static RiskClass fromValue(String v) {
        return valueOf(v);
    }

}
