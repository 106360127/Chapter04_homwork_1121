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
		System.out.println("�ͦ��F���l");
	}
	public void setCar(int n ,double g) {
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class RacingCar extends Car{
	private int course;
	public RacingCar() {
		course = 0;
		System.out.println("�ͦ��F�ɨ�");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("�ɨ��������O"+course);
	}
	public void show() {
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}
