package ArrayOneDimensional;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Welcome to our zombie killer program!!!!");
		
		String backpack[]= {"Shotgun","Assault Rifle","Sniper"};
		String zombies[]= {"Close-range zombie","Mid-range zombie","Long-range zombie"};
		int numbersZombiesHate[]= {4, 90, 70, 123, 12, 4, 561, 1}; 
		int zombiesNotHate[];
		zombiesNotHate = new int[4];
		zombiesNotHate[0] = 2;
		zombiesNotHate[1] = 99;
		zombiesNotHate[2] = 46;
		zombiesNotHate[3] = 183;

		System.out.println("Backpack item! ");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);
		
		System.out.println("These are the zombies!");
		System.out.println(zombies[0]);
		System.out.println(zombies[1]);
		System.out.println(zombies[2]);
		
		System.out.println(numbersZombiesHate[6]);
		System.out.println(zombiesNotHate[3]);
		
		

	}

}
