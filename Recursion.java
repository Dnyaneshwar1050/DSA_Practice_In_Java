import java.util.*;

public class Recursion {

    public static void printNumber(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);

        printNumber(n-1);
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNumber(n);
    }
}

//print sum of first n natrual number

class Recursion1{
    public static void sumOfNNaturalNo(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumOfNNaturalNo(i+1, n, sum); 
        // return;
        System.out.println(i);
    }
    public static void main(String args[]){
        sumOfNNaturalNo(1, 5, 0);
    }
}

//print factorial of n using recursion

class Recursion2{

    public static int factorialOfN(int n){

        if(n == 1 || n == 0){
            return 1;
        }

        int factorial_of_nm1 = factorialOfN(n-1);
        System.out.println(factorial_of_nm1);
        int factorial_of_n = n*factorial_of_nm1;
        return factorial_of_n;
    }
    public static void main(String args[]){
        int factorail_ans = factorialOfN(5);
        System.out.println(factorail_ans);
    }
}

