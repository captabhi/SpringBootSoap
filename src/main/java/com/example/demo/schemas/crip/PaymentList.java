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
import javax.xml.bind.annotation.XmlType;


/**
 * PaymentList element
 * 
 * <p>Java class for paymentList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eSchKgPaymentData" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}ESchKgPaymentData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentList", propOrder = {
    "eSchKgPaymentData"
})
public class PaymentList {

    protected List<ESchKgPaymentData> eSchKgPaymentData;

    /**
     * Gets the value of the eSchKgPaymentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eSchKgPaymentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getESchKgPaymentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ESchKgPaymentData }
     * 
     * 
     */
    public List<ESchKgPaymentData> getESchKgPaymentData() {
        if (eSchKgPaymentData == null) {
            eSchKgPaymentData = new ArrayList<ESchKgPaymentData>();
        }
        return this.eSchKgPaymentData;
    }

}
