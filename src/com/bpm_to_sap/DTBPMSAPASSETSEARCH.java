package com.bpm_to_sap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DT_BPM_SAP_ASSET_SEARCH complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DT_BPM_SAP_ASSET_SEARCH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ANLN1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EQUNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_BPM_SAP_ASSET_SEARCH", propOrder = { "anln1", "equnr" })
public class DTBPMSAPASSETSEARCH {

	@XmlElement(name = "ANLN1", required = true)
	protected String anln1;
	@XmlElement(name = "EQUNR", required = true)
	protected String equnr;

	/**
	 * Gets the value of the anln1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getANLN1() {
		return anln1;
	}

	/**
	 * Sets the value of the anln1 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setANLN1(String value) {
		this.anln1 = value;
	}

	/**
	 * Gets the value of the equnr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEQUNR() {
		return equnr;
	}

	/**
	 * Sets the value of the equnr property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEQUNR(String value) {
		this.equnr = value;
	}

}
