public class Triangle {
    public static void Easiest() {
        System.out.println("*");
    }

    public static void Horizontal(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void Vertical(int length) {
        for (int i = 0; i < length; i++) {
            System.out.println("*");
        }
    }

    public static void Right(int length) {
        String line = "";
        for (int i = 0; i < length; i++) {
            line = line.concat("*");
            System.out.println(line);
        }
    }

    public static void Isosceles(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = i + 1; j < height; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
