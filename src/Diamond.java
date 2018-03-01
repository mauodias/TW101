public class Diamond {
    public static void Diamond(int current, int limit) {
        String line = "";
        for (int i = current + 1; i < limit; i++) {
            line = line.concat(" ");
        }
        for (int j = 0; j < current * 2 + 1; j++) {
            line = line.concat("*");
        }
        System.out.println(line);
        if (current + 1 == limit)
            return;
        else
            Diamond(current + 1, limit);
        System.out.println(line);
    }

    public static void NamedDiamond(int current, int limit, String name) {
        String line = "";
        if (current + 1 == limit) {
            line = name;
        }
        else {
            for (int i = current + 1; i < limit; i++) {
                line = line.concat(" ");
            }
            for (int j = 0; j < current * 2 + 1; j++) {
                line = line.concat("*");
            }
        }
        System.out.println(line);
        if (current + 1 == limit)
            return;
        else
            NamedDiamond(current + 1, limit, name);
        System.out.println(line);
    }
}
