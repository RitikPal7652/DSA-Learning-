package DSA.codes;

import java.util.Collections;
import java.util.ArrayList;

public class Recursion {
    static void subset_Sum(int[] arr, int n, int idx, int sum) {
        //Base Case.
        if (idx >= n) {
            System.out.println(sum);
            return;
        }

        //When current character is added in the sum.
        subset_Sum(arr, n, idx + 1, sum + arr[idx]);

        //when current character is not added in the sum.
        subset_Sum(arr, n, idx + 1, sum);
    }

    static void subSequence_String(String s, String currAns) {
        /*
        Base Case.
         */
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }

        //To find out the current Index.
        char currChar = s.charAt(0);

        //To find out the remaining String.
        String remString = s.substring(1);

        //Call for if current Character is add in the given string.
        subSequence_String(remString, currAns + currChar);

        //Call for if current character is not add in the given string.
        subSequence_String(remString, currAns);
    }

    static ArrayList<String> findSubsequence(String s) {
        /*
        A String has 2^n subsequences or subsets.
         */
        ArrayList<String> ans = new ArrayList<>();
        //Base Case.
        if (s.length() == 0) {
            ans.add(" ");
            return ans;
        }

        char ch = s.charAt(0);
        //Recursive Work.
        ArrayList<String> smallAns = findSubsequence(s.substring(1));

        //Self Work.
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(ch + ss);
        }
        return ans;
    }

    static String mergeStrings(String a, String b) {
        String ans = "";
        if (a.length() == 0) {
            ans += b;
            return ans;
        }
        if (b.length() == 0) {
            ans += a;
            return ans;
        }
        ans += a.substring(0, 1);
        ans += b.substring(0, 1);
        ans += mergeStrings(a.substring(1, a.length()), b.substring(1, b.length()));
        return ans;
    }

    static String reverseString2(String s, int idx) {
        if (idx == s.length()) {
            return " ";
        }
        String smallWork = reverseString2(s, idx + 1);

        return smallWork + s.charAt(idx);
    }

    static String uppercase(String s, int idx) {
        //base case
        if (idx == s.length()) {
            return " ";
        }

        //Self Work.
        if (Character.isUpperCase(s.charAt(idx))) {
            return s.substring(idx);
        } else {
            return uppercase(s, idx + 1); //Recursive Work
        }
    }

    static String firstProgram(String s, int idx) {
        if (idx == s.length()) {
            return " ";
        }
        System.out.print(s.charAt(idx));
        return firstProgram(s, idx + 1);
    }

    static int findLowercase(String s, int idx) {
        if (idx == s.length()) {
            return 0;
        }

        int smallWork = findLowercase(s, idx + 1);

        if (s.charAt(idx) < 97) {
            return smallWork;
        } else {
            return smallWork + 1;
        }
    }

    static int findConsonant(String s, int idx) {
        //Base Case or Halting Condition.
        if (idx == s.length()) {
            return 0;
        }
        //Recursive work.
        int smallWork = findConsonant(s, idx + 1);

        //Self work.
        if (s.charAt(idx) == 'a' || s.charAt(idx) == 'e' || s.charAt(idx) == 'i' || s.charAt(idx) == 'o' || s.charAt(idx) == 'u') {
            return smallWork;
        } else {
            return smallWork + 1;
        }
    }

    static String alaternatively_join(String s1, String s2, int idx) {
        if (idx == s1.length() || idx == s2.length()) {
            return " ";
        }
        String smallWork = alaternatively_join(s1, s2, idx + 1); //Recursive work
        return ((s1.charAt(idx) + s2.charAt(idx)) + smallWork);      // Self work
    }

    static boolean number_palindrome(int[] arr, int l, int r) {
        if (l >= r) {
            return true;
        }

        return (arr[l] == arr[r] && number_palindrome(arr, l + 1, r - 1));
    }

    static boolean isPalindrome(String s, int l, int r) {
        if (l == r) {
            return true;
        }

        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l + 1, r - 1));
    }

    static String reverse(String s) {
        if (s.length() == 0) { //Base case.
            return " ";
        }
        //Recursive Work.
        String smallAns = reverse(s.substring(1));
        //Self Work.
        return smallAns + s.charAt(0);
    }

    static String reverseString(String s, int idx) {
        //Base Case.
        if (idx == s.length()) {
            return " ";
        }
        //Recursive Work.
        String smallWork = reverseString(s, idx + 1);
        //Self Work.
        return smallWork + s.charAt(idx);
    }

    static String removeOccurrences(String s) {
        if (s.length() == 0) {
            return " ";
        }

        String smallWork = removeOccurrences(s.substring(1));
        char ch = s.charAt(0);
        if (ch != 'a') {
            return ch + smallWork;
        } else {
            return smallWork;
        }
    }

    static String removeOccurence(String s, int idx) {
        //Base Case.
        if (idx == s.length()) {
            return " ";
        }

        //Recursive Work.
        String smallWork = removeOccurence(s, idx + 1);
        char curr = s.charAt(idx);

        if (curr != 'a') {
            return curr + smallWork;
        } else {
            return smallWork;
        }
    }

    static int matrix(int[][] arr, int m, int n, int i, int j) {
        arr = new int[m][n];

        //Base Case.
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        //Self Work.
        return matrix(arr, m, n, i, j);
    }

    static int lastIndex(int[] arr, int target, int idx) {
        //Base case.
        if (idx <= 0) {
            return -1;
        }

        //Self Work.
        if (arr[idx] == target) {
            return idx;
        }

        //Recursive Work.
        return lastIndex(arr, target, idx - 1);
    }

    static boolean sorted(int[] arr, int n, int idx) {
        boolean check = true;
        //Base Case.
        if (idx == n - 1) {
            return check;
        }

        //Self Work.
        if (arr[idx] > arr[idx + 1]) {
            check = false;
            return check;
        }
        //1243
        //Recursive Work.
        return sorted(arr, n, idx + 1);
    }

    static ArrayList<Integer> allIndex(int[] arr, int n, int target, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();
        //Base Case.
        if (idx >= n) {
            return ans;
        }

        //Self Work.
        if (arr[idx] == target) {
            ans.add(idx);
        }

        //Recursive Work.
        ArrayList<Integer> smallAns = allIndex(arr, n, target, idx + 1);
        ans.addAll(smallAns);

        return ans;
    }

    static void findAllIndices(int[] arr, int n, int target, int idx) {
        if (idx >= n) {
            return;
        }

        if (arr[idx] == target) {
            System.out.print(idx + "  ");
        }

        findAllIndices(arr, n, target, idx + 1);
    }

    static int indexPresent(int[] arr, int n, int target, int idx) {
        if (idx >= n) return -1;

        if (arr[idx] == target) {
            return idx;
        }

        return indexPresent(arr, n, target, idx + 1);
    }

    static boolean linearSearch(int[] arr, int n, int target, int idx) {
        //Base Case.
        if (arr[idx] >= n) return false;

        //Self Work.
        if (arr[idx] == target) {
            return true;
        }

        //Recursive Work.
        return linearSearch(arr, n, target, idx + 1);
    }

    static void subsetArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    System.out.print("[" + arr[i] + ", " + arr[j] + ", " + arr[k] + "]");
                    System.out.println();
                }
            }
        }
    }

    static int sumOfArray(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int smallWork = sumOfArray(arr, idx + 1);

        return (arr[idx] + smallWork);
    }

    static int maxInArray(int[] arr, int idx) {
        //Base Case.
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        //Recursive work.
        int smallAns = maxInArray(arr, idx + 1);
        //Self work.
        return Math.max(arr[idx], smallAns);
    }

    static void traverseArrayByRecursion(int[] arr, int idx) {
        //Base Case.
        if (idx == arr.length) {
            return;
        }

        //Recursive Work.
        traverseArrayByRecursion(arr, idx + 1);

        // Self Work.
        System.out.print(arr[idx] + " ");
    }

    static int multiplicationBySum(int x, int y) {
        if (x == 0 || y == 0)
            return 0;

        if (y == 0) {
            return 0;
        }
        return multiplicationBySum(x, y - 1) + x;
    }

    static int multiply(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        }
        return x * y;
    }

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    static int loopGCD(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    static void iGCD(int x, int y) {
        for (int i = x - 1; i > 0; i--) {
            if (((x % i) == 0) && (y % i == 0)) {
                System.out.println(i);
                return;
            }
        }
    }

    static int sumUpTon(int n) {
        if (n == 0) {
            return 0;
        }
        return sumUpTon(n - 1) + n;
    }

    static void printSeriesWithDifference5(int n) {
        //Base Case.
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        //Self Work.
        System.out.print(n + " ");
        //Recursive Work.
        printSeriesWithDifference5(n - 5);
        System.out.print(n + " ");
    }

    static int printAlternateSum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return printAlternateSum(n - 1) - n;
        }
        return printAlternateSum(n - 1) + n;

    }

    static void multiplesOfK(int n, int k) {
        /*Base Case.*/
        if (k == 1) {
            System.out.println(n);
            return;
        }
        /*Recursive Work.*/
        multiplesOfK(n, k - 1);

        /* Self-Work.*/
        System.out.println(n * k);

    }

    static int pow(int p, int q) {
        if (q == 0) {
            return 1;
        }
        int smallWork = pow(p, q / 2); //Method level scope.We can't calculate inside the block level scope.
        if (q % 2 == 0) {
            return smallWork * smallWork;
        }
        return p * smallWork * smallWork;
    }

    static int power(int p, int q) {
        if (q == 0) {
            return 1;
        }
        return power(p, q - 1) * p;
    }

    static int countDigits(int n) {
        //Base Case or Halting Condition =>
        if (n >= 0 && n <= 9) {
            return 1;
        }
        return countDigits(n / 10) + 1;
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int sumOfDigits(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        return sumOfDigits(n / 10) + n % 10;
    }

    static int findStairs(int n) {
        if (n == 1 || n == 2) return n;
        if (n == 3) return n + 1;
        return findStairs(n - 1) + findStairs(n - 2) + findStairs(n - 3);
    }

    static int powerByLogarithmic(int a, int b) { //Better Approach to solve the power function.
        // Time Complexity = log(n).
        // b + b/2 + b/4 + b/8 + ......... + 2 + 1.  it is a G.P. b = log(n)

        if (b == 0) return 1;  //Base Case.
        int x = powerByLogarithmic(a, b / 2);  //Recurrence Relation.
        if (b % 2 == 0) return x * x;
        else return x * x * a;
    }

    static int mazePath(int cr, int cc, int er, int ec) {
        int rightWays = 0;
        int downWays = 0;

        //Base Case.
        if (cr == er && cc == ec) return 1;

        //If rows are at ending position so that it will not go outside the grid.
        if (cr == er) {
            rightWays += mazePath(cr, cc + 1, er, ec);
        }

        //If coulumn are at ending position so that it will not go outside the grid.
        if (cc == ec) {
            downWays += mazePath(cr + 1, cc, er, ec);
        }

        if (cr < er && cc < ec) {
            rightWays += mazePath(cr, cc + 1, er, ec);
            downWays += mazePath(cr + 1, cc, er, ec);
        }
        int totalWays = rightWays + downWays;
        return totalWays;
    }

    static int mazePath2(int n, int m) {
        int rightWays = 0;
        int downWays = 0;
        //Base Case.
        if (n == 0 && m == 0) return 1;

        if (n == 0) {
            rightWays += mazePath2(n, m - 1);
        }

        if (m == 0) {
            downWays += mazePath2(n - 1, m);
        }

        if (n > 0 && m > 0) {
            rightWays += mazePath2(n, m - 1);
            downWays += mazePath2(n - 1, m);
        }
        int totalWays = rightWays + downWays;
        return totalWays;
    }

    static void preInPost(int n) {
        if (n == 0) return;

        System.out.print(n + " ");
        preInPost(n - 1);
        System.out.print(n + " ");
        preInPost(n - 1);
        System.out.print(n + " ");
        return;
    }

    static void tower(int n, char s, char h, char d) {
        if (n == 0) return;
        tower(n - 1, s, d, h);
        System.out.println("" + s + " --> " + d + "");
        tower(n - 1, h, s, d);
        return;
    }

    static void subsequences(String s, String currAns) {
        //Base Case.
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }

        char currChar = s.charAt(0);
        String remString = s.substring(1);

        //Current character choose to be part in current answer.
        subsequences(remString, currAns + currChar);

        //Current character does not choose to be part of current answer.
        subsequences(remString, currAns);
    }

    static int frogJumpToFindMinPath(int[] arr, int n, int idx) {
        //Base Case.
        if (idx == n - 1) {
            return 0;
        }
        //To find minimum path when frog reaches to n-1 via 1st position.
        int obj1 = Math.abs(arr[idx + 1] - arr[idx]) + frogJumpToFindMinPath(arr, n, idx + 1);
        if (idx == n - 2) {
            return obj1;
        }

        //To find minimum path when frog reaches to n-1 via 2nd position.
        int obj2 = Math.abs(arr[idx + 2] - arr[idx]) + frogJumpToFindMinPath(arr, n, idx + 2);

        return Math.min(obj1, obj2);
    }

    static void keypadCombinations(String dig, String[] kp, String result) {
        //Base Case.
        if (dig.length() == 0) {
            System.out.print(result + " ");
            return;
        }
        //Self Work.
        int currAns = dig.charAt(0) - '0';
        String currChoices = kp[currAns];

        //Recursive Work.
        for (int i = 0; i < currChoices.length(); i++) {
            keypadCombinations(dig.substring(1), kp, result + currChoices.charAt(i));
        }
    }

    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void TCimproveInNearlySortedArray(int[] arr, int n) {
        /*We can change the time complexity of in the case of BEST CASE TIME COMPLEXITY.
        if the array is nearly sorted bcoz in nearly sorted array we perform only less tasks.
        we do not bother about more tasks as in case of perfectly unsorted array.
         */
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = true;
                }

                if (flag == false) {
                    return;
                }
            }
        }
    }

    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) // i represents the current index.
        {
            //Find the minimum element in the unsorted part of the array.
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    min_idx = j;
                }
            }

            //Swap the found minimum element with the current element.
            if (min_idx != i) {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
    }

    static void selectionSortDec(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int max_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max_index]) {
                    max_index = j;
                }
            }
            if (max_index != i) {
                int temp = arr[i];
                arr[i] = arr[max_index];
                arr[max_index] = temp;
            }
        }
    }

    static void simpleSorting(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    static void insertionSort(int[] arr, int n) {
        /*
        5       4   3   2 =?   After        4   5       3   2
        sort|   unsorted  =?    swapping     sorted| unsorted.
         */
        for (int i = 1; i < n; i++) { //From 1 bcoz the 1st element is always considered as a sorted part.
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                //Swappring will do.
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;
            }
        }
    }

    static void insertionSortDecr(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i;

            while (j > 0 && arr[j] > arr[j - 1]) {
                //Swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    static void moveAllZeroes(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = true;
                }
            }
            if (flag == false) {
                return;
            }
        }
    }

    static void sortFruits(String[] fruits, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            String minStr = fruits[i];

            for (int j = i + 1; j < n; j++) {
                if (fruits[j].compareTo(minStr) < 0) {
                    minStr = fruits[j];
                    min_idx = j;
                }
            }

            if (min_idx != i) {
                String temp = fruits[i];
                fruits[i] = fruits[min_idx];
                fruits[min_idx] = temp;
            }
        }
    }

    static void selSort(String fruit[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            String minStr = fruit[i];
            for (int j = i + 1; j < n; j++) {
                if (fruit[j].compareTo(minStr) < 0) {
                    minStr = fruit[j];
                    min_index = j;
                }
            }

            if (min_index != i) {
                String temp = fruit[min_index];
                fruit[min_index] = fruit[i];
                fruit[i] = temp;
            }
        }
    }

    static void stringSort(String[] word, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (word[j].compareTo(word[j + 1]) > 0) {
                    String temp = word[j];
                    word[j] = word[j + 1];
                    word[j + 1] = temp;

                    flag = true;
                }
            }
            if (flag == false) {
                return;
            }
        }
    }

    static void kthSmallestElement(int[] arr, int n, int k) {
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            //swap.
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    static void lexicographicalCharacter(char[] arr, int n) {
        //By using insertion sort Algorithm.
        for (int i = 1; i < n; i++) {
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {
                char temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;
            }
        }
    }

    static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void mergeFunction(int[] arr, int mid, int l, int r) {
        mid = (l + r) / 2;
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) { //For filling the left array.Initially zero is present in the given array.
            left[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) { //For filling right array.Initially zero is present in the given array.
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {  //If right array is completely end previous than first array. so that we can fill as it is.
            arr[k++] = left[i++];
        }

        while (j < n2) {  //If left array is completely end previous than right array. so that we can fill as it is.
            arr[k++] = right[j++];
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid); //Recursive Calls
        mergeSort(arr, mid + 1, r);// Recursive Calls
        mergeFunction(arr, mid, l, r);// Function call.
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        int pivElement = arr[st];   //To choose the pivot element; We generally taken 1st element as pivot.
        int curr = 0;               //To find the number of smallest element than pivotElement.

        for (int i = st + 1; i <= end; i++) { //To find the number of smallest element than pivotElement.
            if (arr[i] <= pivElement) curr++;
        }

        int pivIdx = st + curr;  //To choose the pivotElement Index bcoz st is not always zero.
        swap(arr, st, pivIdx);

        int i = st, j = end;
        while (i < pivIdx && j > pivIdx) {
            /*
            1. If small element is present before pivot element increement(i++).
            2. If greater element is present after pivot element decreement(j--).
            3. If both condition are not obeyed then by means we need to swap the both of the
               element (i & j).
             */
            while (arr[i] <= pivElement) i++;
            while (arr[j] > pivElement) j--;

            if (i <= pivIdx && j > pivIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivIdx;
    }

    static void quickSort(int[] arr, int st, int end) {
        if (st >= end) return; //Base Case.
        int pi = partition(arr, st, end); //Return an pivotIndex.
        quickSort(arr, st, pi - 1);    //Recursive call to sort an half array.
        quickSort(arr, pi + 1, end);    //Recursive call to sort an after pivot index array.
    }

    static int max(int[] arr) {
        int maxE = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxE) {
                maxE = arr[i];
            }
        }
        return maxE;
        // System.out.println("Maximum in the given array is: "+maxE);
    }

    static void betterCountSort(int[] arr, int n) {
        int[] output = new int[n];

        //To find Maximum of the array.
        int mx = max(arr);

        //Frequency Array Declaration.
        int[] freq = new int[mx + 1];

        //To Making Frequency Array.
        for (int i = 0; i < n; i++) { // Time complexity -> n
            freq[arr[i]]++;
        }

        //Make Prefix Sum Array From Frequency Array.
        for (int i = 1; i < freq.length; i++) { //Time complexity -> max
            freq[i] += freq[i - 1];
        }

        //To Find the Index of in the output array and put them into the output Array.
        for (int i = n - 1; i >= 0; i--) {  //Time complexity -> n
            int idx = freq[arr[i]] - 1;
            output[idx] = arr[i];
            freq[arr[i]]--;
        }

        //Transfer the Output Array elements into Original Array or Copy all the elements into origial array.
        for (int i = 0; i < output.length; i++) { // Time complexity -> n
            arr[i] = output[i];
        }

        //Time Complexity = n+n+n+max = 3n+max = n+max.
        //let max = k, where k is the maximum element present in the given array.
        //so, T.C. = n+k
        // Worst case = O(n+k) && Average Case = sigma(n+k) && Best Case = omega(n) when k is very small.
        //Space complexity = O(n+k), bcoz we make output array of size n and frequency array of size (max,k).
    }

    static void countSort2(int[] arr, int place) {
        int n = arr.length;

        int[] output = new int[n];
        int[] freq = new int[10];

        //Make Frequency Array.
        for (int i = 0; i < n; i++) {
            freq[(arr[i] / place) % 10]++;
        }

        //Make Prefix Sum Array from Frequency Array.
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        //To find out the index and fill out the output array.
        for (int i = n - 1; i >= 0; i--) {
            int idx = freq[(arr[i] / place) % 10] - 1; // -1 to find out for index. 1 is just for position.
            output[idx] = arr[i];
            freq[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort2(int[] arr) {
        int mx = max(arr);

        System.out.println(mx);
        for (int place = 1; mx / place > 0; place *= 10) { //So that it firstly goes at ones place then tens then hundreds.
            countSort2(arr, place);
        }
        /*
        Time complexity : d*n, where d is the maximum number digit present.
        Space Complexuty : O(n).
         */

    }

    static void bucketSort(float[] arr) {
        int n = arr.length;

        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        for (int i = 0; i < n; i++) {
            int bucketIdx = (int) arr[i] * n;
            buckets[bucketIdx].add(arr[i]);
        }

        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currentBucket = buckets[i];
            for (int j = 0; j < currentBucket.size(); j++) {
                arr[index++] = currentBucket.get(j);
            }
        }
    }

    static void sortProblem(int[] nums) {
        /*
        PROBLEM: Given an Array where all its elements are increasing in sorted order except two swapped
                element, sort it in linear time. Assuming that there is no duplicate present in the array.
        INPUT: A[] = {3, 4, 8, 6, 7, 5, 9}
        OUTPUT: A[] = {3, 4, 5, 6, 7, 8, 9};
         */
        int x = -1;
        int y = -1;

        if(nums.length<=1){  // Corner or Edge Case.
            return;
        }
        for (int i = 1; i < nums.length; i++) { //LINEAR TIME COMPLEXITY -> O(n).
            if (nums[i - 1] > nums[i]) {
                if (x == -1) {  //For checking if we are in Ist conflict or at second conflict.
                    x = i - 1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }
        swap(nums, x, y);
    }

    static void separate_Positive_negative(int[] nums){
        /*
        PROBLEM: Given an array of positive and negative integers, separate them in linear time and
                 constant space. The output should print all negative numbers followed by all positive
                 integers.
        INPUT: [19, -20, 7, -4, -13, 11, -5, 3].
        OUTPUT: [-20, -4, -5, -13, 7, 19, 11, 3].
        Note:  Relative order doesn't matter. Only separation should be posssible in linear time.
         */
        int left=0;
        int right=nums.length-1;

        if(nums.length<=1){  //Corner or Edge Case.
            return;
        }

        while(left<=right){ //Linear TIME COMPLEXITY -> O(n)
            if(nums[left]>0 && nums[right]<0){
                swap(nums, left, right);
                left++;
                right--;
            }

            if(nums[left]<0){
                left++;
            }

            if(nums[right]>0){
                right--;
            }
        }
    }

    static void partition_postive_negative_problem(int[] nums){
         /*
        PROBLEM: Given an array of positive and negative integers, separate them in linear time and
                 constant space. The output should print all negative numbers followed by all positive
                 integers.
        INPUT: [19, -20, 7, -4, -13, 11, -5, 3].
        OUTPUT: [-20, -4, -5, -13, 7, 19, 11, 3].
        Note:  Relative order doesn't matter. Only separation should be posssible in linear time.
         */
        int l=0;
        int r=nums.length-1;

        if(nums.length<=1){  //Corner or Edge Case.
            return;
        }

        while(l<r){  //LINEAR TIME COMPLEXITY as we move on one element only at one time.
            while(nums[l]<0) l++;
            while(nums[r]>=0) r--;

            if(l<r){
                swap(nums, l, r);
                l++;
                r--;
            }
        }
    }

    static void sort012(int[] nums){
        /* Approach used here is COUNT SORT. But two passes are used in the Algorithm and we ue the
           Algorithm that do only one pass and sorting is done.
            -> 1st pass we are done for calculating zeroe's, one's and two's.
            -> 2nd pass we are done for filling the original array. so total pass -> 2n

            The Algorithm used here is {(DUTCH NATIONAL FLAG ALGORITHM)}
         */
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for(int j : nums){ // N paas
            if(j==0){
                count_0++;
            }
            else if(j==1){
                count_1++;
            }
            else{
                count_2++;
            }
        }

        int k=0;
        while(count_0>0){ // N pass
            nums[k++] = 0;
            count_0--;
        }

        while(count_1>0){
            nums[k++] = 1;
            count_1--;
        }

        while(count_2>0){
            nums[k++] = 2;
            count_2--;
        }
    }

    static void sort012_(int[] nums){
        int low=0, mid=0, high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String args[]) {
        int[] nums = {1, 2, 1, 0, 1, 0, 0, 2, 2, 1, 1};
        sort012_(nums);
        display(nums);
    }
}
//        radixSort2(arr);
//        for(int v : arr){
//            System.out.print(v + " ");
//        }
//        System.out.println("Before sorting the array");
//        display(arr);
//        radixSort2(arr);
//        System.out.println();
//        System.out.println("After sorting the array");
//        display(arr);
//        System.out.println("Enter the size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter the elements of array: ");
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the value of k: ");
//        int k = sc.nextInt();
//        kthSmallestElement(arr, arr.length, k);
// System.out.println(""+k+"th smallest element in the given array is: "+arr[k-1]);
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of String");
//        int n = sc.nextInt();
//        String[] fruits = new String[n];
//
//        System.out.println("Enter the elements of String:");
//        for(int i=0; i<n; i++){
//            fruits[i] = sc.nextLine();
//        }
//        String[] fruits = {"Apple", "watermelon", "Kiwi", "papaya"};
//        System.out.println("Lexicographical Order is: ");
//        sortFruits(fruits, fruits.length);
//        //For each loop to print the String or array.
//        for(String s : fruits){
//            System.out.print(s + " ");
//        }
//    }
//}


