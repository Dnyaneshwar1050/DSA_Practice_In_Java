// import java.util.*;

// public class Arrays {
//     public static void main(String args[]){
//         int[] marks = new int[3];
//         marks[0] = 95;
//         marks[1] = 96;
//         marks[2] = 97;

//         System.out.println(marks[0]);
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//     }
// }


//using loop

import java.util.Scanner;

public class Arrays {

    public static void main(Strings args[]){
        // int[] marks = new int[3];
        int marks[] = new int[3]; // also valid syntax
        marks[0] = 95;
        marks[1] = 96;
        marks[2] = 97;

        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}
 
// second type of writing arrys 

class Arrays2 {

    public static void main(Strings args[]){
        // int[] marks = new int[3];
        int marks[] = {95, 96, 97};

        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
}


// practise question

class questions {

    public static void main(Strings args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt(); 
        }

        System.out.println("enter x : ");

        int x = sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println(i);
            }
        }
    }
}




//Take an array of names as input from the user and print them on the screen.

class question{
    public static void main(Strings args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Strings names[] = new Strings[num];

        for(int i=0; i<num; i++){
            names[i] = sc.next();
        }

        for(int i=0; i<num; i++){
            System.out.println(names[i]);
        }


    }
}


