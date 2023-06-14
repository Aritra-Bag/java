import java.io.*;


class Students{
	int marks;
	Students(int marks){
		this.marks = marks;
	}
}
class Main {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		try {
			System.out.print("Enter array-size: ");
			int n = Integer.parseInt(br.readLine());
			
			Students[] stuArray = new Students[n];
			for(int i = 0; i < n; i++) {
				System.out.print("Enter marks: ");
				int m = Integer.parseInt(br.readLine());
				stuArray[i] = new Students(m);
			}
		
			float total = 0;
			for(Students s : stuArray) 
				total += s.marks;
			float avg = total/n;
			System.out.println("Average is: " + avg);
		}
		catch(Exception e) {
			
		}
	}
}