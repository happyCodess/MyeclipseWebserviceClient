package com.test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import com.bpm_to_sap.DTBPMSAPASSETSEARCH;
import com.bpm_to_sap.DTBPMSAPASSETSEARCHMSG;
import com.bpm_to_sap.DTBPMSAPASSETSEARCHMSGDTLIST;
import com.bpm_to_sap.SIBPMSAPASSETSEARCHOUTService;


public class Test {
	//这个静态块中的代码是为了请求服务端方法时将登录名和密码带过去，防止报401错误
	static {
        java.net.Authenticator.setDefault(new java.net.Authenticator() {
            @Override
            protected java.net.PasswordAuthentication getPasswordAuthentication() {
                return new java.net.PasswordAuthentication("zpo_bpm",
                        "HS123456".toCharArray());
            }
        });
    }
	public static void main(String[] args) {
	        DTBPMSAPASSETSEARCH dtt=new DTBPMSAPASSETSEARCH();
	        dtt.setANLN1("10000050");
	        dtt.setEQUNR("");
	        SIBPMSAPASSETSEARCHOUTService service=new SIBPMSAPASSETSEARCHOUTService();
	        DTBPMSAPASSETSEARCHMSGDTLIST list= service.getHTTPPort().siBPMSAPASSETSEARCHOUT(dtt);
	        List<DTBPMSAPASSETSEARCHMSG> sss= list.getMSGLIST();
	        
	        for(int i=0;i<sss.size();i++){
			System.out.println("*********************");
			System.out.println(sss.get(i).getBUKRS());
			System.out.println(sss.get(i).getAKTIV());
	        }
		
	}

}
