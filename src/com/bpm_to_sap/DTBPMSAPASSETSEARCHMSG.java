package com.bpm_to_sap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DT_BPM_SAP_ASSET_SEARCH_MSG complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DT_BPM_SAP_ASSET_SEARCH_MSG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ANLN1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EQUNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TXT50" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SERNR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AKTIV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AFBLPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KANSW" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZSBZT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GDLGRP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_BPM_SAP_ASSET_SEARCH_MSG", propOrder = { "anln1", "equnr",
		"bukrs", "txt50", "sernr", "aktiv", "afblpe", "kansw", "zsbzt",
		"gdlgrp", "zname" })
public class DTBPMSAPASSETSEARCHMSG {

	@XmlElement(name = "ANLN1", required = true)
	protected String anln1;
	@XmlElement(name = "EQUNR", required = true)
	protected String equnr;
	@XmlElement(name = "BUKRS", required = true)
	protected String bukrs;
	@XmlElement(name = "TXT50", required = true)
	protected String txt50;
	@XmlElement(name = "SERNR", required = true)
	protected String sernr;
	@XmlElement(name = "AKTIV", required = true)
	protected String aktiv;
	@XmlElement(name = "AFBLPE", required = true)
	protected String afblpe;
	@XmlElement(name = "KANSW", required = true)
	protected String kansw;
	@XmlElement(name = "ZSBZT", required = true)
	protected String zsbzt;
	@XmlElement(name = "GDLGRP", required = true)
	protected String gdlgrp;
	@XmlElement(name = "ZNAME", required = true)
	protected String zname;

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

	/**
	 * Gets the value of the bukrs property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBUKRS() {
		return bukrs;
	}

	/**
	 * Sets the value of the bukrs property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBUKRS(String value) {
		this.bukrs = value;
	}

	/**
	 * Gets the value of the txt50 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTXT50() {
		return txt50;
	}

	/**
	 * Sets the value of the txt50 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTXT50(String value) {
		this.txt50 = value;
	}

	/**
	 * Gets the value of the sernr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSERNR() {
		return sernr;
	}

	/**
	 * Sets the value of the sernr property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSERNR(String value) {
		this.sernr = value;
	}

	/**
	 * Gets the value of the aktiv property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAKTIV() {
		return aktiv;
	}

	/**
	 * Sets the value of the aktiv property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAKTIV(String value) {
		this.aktiv = value;
	}

	/**
	 * Gets the value of the afblpe property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAFBLPE() {
		return afblpe;
	}

	/**
	 * Sets the value of the afblpe property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAFBLPE(String value) {
		this.afblpe = value;
	}

	/**
	 * Gets the value of the kansw property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKANSW() {
		return kansw;
	}

	/**
	 * Sets the value of the kansw property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setKANSW(String value) {
		this.kansw = value;
	}

	/**
	 * Gets the value of the zsbzt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZSBZT() {
		return zsbzt;
	}

	/**
	 * Sets the value of the zsbzt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZSBZT(String value) {
		this.zsbzt = value;
	}

	/**
	 * Gets the value of the gdlgrp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGDLGRP() {
		return gdlgrp;
	}

	/**
	 * Sets the value of the gdlgrp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGDLGRP(String value) {
		this.gdlgrp = value;
	}

	/**
	 * Gets the value of the zname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZNAME() {
		return zname;
	}

	/**
	 * Sets the value of the zname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZNAME(String value) {
		this.zname = value;
	}

}
