package learnathon.batch15.day6.interfaces;

public class Main {
	public static void main(String[] args) {
		Human human = new Human("Ramesh","Indian",25, true);
		human.eat();
		System.out.println(human.getAge());
		//This will not work
		//human.swim();
		
		OlympicSwimmer suresh = new OlympicSwimmer("Suresh", "Indian", 19, true);
		suresh.eat();
		suresh.swim();
		
		//Instantiating a class object and assigning to a interface
		LivingThing humanoid = new Human("Chitti","Endhiran",100,true);
		LivingThing swimmingHumanoid = new OlympicSwimmer("Suresh", "Indian", 19, true);

		humanoid.eat();
		
//		The following code will not work
//		since LivingThing don't have a getAge() method
//		System.out.println(humanoid.getAge());
	}
}
