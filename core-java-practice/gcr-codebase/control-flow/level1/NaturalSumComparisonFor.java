import java.util.*;

public class NaturalSumComparisonFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();

        if (number>=0){
            int sumUsingFormula=number*(number+1)/2;
            int sumUsingLoop=0;

            for (int counter=1; counter<=number; counter++) {
                sumUsingLoop+=counter;
            }

            System.out.println("The sum of "+number+" natural numbers using formula is: "+sumUsingFormula);
            System.out.println("The sum of "+number+" natural numbers using for loop is: "+sumUsingLoop);

            if (sumUsingFormula==sumUsingLoop) {
                System.out.println("Both computations are correct and yield the same result.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        } else {
            System.out.println("The number "+number+" is not a natural number");
        }
        sc.close();
    }
}