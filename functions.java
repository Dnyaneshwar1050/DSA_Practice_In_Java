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