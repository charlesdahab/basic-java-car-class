public class Main {

	public static void main(String[] args) {
		Car car1, car2, car3;
		
		car1 = new Car("Orange", 10,10.8);
		car2 = new Car("Blue", 15,15);
		car3 = new Car("Yellow", 20,20);
		
		car1.setSpeed(29.8);
		car1.speedUP(30);
		
		System.out.println(car1.getSpeed());
		System.out.println(car2.getColor());
		System.out.println(car3.getColor());

	}

}
