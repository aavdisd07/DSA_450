public class GridWays {
    static int gridWays(int row, int col, int target[]) {
        // base case
// TC---> O(2^(m+n))
        if (row == target[0] && col == target[1]) {  // we stand at target position
            return 1;
        } else if (row == target[0] + 1 || col == target[0] + 1) {  // if we reach boundary then no right ways or downways
            return 0;
        }

        int count1 = gridWays(row + 1, col, target);  // rigth ways
        int count2 = gridWays(row, col + 1, target);  // down ways 
        return count1 + count2;  // total ways right+down
    }

   static int factorial(int n){
    if(n==1 ||n==0){
         return 1;
    }
    return n*factorial(n-1);
   }
 

//  Math trick is factorial of combination of both ways and divide by the factorial of repeatative ways
// TC---> O(m+n)
   static int MathTrick(int m,int n){
    int ans= factorial(m+n-2);
    int ans2=ans/factorial(m-1);
    int ans3=ans2/factorial(n-1);

    return ans3;  
   }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int Target[] = { m - 1, n - 1 };
        System.out.println(gridWays(0, 0, Target));

        System.out.println(MathTrick(m, n));
    }
}