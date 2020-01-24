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
import javax.xml.bind.annotation.XmlType;


/**
 * CompanyRegistrationData element
 * 
 * <p>Java class for CompanyRegistrationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyRegistrationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="registeredOfficeCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foundingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="capital" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}Amount" minOccurs="0"/&gt;
 *         &lt;element name="capitalPayed" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}Amount" minOccurs="0"/&gt;
 *         &lt;element name="capitalInKind" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}NullableBoolean" minOccurs="0"/&gt;
 *         &lt;element name="auditingCompany" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}CompanyBaseData" minOccurs="0"/&gt;
 *         &lt;element name="hasAuditingCompany" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}AuditingCompanyStatus" minOccurs="0"/&gt;
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyRegistrationData", propOrder = {
    "registeredOfficeCity",
    "foundingDate",
    "capital",
    "capitalPayed",
    "capitalInKind",
    "auditingCompany",
    "hasAuditingCompany",
    "purpose"
})
public class CompanyRegistrationData {

    protected String registeredOfficeCity;
    protected String foundingDate;
    protected Amount capital;
    protected Amount capitalPayed;
    @XmlSchemaType(name = "string")
    protected NullableBoolean capitalInKind;
    protected CompanyBaseData auditingCompany;
    @XmlSchemaType(name = "string")
    protected AuditingCompanyStatus hasAuditingCompany;
    protected String purpose;

    /**
     * Gets the value of the registeredOfficeCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredOfficeCity() {
        return registeredOfficeCity;
    }

    /**
     * Sets the value of the registeredOfficeCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredOfficeCity(String value) {
        this.registeredOfficeCity = value;
    }

    /**
     * Gets the value of the foundingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundingDate() {
        return foundingDate;
    }

    /**
     * Sets the value of the foundingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundingDate(String value) {
        this.foundingDate = value;
    }

    /**
     * Gets the value of the capital property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCapital(Amount value) {
        this.capital = value;
    }

    /**
     * Gets the value of the capitalPayed property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCapitalPayed() {
        return capitalPayed;
    }

    /**
     * Sets the value of the capitalPayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCapitalPayed(Amount value) {
        this.capitalPayed = value;
    }

    /**
     * Gets the value of the capitalInKind property.
     * 
     * @return
     *     possible object is
     *     {@link NullableBoolean }
     *     
     */
    public NullableBoolean getCapitalInKind() {
        return capitalInKind;
    }

    /**
     * Sets the value of the capitalInKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableBoolean }
     *     
     */
    public void setCapitalInKind(NullableBoolean value) {
        this.capitalInKind = value;
    }

    /**
     * Gets the value of the auditingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyBaseData }
     *     
     */
    public CompanyBaseData getAuditingCompany() {
        return auditingCompany;
    }

    /**
     * Sets the value of the auditingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyBaseData }
     *     
     */
    public void setAuditingCompany(CompanyBaseData value) {
        this.auditingCompany = value;
    }

    /**
     * Gets the value of the hasAuditingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AuditingCompanyStatus }
     *     
     */
    public AuditingCompanyStatus getHasAuditingCompany() {
        return hasAuditingCompany;
    }

    /**
     * Sets the value of the hasAuditingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditingCompanyStatus }
     *     
     */
    public void setHasAuditingCompany(AuditingCompanyStatus value) {
        this.hasAuditingCompany = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

}
