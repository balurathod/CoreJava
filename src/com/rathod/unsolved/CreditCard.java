package com.rathod.unsolved;
//7
public class CreditCard
{
	private String cardID;
	
	private Integer limit;
	
	private String ownerName;
	
	public void setCardInformation(String cardID, String ownerName , Integer limit)
	{
		this.cardID=cardID;
		this.ownerName=ownerName;
		this.limit=limit;   
	}
	 
}

//which is true?
//c-the owner Name variable breaks the encapsulation     compiled