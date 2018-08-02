package com.bpm_to_sap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for DT_BPM_SAP_ASSET_SEARCH_MSGDTLIST complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DT_BPM_SAP_ASSET_SEARCH_MSGDTLIST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSGLIST" type="{http://bpm_to_sap.com}DT_BPM_SAP_ASSET_SEARCH_MSG" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_BPM_SAP_ASSET_SEARCH_MSGDTLIST", propOrder = { "msglist" })
public class DTBPMSAPASSETSEARCHMSGDTLIST {

	@XmlElement(name = "MSGLIST", required = true)
	protected List<DTBPMSAPASSETSEARCHMSG> msglist;

	/**
	 * Gets the value of the msglist property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the msglist property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getMSGLIST().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link DTBPMSAPASSETSEARCHMSG }
	 * 
	 * 
	 */
	public List<DTBPMSAPASSETSEARCHMSG> getMSGLIST() {
		if (msglist == null) {
			msglist = new ArrayList<DTBPMSAPASSETSEARCHMSG>();
		}
		return this.msglist;
	}

}
