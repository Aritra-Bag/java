import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = Integer.parseInt(reader.readLine());
        System.out.print("Enter the upper bound of the range: ");
        int upperBound = Integer.parseInt(reader.readLine());
        
        System.out.println("Prime numbers in the given range:");
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
