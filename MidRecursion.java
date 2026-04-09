public class MidRecursion {
    public static void TowerOfHanoi(int n, String source, String helper, String destination) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: move n-1 from source to helper
        TowerOfHanoi(n - 1, source, destination, helper);

        // Step 2: move nth disk to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: move n-1 from helper to destination
        // TowerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String args[]) {
        TowerOfHanoi(3, "S", "H", "D");
    }
}


// print reverse in string

class MidRecursion1{
    public static void PrintRev(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        PrintRev(str, idx-1);
    }
    public static void main(String args[]){
        String str = "abcd";
        PrintRev(str, str.length()-1);

    }
}


//Q3. Find the occurrence of the first and last occurrence of an element using recursion.

class MidRecursion2 {
public static int first = -1;
public static int last = -1;
public static void getIndices(String str, char el, int idx) {
if(idx == str.length()) {
return;
}
if(str.charAt(idx) == el) {
if(first == -1) {
first = idx;
} else {
last = idx;
}
}
getIndices(str, el, idx+1);
}
public static void main(String args[]) {
String str = "tabcdfghijakkk";
char el = 'a';
getIndices(str, el, 0);
System.out.println("First occurence : " + first);
System.out.println("Last occurence : " + last);
}
}


//Q4. Check if an array is sorted (strictly increasing).

class MidRecursion3{

    public static boolean isIncreasing(int arr[], int idx){

        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
           return isIncreasing(arr, idx+1);
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        if(isIncreasing(arr, 0) == true){
            System.out.println("this array is sorted");
        }else{
            System.out.println("this array is not sorted");
        }

    }
}


//Q5. Move all ‘x’ to the end of the string. - O(n)


class MidRecursion4{
     public static void moveAllXToEnd(String str, int idx, int count, String NewStr){

        if(idx == str.length()){
            for(int i= 0; i<count; i++){
                NewStr += 'x';
            }
            System.out.print(NewStr);
            return;
        }

        char currchar = str.charAt(idx);

        if(currchar == 'x'){
            moveAllXToEnd(str, idx+1, count+1, NewStr);
        }else{
            NewStr += currchar;
            moveAllXToEnd(str, idx+1, count, NewStr);
        }
     }
     public static void main(String args[]){
        String str = "axbcxxd";
        moveAllXToEnd(str, 0, 0, "");
     }
}


//Q6. Remove duplicates in a string.


class MidRecursion5 {
//to add all 'x' to the end of the string
public static String addX(int count) {
String newStr = "x";
for(int i=1;i<count; i++) {
newStr += 'x';
}
return newStr;
}
public static String moveAllX(String str, int idx, int count) {
if(idx == str.length()) {
return addX(count);
}
if(str.charAt(idx) == 'x') {

return moveAllX(str, idx+1, count+1);
} else {
String nextStr = moveAllX(str, idx+1, count);
return str.charAt(idx) + nextStr;
}
}
public static void main(String args[]) {
String str = "abcdefxghxixjxxxk";
int count = 0;
String newStr = moveAllX(str, 0, count);
System.out.println(newStr);
}
}