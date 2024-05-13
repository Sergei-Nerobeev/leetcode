package tasks.lessons;

public class Test123 {
    public static void main(String[] args) {
    test123("qwer", -1);
    }

    private static void test123(String s, int index) {
        if(index >= 0 && s.charAt(index) == 'q' || s.charAt(index) == '\t') {
            System.out.println("1");
        }
    }
}
