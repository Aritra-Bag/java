import java.io.*;

class ReverseAString {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        System.out.println("Enter a string");
        String s = null;
        try{
            s = br.readLine();
        }
        catch(Exception e){

        }

        StringBuilder newS = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--)
            newS.append(s.charAt(i));
        
        System.out.println("Reverse is: " + newS);
    }
}
