package com.rathod.oops;
class Friendly {

  private Friendly partner;
  private String name;
   int count;

	public Friendly(String name) {
		this.name = name;
	}

	public synchronized void hug( ) {
		System.out.println(count+" friends in list");
		System.out.println(Thread.currentThread().getName() + 
		" in " + name + ".hug() trying to invoke " + 
		partner.name + ".hugBack()");

		try {
		Thread.sleep(10);
		} catch(InterruptedException e ) {}
		if(count==1)
			partner.hugBack();
	}
	
	private synchronized void hugBack() {
		System.out.println(Thread.currentThread().getName()+ 
		" in " + name + ".hugBack()");

	}

	public void becomeFriend(Friendly partner) {
		this.partner  = partner ;
		++count;
	}
}


	



