package Palindromicprime;

public class Palindromicprime{
    public static void main(String args[]){
        int count = 0;
        for(int i = 2;true;i++)
        {
            int check = prime(i);
            if(check == 2)
            {
                String intToString = Integer.toString(i);
                String reverse = new StringBuffer(intToString).reverse().toString();
                if(reverse.equals(intToString))
                {
                    System.out.print(i + " ");
                    count++;
                    if(count % 10 == 0) System.out.println();
                }
            }
            if(count == 100) break;
        }
    }
    public static int prime(int num){
        int counter = 0;
        for(int i = num; i >= 1; i--){
            if(num % i == 0)
            {
                counter += 1;
            }
        }
        if(counter > 2)
        {
             counter =0;
        }
        return counter;
    }
}