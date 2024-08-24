package StringQ;
public class StrCompression {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        String str = "bbbbcddddeefghiiiijjjjjklllllmmmn";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            sb.append(count);
        }
        System.out.println(sb);
    }
}
