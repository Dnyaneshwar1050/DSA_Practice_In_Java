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

