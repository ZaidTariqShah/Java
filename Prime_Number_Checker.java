import java.util.Scanner;
public class Prime_Number_Checker{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 2;
        int b = 0;
        while(x < num){
            if(num % x == 0){
                b = 1;
                break;
        }
        x++;
    }
        if(b == 0){
            System.out.print("It Is A Prime Number");
        }
        else
        {
            System.out.print("It Is Not A Prime Number");
        }
    }
    
}
