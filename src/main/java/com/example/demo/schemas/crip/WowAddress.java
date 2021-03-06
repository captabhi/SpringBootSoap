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
 * WowAddress element
 * 
 * <p>Java class for WowAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WowAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="address" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}AddressDescription"/&gt;
 *         &lt;element name="identifiers" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hasDebts" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}HasDebts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WowAddress", propOrder = {
    "id",
    "address",
    "identifiers",
    "hasDebts"
})
public class WowAddress {

    protected int id;
    @XmlElement(required = true)
    protected AddressDescription address;
    protected List<Identifier> identifiers;
    @XmlSchemaType(name = "string")
    protected HasDebts hasDebts;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * Gets the value of the hasDebts property.
     * 
     * @return
     *     possible object is
     *     {@link HasDebts }
     *     
     */
    public HasDebts getHasDebts() {
        return hasDebts;
    }

    /**
     * Sets the value of the hasDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HasDebts }
     *     
     */
    public void setHasDebts(HasDebts value) {
        this.hasDebts = value;
    }

}
