//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.24 at 11:30:43 AM IST 
//


package com.example.demo.schemas.crip;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * SchufaScore element
 * 
 * <p>Java class for SchufaScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchufaScore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scoreValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="riskQuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="scoreCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scoreText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scoreInfoText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="scoreError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchufaScore", propOrder = {
    "description",
    "scoreValue",
    "riskQuota",
    "scoreCategory",
    "scoreText",
    "scoreInfoText",
    "scoreError"
})
public class SchufaScore {

    protected String description;
    protected BigInteger scoreValue;
    protected BigDecimal riskQuota;
    protected String scoreCategory;
    protected String scoreText;
    protected List<String> scoreInfoText;
    protected String scoreError;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the scoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScoreValue() {
        return scoreValue;
    }

    /**
     * Sets the value of the scoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScoreValue(BigInteger value) {
        this.scoreValue = value;
    }

    /**
     * Gets the value of the riskQuota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRiskQuota() {
        return riskQuota;
    }

    /**
     * Sets the value of the riskQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRiskQuota(BigDecimal value) {
        this.riskQuota = value;
    }

    /**
     * Gets the value of the scoreCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreCategory() {
        return scoreCategory;
    }

    /**
     * Sets the value of the scoreCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreCategory(String value) {
        this.scoreCategory = value;
    }

    /**
     * Gets the value of the scoreText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreText() {
        return scoreText;
    }

    /**
     * Sets the value of the scoreText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreText(String value) {
        this.scoreText = value;
    }

    /**
     * Gets the value of the scoreInfoText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreInfoText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreInfoText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScoreInfoText() {
        if (scoreInfoText == null) {
            scoreInfoText = new ArrayList<String>();
        }
        return this.scoreInfoText;
    }

    /**
     * Gets the value of the scoreError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreError() {
        return scoreError;
    }

    /**
     * Sets the value of the scoreError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreError(String value) {
        this.scoreError = value;
    }

}
