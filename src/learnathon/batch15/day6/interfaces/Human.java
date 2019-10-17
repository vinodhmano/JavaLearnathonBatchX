package learnathon.batch15.day6.interfaces;

public class Human implements PlantEater, MeatEater {

	private String name;
	private String nationality;
	private int age;
	private boolean isAlive;
	
	
	public Human(String name, String nationality, int age, boolean isAlive) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.age = age;
		this.setAlive(true);
	}
	
	
	@Override
	public void move() {
		System.out.println("Define how a human will move");
	}

	@Override
	public void eat() {
		System.out.println("Define how a human will eat");
		
	}

	@Override
	public void replicate() {
		System.out.println("New child is born");
		
	}

	@Override
	public void die() {
		this.isAlive = false;
		System.out.println("The human is dead");
		
	}

	@Override
	public void eatMeat() {
		System.out.println("Human eats meat");
		
	}

	@Override
	public String getFavoriteMeat() {
		return "Chicken";
	}

	@Override
	public void eatPlant() {
		System.out.println("Human eats plant");
		
	}

	@Override
	public String getFavoriteFood() {
		// TODO Auto-generated method stub
		return "Carrots";
	}

	

	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getNationality() {
		return nationality;
	}




	public void setNationality(String nationality) {
		this.nationality = nationality;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}


	public boolean isAlive() {
		return isAlive;
	}




	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

}
