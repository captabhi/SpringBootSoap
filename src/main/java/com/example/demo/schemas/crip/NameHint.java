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
 * <p>Java class for NameHint.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameHint"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EMPTY"/&gt;
 *     &lt;enumeration value="CONFIRMED"/&gt;
 *     &lt;enumeration value="TYPO"/&gt;
 *     &lt;enumeration value="PARTIAL"/&gt;
 *     &lt;enumeration value="INCOMPLETE"/&gt;
 *     &lt;enumeration value="PROMINENT"/&gt;
 *     &lt;enumeration value="FICTIONAL"/&gt;
 *     &lt;enumeration value="INVALID"/&gt;
 *     &lt;enumeration value="NO_HINT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NameHint")
@XmlEnum
public enum NameHint {

    EMPTY,
    CONFIRMED,
    TYPO,
    PARTIAL,
    INCOMPLETE,
    PROMINENT,
    FICTIONAL,
    INVALID,
    NO_HINT;

    public String value() {
        return name();
    }

    public static NameHint fromValue(String v) {
        return valueOf(v);
    }

}
