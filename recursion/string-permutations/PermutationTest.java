
/*
 * K.Q Tawana
 * 29290473
 */
import java.util.List;
import java.util.Scanner;

public class PermutationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        StringPermutation sp = new StringPermutation();
        sp.permuteString(input);

        
        System.out.println("\nOriginal string: " + input);

        
        List<String> perms = sp.getResults();
        System.out.println("\nPermutations (" + perms.size() + "):");
        for (String p : perms) {
            System.out.println(p);
        }

        
        List<String> trace = sp.getTraceLog();
        System.out.println("\nStack trace (chronological Push/Pop):");
        for (String entry : trace) {
            System.out.println(entry);
        }

        scanner.close();
    }
}
