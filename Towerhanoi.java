public class Towerhanoi {

    public static void hanoi(int n, char source, char target, char helper) {
        // Base case: only one disk left to move
        if (n == 1) {
            System.out.println("Move disk " + n + ": " + source + " → " + target);
            return;
        }

        // Step 1: move top (n-1) disks from source to helper
        hanoi(n - 1, source, helper, target);

        // Step 2: move the current bottom disk (disk n) to target
        System.out.println("Move disk " + n + ": " + source + " → " + target);

        // Step 3: move (n-1) disks from helper to target
        hanoi(n - 1, helper, target, source);
    }

    public static void main(String[] args) {
        int totalDisks = 3;
        System.out.println("Solving Tower of Hanoi for " + totalDisks + " disks:\n");
        hanoi(totalDisks, 'A', 'C', 'B');
    }
}
