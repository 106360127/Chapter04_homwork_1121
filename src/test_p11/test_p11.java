package test_p11;

public class test_p11 {
	public static void main(String[]args) {
		RacingCar raccar1;
		raccar1 = new RacingCar();
		raccar1.setCar(1234, 20.5);
		raccar1.setCourse(5);
		raccar1.show();
	}

}
class Car{
	protected int num;
	protected double gas;
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("生成了車子");
	}
	public void setCar(int n ,double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class RacingCar extends Car{
	private int course;
	public RacingCar() {
		course = 0;
		System.out.println("生成了賽車");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("賽車的車號是"+course);
	}
	public void show() {
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}
