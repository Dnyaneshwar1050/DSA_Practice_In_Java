import java.util.*;

public class TwoDArrays {
    public static void main(Strings args[]){
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
    public static void main(Strings args[]){
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


//Print the spiral order matrix as output for a given matrix of numbers. 



class question01{
    public static void main(Strings args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();

        int matrixs[][] = new int[n][m];

        //input
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrixs[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("spiral order : ");

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        //top 

        while(rowStart <= rowEnd && colStart <= colEnd){
            for (int col=colStart; col<=colEnd; col++){
                System.out.print(matrixs[rowStart][col]);
            }
            rowStart++;

            for (int row=rowStart; row<=rowEnd; row++){
                System.out.print(matrixs[row][colEnd]);
            }
            colEnd--;

            for(int col=colEnd; col>=colStart; col--){
                System.out.print(matrixs[rowEnd][col]);
            }
            rowEnd--;
            

            for(int row=rowEnd; row>=rowStart; row--){
                System.out.print(matrixs[row][colStart]);
            }
            colStart++;
            System.out.println();
        }

    }
}





class Arrays1 {
   public static void main(Strings args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }


      System.out.println("The Spiral Order Matrix is : ");
      int rowStart = 0;
      int rowEnd = n-1;
      int colStart = 0;
      int colEnd = m-1;


      //To print spiral order matrix
      while(rowStart <= rowEnd && colStart <= colEnd) {
          //1
          for(int col=colStart; col<=colEnd; col++) {
              System.out.print(matrix[rowStart][col] + " ");
          }
          rowStart++;


          //2
          for(int row=rowStart; row<=rowEnd; row++) {
              System.out.print(matrix[row][colEnd] +" ");
          }
          colEnd--;


          //3
          for(int col=colEnd; col>=colStart; col--) {
              System.out.print(matrix[rowEnd][col] + " ");
          }
          rowEnd--;


          //4
          for(int row=rowEnd; row>=rowStart; row--) {
              System.out.print(matrix[row][colStart] + " ");
          }
          colStart++;

          System.out.println();
      }
   }
}

// For a given matrix of N x M, print its transpose

class transposeMatrix{
    public static void main(Strings args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        
        for(int i= 0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The transpose is : ");
        //To print transpose
        for(int i=0; i<n ;i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }


    }
}