
class StrExpansion {

    public static void main(String[] args) {
        String str = "3a2b1c";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                int count = Character.getNumericValue(c);
                char chartorepeat = str.charAt(i + 1);
                for (int j = 0; j < count; j++) {
                    sb.append(chartorepeat);
                }

            }
            i++;

        }
        System.out.println(sb);

    }
}
