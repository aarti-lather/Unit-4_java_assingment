package evaltuaion2;
import java.util.Scanner;
public class Range {
    public static void main(String[] args) {
        Range obj5 =new Range();
        Scanner sc5=new Scanner(System.in);
        System.out.println("Enter starting pont");
        int num1 =sc5.nextInt();

        System.out.println("Enter ending pont");
        int num2 =sc5.nextInt();

        System.out.println("Enter Increment number");
        int num3 =sc5.nextInt();

        obj5. functioncall(num1,num2,num3);
    }


    public void functioncall(int num1, int num2,int num3){
        String bag="";
        for(int i=num1; i<=num2;i=i+num3)
        {
            bag+=i+" ";
        }
        System.out.println(bag);
    }
}
