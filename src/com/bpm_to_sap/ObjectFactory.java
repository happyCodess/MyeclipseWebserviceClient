package com.bpm_to_sap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.bpm_to_sap package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _MTBPMSAPASSETSEARCHMSG_QNAME = new QName(
			"http://bpm_to_sap.com", "MT_BPM_SAP_ASSET_SEARCH_MSG");
	private final static QName _MTBPMSAPASSETSEARCH_QNAME = new QName(
			"http://bpm_to_sap.com", "MT_BPM_SAP_ASSET_SEARCH");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.bpm_to_sap
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link DTBPMSAPASSETSEARCHMSGDTLIST }
	 * 
	 */
	public DTBPMSAPASSETSEARCHMSGDTLIST createDTBPMSAPASSETSEARCHMSGDTLIST() {
		return new DTBPMSAPASSETSEARCHMSGDTLIST();
	}

	/**
	 * Create an instance of {@link DTBPMSAPASSETSEARCH }
	 * 
	 */
	public DTBPMSAPASSETSEARCH createDTBPMSAPASSETSEARCH() {
		return new DTBPMSAPASSETSEARCH();
	}

	/**
	 * Create an instance of {@link DTBPMSAPASSETSEARCHMSG }
	 * 
	 */
	public DTBPMSAPASSETSEARCHMSG createDTBPMSAPASSETSEARCHMSG() {
		return new DTBPMSAPASSETSEARCHMSG();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DTBPMSAPASSETSEARCHMSGDTLIST }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://bpm_to_sap.com", name = "MT_BPM_SAP_ASSET_SEARCH_MSG")
	public JAXBElement<DTBPMSAPASSETSEARCHMSGDTLIST> createMTBPMSAPASSETSEARCHMSG(
			DTBPMSAPASSETSEARCHMSGDTLIST value) {
		return new JAXBElement<DTBPMSAPASSETSEARCHMSGDTLIST>(
				_MTBPMSAPASSETSEARCHMSG_QNAME,
				DTBPMSAPASSETSEARCHMSGDTLIST.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DTBPMSAPASSETSEARCH }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://bpm_to_sap.com", name = "MT_BPM_SAP_ASSET_SEARCH")
	public JAXBElement<DTBPMSAPASSETSEARCH> createMTBPMSAPASSETSEARCH(
			DTBPMSAPASSETSEARCH value) {
		return new JAXBElement<DTBPMSAPASSETSEARCH>(_MTBPMSAPASSETSEARCH_QNAME,
				DTBPMSAPASSETSEARCH.class, null, value);
	}

}
