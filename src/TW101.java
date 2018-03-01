import java.util.Scanner;

public class TW101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle.Easiest();

        System.out.println("--------------------");

        System.out.print("How many asterisks to draw (horizontal)? ");
        int length = Integer.parseInt(sc.next());
        Triangle.Horizontal(length);

        System.out.println("--------------------");

        System.out.print("How many asterisks to draw (vertical)? ");
        length = Integer.parseInt(sc.next());
        Triangle.Vertical(length);

        System.out.println("--------------------");

        System.out.print("What is the height of the right triangle? ");
        length = Integer.parseInt(sc.next());
        Triangle.Right(length);

        System.out.println("--------------------");

        System.out.print("What is the height of the isosceles triangle? ");
        length = Integer.parseInt(sc.next());
        Triangle.Isosceles(length);

        System.out.println("--------------------");

        System.out.print("What is the height of the diamond? ");
        length = Integer.parseInt(sc.next());
        Diamond.Diamond(0, length);

        System.out.println("--------------------");

        System.out.print("What is the height of the diamond? ");
        length = Integer.parseInt(sc.next());
        System.out.print("What is your name? ");
        String name = sc.next();
        Diamond.NamedDiamond(0, length, name);

        System.out.println("--------------------");
        Extras.FizzBuzz();

        System.out.println("--------------------");

        System.out.print("Prime factors of which number? ");
        int num = Integer.parseInt(sc.next());
        Extras.Generate(num);
    }
}
