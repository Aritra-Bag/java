
class Complex {

	float real, imag;
	Complex(float a, float b){
		real = a;
		imag = b;
	}
	
	Complex sum(Complex c1, Complex c2) {
		float real = c1.real + c2.real;
		float imag = c1.imag+ c2.imag;
		
		return new Complex(real, imag);
	}

    Complex multiplication(Complex c1, Complex c2){
        float real = c1.real*c2.real - c1.imag*c2.imag;
        float imag = c1.real*c2.imag + c1.imag*c2.real;

        return new Complex(real, imag);
    }

}

class Main{
	public static void main (String[] args) {
		Complex c1 = new Complex(2.0f, 3.0f);
		Complex c2 = new Complex(3.0f, 2.0f);

		Complex c3 = c1.sum(c1, c2);
		System.out.print("Addition is: "+c3.real+" + "+c3.imag+"j");

        	Complex c4 = c1.multiplication(c1, c2);
		System.out.println();
       	System.out.print("Multiplication is: "+c4.real+" + "+c4.imag+"j");

	}
}

