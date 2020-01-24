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
 * <p>Java class for ActivityIndex.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActivityIndex"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DELETED"/&gt;
 *     &lt;enumeration value="HIGH"/&gt;
 *     &lt;enumeration value="LOW"/&gt;
 *     &lt;enumeration value="MEDIUM"/&gt;
 *     &lt;enumeration value="VERY_HIGH"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActivityIndex")
@XmlEnum
public enum ActivityIndex {

    DELETED,
    HIGH,
    LOW,
    MEDIUM,
    VERY_HIGH,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ActivityIndex fromValue(String v) {
        return valueOf(v);
    }

}
