package learnathon.batch15.day5.objectsasfields;

public class Main {
	public static void main(String[] args) {
		Street s1 = new Street("Adams Street", 5000);
		Street s2 = new Street("Buckland Street", 3000);
		Street s3 = new Street("Slater Street", 15000);
		Street s4 = new Street("Main Street", 52000);
		
		City Manchester = new City();
		Manchester.setCityName("Manchester");
		Manchester.setStreetsInCity(new Street[] {s1, s2, s3, s4});
		System.out.println(Manchester);
		
		
		City Hartford = new City();
		Hartford.setCityName("Hartford");
		
		Hartford.setStreetsInCity(new Street[] {
				new Street("Pearl Street", 5600),
				new Street("Groove Street", 2200),
				new Street("Central Row Street", 6400),
				new Street("North Street", 9700),
				new Street("South Street", 7300)
		}
				);
		
		
		State ct = new State("Connecticut",new City[] {Manchester, Hartford});
		System.out.println(ct);
		
		/*
		//to access the field of street form City
		System.out.println(ct.getCities()[1].getStreetsInCity()[0].getStreetName());
		
		
		ct.setOfficials("Mr.Jack Houston", "Mrs.Margeret Taylor");
		System.out.println(ct.getOfficials().getGovernor());
		*/
		
	}
}
