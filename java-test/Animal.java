public class Animal {

	private String name;
	private int food_eaten, hours_slept;

	public Animal(String n){
		name = n;
		food_eaten = 0;
		hours_slept = 0;
	}

	public void eat(){
		food_eaten++;
		System.out.println(name + " has eaten " + food_eaten + " foods");
	}

	public void sleep(){
		hours_slept++;
		System.out.println(name + " has slept " + hours_slept + " hours");
	}

	public void rave(){
		System.out.println("PARTAYYYYYY!!!!!");	
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setFood(int f){
		food_eaten = f;
	}

	public int getFood(){
		return food_eaten;
	}

	public void setHours(int f){
		hours_slept = f;
	}

	public int getHours(){
		return hours_slept;
	}
}
