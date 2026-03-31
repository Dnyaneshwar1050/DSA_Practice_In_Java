import java.util.*;

public class functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    
    printMyName(name); // call kiya function ko 
}
}

// function memory mai stack ki form mai save hote hai

//questions 

// 1) Make a function to add 2 numbers and return sum 

class functionQuestions{

    public static int sumOfNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sumOfNumbers(a, b));

    }
}

//or
class functionQuestions2{

    public static void sumOfNumbers(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sumOfNumbers(a, b);

    }
}

// 3) find factorial of n numbers

class findFactorial {

    public static int calculatesFactorials(int n){
        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = calculatesFactorials(n);

        System.out.println(factorial);
    }
}

// 2)Enter 3 numbers from the user & make a function to print their average


class average {

    public static double average(int a, int b, int c){
        double average = (a+b+c)/3.0;
        return average;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double average = average(a, b, c);

        System.out.println(average);
    }
}

// 4)Write a function to print the sum of all odd numbers from 1 to n.

class sumOfOddNumber1{

    public static int sumOfOddNumber(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
           if(i % 2 !=0 ){
            sum = sum + i;
           }
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = sumOfOddNumber(n);
        System.out.println(sum);

    }
}