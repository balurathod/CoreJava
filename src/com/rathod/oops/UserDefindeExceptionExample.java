package com.rathod.oops;


class EidNotFoundException extends Exception{
	String eid;
	String ename;
	String address;
	public EidNotFoundException(String eid, String ename, String address) {
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}
	public EidNotFoundException() {	}
	@Override
	public String getMessage() {
		String msg=null;
		if(eid==null){
			msg="Employee not found with"+ eid;
		}
		return msg;
	}
	@Override
	public String toString() {
		return getMessage();
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

class EmpEx{
	
	public void getInfo(String eid)
	{
		try {
		if(eid==null){
		 	throw new EidNotFoundException();
		}
		else{
				EidNotFoundException employee=new EidNotFoundException();
				employee.setAddress("pune");
				employee.setEid("72488");
				employee.setEname("shyam");
								System.out.println(employee.getEid()+ " "+employee.getEname()+ " "+employee.getAddress());
				}
	}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
}

}

  class UserDefindeExceptionExample {
	public static void main(String[] args) {
		EmpEx ex=new EmpEx();
		ex.getInfo(null);
	}
}


