package ArrayOneDimensional;

public class Exercise2 {

	public static void main(String[] args) {
		// write a statement that declare a string array initialize with the following string:
		//sunday, monday, tuesday, wednesday, thursday, friday, saturday
		//write a loop that displ content of each element in the array that u declared
		
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
            for(int i = 0; i < days.length; i++) {
			System.out.println(days[i]);	
		}
         int i = 0;
         while (i < days.length) {
        	 System.out.println("while "+days[i]);
        	 i++;
         }
         
         int j = 0;
         do {
        	 System.out.println("Do "+days[j]);
        	 j++;
         }while(j < days.length);
         
				

	}

	}


