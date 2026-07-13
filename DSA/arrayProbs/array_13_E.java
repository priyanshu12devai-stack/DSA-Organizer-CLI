/*
@Problem =Duplicate Zeroes
@Algorithm = -
@Topic = array
@Difficulty = Medium
@Problem_num = 13
*/

package DSA.arrayProbs;


public class array_13_E {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = n - 1; j > i; j--) {
                    if (j == i + 1) {
                        arr[i + 1] = 0;
                        i++;        // ✅ FIXED: always skip, no condition
                        break;
                    }
                    arr[j] = arr[j - 1];
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        System.out.println(" }");
    }

    public static void main(String[] args) {

        // ── Test 1: Normal case ──────────────────────────────────────────────
        int[] t1 = {1, 2, 0, 2, 1, 3, 4};
        System.out.print("T1 Input  : "); printArray(t1);
        duplicateZeros(t1);
        System.out.print("T1 Output : "); printArray(t1);
        System.out.println("T1 Expected: { 1, 2, 0, 0, 2, 1, 3 }");
        System.out.println();

        // ── Test 2: Zero at the END ──────────────────────────────────────────
        int[] t2 = {1, 2, 3, 4, 5, 0};
        System.out.print("T2 Input  : "); printArray(t2);
        duplicateZeros(t2);
        System.out.print("T2 Output : "); printArray(t2);
        System.out.println("T2 Expected: { 1, 2, 3, 4, 5, 0 }");
        System.out.println();

        // ── Test 3: Zero at SECOND-TO-LAST (the bug case) ───────────────────
        int[] t3 = {1, 2, 3, 4, 0, 5};
        System.out.print("T3 Input  : "); printArray(t3);
        duplicateZeros(t3);
        System.out.print("T3 Output : "); printArray(t3);
        System.out.println("T3 Expected: { 1, 2, 3, 4, 0, 0 }");
        System.out.println();

        // ── Test 4: Zero at the START ────────────────────────────────────────
        int[] t4 = {0, 1, 2, 3, 4, 5};
        System.out.print("T4 Input  : "); printArray(t4);
        duplicateZeros(t4);
        System.out.print("T4 Output : "); printArray(t4);
        System.out.println("T4 Expected: { 0, 0, 1, 2, 3, 4 }");
        System.out.println();

        // ── Test 5: Multiple zeros ───────────────────────────────────────────
        int[] t5 = {0, 0, 1, 2, 3, 4};
        System.out.print("T5 Input  : "); printArray(t5);
        duplicateZeros(t5);
        System.out.print("T5 Output : "); printArray(t5);
        System.out.println("T5 Expected: { 0, 0, 0, 0, 1, 2 }");
        System.out.println();

        // ── Test 6: All zeros ────────────────────────────────────────────────
        int[] t6 = {0, 0, 0, 0};
        System.out.print("T6 Input  : "); printArray(t6);
        duplicateZeros(t6);
        System.out.print("T6 Output : "); printArray(t6);
        System.out.println("T6 Expected: { 0, 0, 0, 0 }");
        System.out.println();

        // ── Test 7: Single zero ──────────────────────────────────────────────
        int[] t7 = {0};
        System.out.print("T7 Input  : "); printArray(t7);
        duplicateZeros(t7);
        System.out.print("T7 Output : "); printArray(t7);
        System.out.println("T7 Expected: { 0 }");
        System.out.println();

        // ── Test 8: No zeros ─────────────────────────────────────────────────
        int[] t8 = {1, 2, 3, 4, 5};
        System.out.print("T8 Input  : "); printArray(t8);
        duplicateZeros(t8);
        System.out.print("T8 Output : "); printArray(t8);
        System.out.println("T8 Expected: { 1, 2, 3, 4, 5 }");
        System.out.println();

        // ── Test 9: Consecutive zeros in middle ──────────────────────────────
        int[] t9 = {1, 0, 0, 2, 3, 4};
        System.out.print("T9 Input  : "); printArray(t9);
        duplicateZeros(t9);
        System.out.print("T9 Output : "); printArray(t9);
        System.out.println("T9 Expected: { 1, 0, 0, 0, 0, 2 }");
        System.out.println();

        // ── Test 10: Two elements, one zero ──────────────────────────────────
        int[] t10 = {0, 5};
        System.out.print("T10 Input  : "); printArray(t10);
        duplicateZeros(t10);
        System.out.print("T10 Output : "); printArray(t10);
        System.out.println("T10 Expected: { 0, 0 }");
        System.out.println();
    }
}

