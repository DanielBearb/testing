
public class Main {
	public static void main(String[] args) {
		int[] values = new int[11];
		double total = 0;
		//Filling the array
		for(int i = 0; i < values.length; i++ ) {
			values[i] = (int)Math.floor(Math.random()*100);
		}
		//Show the segmented array
		for(int i = 0; i < values.length; i ++) {
			if(i > 0) {
				System.out.print("!");
			}
			System.out.print(values[i]);
		}
		System.out.println();
		//Average the array
		for(double element : values) {
			total = total + element;
		}
		double average = 0;
		if(values.length > 0) {
			average = total/values.length;
			System.out.printf("Average: %.2f ", average);
		}
		System.out.println();
		//find the maximum && minimum
		double largest = values[0];
		double smallest = values[0];
		for(int i = 1; i<values.length; i++) {
			if(values[i] > largest) {
				largest = values[i];
			}
			if(values[i] < smallest) {
				smallest = values[i];
			}
		}
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
		int searchValue = (int)Math.floor(Math.random()*100);
		System.out.println("Search Value is " + searchValue);
		int pos = 0;
		boolean found = false;
		while(!found && pos < values.length) {
			if(values[pos] == searchValue) {
				found = true;
			}else {
				pos++;
			}
		}
		if(found) {
			System.out.println("Found at: " + pos);
		}else {
			System.out.println("Not found");
		}
	}
}
