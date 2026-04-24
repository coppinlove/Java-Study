package javaex;



public class Employee {
	private String name;
	private int no, pay;

	Employee(String name, int no, int pay){
		this.name = name;
		this.no = no;
		this.pay = pay;
	}
	
	void print() {
		System.out.println("Name: " + name + ", No." + no + ", Pay: " + pay);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("이름 수정 불가");
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		System.out.println("사번 수정 불가");
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		if(pay < 2200000) {
			System.out.println("최저임금 미만입니다. 확인하십시오.");
		}
		else {
			System.out.println("급여를 수정합니다.");
			this.pay = pay;
		}
	}
	
}
