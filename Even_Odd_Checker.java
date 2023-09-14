public class Even_Odd_Checker {
    public static void main (String args []){
        int x = 2;
        while(x<=100)
        {
            if(x%2==0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
            x = x+1;
        }
    }
}
