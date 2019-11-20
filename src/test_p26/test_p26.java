package test_p26;

public class test_p26 {
	public static void main(String[]args) {
		Car car1[];
		car1 = new Car[2];
		
		car1[0]=new Car();
		car1[1]=new RacingCar();
		
		for(int i=0; i<car1.length ; i++) {
			Class cl = car1[i].getClass();
			System.out.println("第"+(i+1)+"個物件的類別是"+cl);
		}
	}

}

class Car{
	protected int num;
	protected double gas;
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
}
class RacingCar extends Car{
	private int course ;
	public RacingCar() {
		course = 0;
		System.out.println("生產了賽車");
	}
}