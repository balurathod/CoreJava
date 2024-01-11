package com.rathod.oops;
//chk not understnd
class Field {
	private String EmpId;
	private int EmpNo = 1;
	private String EmpName;
	
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	
}
public class PrivateAccess {
    static class InnerOne {
        private int value;        
        //System.out.println("InnerOne "+value);
    }
    
    static class InnerTwo {
        int getOne ( InnerOne other ) {
            return other.value;
            
        }
    }
	public static void main(String[] args) {
		PrivateAccess pa = new PrivateAccess();
		System.out.println("Hello, world!"+getEmpNo());
	}
	
}