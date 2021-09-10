// A positive n digit number X is called a Keith Number (or repfigit number) if it arranged in a special number sequence generated using its
// digits. The special sequence has first n terms as digits of x and other terms are recursively evaluated as the sum of previous n terms.
// For Example: 197, 19, 741, 1537 etc.

package numbers.variants;

public class Keith {

    public static int sum(int[] arr) {
        int suming = 0;
        for (int n: arr) {
            suming += n;
        } 
        return suming;
    }


    public static boolean Keithing(int num, int[] arr) {
        if (sum(arr) == num) {
            return true;    
        } else if (sum(arr) > num) {
            return false;
        } else {
            int sum = Keith.sum(arr);
            
            for (int i=0; i<arr.length; i++) {
                if (i == arr.length - 1) {
                    arr[i] = sum;
                } else {
                    arr[i] = arr[i + 1];
                }
            }

            return Keithing(num, arr);
        }
    }

    public static void print(int arr[]) {
        System.out.println("Array is :- ");
        for (int n: arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static boolean isKeith(String num) {   

        int[] arr = new int[num.length()];
        
        for (int i=0; i<num.length(); i++) {
            arr[i] = num.charAt(i) - '0';
        }
        
        boolean result = Keithing(Integer.parseInt(num), arr);

        return result;
    }

}
