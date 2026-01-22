
/**
 *
 * 29290473
 * K.Q Tawana
 *
 */
import java.util.*;

public class StringPermutation {
    private List<String> results;        // 
    private List<String> trackLog;       
    private Stack<String> stackCall;     

    public StringPermutation() {
        results = new ArrayList<>();
        trackLog = new ArrayList<>();
        stackCall = new Stack<>();
    }

    public List<String> getResults() {
        return results;
    }

    public List<String> getTraceLog() {
        return trackLog;
    }

    /**
     * Public entry - accepts the input string and starts permutation.
     */
    public void permuteString(String input) {
        results.clear();
        trackLog.clear();
        stackCall.clear();

        if (input == null) return;
        char[] chars = input.toCharArray();
        permute(chars, 0, chars.length - 1);
    }

    
    private void permute(char[] arr, int l, int r) {
        String state = new String(arr) + " (l=" + l + ", r=" + r + ")";
        stackCall.push(state);
        trackLog.add("Push: "+ state);

        if (l == r) {
            results.add(new String(arr)); 
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i); 
            }
        }

        
        String popped = stackCall.pop();
        trackLog.add("Pop: " + popped);
    }

    private void swap(char[] arr, int i, int j) {
        if (i == j) return;
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}