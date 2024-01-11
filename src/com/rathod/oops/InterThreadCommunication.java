package com.rathod.oops;
class FoodItem
{
	String itemName;

	boolean itemServed = false;

		synchronized String eat() throws InterruptedException
		{
			if(!itemServed)
			wait();	
				System.out.println("\t\t\tItem eaten : "+ itemName);
				itemServed=false;
				notify();
				return itemName;
		}

		synchronized void serve(String itemName) throws InterruptedException
		{
			if(itemServed)
					wait();	
				this.itemName = itemName;
				itemServed=true;
				System.out.print("Item served : "+itemName);
				notify();
		}

}


class Waiter extends Thread
{
	String itemList[] = {"Wada","Samosa","Idli"};

	FoodItem item = new FoodItem();

		Waiter(FoodItem item)
		{
			this.item=item;
		}	

		public void run()
		{
			int i=0;
			while(true)
			{
				try{ 
				item.serve(itemList[i++]);
				if(i>2)
				   i=0;
				Thread.sleep(2000); } catch(InterruptedException e) { }
			}
		}
}

class Eater extends Thread
{
	FoodItem item;

		Eater(FoodItem item)
		{
			this.item=item;
		}

		public void run()
		{
			while(true)
			{
				try{ 
				item.eat();
				Thread.sleep(2000); } catch(InterruptedException e) { }					}
		}
}


public class InterThreadCommunication
{
	public static void main(String args[])
	{
		FoodItem item = new FoodItem();

		Waiter w = new Waiter(item);
		Eater f= new Eater(item);

		w.start();
		f.start();
	}

}