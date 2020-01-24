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
 * <p>Java class for IdVerificationDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdVerificationDocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DRIVING_LICENCE"/&gt;
 *     &lt;enumeration value="IDENTITY_CARD"/&gt;
 *     &lt;enumeration value="PASSPORT"/&gt;
 *     &lt;enumeration value="RESIDENCE_PERMIT"/&gt;
 *     &lt;enumeration value="UTILITY_BILL"/&gt;
 *     &lt;enumeration value="UNDETERMINED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IdVerificationDocumentType")
@XmlEnum
public enum IdVerificationDocumentType {

    DRIVING_LICENCE,
    IDENTITY_CARD,
    PASSPORT,
    RESIDENCE_PERMIT,
    UTILITY_BILL,
    UNDETERMINED;

    public String value() {
        return name();
    }

    public static IdVerificationDocumentType fromValue(String v) {
        return valueOf(v);
    }

}