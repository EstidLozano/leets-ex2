/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.example2.util;

/**
 *
 * @author umansilla
 */
public class InboundXML {
    	/*
	 * INBOUND CALL IVR FINANCE TWO FACTOR AUTHUENTICATION.
	 */
	public final static String
                EXAMPLE2_MENU = "http://cloud.zang.io/data/inboundxml/12aa3b56b20bc3f1c60713394e72532dc6f1cc4e",
                EXAMPLE2_INPUT_NUMERO_DE_CUENTA = "http://cloud.zang.io/data/inboundxml/4710e3fdd8ac22b181fd6596fc9042fa78947da5",
                EXAMPLE2_SMS_PIN = "http://cloud.zang.io/data/inboundxml/b582020b2c7884c4376dba550bd6025ee2bddb7c",
                EXAMPLE2_SALDO_ACTUAL = "http://cloud.zang.io/data/inboundxml/0f3b7b376356128534a4a07b9972ee0c82de5a93",
                EXAMPLE2_HORARIOS_DE_ATENCION = " http://cloud.zang.io/data/inboundxml/4b39a97a3b002f36f832a328ad2fcb044077e850",
                EXAMPLE2_TRANSFERENCIA = "http://cloud.zang.io/data/inboundxml/a18cec650ba051afd7cbfe6e02695cc502b57532",
                EXAMPLE2_ERROR_CON_CAUSA = "http://cloud.zang.io/data/inboundxml/426a260fe19f2ffb63ed03496c49d05e85779694";
	
	public static String setRedirectInboundXML(String redirectInboundXML, String causa) {
		return "<Response>" + "<Redirect method=\"GET\">" + redirectInboundXML + "?causa=" + causa + "</Redirect>"
				+ "</Response>";
	}
	
	public static String setNumeroDeCuentaEnXML(String numeroDeCuenta) {
		return EXAMPLE2_SMS_PIN +"?numerodecuenta="+ numeroDeCuenta;
	}

	public static String setRedirectInboundXML(String redirectInboundXML) {
		return "<Response>" + "<Redirect method=\"GET\">" + redirectInboundXML + "</Redirect>" + "</Response>";
	}
}
