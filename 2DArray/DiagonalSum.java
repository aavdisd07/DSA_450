
public class DiagonalSum {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int startCol = 0;
        int sum = 0;
        int rev_sum=0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i][startCol++];
            rev_sum+=arr[i][arr[0].length-1-i];
        }
        System.out.println("Left Digonal sum :"+sum);
        System.out.println("Right Diagonal Sum :"+rev_sum);
       
    }
}
