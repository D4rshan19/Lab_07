public class Task1 {
    public static void main(String [] args) {

        //#1 (0 - 30) [+1]
        for (int i = 0; i <= 30; i++) {
            System.out.println(i + "");
        }

        //#2 ( 30 - 0) [-1]
        for (int i = 30; i >= 0; i--) {
            System.out.println(i + "");
        }

        //#3 (0 - 18) [-3]
        for (int i = 0; i <= 18; i += 3) {
            System.out.println(i + "");
        }

        //#4 (10 - 0) [-2]
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i + "");
        }
    }
}
