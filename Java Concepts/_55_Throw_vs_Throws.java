// Throw vs Throws in Java
// This Program was created by Yatharth Chauhan

// The Throw Keyword:
// The throw keyword is used to throw an exception explicitly by the
// programmer

// if ( b===0 ) {
// throw new ArithmeticException("Div by 0");
// }
// else{
// return a/b ;
// }

// In a similar manner, we can throw user defined exceptions:

// throw new My Exception ( "Exception throw" );

// The throw Keyword
// Throws java throws keyword is used to declare an exception.

// This gives an information to the programmer that there might be an exception
// so its better to be prepared with a try catch block!

// public void calculate (int a, int b) throws IOException {

// code

// }

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class _55_Throw_vs_Throws {

    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // Made By Harry
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
        try {
            // int c = divide(6, 0);
            // System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
