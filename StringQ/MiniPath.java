package StringQ;

public class MiniPath {

    public static void main(String[] args) {
        // String str="WWEENEWSNNEEENNNNSS";
        String str = "NENEENN";
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'N':
                    y++;
                    break;
                default:
                    y--;
                    break;
            }
        }
        int X = x * x;
        int Y = y * y;
        System.out.println(X + " " + Y);

        System.out.println((float) Math.sqrt(X + Y));

    }
}
