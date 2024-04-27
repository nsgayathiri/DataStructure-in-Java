public class Linear_Search_String {
    public static void main(String args[]) {
        String str = "Gayathiri";
        char target = 'u';
        System.out.println(search(str, target));
    }

    public static boolean search(String name, char target) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
