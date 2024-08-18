
public class Stock_buy_Sell {

    public static void main(String[] args) {
        int arr[] = {7, 6, 4, 3, 1};
        int buy = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            buy = Math.min(buy, arr[i]);
            profit = Math.max(arr[i] - buy, profit);
        }

        System.out.println(profit);

    }
}
