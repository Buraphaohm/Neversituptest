import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter smiley faces separated by spaces: ");
        String smileys_input = scanner.nextLine();
        String[] smileys = smileys_input.split(" ");
        int smileys_count = count_smileys(smileys);
        System.out.println("Number of valid smiley faces: " + smileys_count);
    }

    public static int count_smileys(String[] smileys) {
        int smileys_count = 0;
        for (String smiley : smileys) {
            if (smiley.length() >= 2 && smiley.length() <= 3) {
                char eyes = smiley.charAt(0);
                char mouth = smiley.charAt(smiley.length() - 1);
                if ((eyes == ':' || eyes == ';') && (mouth == ')' || mouth == 'D' || mouth == ']')) {
                    if (smiley.length() == 2 || (smiley.length() == 3 && (smiley.charAt(1) == '-' || smiley.charAt(1) == '~'))) {
                        smileys_count++;
                    }
                }
            }
        }
        return smileys_count;
    }
}
