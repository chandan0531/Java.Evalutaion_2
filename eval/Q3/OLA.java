package com.eval.Q3;

public class OLA {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3)
		{
			HatchBack h1 = new HatchBack ();
			h1.setNumberOfKms(numberOfKMs);
			return h1;
		}
		else
		{
			Car c1 = new Sedan();
			c1.setNumberOfKms(numberOfKMs);
			return c1;
		}
	}
	
	public int calculateBill(Car car) {
		
		int total = car.getNumberOfKms()*car.numberOfKms ;
		return total;
	}
	
	
}
