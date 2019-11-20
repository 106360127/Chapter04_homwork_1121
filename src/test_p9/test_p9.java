package test_p9;

public class test_p9 {
	public static void main(String[]args) {
		RacingCar raccar ;
		raccar = new RacingCar();
		raccar.newshow();
	}

}

class Car {
	protected int num;
	protected double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
}

class RacingCar extends Car{
	private int course;
	public RacingCar() {
		course = 0 ;
		System.out.println("生成了賽車");
	}
	public void newshow() {
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}