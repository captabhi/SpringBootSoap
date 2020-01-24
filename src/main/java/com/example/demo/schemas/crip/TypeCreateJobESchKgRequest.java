//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.24 at 11:30:43 AM IST 
//


package com.example.demo.schemas.crip;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * TypeCreateJobESchKg request root element
 * 
 * <p>Java class for TypeCreateJobESchKgRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeCreateJobESchKgRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}TypeBaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caseGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caseGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="representative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enforcementStatus" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}EnforcementStatus" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}AddressDescription"/&gt;
 *         &lt;element name="legalFormTypeOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobData" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}ESchKgJobData"/&gt;
 *         &lt;element name="additionalInput" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}KeyValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeCreateJobESchKgRequest", propOrder = {
    "externalId",
    "caseGroup",
    "caseGroupType",
    "representative",
    "enforcementStatus",
    "address",
    "legalFormTypeOriginal",
    "jobData",
    "additionalInput"
})
public class TypeCreateJobESchKgRequest
    extends TypeBaseRequest
{

    @XmlElementRef(name = "externalId", namespace = "http://www.crif-online.ch/webservices/crifsoapservice/v1.00", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalId;
    @XmlElementRef(name = "caseGroup", namespace = "http://www.crif-online.ch/webservices/crifsoapservice/v1.00", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caseGroup;
    @XmlElementRef(name = "caseGroupType", namespace = "http://www.crif-online.ch/webservices/crifsoapservice/v1.00", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caseGroupType;
    @XmlElementRef(name = "representative", namespace = "http://www.crif-online.ch/webservices/crifsoapservice/v1.00", type = JAXBElement.class, required = false)
    protected JAXBElement<String> representative;
    @XmlElementRef(name = "enforcementStatus", namespace = "http://www.crif-online.ch/webservices/crifsoapservice/v1.00", type = JAXBElement.class, required = false)
    protected JAXBElement<EnforcementStatus> enforcementStatus;
    @XmlElement(required = true, nillable = true)
    protected AddressDescription address;
    @XmlElementRef(name = "legalFormTypeOriginal", namespace = "http://www.crif-online.ch/webservices/crifsoapservice/v1.00", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalFormTypeOriginal;
    @XmlElement(required = true, nillable = true)
    protected ESchKgJobData jobData;
    protected List<KeyValuePair> additionalInput;

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalId(JAXBElement<String> value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the caseGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaseGroup() {
        return caseGroup;
    }

    /**
     * Sets the value of the caseGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaseGroup(JAXBElement<String> value) {
        this.caseGroup = value;
    }

    /**
     * Gets the value of the caseGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaseGroupType() {
        return caseGroupType;
    }

    /**
     * Sets the value of the caseGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaseGroupType(JAXBElement<String> value) {
        this.caseGroupType = value;
    }

    /**
     * Gets the value of the representative property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRepresentative() {
        return representative;
    }

    /**
     * Sets the value of the representative property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRepresentative(JAXBElement<String> value) {
        this.representative = value;
    }

    /**
     * Gets the value of the enforcementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnforcementStatus }{@code >}
     *     
     */
    public JAXBElement<EnforcementStatus> getEnforcementStatus() {
        return enforcementStatus;
    }

    /**
     * Sets the value of the enforcementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnforcementStatus }{@code >}
     *     
     */
    public void setEnforcementStatus(JAXBElement<EnforcementStatus> value) {
        this.enforcementStatus = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDescription }
     *     
     */
    public AddressDescription getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDescription }
     *     
     */
    public void setAddress(AddressDescription value) {
        this.address = value;
    }

    /**
     * Gets the value of the legalFormTypeOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalFormTypeOriginal() {
        return legalFormTypeOriginal;
    }

    /**
     * Sets the value of the legalFormTypeOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalFormTypeOriginal(JAXBElement<String> value) {
        this.legalFormTypeOriginal = value;
    }

    /**
     * Gets the value of the jobData property.
     * 
     * @return
     *     possible object is
     *     {@link ESchKgJobData }
     *     
     */
    public ESchKgJobData getJobData() {
        return jobData;
    }

    /**
     * Sets the value of the jobData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESchKgJobData }
     *     
     */
    public void setJobData(ESchKgJobData value) {
        this.jobData = value;
    }

    /**
     * Gets the value of the additionalInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePair }
     * 
     * 
     */
    public List<KeyValuePair> getAdditionalInput() {
        if (additionalInput == null) {
            additionalInput = new ArrayList<KeyValuePair>();
        }
        return this.additionalInput;
    }

}
