import java.util.Scanner;

public class Largest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int k=Math.max(a,b);
        System.out.println(Math.max(k,c));
    }
}
