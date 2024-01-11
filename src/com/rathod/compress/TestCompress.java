package com.rathod.compress;

import java.io.Console;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.Deflater;



public class TestCompress {
public	static String  decompressGZIP(byte[] gzip) throws IOException {
	    java.util.zip.Inflater inf = new java.util.zip.Inflater();
	    java.io.ByteArrayInputStream bytein = new java.io.ByteArrayInputStream(gzip);
	    java.util.zip.GZIPInputStream gzin = new java.util.zip.GZIPInputStream(bytein);
	    java.io.ByteArrayOutputStream byteout = new java.io.ByteArrayOutputStream();
	    int res = 0;
	    byte buf[] = new byte[1024];
	    while (res >= 0) {
	        res = gzin.read(buf, 0, buf.length);
	        if (res > 0) {
	            byteout.write(buf, 0, res);
	        }
	    }
	    byte uncompressed[] = byteout.toByteArray();
	    return (uncompressed.toString());
	}
	public static void main(String[] args) throws Exception {
		StringBuilder txtString=new StringBuilder();
		txtString.append("<?xml version=").append("1.0").append("encoding=").append("UTF-8").append("?>" );
		txtString.append("<AccountDetailResponse>");
		txtString.append("<AccountDetailResponse>");
		txtString.append("<SystemId>FCL</SystemId>");
		txtString.append("<AccountDetail>");
		txtString.append("<AccountNumber>15OMPLEX</AccountNumber>");
		txtString.append("<AccountSystemId>UKB</AccountSystemId>");
		txtString.append("<BranchCode>100006</BranchCode>");
			txtString.append("<OfficeId>GB1</OfficeId>");
		txtString.append("<AccountName>Brendon Macullum</AccountName>");
										txtString.append("<AccountStatus>N</AccountStatus>");
												txtString.append("<ReferStream>345</ReferStream>");
														txtString.append("<SBU>WL</SBU>");
		txtString.append("<CustomerId>100000000000000003</CustomerId>");
		txtString.append("<CustomerName>vENKATESH</CustomerName>");
		txtString.append("<BalanceDetail>");
		txtString.append("<BalanceType>Running Cleared For Fate Balance</BalanceType>");
		txtString.append("<BalanceAmount>80000000000</BalanceAmount>");
		txtString.append("<BalanceCurrency>GBP</BalanceCurrency>");
		txtString.append("</BalanceDetail>");
		txtString.append("<BalanceDetail>");
		txtString.append("<BalanceType>Running Ledger Balance</BalanceType>");
		txtString.append("<BalanceAmount>1200000</BalanceAmount>");
		txtString.append("<BalanceCurrency>GBP</BalanceCurrency>");
		txtString.append("</BalanceDetail>");
		txtString.append("<BalanceDetail>");
		txtString.append("<BalanceType>Debit interest Charge balance</BalanceType>");
		txtString.append("<BalanceAmount>8000</BalanceAmount>");
		txtString.append("<BalanceCurrency>GBP</BalanceCurrency>");
		txtString.append("</BalanceDetail>");
		txtString.append("<AccountLevelLimit>");
		txtString.append("<LimitTypeCode>ODL</LimitTypeCode>");
		txtString.append("<LimitTypeDesc>Overdraft Limit</LimitTypeDesc>");
		txtString.append("<LimitAmount>90</LimitAmount>");
		txtString.append("<LimitCurrency>GBP</LimitCurrency>");
		txtString.append("<LimitExpiryDate>25-11-2016</LimitExpiryDate>");
		txtString.append("</AccountLevelLimit>");
		txtString.append("<AccountLevelLimit>");
		txtString.append("<LimitTypeCode>RLM</LimitTypeCode>");
		txtString.append("<LimitTypeDesc>Reserve Limit</LimitTypeDesc>");
		txtString.append("<LimitAmount>70</LimitAmount>");
		txtString.append("<LimitCurrency>GBP</LimitCurrency>");
		txtString.append("<LimitExpiryDate>25-11-2016</LimitExpiryDate>");
		txtString.append("</AccountLevelLimit>");
		txtString.append("<ResponseCode>111111</ResponseCode>");
		txtString.append("<ResponseMessage>Successful transaction</ResponseMessage>");
		txtString.append("</AccountDetail>");
		txtString.append("<ResponseCode>111111</ResponseCode>");
		txtString.append("<ResponseMessage>Successful</ResponseMessage>");
		txtString.append("<FCLReferenceId>114021000092224</FCLReferenceId>");
		txtString.append("</AccountDetailResponse>");
		txtString.append("OAD-102891");
		 byte[] bytes = txtString.toString().getBytes();
		String testvalue= TestCompress.decompressGZIP(bytes);
		System.out.println("testvalue:::"+testvalue);
	}
}