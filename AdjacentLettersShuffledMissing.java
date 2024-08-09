public class AdjacentLettersShuffledMissing {

    public static String Solution(String str1, String str2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder res1 = new StringBuilder();

        int i = 0;
        while (i < str1.length() && i < str2.length()) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                sb1.append(ch1);
                sb2.append(ch2);
                if (i + 1 < str1.length() && i + 1 < str2.length() && str1.charAt(i + 1) == str2.charAt(i + 1)) {
                    res1.append(sb1).append('-').append(sb2).append(',');
                    sb1.setLength(0);
                    sb2.setLength(0);
                }
            }
            i++;
        }

        while (i < str1.length()) {
            sb1.append(str1.charAt(i));
            i++;
        }
        while (i < str2.length()) {
            sb2.append(str2.charAt(i));
            i++;
        }

        if (sb1.length() > 0 || sb2.length() > 0) {
            res1.append(sb1).append('-').append(sb2);
        } else if (res1.length() > 0 && res1.charAt(res1.length() - 1) == ',') {
            res1.setLength(res1.length() - 1);  
        }

        return res1.toString();
    }

    public static void main(String[] args) {
        String str1 = "base";
        String str2 = "basic";
        String res = AdjacentLettersShuffledMissing.Solution(str1, str2);
        System.out.println(res);  
    }
}
