package com.heraizen.cj.staticandfinal;

class C1{
	
	final void m1() {
		System.out.println("M1");
	}
}
class C2 extends C1{
	
}

public final class FinalExample {
		
		static final int num ;
		
		static {
			num = 100;
		}
		FinalExample(){
	
		}
		public final static void main(final String[] args) {
				args[0] = "Badal";
				final int NO_OF_DAYS_IN_WEEK = 7;
			
		}
}
