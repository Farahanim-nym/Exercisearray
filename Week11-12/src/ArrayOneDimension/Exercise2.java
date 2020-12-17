package ArrayOneDimension;

public class Exercise2 {

	public static void main(String[] args) {
		// write a statement that declare a string arrat initiablize with the following string:sunday,monday,tuesday,wednesday,thursday,friday,saturday
		//write a loop that display content of each element in the array that u declare
		
		String[] days= {"sunday","monday","tuesday","wednesday","thursday","Friday","Saturday"};
		
		for (int i=0;i<7;i++) {
			System.out.println(days[i]);
		}
		System.out.println();
		
		int c=0;
		while(c<7) {
			System.out.println(days[c]);
			c++;
		}
		System.out.println();
		
		int count=0;
		do {
			System.out.println(days[count]);
			count++;
		}while(count<7);

	}

}
