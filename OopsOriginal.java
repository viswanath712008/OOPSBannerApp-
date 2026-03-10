import java.util.HashMap;

public class Oops {
    private static HashMap<Character, String[]> patterns = new HashMap<>();

    public static void main(String[] args) {
        displayMessage("OOPS");
    }

    private static void generatePatterns() {
        patterns.put('O', new String[]{
            "  OOO ",
            " O   O",
            "O     O",
            "O     O",
            " O   O ",
            "  OOO "
        });
        patterns.put('P', new String[]{
            "  PPPP ",
            " P   P ",
            " PPPP  ",
            "P     ",
            " P     ",
            "  P     "
        });
        patterns.put('S', new String[]{
            "  SSSS ",
            "S     ",
            "  SSS ",
            "     S ",
            "    SSS ",
            "     SSS"
        });
    }

    public static String[] getPattern(char c) {
        return patterns.get(c);
    }

    public static void displayMessage(String message) {
        generatePatterns();
        for (int i = 0; i < 6; i++) {
            for (char c : message.toCharArray()) {
                String[] pat = getPattern(c);
                if (pat != null && i < pat.length) {
                    System.out.print(pat[i]);
                }
            }
            System.out.println();
        }
    }
}
