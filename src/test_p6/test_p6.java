package test_p6;

public class test_p6 {
	public static void main(String[]args) {
	RacingCar rccar1 = new RacingCar(1234,20.5,5);
	}
}

class Car{
	private int num;
	private double gas;	
	public Car(int n,double g) {
		num =n;
		gas =g;
		System.out.println("生產了車號為"+num+",汽油量設為"+gas+"的車子");
	}
	public void setCar(int n,double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}

}
class RacingCar extends Car{
	private int course;

	public RacingCar(int n ,double g,int c) {
		super(n,g);
		course = c;
		System.out.println("生成了編號為"+course+"的賽車");
	}

}