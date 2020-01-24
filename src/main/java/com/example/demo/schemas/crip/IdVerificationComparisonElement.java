//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.24 at 11:30:43 AM IST 
//


package com.example.demo.schemas.crip;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * IdVerificationComparisonElement element
 * 
 * <p>Java class for IdVerificationComparisonElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdVerificationComparisonElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="providedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="mrzValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providedVsDocumentSimilarity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="providedVsMrzSimilarity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="documentVsMrzSimilarity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdVerificationComparisonElement", propOrder = {
    "fieldName",
    "providedValue",
    "documentValue",
    "percentage",
    "mrzValue",
    "providedVsDocumentSimilarity",
    "providedVsMrzSimilarity",
    "documentVsMrzSimilarity"
})
public class IdVerificationComparisonElement {

    @XmlElement(required = true)
    protected String fieldName;
    protected String providedValue;
    protected String documentValue;
    protected BigInteger percentage;
    protected String mrzValue;
    protected BigInteger providedVsDocumentSimilarity;
    protected BigInteger providedVsMrzSimilarity;
    protected BigInteger documentVsMrzSimilarity;

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the providedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvidedValue() {
        return providedValue;
    }

    /**
     * Sets the value of the providedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvidedValue(String value) {
        this.providedValue = value;
    }

    /**
     * Gets the value of the documentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentValue() {
        return documentValue;
    }

    /**
     * Sets the value of the documentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentValue(String value) {
        this.documentValue = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentage(BigInteger value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the mrzValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrzValue() {
        return mrzValue;
    }

    /**
     * Sets the value of the mrzValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrzValue(String value) {
        this.mrzValue = value;
    }

    /**
     * Gets the value of the providedVsDocumentSimilarity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProvidedVsDocumentSimilarity() {
        return providedVsDocumentSimilarity;
    }

    /**
     * Sets the value of the providedVsDocumentSimilarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProvidedVsDocumentSimilarity(BigInteger value) {
        this.providedVsDocumentSimilarity = value;
    }

    /**
     * Gets the value of the providedVsMrzSimilarity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProvidedVsMrzSimilarity() {
        return providedVsMrzSimilarity;
    }

    /**
     * Sets the value of the providedVsMrzSimilarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProvidedVsMrzSimilarity(BigInteger value) {
        this.providedVsMrzSimilarity = value;
    }

    /**
     * Gets the value of the documentVsMrzSimilarity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentVsMrzSimilarity() {
        return documentVsMrzSimilarity;
    }

    /**
     * Sets the value of the documentVsMrzSimilarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentVsMrzSimilarity(BigInteger value) {
        this.documentVsMrzSimilarity = value;
    }

}
