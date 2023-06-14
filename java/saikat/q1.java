import java.io.*;


class First {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
	 	BufferedReader br = new BufferedReader(in);

		System.out.print("Enter the range: ");
		int n = 0;

		try{
			String str = br.readLine();
			n = Integer.parseInt(str);	
		}
		catch(Exception e){
		}

		for(int i = 2; i <= n; i++) {
			int count = 0;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) count++;
			}
			if(count == 0)
				System.out.print(i + " ");
		}
		
	}

}
