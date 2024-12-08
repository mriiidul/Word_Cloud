import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DrawCSE {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        int height = 7;
        int width = 7;
        List<String> names = Arrays.asList(
                "Asib", "Tanni", "Priya", "Saad", "Rakib", "Jisan", "Darda",
                "Ifti", "Mirza", "Shrabone", "Abir", "Hridoy", "Anik", "Saiful",
                "Syeid", "Sabbir", "Rakib", "Galib", "Rifat", "Robi", "Moslah",
                "Masum", "Maruf", "Ayon", "Rocky", "Yeasin", "Apu", "Shuvo",
                "Tasmia", "Jameu", "Disha", "Sani", "Ayshi", "Ananya", "Mridul"
        );

        Random random = new Random();

        String[] colors = {
                ANSI_RED, ANSI_GREEN, ANSI_YELLOW, ANSI_BLUE,
                ANSI_PURPLE, ANSI_CYAN, ANSI_WHITE
        };

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0) {
                    System.out.print(colors[random.nextInt(colors.length)] + names.get(random.nextInt(names.size())) + ANSI_RESET + " ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.print("           ");

            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || i == height / 2 || (i < height / 2 && j == 0) || (i > height / 2 && j == width - 1)) {
                    System.out.print(colors[random.nextInt(colors.length)] + names.get(random.nextInt(names.size())) + ANSI_RESET + " ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.print("           ");

            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || i == height / 2 || j == 0) {
                    System.out.print(colors[random.nextInt(colors.length)] + names.get(random.nextInt(names.size())) + ANSI_RESET + " ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.print("           ");

            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || i == height / 2 || (i > height / 2 && j == width - 1)) {
                    System.out.print(colors[random.nextInt(colors.length)] + names.get(random.nextInt(names.size())) + ANSI_RESET + " ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.print("           ");

            for (int j = 0; j < width; j++) {
                if (j == width - 1 || (i <= height / 2 && j == 0) || i == height / 2) {
                    System.out.print(colors[random.nextInt(colors.length)] + names.get(random.nextInt(names.size())) + ANSI_RESET + " ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.print("           ");

            for (int j = 0; j < width; j++) {
                if (j == 0 || (i < height / 2 && j == height / 2 - i) || (i >= height / 2 && j == i - height / 2)) {
                    System.out.print(colors[random.nextInt(colors.length)] + names.get(random.nextInt(names.size())) + ANSI_RESET + " ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.println();
        }
    }
}