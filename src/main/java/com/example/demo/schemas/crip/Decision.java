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
 * <p>Java class for Decision.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Decision"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LIGHT_GREEN"/&gt;
 *     &lt;enumeration value="GREEN"/&gt;
 *     &lt;enumeration value="YELLOW_GREEN"/&gt;
 *     &lt;enumeration value="YELLOW"/&gt;
 *     &lt;enumeration value="ORANGE"/&gt;
 *     &lt;enumeration value="RED"/&gt;
 *     &lt;enumeration value="DARK_RED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Decision")
@XmlEnum
public enum Decision {

    LIGHT_GREEN,
    GREEN,
    YELLOW_GREEN,
    YELLOW,
    ORANGE,
    RED,
    DARK_RED;

    public String value() {
        return name();
    }

    public static Decision fromValue(String v) {
        return valueOf(v);
    }

}