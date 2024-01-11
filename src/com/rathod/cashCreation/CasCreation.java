 package com.rathod.cashCreation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author shyama.sharma
 * class create cas structure for 100 account
 */
public class CasCreation {
public static void main(String[] args) {
	StringBuffer casfeed = new StringBuffer();
	int size=20;									//provide the length of account
	String parentAccno="RATHOD00"; 				//provide the parent account no 
	String childAccno="RAT5";					//provide the child account no. Length of string should be same
	casfeed.append("<ComplexAccountStructure>\n")
	.append("<Header>\n")
	.append("<FileName>UKB_Complex_Group_Accounts_07JUN2211.xml</FileName>\n")
	.append("<Date>12-AUG-2014</Date>\n")
	.append("<Time>10:10:10</Time>\n")
	.append("</Header>\n")
	.append("<Data>\n")
	.append("<AccountDetails>\n")
	.append("<AccountNumber>"+parentAccno+"</AccountNumber>\n")
	.append("<AccountSystemId>UKB</AccountSystemId>\n")
	.append("<BranchCode>100006</BranchCode>\n")
	.append("<OfficeId>GB1</OfficeId>\n")
	.append("</AccountDetails>\n")
	.append("<LimitDetails>\n")
	.append("<LimitTypeDesc>Net limit</LimitTypeDesc>\n")
	.append("<LimitTypeCode>NLM</LimitTypeCode>\n")
	.append("<LimitAmount>1000</LimitAmount>\n ")
	.append("<LimitCurrency>GBP</LimitCurrency>\n ")
	.append("<ExpiryDate>25-11-2017</ExpiryDate> \n")
	.append("</LimitDetails>\n")
	.append("<LimitDetails>\n")
	.append("<LimitTypeDesc>SettleRisk limit</LimitTypeDesc>\n ")
	.append("<LimitTypeCode>SRL</LimitTypeCode> \n")
	.append("<LimitAmount>1000</LimitAmount>\n ")
	.append("<LimitCurrency>GBP</LimitCurrency> \n")
	.append("<ExpiryDate>25-11-2017</ExpiryDate> \n")
	.append("</LimitDetails>\n")
	.append("<LimitDetails>\n")
	.append("<LimitTypeDesc>Gross limit</LimitTypeDesc>\n ")
	.append("<LimitTypeCode>GLM</LimitTypeCode> \n")
	.append("<LimitAmount>1000</LimitAmount>\n ")
	.append("<LimitCurrency>GBP</LimitCurrency> \n")
	.append("<ExpiryDate>25-11-2017</ExpiryDate> \n")
	.append("</LimitDetails>\n")
	.append("<EntityType>Group</EntityType>\n ")
	.append("<Action>INSERT</Action> \n")
	.append("</Data>\n");
		for(int i=0;i<size;i++){
		if(i<10){
		casfeed.append("<Data>\n")
		.append("<AccountDetails>\n")
		.append("<AccountNumber>"+childAccno+"000"+i+"</AccountNumber>\n")
		.append("<AccountSystemId>UKB</AccountSystemId>\n")
		.append("<BranchCode>100006</BranchCode>\n")
		.append("<OfficeId>GB1</OfficeId>\n")
		.append("</AccountDetails>\n")
		.append("<LimitDetails>\n")
		.append("<LimitTypeDesc>OverDraft limit</LimitTypeDesc>\n ")
		.append("<LimitTypeCode>ODL</LimitTypeCode>\n ")
		.append("<LimitAmount>1000</LimitAmount>\n ")
		.append("<LimitCurrency>GBP</LimitCurrency>\n ")
		.append("<ExpiryDate>25-11-2017</ExpiryDate> \n")
		.append("</LimitDetails>\n")
		.append("<LimitDetails>\n")
		.append("<LimitTypeDesc>Net limit</LimitTypeDesc>\n ")
		.append("<LimitTypeCode>NLM</LimitTypeCode> \n")
		.append("<LimitAmount>1000</LimitAmount> \n")
		.append("<LimitCurrency>GBP</LimitCurrency> \n")
		.append("<ExpiryDate>25-11-2017</ExpiryDate>\n ")
		.append("</LimitDetails>\n")
		.append("<LimitDetails>\n")
		.append("<LimitTypeDesc>SettleRisk limit</LimitTypeDesc> \n")
		.append("<LimitTypeCode>SRL</LimitTypeCode>\n ")
		.append("<LimitAmount>1000</LimitAmount>\n ")
		.append("<LimitCurrency>GBP</LimitCurrency>\n ")
		.append("<ExpiryDate>25-11-2017</ExpiryDate>\n ")
		.append("</LimitDetails>\n")
		.append("<ParentDetails>\n")
		.append("<ParentAccountNumber>"+parentAccno+"</ParentAccountNumber>\n")
		.append("<ParentOfficeId>GB1</ParentOfficeId>\n")
		.append("<ParentAccountSystemId>UKB</ParentAccountSystemId>\n")
		.append("<ParentBranchCode>100006</ParentBranchCode>\n")
		.append("</ParentDetails>\n")
		.append("<EntityType>Account</EntityType>\n")
		.append("<Action>INSERT</Action>\n")
		.append("</Data>\n");
			}
		if(i>=10&&i<100){
			casfeed.append("<Data>\n")
			.append("<AccountDetails>\n")
			.append("<AccountNumber>"+childAccno+"00"+i+"</AccountNumber>\n")
			.append("<AccountSystemId>UKB</AccountSystemId>\n")
			.append("<BranchCode>100006</BranchCode>\n")
			.append("<OfficeId>GB1</OfficeId>\n")
			.append("</AccountDetails>\n")
			.append("<LimitDetails>\n")
			.append("<LimitTypeDesc>OverDraft limit</LimitTypeDesc>\n ")
			.append("<LimitTypeCode>ODL</LimitTypeCode>\n ")
			.append("<LimitAmount>1000</LimitAmount>\n ")
			.append("<LimitCurrency>GBP</LimitCurrency>\n ")
			.append("<ExpiryDate>25-11-2017</ExpiryDate>\n ")
			.append("</LimitDetails>")
			.append("<LimitDetails>")
			.append("<LimitTypeDesc>Net limit</LimitTypeDesc>\n ")
			.append("<LimitTypeCode>NLM</LimitTypeCode>\n ")
			.append("<LimitAmount>1000</LimitAmount>\n ")
			.append("<LimitCurrency>GBP</LimitCurrency>\n ")
			.append("<ExpiryDate>25-11-2017</ExpiryDate>\n ")
			.append("</LimitDetails>\n")
			.append("<LimitDetails>\n")
			.append("<LimitTypeDesc>SettleRisk limit</LimitTypeDesc>\n ")
			.append("<LimitTypeCode>SRL</LimitTypeCode>\n ")
			.append("<LimitAmount>1000</LimitAmount>\n ")
			.append("<LimitCurrency>GBP</LimitCurrency>\n ")
			.append("<ExpiryDate>25-11-2017</ExpiryDate>\n ")
			.append("</LimitDetails>\n")
			.append("<ParentDetails>\n")
			.append("<ParentAccountNumber>"+parentAccno+"</ParentAccountNumber>\n")
			.append("<ParentOfficeId>GB1</ParentOfficeId>\n")
			.append("<ParentAccountSystemId>UKB</ParentAccountSystemId>\n")
			.append("<ParentBranchCode>100006</ParentBranchCode>")
			.append("</ParentDetails>\n")
			.append("<EntityType>Account</EntityType>\n")
			.append("<Action>INSERT</Action>\n")
			.append("</Data>\n");
				}
		if(i>=100&&i<1000){
			casfeed.append("<Data>\n")
			.append("<AccountDetails>\n")
			.append("<AccountNumber>"+childAccno+"0"+i+"</AccountNumber>\n")
			.append("<AccountSystemId>UKB</AccountSystemId>\n")
			.append("<BranchCode>100006</BranchCode>\n")
			.append("<OfficeId>GB1</OfficeId>\n")
			.append("</AccountDetails>\n")
			.append("<LimitDetails>\n")
			.append("<LimitTypeDesc>OverDraft limit</LimitTypeDesc>\n ")
			.append("<LimitTypeCode>ODL</LimitTypeCode>\n ")
			.append("<LimitAmount>1000</LimitAmount>\n ")
			.append("<LimitCurrency>GBP</LimitCurrency>\n ")
			.append("<ExpiryDate>25-11-2017</ExpiryDate>\n ")
			.append("</LimitDetails>")
			.append("<LimitDetails>")
			.append("<LimitTypeDesc>Net limit</LimitTypeDesc>\n ")
			.append("<LimitTypeCode>NLM</LimitTypeCode>\n ")
			.append("<LimitAmount>1000</LimitAmount>\n ")
			.append("<LimitCurrency>GBP</LimitCurrency>\n ")
			.append("<ExpiryDate>25-11-2017</ExpiryDate>\n ")
			.append("</LimitDetails>\n")
			.append("<LimitDetails>\n")
			.append("<LimitTypeDesc>SettleRisk limit</LimitTypeDesc>\n ")
			.append("<LimitTypeCode>SRL</LimitTypeCode>\n ")
			.append("<LimitAmount>1000</LimitAmount>\n ")
			.append("<LimitCurrency>GBP</LimitCurrency>\n ")
			.append("<ExpiryDate>25-11-2017</ExpiryDate>\n ")
			.append("</LimitDetails>\n")
			.append("<ParentDetails>\n")
			.append("<ParentAccountNumber>"+parentAccno+"</ParentAccountNumber>\n")
			.append("<ParentOfficeId>GB1</ParentOfficeId>\n")
			.append("<ParentAccountSystemId>UKB</ParentAccountSystemId>\n")
			.append("<ParentBranchCode>100006</ParentBranchCode>")
			.append("</ParentDetails>\n")
			.append("<EntityType>Account</EntityType>\n")
			.append("<Action>INSERT</Action>\n")
			.append("</Data>\n");
				}
		if(i>=1000&&i<10000){
			casfeed.append("<Data>\n")
			.append("<AccountDetails>\n")
			.append("<AccountNumber>"+childAccno+i+"</AccountNumber>\n")
			.append("<AccountSystemId>UKB</AccountSystemId>\n")
			.append("<BranchCode>100006</BranchCode>\n")
			.append("<OfficeId>GB1</OfficeId>\n")
			.append("</AccountDetails>\n")
			.append("<LimitDetails>\n")
			.append("<LimitTypeDesc>OverDraft limit</LimitTypeDesc>\n ")
			.append("<LimitTypeCode>ODL</LimitTypeCode>\n ")
			.append("<LimitAmount>1000</LimitAmount>\n ")
			.append("<LimitCurrency>GBP</LimitCurrency>\n ")
			.append("<ExpiryDate>25-11-2017</ExpiryDate>\n ")
			.append("</LimitDetails>")
			.append("<LimitDetails>")
			.append("<LimitTypeDesc>Net limit</LimitTypeDesc>\n ")
			.append("<LimitTypeCode>NLM</LimitTypeCode>\n ")
			.append("<LimitAmount>1000</LimitAmount>\n ")
			.append("<LimitCurrency>GBP</LimitCurrency>\n ")
			.append("<ExpiryDate>25-11-2017</ExpiryDate>\n ")
			.append("</LimitDetails>\n")
			.append("<LimitDetails>\n")
			.append("<LimitTypeDesc>SettleRisk limit</LimitTypeDesc>\n ")
			.append("<LimitTypeCode>SRL</LimitTypeCode>\n ")
			.append("<LimitAmount>1000</LimitAmount>\n ")
			.append("<LimitCurrency>GBP</LimitCurrency>\n ")
			.append("<ExpiryDate>25-11-2017</ExpiryDate>\n ")
			.append("</LimitDetails>\n")
			.append("<ParentDetails>\n")
			.append("<ParentAccountNumber>"+parentAccno+"</ParentAccountNumber>\n")
			.append("<ParentOfficeId>GB1</ParentOfficeId>\n")
			.append("<ParentAccountSystemId>UKB</ParentAccountSystemId>\n")
			.append("<ParentBranchCode>100006</ParentBranchCode>")
			.append("</ParentDetails>\n")
			.append("<EntityType>Account</EntityType>\n")
			.append("<Action>INSERT</Action>\n")
			.append("</Data>\n");
				}
		}
	casfeed.append("<Trailer>\n")
	.append("<CountofRecords>"+size+"</CountofRecords>\n")
	.append("</Trailer>\n")
	.append("</ComplexAccountStructure>\n");
	System.out.println("casfeed::::::::\n"+casfeed);

	try {
		//File file = new File("C:/Users/balu.rathod/Desktop/CAS.XML");
		File file = new File("D:/Rathod/CasFeed_Creation/CAS.XML");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(casfeed.toString());
		System.out.println(casfeed);
		System.out.println("Done11111");
		bw.close();

		System.out.println("Done");

	} catch (IOException e) {
}
}
}