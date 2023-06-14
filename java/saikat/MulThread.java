import java.util.Scanner;


class Fibo extends Thread{
	int n;
	Fibo(int n){
		this.n = n;
	}
	public void run() {
		int[] arr = new int[n];
		
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i < n; i++) 
			arr[i] = arr[i-1] + arr[i-2];
		
		for(int i = 0; i < n; i++) {
			System.out.println("From Fibo: " + arr[i]);
			try {
				sleep(6000);
			}
			catch(Exception e) {
				
			}
		}	
	}
}

class Prime extends Thread{
	int n;
	Prime(int n){
		this.n = n;
	}
	public void run() {
		for(int i = 2; i <= n; i++) {
			int count = 0;
			for(int j = 2; j <= i/2; j++) {
				if(i%j == 0) count++;
			}
			if(count == 0) {
				System.out.println("From Prime: " + i);
				try {
					sleep(3000);
				}
				catch(Exception e) {
					
				}
			}
		}
	}
}

class MulThread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		new Fibo(n).start();
		new Prime(n).start();
	}
}