package com.rathod.compress;
import java.io.*;
import java.util.*;
import java.util.zip.*;

public class CompressionTest2{
	
	
	public byte[] compress(byte[] bytesToCompress)
	{		
		Deflater deflater = new Deflater();
		deflater.setInput(bytesToCompress);
		deflater.finish();

		byte[] bytesCompressed = new byte[Short.MAX_VALUE];

		int numberOfBytesAfterCompression = deflater.deflate(bytesCompressed);

		byte[] returnValues = new byte[numberOfBytesAfterCompression];

		System.arraycopy
		(
			bytesCompressed,
			0,
			returnValues,
			0,
			numberOfBytesAfterCompression
		);

		return returnValues;
	}

	public byte[] compress(String stringToCompress)
	{		
		byte[] returnValues = null;

		try
		{

			returnValues = this.compress
			(
				stringToCompress.getBytes("UTF-8")
			);
		}
		catch (UnsupportedEncodingException uee)
		{
			uee.printStackTrace();
		}

		return returnValues;
	}

	public byte[] decompress(byte[] bytesToDecompress)
	{
		byte[] returnValues = null;

		Inflater inflater = new Inflater();

		int numberOfBytesToDecompress = bytesToDecompress.length;

		inflater.setInput
		(
			bytesToDecompress,
			0,
			numberOfBytesToDecompress
		);

		int bufferSizeInBytes = numberOfBytesToDecompress;

		int numberOfBytesDecompressedSoFar = 0;
		List<Byte> bytesDecompressedSoFar = new ArrayList<Byte>();

		try
		{
			while (inflater.needsInput() == false)
			{
				byte[] bytesDecompressedBuffer = new byte[bufferSizeInBytes];

				int numberOfBytesDecompressedThisTime = inflater.inflate
				(
					bytesDecompressedBuffer
				);

				numberOfBytesDecompressedSoFar += numberOfBytesDecompressedThisTime;

				for (int b = 0; b < numberOfBytesDecompressedThisTime; b++)
				{
					bytesDecompressedSoFar.add(bytesDecompressedBuffer[b]);
				}
			}

			returnValues = new byte[bytesDecompressedSoFar.size()];
			for (int b = 0; b < returnValues.length; b++) 
			{
				returnValues[b] = (byte)(bytesDecompressedSoFar.get(b));
			}

		}
		catch (DataFormatException dfe)
		{
			dfe.printStackTrace();
		}

		inflater.end();

		return returnValues;
	}

	public String decompressToString(byte[] bytesToDecompress)
	{	
		byte[] bytesDecompressed = this.decompress
		(
			bytesToDecompress
		);

		String returnValue = null;

		try
		{
			returnValue = new String
			(
				bytesDecompressed,
				0,
				bytesDecompressed.length,
				"UTF-8"
			);	
		}
		catch (UnsupportedEncodingException uee)
		{
			uee.printStackTrace();
		}

		return returnValue;
	}




public void writeBytesAsHexadecimal(byte[] bytesToWrite)
{
	int numberOfBytes = bytesToWrite.length;
	int bytesPerLine = 16;
	int bytesPerColumn = 8;	
	int numberOfColumns = bytesPerLine / bytesPerColumn;
	int linesPerBlock = 16;

	int numberOfLines = (int)Math.ceil
	(
		(double)numberOfBytes / (double)bytesPerLine
	);

	int widthOfDataOnDisplayInChars =
		numberOfColumns
		* (bytesPerColumn * 3 + 1)
		- 1;

	String horizontalRule = "";

	for (int i = 0; i < widthOfDataOnDisplayInChars; i++)
	{
		horizontalRule += "=";
	}

	System.out.println(horizontalRule);

	for (int y = 0; y < numberOfLines; y++)
	{
		if (y > 0 && y % linesPerBlock == 0)
		{
			System.out.println("");
		}

		int bytesOnThisLine;

		if (y < numberOfLines - 1)
		{
			bytesOnThisLine = bytesPerLine;
		}
		else
		{
			bytesOnThisLine = numberOfBytes % bytesPerLine;
		}			

		for (int x = 0; x < bytesOnThisLine; x++)
		{
			if (x > 0 && x % bytesPerColumn == 0)
			{
				System.out.print("  ");
			}

			int byteIndex = y * bytesPerLine + x;
			byte byteCurrent = bytesToWrite[byteIndex];

			String byteAsString = Integer.toHexString(byteCurrent & 0xFF);
			if (byteAsString.length() < 2)
			{
				byteAsString = "0" + byteAsString;
			}

			byteAsString += " ";

			System.out.print(byteAsString);
		}

		System.out.println();
	}

	System.out.println(horizontalRule);
}
public static void main(String[] args) {
		StringBuffer txtString=new StringBuffer();
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
		txtString.append("<FCLReferenceId>114021000092224</FCLReferenceId>\n");
		txtString.append("</AccountDetailResponse>");
		
		 //byte[] bytes = txtString.toString().getBytes();
		CompressionTest2 test=new CompressionTest2();
		String testvalue= txtString.toString();
		//System.out.println("testvalue:::\n"+testvalue);
		//byte[] bytesCompressed =test.compress(testvalue);
		byte [] ss=test.compressForReqRes(testvalue);
		System.out.println("ss: '" + ss + "'");
		//byte [] bb=ss.getBytes();
		//test.decompressForReqRes(bb);
		//System.out.println("bb" + bb + "'");
	      // test.writeBytesAsHexadecimali(bytesCompressed);
	      // String stringDecompressed = test.decompressToString(bytesCompressed);
		//System.out.println("stringDecompressed is: '" + stringDecompressed + "'");
}

public byte [] compressForReqRes(String txnString){
	CompressionTest2 test=new CompressionTest2();
	byte[] bytesCompressed =test.compress(txnString);
    test.writeBytesAsHexadecimal(bytesCompressed);
    return bytesCompressed;

}
public void decompressForReqRes(byte[] bytesCompressed){
	CompressionTest2 test=new CompressionTest2();
   String stringDecompressed = test.decompressToString(bytesCompressed);
	System.out.println("stringDecompressed is: '" + stringDecompressed + "'");
}


}
	


