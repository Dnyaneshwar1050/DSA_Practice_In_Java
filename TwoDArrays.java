import java.util.*;

public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int numbers[][] = new int[row][col];

        // Input 
        // using nested loop 

        // outer loop control row 
        for(int i=0; i<row; i++){
            // inner loop control columns
            for(int j=0; j<col; j++ ){
                numbers[i][j] = sc.nextInt();
            }
        }

        //Output 
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}



class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int numbers[][] = new int[row][col];

        // Input 
        // using nested loop 

        // outer loop control row 
        for(int i=0; i<row; i++){
            // inner loop control columns
            for(int j=0; j<col; j++ ){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter find int: ");
        int x = sc.nextInt();

        //Output 
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(numbers[i][j]==x){
                    System.out.println(i+","+j);
                }
            }
            System.out.println();
        }
        

    }
    
}


