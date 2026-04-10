//Q1. Print all the permutations of a string.

public class HardRecursion {

    public static void printPermutation(String str, String permutation){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermutation(newString, permutation+currchar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");
    }
}


//Q2. CountPathMaze 

class HardRecursion1 {

    public static int countPath(int i, int j, int n, int m){

        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 || j == m-1){
            return 1;
        }

        int downPath = countPath(i+1, j, n, m);

        int rightPath = countPath(i, j+1, n, m);

        return downPath + rightPath;
        
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int count = countPath(0, 0, n, m);
        System.out.println(count);
    }
}