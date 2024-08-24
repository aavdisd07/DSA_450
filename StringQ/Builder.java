package StringQ;
public class Builder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        String str = "good morning to you sir ! have a great day";
        char a = Character.toUpperCase(str.charAt(0));
        //    Making First letter Capital
        sb.append(a);
        int i = 1;
        while (i <= str.length() - 1) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
            i++;

        }

        System.out.println(sb);

    }

}
