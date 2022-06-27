package org.add1;

public class GreensTech {
	
	private void greensOmr(int id) {
		System.out.println(id);
	}
	
	private void greensOmr(String name,String last) {
		System.out.println(name);
	}
	
	private void greensOmr(long num) {
		System.out.println(num);
	}
	
	

	public static void main(String[] args) {
		
		GreensTech g=new GreensTech();
		g.greensOmr(214);
		g.greensOmr("Greens Technology Pvt Ltd.","mayiladuthurai");
		g.greensOmr(6383468626l);
	}

}
