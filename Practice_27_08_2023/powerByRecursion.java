package Practice_27_08_2023;

public class powerByRecursion {
    public static int power(int a, int n) {
        // base case
        if (n == 0) {
            return 1;

        }
        return a * power(a, n - 1);
    }

    public static void main(String Arg[]) {
        int ans = power(5, 2);
        System.out.println(ans);

    }
}
