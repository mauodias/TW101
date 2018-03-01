import java.util.List;
import java.util.ArrayList;

public class Extras {
    public static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.print("Fizz");
            if (i % 5 == 0)
                System.out.print("Buzz");
            if (i % 3 != 0 && i % 5 != 0)
                System.out.print(i);
            System.out.println();
        }
    }

    public static void Generate(int num) {
        int n = num;
        List<Integer> factors = new ArrayList<>();

        while(num % 2 == 0) {
            factors.add(2);
            num /= 2;
        }

        for(int i = 3; i < Math.sqrt(n); i += 2) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
            if (num == 1)
                break;
        }

        System.out.println("Prime factors of " + n + ":");
        for(int val : factors) {
            System.out.println("- " + val);
        }
        if (num > 2)
            System.out.println("- " + num);
    }
}
