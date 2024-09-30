import java.util.ArrayList;

public class Beautiful_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(1);
        int n = 4;
        while (Arr.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i : Arr) {
                if (i * 2 <= n) {
                    // checking for even number
                    temp.add(i * 2);

                }
            }
            for (int i : Arr) {
                // check for odd no
                if ((i * 2) - 1 < n) {
                    temp.add((i * 2) - 1);
                  
                }
            }
            Arr = temp;
        }
        System.out.println(Arr);
    }
}
