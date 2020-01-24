//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.24 at 11:30:43 AM IST 
//


package com.example.demo.schemas.crip;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * CompanyDetailData element
 * 
 * <p>Java class for CompanyDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ultimateMotherCompany" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}CompanyBaseData" minOccurs="0"/&gt;
 *         &lt;element name="industryCodes" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}IndustryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nrOfEmployees" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}Range" minOccurs="0"/&gt;
 *         &lt;element name="sizeClass" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}CompanySizeClass" minOccurs="0"/&gt;
 *         &lt;element name="turnoverCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="turnoverRange" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}Range" minOccurs="0"/&gt;
 *         &lt;element name="turnoverInExport" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}NullableBoolean" minOccurs="0"/&gt;
 *         &lt;element name="activityIndex" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}ActivityIndex" minOccurs="0"/&gt;
 *         &lt;element name="knownSince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateFinancialStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateFinancialStatementHandedIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankAccounts" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}BankAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyDetailData", propOrder = {
    "ultimateMotherCompany",
    "industryCodes",
    "nrOfEmployees",
    "sizeClass",
    "turnoverCurrency",
    "turnoverRange",
    "turnoverInExport",
    "activityIndex",
    "knownSince",
    "dateFinancialStatement",
    "dateFinancialStatementHandedIn",
    "bankAccounts"
})
public class CompanyDetailData {

    protected CompanyBaseData ultimateMotherCompany;
    protected List<IndustryCode> industryCodes;
    protected Range nrOfEmployees;
    @XmlSchemaType(name = "string")
    protected CompanySizeClass sizeClass;
    protected String turnoverCurrency;
    protected Range turnoverRange;
    @XmlSchemaType(name = "string")
    protected NullableBoolean turnoverInExport;
    @XmlSchemaType(name = "string")
    protected ActivityIndex activityIndex;
    protected String knownSince;
    protected String dateFinancialStatement;
    protected String dateFinancialStatementHandedIn;
    protected List<BankAccount> bankAccounts;

    /**
     * Gets the value of the ultimateMotherCompany property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyBaseData }
     *     
     */
    public CompanyBaseData getUltimateMotherCompany() {
        return ultimateMotherCompany;
    }

    /**
     * Sets the value of the ultimateMotherCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyBaseData }
     *     
     */
    public void setUltimateMotherCompany(CompanyBaseData value) {
        this.ultimateMotherCompany = value;
    }

    /**
     * Gets the value of the industryCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryCode }
     * 
     * 
     */
    public List<IndustryCode> getIndustryCodes() {
        if (industryCodes == null) {
            industryCodes = new ArrayList<IndustryCode>();
        }
        return this.industryCodes;
    }

    /**
     * Gets the value of the nrOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getNrOfEmployees() {
        return nrOfEmployees;
    }

    /**
     * Sets the value of the nrOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setNrOfEmployees(Range value) {
        this.nrOfEmployees = value;
    }

    /**
     * Gets the value of the sizeClass property.
     * 
     * @return
     *     possible object is
     *     {@link CompanySizeClass }
     *     
     */
    public CompanySizeClass getSizeClass() {
        return sizeClass;
    }

    /**
     * Sets the value of the sizeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanySizeClass }
     *     
     */
    public void setSizeClass(CompanySizeClass value) {
        this.sizeClass = value;
    }

    /**
     * Gets the value of the turnoverCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoverCurrency() {
        return turnoverCurrency;
    }

    /**
     * Sets the value of the turnoverCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoverCurrency(String value) {
        this.turnoverCurrency = value;
    }

    /**
     * Gets the value of the turnoverRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getTurnoverRange() {
        return turnoverRange;
    }

    /**
     * Sets the value of the turnoverRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setTurnoverRange(Range value) {
        this.turnoverRange = value;
    }

    /**
     * Gets the value of the turnoverInExport property.
     * 
     * @return
     *     possible object is
     *     {@link NullableBoolean }
     *     
     */
    public NullableBoolean getTurnoverInExport() {
        return turnoverInExport;
    }

    /**
     * Sets the value of the turnoverInExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableBoolean }
     *     
     */
    public void setTurnoverInExport(NullableBoolean value) {
        this.turnoverInExport = value;
    }

    /**
     * Gets the value of the activityIndex property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityIndex }
     *     
     */
    public ActivityIndex getActivityIndex() {
        return activityIndex;
    }

    /**
     * Sets the value of the activityIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityIndex }
     *     
     */
    public void setActivityIndex(ActivityIndex value) {
        this.activityIndex = value;
    }

    /**
     * Gets the value of the knownSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnownSince() {
        return knownSince;
    }

    /**
     * Sets the value of the knownSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnownSince(String value) {
        this.knownSince = value;
    }

    /**
     * Gets the value of the dateFinancialStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFinancialStatement() {
        return dateFinancialStatement;
    }

    /**
     * Sets the value of the dateFinancialStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFinancialStatement(String value) {
        this.dateFinancialStatement = value;
    }

    /**
     * Gets the value of the dateFinancialStatementHandedIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFinancialStatementHandedIn() {
        return dateFinancialStatementHandedIn;
    }

    /**
     * Sets the value of the dateFinancialStatementHandedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFinancialStatementHandedIn(String value) {
        this.dateFinancialStatementHandedIn = value;
    }

    /**
     * Gets the value of the bankAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankAccount }
     * 
     * 
     */
    public List<BankAccount> getBankAccounts() {
        if (bankAccounts == null) {
            bankAccounts = new ArrayList<BankAccount>();
        }
        return this.bankAccounts;
    }

}