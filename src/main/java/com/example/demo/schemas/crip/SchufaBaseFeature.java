//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.24 at 11:30:43 AM IST 
//


package com.example.demo.schemas.crip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * SchufaBaseFeature element
 * 
 * <p>Java class for SchufaBaseFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchufaBaseFeature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="featureWithoutBirthdate" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}NullableBoolean" minOccurs="0"/&gt;
 *         &lt;element name="ownFeature" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}NullableBoolean" minOccurs="0"/&gt;
 *         &lt;element name="featureCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchufaBaseFeature", propOrder = {
    "type",
    "featureWithoutBirthdate",
    "ownFeature",
    "featureCode",
    "description",
    "text"
})
@XmlSeeAlso({
    SchufaFeature.class,
    SchufaTextFeature.class
})
public class SchufaBaseFeature {

    protected String type;
    @XmlSchemaType(name = "string")
    protected NullableBoolean featureWithoutBirthdate;
    @XmlSchemaType(name = "string")
    protected NullableBoolean ownFeature;
    protected String featureCode;
    protected String description;
    protected String text;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the featureWithoutBirthdate property.
     * 
     * @return
     *     possible object is
     *     {@link NullableBoolean }
     *     
     */
    public NullableBoolean getFeatureWithoutBirthdate() {
        return featureWithoutBirthdate;
    }

    /**
     * Sets the value of the featureWithoutBirthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableBoolean }
     *     
     */
    public void setFeatureWithoutBirthdate(NullableBoolean value) {
        this.featureWithoutBirthdate = value;
    }

    /**
     * Gets the value of the ownFeature property.
     * 
     * @return
     *     possible object is
     *     {@link NullableBoolean }
     *     
     */
    public NullableBoolean getOwnFeature() {
        return ownFeature;
    }

    /**
     * Sets the value of the ownFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableBoolean }
     *     
     */
    public void setOwnFeature(NullableBoolean value) {
        this.ownFeature = value;
    }

    /**
     * Gets the value of the featureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureCode() {
        return featureCode;
    }

    /**
     * Sets the value of the featureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureCode(String value) {
        this.featureCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
