package com.rathod.compress;
import java.io.*;
import java.util.*;
import java.util.zip.*;

public class CompressionTest1
{
	public static void main(String[] args)
	{
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
		Compressor compressor = new Compressor();

		String stringToCompress = txtString.toString();
		//String stringToCompress = "When in the course of human events, it becomes necessary for one people to dissolve the bands that bind them...";

		System.out.println("stringToCompress is: '" + stringToCompress + "'");

		byte[] bytesCompressed = compressor.compress(stringToCompress);

		System.out.println("bytesCompressed is: ");
		Console.writeBytesAsHexadecimal(bytesCompressed);

		String stringDecompressed = compressor.decompressToString(bytesCompressed);

		System.out.println("stringDecompressed is: '" + stringDecompressed + "'");
	}
}

class Compressor
{
	public Compressor()
	{}

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
}

class Console
{
	public static void writeBytesAsHexadecimal(byte[] bytesToWrite)
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
}