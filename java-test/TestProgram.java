public class TestProgram{
	public static void main(String[] args){
		String msg = "Hello world!!!!! :3";
		System.out.println(msg);

		Dog a1 = new Dog("pinky");
		a1.eat();
		a1.sleep();
		a1.eat();
		a1.rave();

		Cat c = new Cat("barf");
		c.eat();
		c.bother();
	}
}
