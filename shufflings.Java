import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        List<String> result = permute(str);
        System.out.println(result);
    }
    // Rest of the code remains the same
    public static List<String> permute(String str) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        if (str == null || str.length() == 0) {
            list.add("");
            return list;
        }

        for (int i = 0; i < str.length(); i++) {
            String currentChar = String.valueOf(str.charAt(i));
            String remainingString = str.substring(0, i) + str.substring(i + 1);
            List<String> permutationsWithoutCurrentChar = permute(remainingString);

            for (String permutation : permutationsWithoutCurrentChar) {
                String temp = currentChar + permutation;
                if (!set.contains(temp)) {
                    list.add(temp);
                    set.add(temp);
                }
            }
        }

        return list;
    }
}