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


public class Arrays {

    public static void main(String args[]){
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



