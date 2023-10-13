public class factorial {
    public static void main(String[] args) {
        int num = 6;
        int fact = 1;
        while (num != 0) {
            fact = num * fact;
            num--;
        }
        System.out.print("The Factorial of 6 is = " + (fact));
    }
}
