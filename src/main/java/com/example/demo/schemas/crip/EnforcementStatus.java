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
 * <p>Java class for EnforcementStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnforcementStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENFORCEMENT_DEMAND"/&gt;
 *     &lt;enumeration value="ENFORCEMENT_INSPECTION_RESULT"/&gt;
 *     &lt;enumeration value="ENFORCEMENT_RECEJTED"/&gt;
 *     &lt;enumeration value="PAYMENT_SUMMON_CONTESTED"/&gt;
 *     &lt;enumeration value="PAYMENT_SUMMON_UNCONTESTED"/&gt;
 *     &lt;enumeration value="DEBTOR_MOVED_AWAY"/&gt;
 *     &lt;enumeration value="PAYMENT_SUMMON_UNDELIVERABLE"/&gt;
 *     &lt;enumeration value="CONTINUATION_REQUEST"/&gt;
 *     &lt;enumeration value="ENFORCEMENT_CANCELED"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnforcementStatus")
@XmlEnum
public enum EnforcementStatus {

    ENFORCEMENT_DEMAND,
    ENFORCEMENT_INSPECTION_RESULT,
    ENFORCEMENT_RECEJTED,
    PAYMENT_SUMMON_CONTESTED,
    PAYMENT_SUMMON_UNCONTESTED,
    DEBTOR_MOVED_AWAY,
    PAYMENT_SUMMON_UNDELIVERABLE,
    CONTINUATION_REQUEST,
    ENFORCEMENT_CANCELED,
    OTHER;

    public String value() {
        return name();
    }

    public static EnforcementStatus fromValue(String v) {
        return valueOf(v);
    }

}
