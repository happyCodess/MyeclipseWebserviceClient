package com.bpm_to_sap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "SI_BPM_SAP_ASSET_SEARCH_OUT", targetNamespace = "http://bpm_to_sap.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SIBPMSAPASSETSEARCHOUT {

	/**
	 * 
	 * @param mtBPMSAPASSETSEARCH
	 * @return returns com.bpm_to_sap.DTBPMSAPASSETSEARCHMSGDTLIST
	 */
	@WebMethod(operationName = "SI_BPM_SAP_ASSET_SEARCH_OUT", action = "http://sap.com/xi/WebService/soap1.1")
	@WebResult(name = "MT_BPM_SAP_ASSET_SEARCH_MSG", targetNamespace = "http://bpm_to_sap.com", partName = "MT_BPM_SAP_ASSET_SEARCH_MSG")
	public DTBPMSAPASSETSEARCHMSGDTLIST siBPMSAPASSETSEARCHOUT(
			@WebParam(name = "MT_BPM_SAP_ASSET_SEARCH", targetNamespace = "http://bpm_to_sap.com", partName = "MT_BPM_SAP_ASSET_SEARCH") DTBPMSAPASSETSEARCH mtBPMSAPASSETSEARCH);

}