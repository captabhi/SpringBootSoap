//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.24 at 11:30:43 AM IST 
//


package com.example.demo.schemas.crip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * GetReport request root element
 * 
 * <p>Java class for TypeBaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeBaseRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="control" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}Control"/&gt;
 *         &lt;element name="identityDescriptor" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}IdentityDescriptor"/&gt;
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeBaseRequest", propOrder = {
    "control",
    "identityDescriptor",
    "referenceNumber"
})
@XmlSeeAlso({
    TypeIdentifyAddressRequest.class,
    TypeAddressInvestigationRequest.class,
    TypeGetReportRequest.class,
    TypeGetArchivedReportRequest.class,
    TypeGetDebtDetailsRequest.class,
    TypeOrderOfflineReportRequest.class,
    TypeGetListOfReadyOfflineReportsRequest.class,
    TypePollOfflineReportResponseRequest.class,
    TypeIdVerificationRequest.class,
    TypeSubmitDataIssueRequest.class,
    TypeCancelDataIssueRequest.class,
    TypeGetDataIssueStatusRequest.class,
    TypeCreateJobESchKgRequest.class,
    TypeGetStatusESchKgRequest.class,
    TypeGetLastDocumentESchKgRequest.class,
    TypeGetWebAccessTokenESchKgRequest.class,
    TypeCheckOfflineReportOfficeRequest.class
})
public class TypeBaseRequest {

    @XmlElement(required = true)
    protected Control control;
    @XmlElement(required = true)
    protected IdentityDescriptor identityDescriptor;
    protected String referenceNumber;

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link Control }
     *     
     */
    public Control getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link Control }
     *     
     */
    public void setControl(Control value) {
        this.control = value;
    }

    /**
     * Gets the value of the identityDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDescriptor }
     *     
     */
    public IdentityDescriptor getIdentityDescriptor() {
        return identityDescriptor;
    }

    /**
     * Sets the value of the identityDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDescriptor }
     *     
     */
    public void setIdentityDescriptor(IdentityDescriptor value) {
        this.identityDescriptor = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

}
