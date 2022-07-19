public class Main {
    public static void main(String[] args) {
        int param1 = 15;
        int param2 = 5;
        int param3 = 10;

        int result = add(param1, param2, param3);
        System.out.println(result);

    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}