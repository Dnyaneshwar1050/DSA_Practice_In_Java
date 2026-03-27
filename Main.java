import java.util.*;

class outputClass {
    public static void main(String args[]) {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
    }
}

// or

class output1Class {
    public static void main(String args[]) {
        System.out.print("* \n* *\n* * *\n* * * *");
    }
}

// veraibles

public class Main {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int sum = a + b ;
        System.out.println(sum);
    }
}



//input in java 

class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
    }
}


// question for practice 

class Question {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println(sum);
    }
}