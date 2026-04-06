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