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
		System.out.println("�Ͳ��F���l");
	}
}

class RacingCar extends Car{
	private int course;
	public RacingCar() {
		course = 0 ;
		System.out.println("�ͦ��F�ɨ�");
	}
	public void newshow() {
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}