package learnathon.batch15.day7.strings;

import java.util.ArrayList;

import learnathon.batch15.day4.FBProfile;

public class HashCodeEqualsDemo {
	
	public static void withoutHashCode() {
		FBProfile jack = new FBProfile("jack", "shephard", 'M',"8009008900",35,"sydney","jack.shepard@sydney.com");
		FBProfile tom  = new FBProfile("tom", "shephard", 'M',"8009008900",35,"sydney","tom.shepard@sydney.com");
		
		System.out.println("Is Jack = Tom?");
		System.out.println(jack.equals(tom));
		System.out.println();
		System.out.println("Why Not?");
		System.out.println("Hash Code of object jack = " + jack.hashCode());
		System.out.println("Hash Code of object tom = " + tom.hashCode());
		System.out.println("Since the hash codes are different, they are not the same");
	}
	
	public static void withHashCode() {
		FBProfile jack = new FBProfile("jack", "shephard", 'M',"8009008900",35,"sydney","jack.shepard@sydney.com");
		FBProfile tom  = new FBProfile("tom", "shephard", 'M',"8009008900",35,"sydney","tom.shepard@sydney.com");
		
		System.out.println("Is Jack = Tom?");
		System.out.println(jack.equals(tom));
		System.out.println();
		System.out.println("Why Not?");
		System.out.println("Hash Code of object jack = " + jack.hashCode());
		System.out.println("Hash Code of object tom = " + tom.hashCode());
		System.out.println("Even though hashCodes are same, it is not used in equals method");
	}
	
	
	public static void withProperEqualsTo() {
		FBProfile jack = new FBProfile("jack", "shephard", 'M',"8009008900",35,"sydney","jack.shepard@sydney.com");
		FBProfile tom  = new FBProfile("tom", "shephard", 'M',"8009008900",35,"sydney","tom.shepard@sydney.com");
		
		System.out.println("Is Jack = Tom?");
		System.out.println(jack.equals(tom));
		System.out.println();
		System.out.println("Why?");
		System.out.println("Hash Code of object jack = " + jack.hashCode());
		System.out.println("Hash Code of object tom = " + tom.hashCode());
		System.out.println("Now they both are same");

	}
	
	public static void main(String[] args) {
		//withoutHashCode();
		//withHashCode();
		//withProperEqualsTo();
		

		
	}

}
