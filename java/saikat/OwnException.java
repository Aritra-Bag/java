import java.io.*;


class MyException extends Exception{
	MyException(String s){
		super(s);
	}
}

class ThrowException {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		
		float n = 0;
		try {
			System.out.print("Enter first number: ");
			int n1 = Integer.parseInt(br.readLine());
			System.out.print("Enter secondt number: ");
			int n2 = Integer.parseInt(br.readLine());
			
			n = n1/n2;
			if(n == -1) {
				throw new MyException("Exception Occured");
			}
		}

		catch(Exception e) {
			System.out.print(e.getMessage());
		}

		finally {
			System.out.println("\nDivision is: " + n);
		}
	}
}