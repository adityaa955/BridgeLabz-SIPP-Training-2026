
import java.util.*;
public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int number=sc.nextInt();
        int[] multiplicationTable=new int[10];

        for (int i=0;i<multiplicationTable.length;i++){
            multiplicationTable[i]=number*(i+1);
        }

        System.out.println("Multiplication Table of "+number+":");
        for (int i=0;i<multiplicationTable.length;i++){
            System.out.println(number+" * "+(i+1)+" = "+multiplicationTable[i]);
        }

        sc.close();
    }
}