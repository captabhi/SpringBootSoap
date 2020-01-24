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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * OrganizationPositionFunction element
 * 
 * <p>Java class for OrganizationPositionFunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationPositionFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="functionType" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}FunctionType"/&gt;
 *         &lt;element name="functionTypeOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="functionPriority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationPositionFunction", propOrder = {
    "functionType",
    "functionTypeOriginal",
    "functionPriority"
})
public class OrganizationPositionFunction {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FunctionType functionType;
    protected String functionTypeOriginal;
    protected BigInteger functionPriority;

    /**
     * Gets the value of the functionType property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionType }
     *     
     */
    public FunctionType getFunctionType() {
        return functionType;
    }

    /**
     * Sets the value of the functionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionType }
     *     
     */
    public void setFunctionType(FunctionType value) {
        this.functionType = value;
    }

    /**
     * Gets the value of the functionTypeOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionTypeOriginal() {
        return functionTypeOriginal;
    }

    /**
     * Sets the value of the functionTypeOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionTypeOriginal(String value) {
        this.functionTypeOriginal = value;
    }

    /**
     * Gets the value of the functionPriority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFunctionPriority() {
        return functionPriority;
    }

    /**
     * Sets the value of the functionPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFunctionPriority(BigInteger value) {
        this.functionPriority = value;
    }

}