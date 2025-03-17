
class MathMeth {

    static void print(Object s) {
         System.out.println(s);
    }
   

    public static void main(String[] args) {

        // Arithmatic
        int a = 10, b = 3;
        print("Addition: " + (a + b));
        print("Subtraction: " + (a - b));
        print("Multiplication: " + (a * b));
        print("Division: " + (a / b)); // Integer division
        print("Modulus: " + (a % b)); // Remainder

        // Relational
        int x = 10, y = 5;
        print("x == y: " + (x == y));
        print("x != y: " + (x != y));
        print("x > y: " + (x > y));
        print("x < y: " + (x < y));
        print("x >= y: " + (x >= y));
        print("x <= y: " + (x <= y));

        // Bitwise
        a = 5; b = 3;
        print("a & b: " + (a & b)); // 1
        print("a | b: " + (a | b)); // 7
        print("a ^ b: " + (a ^ b)); // 6
        print("~a: " + (~a)); // -6
        print("a << 1: " + (a << 1)); // 10
        print("a >> 1: " + (a >> 1)); // 2

        // Math methods
        print("abs: "+Math.abs(-5));
        print("sqrt: "+Math.sqrt(9));
        print("pow: "+Math.pow(2,3));
        print("max: "+Math.max(4,5));
        print("min: "+Math.min(6,2));
        print("round: "+Math.round(4.5));
        print("ceil: "+Math.ceil(5.5));
        print("floor: "+Math.floor(5.5));
        print("random: "+Math.random()); //0.0-1.0

        print((int) (Math.random() * 100));

        String ag = (((Math.random() * 100)) > 50) ? "bada" :"chota";
        print(ag);
    }
}
