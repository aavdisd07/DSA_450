
public class HanoiTower {

    public static void towerOfHanoi(int disk, String src, String helper, String destn) {
        if (disk == 1) {
            System.out.println(disk + " disk moved from " + src + " to " + destn);
            return;
        }
        // transfer n-1 disk  from src to  helper using destn as helper
        towerOfHanoi(disk - 1, src, destn, helper);
        System.out.println(disk + " disk moved from " + src + " to " + destn);
        // transfer n-1 disk from helper to destn using src as helper
        towerOfHanoi(disk - 1, helper, src, destn);

    }

    public static void main(String[] args) {
        int n = 2;
        towerOfHanoi(n, "A", "B", "C");
    }
}
