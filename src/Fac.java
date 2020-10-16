public class Fac {
    static int fac(int n) {
        int result = 1;
        while (n >= 1) {
            result = result * n;
            n = n - 1;
        }
        return result;
    }

    static int fac2(int n) {
        if (n < 1)
            return 1;
        else
            return n * fac2(n - 1);
    }

    static int fac3(int n) {
        return switch (n) {
            case 1 -> 1;
            default -> n * fac3(n-1);
        };
    }

    public static void main(String[] args) {
        System.out.println(fac(5));
        System.out.println(fac2(5));
        System.out.println(fac3(5));
    }
}