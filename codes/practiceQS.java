package DSA.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import static java.sql.DriverManager.println;

public class practiceQS {
    static int[][] pascalTriangle(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1]; //ans[i] is actually 1-d array.
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    static void rotate90degAntiClock(int[][] arr, int r1, int c1) {
        if (r1 != c1) {
            System.out.println("Rotation not possible");
            return;
        }
        reverse2DArray(arr);
        transposeInPlace(arr, r1, c1);
        System.out.println("AntiClockwise Matrix Rotate by 90 degree is: ");
        display2D(arr);
    }

    static void rotate90degClockWise(int[][] arr, int r1, int c1) {
        if (r1 != c1) {
            System.out.println("Rotation not possible");
            return;
        }
        transposeInPlace(arr, r1, c1);
        for (int i = 0; i < r1; i++) {
            reverse2DArray(arr);
        }
        System.out.println("Given Matrix Rotate 90 degrees and looks like this: ");
        display2D(arr);
    }

    static void findTranspose(int[][] arr, int r1, int c1) {
        if (r1 != c1) {
            System.out.println("Transpose not possible for rectangular Matrix");
            return;
        }
        int[][] transpose = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
//        System.out.println("Transpose of given Matrix is: ");
//        display2D(transpose);
    }

    static void transposeInPlace(int[][] arr, int r1, int c1) {
        if (r1 != c1) {
            System.out.println("Transpose not possible for triangular Matrix");
            return;
        }
        for (int i = 0; i < r1; i++) {
            for (int j = i; j < c1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
//        System.out.println("Transpose of Matrix is: ");
//        display2D(arr);
    }

    static void elementFind(int[][] arr, int r1, int c1, int x) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                if (arr[i][j] == x) {
                    System.out.println("Row is: " + i);
                    System.out.println("Column is: " + j);
                    return;
                }
            }
        }
        System.out.println("No element is present");
        System.out.println(-1);
        return;
    }

    static void reverse2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            reverse2For2D(arr[i]);
        }
//        System.out.println("Reversible Matrix is: ");
//        display2D(arr);
    }

    static void reverse2For2D(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void multiplicationMatrix(int[][] arr1, int[][] arr2, int r1, int c1, int r2, int c2) {
        //Corner Or Edge Case.
        if (c1 != r2) {
            System.out.println("Multiplication not Possible as multiplication rule not following.");
            return;
        }

        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two matrices is: ");
        display2D(ans);
    }

    static void sumOfMatrix(int[][] arr1, int[][] arr2, int r, int c, int r1, int c1) {
        //Corner Case or Edge Case.
        if (r != r1 || c != c1) {
            System.out.println("Addition is not possible as order is not same");
            return;
        }
        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of " + r + "X" + c + " Matrix is: ");
        display2D(ans);
        return;
    }

    static int totalSumArray(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean partition(int[] arr) {
        int totalSum = totalSumArray(arr);
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) {
                return true;
            }
        }
        return false;
    }

    static void prefixSumOf1d(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
    }

    static int targetPresent(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    int idx1 = i + 1;
                    int idx2 = j + 1;
                    System.out.println("Indices are: " + idx1 + " and " + idx2 + "");
                    return idx1;
                }
            }
        }
        return -1;
    }

    static int[] squareSort(int[] arr) {
        int[] ans = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;

        int k = ans.length - 1;
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k--] = arr[i] * arr[i];
                i++;
            } else {
                ans[k--] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;
    }

    static void evenOddSort(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }

            if (arr[i] % 2 == 0) {
                i++;
            }

            if (arr[j] % 2 != 0) {
                j--;
            }
        }
    }

    static void zeroesAndOnesSort(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }

            if (arr[i] == 0) {
                i++;
            }

            if (arr[j] == 1) {
                j--;
            }
        }

    }

    static int firstRepeating(int[] arr) {
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    index = i;
                    return i;
                }
            }
        }
        return index;
    }

    static int[] numberPresent(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int[] freq = new int[100000];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // As k is greater than n as well so k also return same value from it stands.
        int[] ans = new int[n];

        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void reverse(int[] arr, int i, int j) {
        i = 0;
        j = arr.length - 1;
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static boolean equalityTwoArray(int[] arr, int[] arr2) {
        boolean check = false;

        /*
        Means, If the corresponding elements are equal then two arrays are said to be equal.
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr2[i]) {
                check = true;
                return check;
            }
        }
        return check;
    }

    static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = 0;
        //To find sum of N-1 digits.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int sumN = (n * (n + 1)) / 2;
        int missNum = sumN - sum;
        return missNum;
    }

    static boolean absolteDiff(int[] arr, int x) {
        int n = arr.length;
        boolean check = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] - arr[i] == x) {
                    check = true;
                    return check;
                }
            }
        }
        return check;
    }

    static void display2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int Occurences(int[] arr, int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    static int repeatFirstValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { //
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int repeatLastValue(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[j];
                }
            }
        }
        return -1;
    }

    static int smallest(int[] arr) {
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int secondSmallest(int[] arr) {
        int small = smallest(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            //    if(arr[i]==small){
            arr[i] = Integer.MAX_VALUE;
        }

        int secSmall = smallest(arr);
        return secSmall;
    }

    static void prime(int n) {
        /*
        1. A number is said to be prime if it is divisible by 1 and itself table.
        2. We declare a variable count.
        3. If count=2, then we can say that number is prime because it is divisible on 1 and table itself.
        4. for this, we use two loop so that we calculate the number if divisible by 1 or own table or not.
        5. And every time we increment the count variable.
        6. And check if count =2 then it is prime otherwise it is not prime.
         */
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Number is Prime: true");
        } else {
            System.out.println("Number is not prime: false");
        }
    }

    static void printDiagonally(int[][] arr, int r1, int c1) {
        /*
        Problem: Given a matrix n*m, return an array of elements containing diagonal traversal of the matrix.

        PseudeCode:
        1   2   3
        3   4   5
        6   7   8
        i represents row number, j  represents column number.
         */
        for (int k = 0; k < r1; k++) {
            int i = k;
            int j = 0;

            while (i >= 0) {
                System.out.print(arr[i][j] + " ");
                i--;
                j++;
            }
        }

        for (int k = 1; k < c1; k++) {
            int i = r1 - 1;
            int j = k;

            while (j < c1) {
                System.out.print(arr[i][j] + " ");
                i--;
                j++;
            }
        }
    }

    static void prefixSumColWise(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
//        System.out.println("Prefix Sum of the given Array is: ");
//        display2D(arr);
    }

    static void sumOfEachRow(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum is: " + sum);
            sum = 0; //Again Initialize sum with zero.
        }
    }

    static void printSpiral(int[][] arr, int r1, int c1) {
        int topRow = 0, bottRow = r1 - 1, leftCol = 0, rightCol = c1 - 1;
        int totalElements = 0;

        while (totalElements < r1 * c1) {
            for (int j = leftCol; j <= rightCol && totalElements < r1 * c1; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            for (int i = topRow; i <= bottRow && totalElements < r1 * c1; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            for (int j = rightCol; j >= leftCol && totalElements < r1 * c1; j--) {
                System.out.print(arr[bottRow][j] + " ");
                totalElements++;
            }
            bottRow--;

            for (int i = bottRow; i >= topRow && totalElements < r1 * c1; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    static int[][] printSpiralClockWise(int n) {
        int[][] arr = new int[n][n];
        int topRow = 0, bottRow = n - 1, leftCol = 0, rightCol = n - 1;
        int currentElement = 1;

        while (currentElement <= n * n) {
            for (int j = leftCol; j <= rightCol && currentElement <= n * n; j++) {
                arr[topRow][j] = currentElement++;
            }
            topRow++;

            for (int i = topRow; i <= bottRow && currentElement <= n * n; i++) {
                arr[i][rightCol] = currentElement++;
            }
            rightCol--;

            for (int j = rightCol; j >= leftCol && currentElement <= n * n; j--) {
                arr[bottRow][j] = currentElement++;
            }
            bottRow--;

            for (int i = bottRow; i >= topRow && currentElement <= n * n; i--) {
                arr[i][leftCol] = currentElement++;
            }
            leftCol++;
        }
        return arr;
    }

    static int[][] printSpiralAntiClockWise(int n) {
        int[][] arr = new int[n][n];
        int topRow = 0, bottRow = n - 1, leftCol = 0, rightCol = n - 1;
        int currElement = 1;

        while (currElement <= n * n) {
            for (int i = topRow; i <= bottRow && currElement <= n * n; i++) {
                arr[i][leftCol] = currElement++;
            }
            leftCol++;

            for (int j = leftCol; j <= rightCol && currElement <= n * n; j++) {
                arr[bottRow][j] = currElement++;
            }
            bottRow--;

            for (int i = bottRow; i >= topRow && currElement <= n * n; i--) {
                arr[i][rightCol] = currElement++;
            }
            rightCol--;

            for (int j = rightCol; j >= leftCol && currElement <= n * n; j--) {
                arr[topRow][j] = currElement++;
            }
            topRow++;
        }
        return arr;
    }

    static void linearSearch(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        //Let 1 2 3 4 & x=3
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    static void checkteoplitzMatrix(int[][] arr, int r1, int c1) {
        for (int i = 1; i < r1; i++) {
            for (int j = 1; j < c1; j++) {
                if (arr[i][j] == arr[i - 1][j - 1]) {
                    System.out.println("Matrix is Teoplitz : True");
                    return;
                }
            }
        }
        System.out.println("Matrix is not Teoplitz : False");
    }

    static void prefixSumRowWise(int[][] arr) {

        int r = arr.length;
        int c = arr[0].length;
        //Corner or Edge Case. If there is no row then we can't calculate number of columns.

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }
    }

    static int rectangleSum(int[][] arr, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static void prefixSumRowCol(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        //Prefix Sum Row Wise.
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        //Prefix Sum Column Wise
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
    }

    static int rectangleSum2(int[][] arr, int l1, int r1, int l2, int r2) {
        int sum = 0;
        prefixSumRowWise(arr);

        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1)
                sum += (arr[i][r2] - arr[i][r1 - 1]);
            else
                sum += arr[i][r2];
        }
        return sum;
    }

    static int rectangleSum3(int[][] arr, int l1, int r1, int l2, int r2) {
        int ans = 0, sum = 0, left = 0, up = 0, leftUp = 0;
        prefixSumRowCol(arr);

        sum = arr[l2][r2];
        if (r1 >= 1) {
            left = arr[l2][r1 - 1];
        }
        if (l1 >= 1) {
            up = arr[l1 - 1][r2];
        }
        if (l1 >= 1 && r1 >= 1) {
            leftUp = arr[l1 - 1][r1 - 1];
        }

        ans = sum - left - up + leftUp;
        return ans;
    }

    static void perfectMatrix(int[][] arr) {
        //Perfect Matrix is Always Square Matrix.
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; i++) {
                if (i == j || (i + j == n - 1)) {
                    if (arr[i][j] == 0) {
                        System.out.println("False");
                        return;
                    }
                } else {
                    if (arr[i][j] != 0) {
                        System.out.println("False");
                        return;
                    }
                }
            }
        }
        System.out.println("True");
    }

    static void upper_Half_Matrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j >= i) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void reverse(ArrayList<Integer> l1) {
        int i = 0;
        int j = l1.size() - 1;

        while (i <= j) {
            Collections.swap(l1, i, j);
            // or
//            Integer temp = Integer.valueOf(l1.get(i));
//            l1.set(i, l1.get(j));
//            l1.set(j, temp);
            i++;
            j--;
        }
    }

    static ArrayList<Integer> positiveArrayList(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                pos.add(Integer.valueOf(arr[i]));
            }
        }
        return pos;
    }

    static void printNaturalNum_Recursion(int n) {
        //Base Case.
        if (n == 1) {
            System.out.println(n);
            return;
        }

        //Recursive work.
        printNaturalNum_Recursion(n - 1);
        //Self work.
        System.out.println(n);
    }

    static void printNaturalNum2_Recursion(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printNaturalNum2_Recursion(n - 1);
    }

    static int factorialRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

    static int fibonacci_Recursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci_Recursion(n - 1) + fibonacci_Recursion(n - 2);
    }

    static int sum_Recursion(int n) {
        if (n >= 0 && n < 9) {
            return n;
        }
        return sum_Recursion(n / 10) + (n % 10);
    }

    static int count_Recursion(int n) {
        if (n >= 0 && n < 9) {
            return 1;
        }
        return count_Recursion(n / 10) + 1;
    }

    static int power_Recursuin(int p, int q) {
        if (q <= 0) {
            return 1;
        }
        return power_Recursuin(p, q - 1) * p;
    }

    static void kMultiples_Recursion(int n, int k) {
        if (k == 0) {
            return;
        }
        kMultiples_Recursion(n, k - 1);
        System.out.println(n * k);

    }

    static int sumAlternative_Recursion(int n) {
        if (n == 0) {
            return n;
        }
        if (n % 2 == 0) {
            return sumAlternative_Recursion(n - 1) - n;
        } else {
            return sumAlternative_Recursion(n - 1) + n;
        }
    }

    static void nToN_Recursion(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        nToN_Recursion(n - 5);
    }

    static void nToN2_Recursion(int n) {
        if (n > 0 && n < 9) {
            System.out.print(n + " ");
            return;
        }
        nToN2_Recursion(n - 5);
        System.out.print(n + " ");
    }

    static void printArray_Recursion(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        printArray_Recursion(arr, idx + 1);
    }

    static int maxInArray_Recursion(int[] arr, int idx) {
        int n = arr.length;
        if (idx == n) {
            return 0;
        }
        int ans = maxInArray_Recursion(arr, idx + 1);
        return Math.max(ans, arr[idx]);
    }

    static int sumArray_Recursion(int[] arr, int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int sum = sumArray_Recursion(arr, idx + 1);
        return Math.addExact(sum, arr[idx]);
    }

    static boolean linearSearch_Recursion(int[] arr, int idx, int target) {
        if (idx >= arr.length) {
            return false;
        }
        //Self Work.
        if (arr[idx] == target) {
            return true;
        }
        //Recursive Work.
        return linearSearch_Recursion(arr, idx + 1, target);
    }

    static int linearSearch2_Recursion(int[] arr, int idx, int target) {
        if (idx >= arr.length) {
            System.out.print("Invalid Index: ");
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return linearSearch2_Recursion(arr, idx + 1, target);
    }

    static ArrayList<Integer> linearSearchAll3_Recursion(int[] arr, int idx, int target, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        //Base Case
        if (idx >= n) {
            return ans; //return empty Arraylist.
        }
        //Self Work.
        if (arr[idx] == target) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = linearSearchAll3_Recursion(arr, idx + 1, target, n);
        ans.addAll(smallAns);
        return ans;
    }

    static void linearSearchAllIndices_Recursion(int[] arr, int idx, int target) {
        //Base Case.
        if (idx >= arr.length) {
            return;
        }
        //Self Work.
        if (arr[idx] == target) {
            System.out.println(idx);
        }
        //Recursive Work.
        linearSearchAllIndices_Recursion(arr, idx + 1, target);
    }

    static boolean sort_Recursion(int[] arr, int idx) {
        boolean check = true;
        //Base Case.
        if (idx == arr.length - 1) {
            return check;
        }

        //Self Work.
        if (arr[idx] > arr[idx + 1]) {
            check = false;
            return check;
        }
        return sort_Recursion(arr, idx + 1);
    }

    static int lastIndex_Recursion(int[] arr, int idx, int target) {
        //Base Case.
        if (idx < 0) {
            return -1;
        }
        //Self Work.
        if (arr[idx] == target) {
            return idx;
        }
        //Recursive Work.
        return lastIndex_Recursion(arr, idx - 1, target);
    }

    static String removeElement1_Recursion(String s, int idx) {
        //Base Case.
        if (idx == s.length()) {
            return " ";
        }
        //Recursive Work.
        String smallAns = removeElement1_Recursion(s, idx + 1);
        char ch = s.charAt(idx);
        //Self Work.
        if (ch != 'a') {
            return ch + smallAns;
        } else {
            return smallAns;
        }
    }

    static String removeElement2_Recursion(String s) {
        //Base Case.
        if (s.length() == 0) {
            return " ";
        }
        //Recursive Work.
        String smallAns = removeElement2_Recursion(s.substring(1));
        char ch = s.charAt(0);

        //Self Work.
        if (ch != 'a') {
            return ch + smallAns;
        } else {
            return smallAns;
        }
    }

    static String reverseString_Recursion(String s, int idx) {
        //Base Case.
        if (idx == s.length()) {
            return " ";
        }
        //Recursive Work.
        String smallAns = reverseString_Recursion(s, idx + 1);
        char ch = s.charAt(idx);
        //Self Work.
        return smallAns + ch;
    }

    static String reverseString2_Recursion(String s) {
        //Base Case.
        if (s.length() == 0) {
            return " ";
        }
        //Recursive Work.
        String smallAns = reverseString2_Recursion(s.substring(1));
        char ch = s.charAt(0);
        //Self Work.
        return smallAns + ch;
    }

    static boolean palindrome_Recursion(String s, int l, int r) {
        if (l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && palindrome_Recursion(s, l + 1, r - 1));
    }

    static boolean palindrome2_Recursion(String s, int l, int r) {
        if (l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && palindrome2_Recursion(s, l + 1, r - 1));
    }

    static int countConsonants_Recursion(String s, int idx) {
        //Base Case.
        if (idx == s.length()) {
            return 0;
        }
        //Recursive Work.
        int count = countConsonants_Recursion(s, idx + 1);

        //Self Work.
        if (s.charAt(idx) == 'a' || s.charAt(idx) == 'e' || s.charAt(idx) == 'i' || s.charAt(idx) == 'o' || s.charAt(idx) == 'u') {
            return count;
        } else {
            return count + 1;
        }
    }

    static int countLowerCase_Recursion(String s, int idx) {
        //Base Case.
        if (idx == s.length()) {
            return 0;
        }
        //Recursive Work.
        int count = countLowerCase_Recursion(s, idx + 1);
        //Self Work.
        if (s.charAt(idx) >= 97) {
            return count + 1;
        } else {
            return count;
        }
    }

    static String upperCase_Recursion(String s) {
        //Base Case.
        if (s.length() == 0) {
            return " ";
        }

        //Self Work.
        if (s.charAt(0) >= 65 && s.charAt(0) < 90) {
            return s.substring(0);
        } else {
            return upperCase_Recursion(s.substring(1));
        }
    }

    static void subsequence_Recursion(String s, String currAns) {
        //Base Case.
        if (s.isEmpty()) {
            System.out.println(currAns);
            return;
        }
        char currChar = s.charAt(0);
        String remString = s.substring(1);

        //CurrAns chose to be part of String.
        subsequence_Recursion(remString, currAns + currChar);

        //CurrAns chose not be the part of String.
        subsequence_Recursion(remString, currAns);
    }

    static ArrayList<String> subsequence(String s) {
        ArrayList<String> ans = new ArrayList<>();
        //Base Case.
        if (s.length() == 0) {
            ans.add(" ");
            return ans;
        }
        char ch = s.charAt(0);
        //Recursive Work.
        ArrayList<String> smallAns = subsequence(s.substring(1));
        //Self Work.
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(ch + ss);
        }
        return ans;
    }

    static void subsequence2_Recursion(String s, String currAns) {
          /*
        Based on Inclusion-Exclusion Principle.
                                    Include -> Exclude
         */
        //Bae Case.
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }

        char currChar = s.charAt(0);
        String remString = s.substring(1);

        //CurrCharacter chooses to be part of Current Answer.
        subsequence2_Recursion(remString, currAns + currChar);
        //CurrCharacter do not chooses to be the part of currAns.
        subsequence2_Recursion(remString, currAns);
    }

    static void findSubsequences_Recursion(int[] arr, int idx, int sum) {
        /*
        Based on Inclusion-Exclusion Principle.
                                    Include -> Exclude
         */
        //Base Case.
        if (idx == arr.length) {
            System.out.println(sum + " ");
            return;
        }

        // Chooses to be the part of Subsequence.
        findSubsequences_Recursion(arr, idx + 1, sum + arr[idx]);
        // Do not chooses to be the part of Subsequence.
        findSubsequences_Recursion(arr, idx + 1, sum);
    }

    static int frogJump(int[] h, int n, int idx) {
        /*
        1. If we know the minimum path from idx+1 and idx+2 then we can find the minimum path from idx
            via idx+1 and via idx+2 by adding |hi-hj| cost in it.

        2. And by comparing the minimum path via idx+1 or via idx+2, we can find the minimum cost.
         */

        /*Base Case.
        There are two base cases:
         (i). One when idx reach at (n-1)th position means minimum cost to reach (n-1)th index when
                idx is present at (n-1)th position. It is zero cost.
         (ii).Second when idx reaches at (n-2)th position means the minimum cost to reach (n-1)th index
                when index is at (n-2)th index, it is minimum cost to reach n-1 via idx+1.
                 */
        if (idx == n - 1) {
            return 0;
        }

        int opt1 = frogJump(h, n, idx + 1) + Math.abs(h[idx + 1] - h[idx]);
        if (idx == n - 2) {
            return opt1;
        }
        int opt2 = frogJump(h, n, idx + 2) + Math.abs(h[idx + 2] - h[idx]);
        return Math.min(opt1, opt2);
    }

    static void keypad_Problem(String s, String[] keypad, String result) {
        /*
        Pseudo-Code:
        1. First of all, we have to make a String(keypad) array so that we can traverse on it.
        2. We have to find the current number but we can't find directly by using s.chatSt(0) as it
            gives current character but we have to find current number so we can subtract '0' from the
           number.
        3. After that store string in another string variable.
        4. Now bcoz we make the recursive call is equal to the length of String. So, we use a for loop
             here to do repittive recursive Calls.
         */
        //Base Case.
        if (s.length() == 0) {
            System.out.print(result + " ");
            return;
        }

        int currNum = s.charAt(0) - '0';
        String s1 = keypad[currNum];

        for (int i = 0; i < s1.length(); i++) {
            keypad_Problem(s.substring(1), keypad, result + s1.charAt(i));
        }
    }

    static void bubbleSort(int[] arr, int n) {
        /*
        1. We used two loops here. 1st loop is run from 0 to n-2 elements bcoz if we place n-2 elements
            at correct position. Then, (n-1)th elements is also at correct position.
        2. 2nd Loop is run from 0 to n-i-1 bcoz in every pass we place one element at correct position.
         */
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

    static void bubbleSort_PartiallySorted(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) { // from 0 to n-2.
            boolean check = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    check = true;
                }
            }
            if (check == false) {
                return;
            }
        }
    }

    static void selectionSort(int[] arr, int n) {
        /*
        1. First of all, we find the minimum element present in the given array. After that minimum
        element is replaced by 1st element by using sapping. Now our 1st element of the array is sorted
         and remaining array becomes unsorted.
                Same procedure is done by remaning Array.
         */
        for (int i = 0; i < n - 1; i++) { //Bcoz in (n-2) iteration we place all elements at correct position.
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            if (min_idx != i) ; //We do not need to swap if min_Index=i bcoz element is present at correct position.
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    static void selectionSort2(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < n - i; j++) {
                if (arr[j] > arr[max_idx]) {
                    max_idx = j;
                }
            }

            int temp = arr[max_idx];
            arr[max_idx] = arr[n - 1];
            arr[n - 1] = temp;
        }
    }

    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    static void moveAllZeroes_Problem(int[] arr, int n) {
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

    static void lexicoGraphicalString_problem(String[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            String min_Str = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(min_Str) < 0) {
                    min_idx = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = l;

        //To fill the array by using left and right array.
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    static void merge2(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        /*
        1. RECURSIVE WORK:
        First of all, we divide the array into two halves. Then, we sort the two arrays separately.
        2. SELF WORK:
        Then we merge the two arrays and form overall sorted array.
         */
        //Base Case.
        if (l >= r) {
            return;
        }
        //Recursive Call.
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        //Self Work.
        merge2(arr, l, mid, r);
    }

    static int partition_quicksort(int[] arr, int st, int end) {
        int pivElt = arr[st];
        int count = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivElt) {
                count++;
            }
        }
        int pivIdx = st + count;
        swap(arr, st, pivIdx);

        int i = st;
        int j = end;
        while (i <= pivIdx && j > pivIdx) {
            while (arr[i] < pivElt) i++;
            while (arr[j] > pivElt) j--;

            if (i < pivIdx && j > pivIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivIdx;
    }

    static void quickSort_Algo(int[] arr, int st, int end) {
        //Base Case.
        if (st >= end) {
            return;
        }
        int pi = partition_quicksort(arr, st, end);
        quickSort_Algo(arr, st, pi - 1);
        quickSort_Algo(arr, pi + 1, end);
    }

    static int maxPresent(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort2(int[] arr) {
        int max = maxPresent(arr);
        int[] output = new int[arr.length];
        /*Make Frequency Array.

      By making frequency array we know that how many occurrence of element present in the given
      array.
         */
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        /*Make Prefix sum array from frequency array.

        By making prefix sum array of frequency array we kow that how many element covered how much
        area.
         */
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        /*Traversing on original Array and fill the output array.
        
        We traverse from the last index of original array and whatever element comes we go to frequency
        array that is actually now a prefix sum array gives the position of the particular element and
        the index of this element is one less than the position of element.
         */
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = freq[arr[i]] - 1;
            output[idx] = arr[i];
            freq[arr[i]]--;
        }
        //To put elements from output array to Original Array.
        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }

    static void countSort(int[] arr) {
        int max = maxPresent(arr);
        int[] freq = new int[max + 1];

        //Frequency array banane se hme pta chalta hai kii kon sa elements kitni baar aa rha hai.
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    static void countSort_ForRadixSort(int[] arr, int place) {
        int max = maxPresent(arr);
        int[] output = new int[arr.length];
        int[] freq = new int[10];

        for (int i = 0; i < arr.length; i++) {
            freq[(arr[i] / place) % 10]++;
        }

        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = freq[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            freq[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr) {
        int max = maxPresent(arr);
        for (int place = 1; max / place > 0; place *= 10) {
            countSort_ForRadixSort(arr, place);
        }
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

    static boolean binary_Search_loop(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        //To find the mid of array.


        while (st <= end) {
            //Mid is calculating by this formula to avoid the overflow error.
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    static boolean binary_Search_Recursion(int[] arr, int st, int end, int target) {
        //Base Case.
        if (st > end) {
            return false;
        }
        //Mid is calculating by this formula to avoid the overflow error.
        int mid = st + (end - st) / 2;

        //Self Work.
        if (arr[mid] == target) {
            return true;
        }

        //Recursive Work.
        else if (arr[mid] < target) {
            return binary_Search_Recursion(arr, mid + 1, end, target);
        } else {
            return binary_Search_Recursion(arr, st, mid - 1, target);
        }
    }

    static int binary_SearchProblem_FirstIndex(int[] arr, int st, int end, int target) {
        /*
        1. Need to create idx variable is to find the first repetitive element.
        2. If we do not create idx variable then random index is taken by binary search algorithm.
        3. But we have to find the first repetitive element.
         */
        int firstIdx = -1;
        while (st <= end) {
            //Mid is calculating by this formula to avoid the overflow error.
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                firstIdx = mid;
                //As we from right to left and we have to find the first occurrence of element.
                end = mid - 1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return firstIdx;
    }

    static int binary_SearchProblem1_lastIndex(int[] arr, int st, int end, int target) {
        int lastIdx = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                lastIdx = mid;
                //As we move from left to right.
                st = mid + 1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastIdx;
    }

    static int binary_search_Problem2_sqrt(int x) {
        int st = 0;
        int end = x;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = mid * mid;

            if (val == x) {
                return mid;
            } else if (val < x) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int bSearch_prblm3_FE_Index_RotatedSortedArray(int[] arr, int st, int end) {
        int ans = -1;
        int n = arr.length;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] <= arr[n - 1]) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    static int bs_Prblm4_Search(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < arr[end]) { // Means, mid to end is sorted.
                if (target > arr[mid] && target <= arr[end]) { //Means, target is present.
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else { //Means, start to mid is sorted.
                if (target >= arr[st] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }

    static int bs_prblm4_doublets(int[] arr, int target) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            //If we find element at mid, then we simply return from the mid.
            if (arr[mid] == target) {
                return mid;
            }

            //We skip the element if elements of starting, mid and end are equal.
            else if (arr[st] == arr[mid] && arr[mid] == arr[end]) {
                st++;
                end--;
            } else if (arr[mid] <= arr[end]) { //Means, mid to end is sorted.
                if (target > arr[mid] && target <= arr[end]) { //Target is present inside mid to end.
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else { //Means, start to mid is sorted.
                if (target >= arr[st] && target < arr[mid]) { //Target is present inside start to mid.
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }

    static void bin_sear_find_maxElmt_wrong(int[] arr, int st, int end) {
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] < arr[end]) {
                end = mid - 1;
            } else {
                ans = Math.max(ans, mid);
                st = mid + 1;
            }
        }
        System.out.println("Maximum element is present at Index: " + ans);
        System.out.println("Maximum element in the array is: " + arr[ans]);
    }

    static void bin_search_occurrence(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        int first = -1;
        int last = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        st = 0;
        end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                last = mid;
                st = mid + 1;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        if (first == -1) {
            System.out.println("Element is not present");
            return;
        }
        System.out.print(last - first + 1);
    }

    static int bin_sea_findIdx(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int lower_Bound(int[] arr, int target) {
        /*
       1. Lower Bound is index which contains the position where the element is present just above or
          equal to the target element.
       2. This element may be greater than or equal to the target element.
       3. Must condition for lower bound is: (arr[mid]>=target).
       4. Time-Complexity for Lower Bound is O(logN) same as Binary Search.
        */
        int st = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    static int upper_Bound(int[] arr, int target) {
      /*
      1.Upper Bound is Index which contains just maximum element from the target element.
      2.Upper Bound element is always strictly greater than target element.
      3.It must follow this condition: arr[mid]>target.
      4.Time-Complexity of Upper bound is: O(logN).
             */

        int st = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    static boolean binary_searchMatrix_leet(int[][] arr, int target) {
        /*
        PSEUDOCODE:
        1. First of all write numbers in all matrix elements starting from 0 to last element.
        2. Then initialize start from zero and end from last element.
        3. Now find the middle element (according to linear ransformation) as we find in other Q's by using binary search Algorithm.
        4. Then find middle element from the number of rows and columns as we using this method
            (mid/m) for number of rows and (mid%m) for number of columns.
        5.      1 0m+0, 2 0m+1, 3 0m+2, 4 0m+3
                5 1m+0, 6 1m+1, 7 1m+2m, 8 1m+3
                9 2m+0, 10 2m+1, 11, 2m+2, 12 2m+3;
                1,2,3,4,5,6,7,8,9,10,11,12 are the elements of array and other is the nototaion for
                finding rows and coulumns.
        6, We find rows and columns to access the elements.
         */
        int n = arr.length;
        int m = arr[0].length;

        int st = 0;
        int end = n * m - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int midElmt = arr[mid / m][mid % m];

            if (target == midElmt) {
                return true;
            } else if (target < midElmt) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }

    static boolean binary_searchMatrixII(int[][] arr, int target) {
        /*
        PSEUDOCODE:
        1. First of all, initialize i from zero and j from last element of the first row.
        2. Start a loop which is goes from i->n and j->0.
        3. If arr[i][j]==target return true.
        4. If arr[i][j] is less than target then increment row no. by 1 otherwise decrement column no.
            by 1.
         */
        int n = arr.length; //Give number of rows present in Matrix.

        int m = arr[0].length; //Give number of columns present in Matrix.

        int i = 0; //Goes from top to bottom.(top -> bottom)

        int j = m - 1; //Goes from right to left.(right -> left)

        while (i < n && j >= 0) {
            if (arr[i][j] == target) {
                return true;
            } else if (arr[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    static int peakElmnt_Mountain(int[] arr) {
        /*
        1. First of all, All the elements are in ascending order then in
            descending order and the maximum element in the in between is the
            peak element.
        */

        int n = arr.length;
        int st = 0;
        int end = n - 1;
        int ans = -1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] < arr[mid + 1]) {
                ans = mid + 1;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int binarySrch_peakElmnt(int[] arr) {
        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            if ((mid == 0 || arr[mid] > arr[mid + 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid - 1])) {
                return mid;
            }

            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int find_Unique(int[] arr) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == arr[mid + 1]) {
                arr[mid] = -1;
                arr[mid + 1] = -1;
                st = mid + 2;
            } else {
                arr[mid] = -1;
                arr[mid - 1] = -1;
                end = mid - 2;
            }
        }

        quickSort_Algo(arr, 0, arr.length - 1);
        return arr[arr.length - 1];
    }

    static boolean isDivisionPossible(int[] arr, int m, int maxChocAllowed) {
        //Time Complexity is : O(n*logn).
        int numberOfStudent = 1; // Start as 1, Keep initialze when go ahead in code.
        int choc = 0; // Number of chocolates current student has.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxChocAllowed) return false; //ex. 4>5

            if ((choc + arr[i]) <= maxChocAllowed) {
                choc += arr[i];
            } else {
                numberOfStudent++;
                choc = arr[i];
            }
        }
        /*
        We can either write in below form :
        if(numberOfStudent>m){ where, m is the Student allowed to chocolates given.
            return false; jitne students ko chocolates deni hai vo hai m
        }
        return true;
                                    or
        We can simply write as:
        return (numberOfStudent<=m). If it is less than or equal to m it will return true, else
                                        it return false.
         */

        return numberOfStudent <= m;
    }

    static int distributeChocolates(int[] arr, int m) {
        /*
        Corner Case: We can't divide chocolates in students if we have less chocolates than number
                    of students.
                    Let see Example: 1,2,3 : 3 boxes of chocolates are present and we divide these
                    boxes into 4 students. So it is not possible bcoz each we have to given individual
                    box to each and every student.
         */
        if (arr.length < m) {
            return -1;
        }

        int st = 1;
        int end = (int) 1e9;
        int ans = 0;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            /*
            Such that none of the students will get more than m chocolates.
            There are no more than m students if mid is kept as maximum chocolates allowed for any
            student.
             */
            if (isDivisionPossible(arr, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] arr, int kids, int dist){
        int kidsPlaced=1;
        int lastKid=arr[0];

        for(int i=1; i < arr.length; i++){
            if(arr[i]-lastKid>=dist){
                kidsPlaced++;
                lastKid = arr[i];
            }
        }
        return kidsPlaced>=kids;
    }
    static int raceTask(int[] arr, int kids){
        if(kids>arr.length) return -1;

        int st=0; int end=(int)1e9; //1e9 means     ->  10 raise to the power 9.
        int ans=-1;

        while(st<=end){
            int mid=st+(end-st)/2;

            if(isPossible(arr, kids, mid)){
                ans=mid;
                st=mid+1; //We have to find Maximal minimal answer.
            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,4,8,9};
        int kids = 3;

        System.out.println("Maximal Minima is: "+raceTask(arr, kids));
    }
}
//        System.out.println("Enter the value for finding square root: ");
//        int x = sc.nextInt();
//        System.out.println("Enter the size of array: ");
//        int n = sc.nextInt();
//       int[][] arr = {{1,2,3,4},{5,6,7,8}, {10,12, 13,15}};
//       int target=7;
//        System.out.println("Enter a elements of array: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        int target = 8;
////      System.out.println("First Repetitive Index of "+target+" is: "+binary_SearchProblem_lastIndex(arr,0, arr.length-1, target));
//      System.out.println(bin_sea_findIdx(arr, target));
//      bin_sear_find_maxElmt_wrong(arr, 0, arr.length-1);
//      System.out.println("Lower bound is present at Index: "+lower_Bound(arr, target));
//      System.out.println("Upper bound of "+target+" is: "+upper_Bound(arr, target));
//      System.out.println(binary_searchMatrixII(arr, target));


//        while(target!=6){
//            System.out.printf("%d number is present: %s\n",target, binary_Search_Recursion(arr, 0, arr.length-1, target));
//            System.out.printf("%d number is present: %s\n", target, binary_Search_loop(arr, target));
//            System.out.println();
//
//            target++;
//        System.out.println("Original Array");
//        display(arr);
//        System.out.println();
//        radixSort(arr);
//        System.out.println("Sorted Array");
//        display(arr);
//        System.out.println();

////            System.out.println("Enter the elements of array: ");
////                for (int i = 0; i < n; i++) {
////                 arr[i] = sc.nextInt();
////        }

//        for(String val : s){
//            System.out.println(val + " ");
//        }
//        lexicoGraphicalString_problem(s, s.length);
//        System.out.println("Sorted Array");
//        for(String val : s){
//            System.out.println(val + " ");
//        }
//
////      bubbleSort(arr, arr.length);
//        selectionSort2(arr, arr.length);
//        insertionSort(arr, arr.length);
//          moveAllZeroes_Problem(arr, arr.length);
//                System.out.println();
//                display(arr);
//    }
//}
//
//        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        //                  0   1    2      3       4    5      6       7       8       9.
//        keypad_Problem(s, keypad, " ");
//        ArrayList<String> ans = subsequence(s);
//        for(String ss : ans){
//            System.out.print(ss + " ");
//        }
//        findSubsequences2_Recursion(arr, 0, 0);
//        System.out.println("Minimum Cost is: "+frogJump(arr, arr.length, 0));
//     if(palindrome2_Recursion(s, 0, s.length()-1)){
//         System.out.printf(" %s is Palindrome", s);
//     }
//     else{
//         System.out.printf("%s is not Palindrome",s);
//     }
//        System.out.println("Last Index of Target is: "+lastIndex_Recursion(arr, arr.length-1, 2));
//        linearSearchAllIndices_Recursion(arr, 0, 2);
//        if(linearSearch_Recursion(arr, 0, 5)){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }
//        for(int i=0; i<ans.size(); i++){
//            System.out.print(ans.get(i) + " ");
//        }
//        System.out.println(linearSearch2_Recursion(arr, 0, 5));
//        System.out.println("Enter the value of n: ");
//        int  n=sc.nextInt();
//        System.out.println("Enter the value of k: ");
//        int k=sc.nextInt();
//        System.out.println("Enter the value of n: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of array: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        ArrayList<Integer> l1 = new ArrayList<>();
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
//        l1.add(4);
//        System.out.println(l1.isEmpty());
//        l1.indexOf(6);
//        System.out.println(l1);
//        Wrapper Class.
//        Integer i = Integer.valueOf(3);
//        System.out.println(i);
//        Float f = Float.valueOf(3.5f);
//        System.out.println(f);
//        Double d = Double.valueOf(3.6789);
//        System.out.println(d);
//        ArrayList<String> l1 = new ArrayList<>();
//        l1.add("Rajesh");
//        l1.add("Mamtesh");
//        l1.add("Kavita");
//        l1.add("Deepak");
//        l1.add("Gagan");
//        l1.add("Ritik");
//        l1.add("Gadariya");
//        System.out.println("Original ArrayList : "+l1);
//        Collections.reverse(l1);
//        System.out.println("Reverse ArrayList : "+l1);
//        Collections.sort(l1);
//        System.out.println("Ascending order : "+l1);
//        Collections.sort(l1, Collections.reverseOrder());
//        System.out.println("Descending order : "+l1);
//        l1.add(0, 0);
//        System.out.println(l1);
//        l1.remove(2);
//        System.out.println(l1);
//        Collections.swap(l1, 2, 3);
//        System.out.println(l1);
//        for(int i=0; i<l1.size(); i++){
//            System.out.print(l1.get(i) + " ");
//        System.out.println(l1);
//        l1.set(1, 10);
//        System.out.println(l1);
//        System.out.println(l1.contains(6));
//        l1.remove(2);
//        System.out.println(l1);
//        System.out.println(l1.remove(Integer.valueOf(7)));
//        l1.add(2, 100);
//        System.out.println(l1);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows first array: ");
//        int n = sc.nextInt();
//        System.out.println("Enter the number of columns first array: ");
//        int m = sc.nextInt();
//        int[][] arr = new int[n][m];
//        System.out.println("Enter the elements of first array: ");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = sc.nextInt();
//        upper_Half_Matrix(arr);
//        //display2D(arr);
//        System.out.println("Enter the boundaries of rectangle for sum: ");
//        int l1=sc.nextInt();
//        int r1=sc.nextInt();
//        int l2=sc.nextInt();
//        int r2=sc.nextInt();
//        System.out.println("Sum is: "+rectangleSum(arr, l1, r1, l2, r2));
//        System.out.println("Sum is: "+rectangleSum2(arr, l1, r1, l2, r2));
//        System.out.println("Sum is: "+rectangleSum3(arr, l1, r1, l2, r2));
//        checkteoplitzMatrix(arr, r1, c1);
//        System.out.println("Print in Spiral Order: ");
//        printSpiral(arr, r1, c1);
//        int[][] arr = printSpiralAntiClockWise(n);
//        display2D(arr);
//        linearSearch(arr);
//        prime(n);
//        int[][] ans=pascalTriangle(n);
//        display2D(ans);
//        System.out.println(teoplitzMatrix(arr, r1, c1));
//        System.out.println("Original Matrix");
//        display2D(arr);
//        transposeInPlace(arr, r1, c1);
//        System.out.println("Enter the number of rows second array: ");
//        int r2 = sc.nextInt();
//        System.out.println("Enter the number of columns of second arrays: ");
//        int c2 = sc.nextInt();
//        int[][] arr2 = new int[r2][c2];
//        System.out.println("Enter the elements of Second array: ");
//        System.out.println();
//        display2D(arr2);


