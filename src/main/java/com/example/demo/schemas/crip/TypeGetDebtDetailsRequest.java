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
import javax.xml.bind.annotation.XmlType;


/**
 * GetDebtDetailsRequest request root element
 * 
 * <p>Java class for TypeGetDebtDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeGetDebtDetailsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}TypeBaseRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://www.crif-online.ch/webservices/crifsoapservice/v1.00}Identifier"/&gt;
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
@XmlType(name = "TypeGetDebtDetailsRequest", propOrder = {
    "identifier",
    "additionalInput"
})
public class TypeGetDebtDetailsRequest
    extends TypeBaseRequest
{

    @XmlElement(required = true)
    protected Identifier identifier;
    protected List<KeyValuePair> additionalInput;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
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
