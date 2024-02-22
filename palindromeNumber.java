import java.util.*;
public class palindromeNumber {
    public static void main(String[] args) {
        
    System.out.print("enter a number=");
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int originalnum=a;
    int rev=0 ;
    while(a>0){
        int temp=a%10;
        a=a/10;
        rev=rev*10+temp;
    }
    if(originalnum==rev){
        System.out.println("given number is palindrome");
    } else{
                System.out.println("given number is not palindrome");

    }
}
}

