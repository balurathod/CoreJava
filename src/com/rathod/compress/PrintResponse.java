package com.rathod.compress;

public class PrintResponse {
	public static void main(String[] args) {
		
		for(int i=101;i<=140;i++){
			StringBuffer txtString=new StringBuffer();
			txtString.append("<AccountDetail>");
			txtString.append("<AccountNumber>ACCMSG0"+i+"</AccountNumber>");
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
			System.out.print(txtString+"\n");
				}
	}

}
