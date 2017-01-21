public class Dog extends Animal {

	public Dog(String n){
		super(n);
//		setName(n);
//		setFood(0);
//		setHours(0);
	}

	public void eat(){
		super.eat();
		System.out.println("BARK");
	}
}
