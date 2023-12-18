import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Single {
    public static final int MAX = 5;

    public static void main(String[] args) {
        List<Integer> nums = Readinput();
        Sort(nums);
        displayNumbers(nums);
    }

    public static List<Integer> Readinput() {
        System.out.println("Welcome to the Application!");
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter 5 valid integers in the range [0, 10]");
        while (nums.size() < MAX) {
            String s = inp.nextLine();
            if (CheckType(s)) {
                continue;
            }
            int num = Integer.parseInt(s);
            if (CheckRange(num)) {
                continue;
            }
            nums.add(num);
        }
        inp.close();
        return nums;
    }

    public static boolean CheckRange(int input) {
        if (input < 0 || input > 10) {
            System.out.println("Invalid range! Try again!");
            return true;
        }
        return false;
    }

    public static boolean CheckType(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return true;
        }
        return false;
    }

    public static void Sort(List<Integer> input) {
        Collections.sort(input);
    }

    public static void displayNumbers(List<Integer> nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
