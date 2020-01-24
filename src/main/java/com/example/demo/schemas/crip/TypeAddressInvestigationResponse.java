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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * AddressInvestigationResponse root element
 * 
 * <p>Java class for TypeAddressInvestigationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeAddressInvestigationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}TypeBaseResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressMatchResult" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}AddressMatchResult"/&gt;
 *         &lt;element name="searchedAddressDeliverability" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}Deliverability"/&gt;
 *         &lt;element name="highestDeliverableAddress" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}AddressWithDeliverability" minOccurs="0"/&gt;
 *         &lt;element name="knownAddresses" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}AddressWithDeliverability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="householdAddresses" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}AddressWithDeliverability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="report" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deceasedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personStatus" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}PersonStatus" minOccurs="0"/&gt;
 *         &lt;element name="additionalOutput" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}KeyValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeAddressInvestigationResponse", propOrder = {
    "addressMatchResult",
    "searchedAddressDeliverability",
    "highestDeliverableAddress",
    "knownAddresses",
    "householdAddresses",
    "report",
    "deceasedDate",
    "personStatus",
    "additionalOutput"
})
public class TypeAddressInvestigationResponse
    extends TypeBaseResponse
{

    @XmlElement(required = true)
    protected AddressMatchResult addressMatchResult;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Deliverability searchedAddressDeliverability;
    protected AddressWithDeliverability highestDeliverableAddress;
    protected List<AddressWithDeliverability> knownAddresses;
    protected List<AddressWithDeliverability> householdAddresses;
    protected String report;
    protected String deceasedDate;
    @XmlSchemaType(name = "string")
    protected PersonStatus personStatus;
    protected List<KeyValuePair> additionalOutput;

    /**
     * Gets the value of the addressMatchResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddressMatchResult }
     *     
     */
    public AddressMatchResult getAddressMatchResult() {
        return addressMatchResult;
    }

    /**
     * Sets the value of the addressMatchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressMatchResult }
     *     
     */
    public void setAddressMatchResult(AddressMatchResult value) {
        this.addressMatchResult = value;
    }

    /**
     * Gets the value of the searchedAddressDeliverability property.
     * 
     * @return
     *     possible object is
     *     {@link Deliverability }
     *     
     */
    public Deliverability getSearchedAddressDeliverability() {
        return searchedAddressDeliverability;
    }

    /**
     * Sets the value of the searchedAddressDeliverability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deliverability }
     *     
     */
    public void setSearchedAddressDeliverability(Deliverability value) {
        this.searchedAddressDeliverability = value;
    }

    /**
     * Gets the value of the highestDeliverableAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressWithDeliverability }
     *     
     */
    public AddressWithDeliverability getHighestDeliverableAddress() {
        return highestDeliverableAddress;
    }

    /**
     * Sets the value of the highestDeliverableAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressWithDeliverability }
     *     
     */
    public void setHighestDeliverableAddress(AddressWithDeliverability value) {
        this.highestDeliverableAddress = value;
    }

    /**
     * Gets the value of the knownAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knownAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnownAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressWithDeliverability }
     * 
     * 
     */
    public List<AddressWithDeliverability> getKnownAddresses() {
        if (knownAddresses == null) {
            knownAddresses = new ArrayList<AddressWithDeliverability>();
        }
        return this.knownAddresses;
    }

    /**
     * Gets the value of the householdAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the householdAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseholdAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressWithDeliverability }
     * 
     * 
     */
    public List<AddressWithDeliverability> getHouseholdAddresses() {
        if (householdAddresses == null) {
            householdAddresses = new ArrayList<AddressWithDeliverability>();
        }
        return this.householdAddresses;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReport(String value) {
        this.report = value;
    }

    /**
     * Gets the value of the deceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceasedDate() {
        return deceasedDate;
    }

    /**
     * Sets the value of the deceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceasedDate(String value) {
        this.deceasedDate = value;
    }

    /**
     * Gets the value of the personStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PersonStatus }
     *     
     */
    public PersonStatus getPersonStatus() {
        return personStatus;
    }

    /**
     * Sets the value of the personStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonStatus }
     *     
     */
    public void setPersonStatus(PersonStatus value) {
        this.personStatus = value;
    }

    /**
     * Gets the value of the additionalOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePair }
     * 
     * 
     */
    public List<KeyValuePair> getAdditionalOutput() {
        if (additionalOutput == null) {
            additionalOutput = new ArrayList<KeyValuePair>();
        }
        return this.additionalOutput;
    }

}
