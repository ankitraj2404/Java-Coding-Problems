
public class Program1 {

    static int findMax(int x, int y) {
        return x > y ? x : y;
    }

    static int findMax(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        int method1 = findMax(25, 45);
        int method2 = findMax(25, 45, 55);
        System.out.print(method1);
        System.out.print(method2);
    }

}
