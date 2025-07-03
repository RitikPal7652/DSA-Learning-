package DSA.codes;

import java.util.Scanner;
class Arr {
        public void subArray(int[] arr){
            for(int i=0; i<arr.length; i++){
                for(int j=i; j<arr.length; i++){
                    for(int k=i; k<=j; k++){
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
        public void upper_HalfMatrix(int[][] arr, int n){
            //int[][] ans = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(i>=j){
                        System.out.print(arr[i][j] + " ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            //print_Matrix(arr);
        }
        public void perfect_Square_Matrix(int[][] arr, int n) {
            //int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i==j || i+j==n-1){
                        if(arr[i][j] == 0){
                            System.out.println("False");
                            return;
                        }
                    }
                    else{
                        if(arr[i][j] !=0){
                            System.out.println("False");
                            return;
                        }
                    }
                }
            }
            System.out.println("True");
        }
    public int rectangleSum_with_PrefixSum_RowAndCoulmn(int[][] arr, int l1, int r1, int l2, int r2){
        int ans = 0, sum = 0, left = 0, up = 0, leftUp = 0;
        prefixSum_RowAndCoulumn_Wise(arr);

        sum = arr[l2][r2];
        if(r1>=1) {
            left = arr[l2][r1 - 1];
        }
        if(l1>=1) {
            up = arr[l1 - 1][r2];
        }

        if(l1>=1 && r1>=1) {
            leftUp = arr[l1 - 1][r1 - 1];
        }

        ans = sum - up - left + leftUp;

        System.out.println("Sum is : "+ans);
        return ans;
    }
    public void prefixSum_RowAndCoulumn_Wise(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        //Prefix sum Calculate Row-Wise.
        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                arr[i][j] += arr[i][j-1];
            }
        }
        //Prefix Sum Calculate over Coulumn-Wise.
        for(int j=0; j<c; j++){
            for(int i=1; i<r; i++){
                arr[i][j] += arr[i-1][j];
            }
        }
        print_Matrix(arr);
    }
     public void prefix_Sum_in2D(int[][] arr) {
                int r = arr.length;
                int c = arr[0].length;
                for (int i = 0; i < r; i++) {
                    for (int j = 1; j < c; j++) {
                        arr[i][j] += arr[i][j - 1];
                    }
                }
            }
     public int rectangle_Sum_PrefixSum_In_HorizontalRow(int[][] arr, int l1, int l2, int r1, int r2){
            int sum=0;
            prefix_Sum_in2D(arr);

            for(int i=l1; i<=l2; i++){
                if(r1>=1){
                    sum += arr[i][r2] - arr[i][r1-1];
                }
                else{
                    sum += arr[i][r2];
                }
            }
            return sum;
            }
            public int rectangle_Sum(int[][] arr, int l1, int l2, int r1, int r2){
                int sum=0;
                for(int i=l1; i<=l2; i++){
                    for(int j=r1; j<=r2; j++){
                        sum += arr[i][j];
                    }
                }
                return sum;
            }
            public int[][] spiral_different(int n){
                /*
                                        ALGORITHM
                1. First of all Traverse on leftCol and assign the values of Matrix in it.
                2. Similarly traverse on all the rows and coulumns like bottomRow, rightCol and topRow
                    and assign the values of Matrix in it spiral order.
                 */
                int[][] ans = new int[n][n];
                int current_put = 1;
                int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;

                while(current_put<=n*n){
                    for(int i=topRow; i<=bottomRow && current_put<=n*n; i++){
                        ans[i][leftCol] = current_put++;
                    }
                    leftCol++;

                    for(int j=leftCol; j<=rightCol && current_put<=n*n; j++){
                        ans[bottomRow][j] = current_put++;
                    }
                    bottomRow--;

                    for(int i=bottomRow; i>=topRow && current_put<=n*n; i--){
                        ans[i][rightCol] = current_put++;
                    }
                    rightCol--;

                    for(int j=rightCol; j>=leftCol && current_put<=n*n; j--){
                        ans[topRow][j] = current_put++;
                    }
                    topRow++;
                }
                return ans;
            }
            public int[][] spiral_Matrix_Print(int n){
                int[][] ans = new int[n][n];
                int currrent_Element=1;
                /*
                                ALGORITHM
                1. First of all we traverse on top row of matrix which is going from leftCol to rightCol
                    and assign the matrix element on matrix.
                2. Then similarly assign the values in rightCoulumn, bottomRow, leftCoulumn and print the
                    matrix.
                 */
                int topRow=0, bottomRow=n-1, leftCol=0, rightCol=n-1;

                while(currrent_Element<=n*n) {
                    for (int j = leftCol; j <= rightCol && currrent_Element <= n * n; j++) {
                        ans[topRow][j] = currrent_Element++;
                    }
                    topRow++;

                    for (int i = topRow; i <= bottomRow && currrent_Element <= n * n; i++) {
                        ans[i][rightCol] = currrent_Element++;
                    }
                    rightCol--;

                    for (int j = rightCol; j >= leftCol && currrent_Element <= n * n; j--) {
                        ans[bottomRow][j] = currrent_Element++;
                    }
                    bottomRow--;

                    for (int i = bottomRow; i >= topRow && currrent_Element <= n * n; i--) {
                        ans[i][leftCol] = currrent_Element++;
                    }
                    leftCol++;
                }
               return ans;
            }
            public void spiral_Order_Traversal(int[][] arr, int r, int c){
                /*
                                        ALGORITHM.
                1. First of all we print topRow from leftColmn to rightColmn and icrease topRow by 1.
                2. Then, print rightColmn from topRow to bottomRow and decrease rightColmn by 1.
                3. Then, we print bottomRow from rightColmn to leftColmn and decrease the bottomRow by 1.
                4. In last, we print leftColm from bottomRow to topRow and increase the leftColmn by 1.
                        in all these condition not forgot that is totalElements is less than r*c.
                 */
                int topRow=0, rightColmn=c-1, bottomRow=r-1, leftColmn= 0;
                int totalE = 0;

                while(totalE<r*c) {
                    for (int j = leftColmn; j <= rightColmn && totalE < r * c; j++) {
                        System.out.print(arr[topRow][j] + " ");
                        totalE++;
                    }
                    topRow++;

                    for (int i = topRow; i <= bottomRow && totalE < r * c; i++) {
                        System.out.print(arr[i][rightColmn] + " ");
                        totalE++;
                    }
                    rightColmn--;

                    for (int j = rightColmn; j >= leftColmn && totalE < r * c; j--) {
                        System.out.print(arr[bottomRow][j] + " ");
                        totalE++;
                    }
                    bottomRow--;

                    for (int i = bottomRow; i >= topRow && totalE < r * c; i--) {
                        System.out.print(arr[i][leftColmn] + " ");
                        totalE++;
                    }
                    leftColmn++;
                }
            }
            public boolean teoplitz_Matrix(int[][] arr, int r, int c){
                boolean check = true;
                for(int i=1; i<r; i++){
                    for(int j=1; j<c; j++){
                        if(arr[i][j] != arr[i-1][j-1]){
                            check = false;
                            System.out.println(check);
                            return check;
                        }
                    }
                }
                System.out.println(check);
                return check;
            }
            public void matrix_Rotation_Into_90_Anticlockwise(int[][] arr, int r, int c) {
                /*
                         ALGORITHM
                1. First of all, we find reverse of the matrix.
                2. Second we find the transpose of matrix to make the matrix rotation in anticlockwise
                    in 90 degree direction.
                 */
                for(int i=0; i<arr.length; i++){ //For Reversing the Array.
                    reverse_IP(arr[i]);
                }

                for(int i=0; i<c; i++){ //For Transpose of matrix.
                    for(int j=i; j<r; j++){
                        int temp = arr[i][j];
                        arr[i][j] = arr[j][i];
                        arr[j][i] = temp;
                    }
                }
                System.out.println("Rotation of matrix in anticlockwise direction is: ");
                print_Matrix(arr);
            }
            public int[][] multiplicationMatrix(int[][] c, int r1, int c1, int[][] d, int r2, int c2){
                int[][] ans = new int[r1][c2];
                if(c1!=r2){
                    System.out.println("Multiplication not possible: Wrong Input");
                    return ans;
                }
                for(int i=0; i<r1; i++){
                    for(int j=0; j<c2; j++){
                        for(int k=0; k<c1; k++){
                            ans[i][j] += (c[i][k]*d[k][j]);
                        }
                    }
                }
                System.out.println();
                print_Matrix(ans);
                return ans;
            }
            public int[][] Pascals_Triangle(int n) {
                int[][] ans = new int[n][];
                /*
                1. Jagged array: Coulumn is not fixed || inevery row, coulumn changes.
                2. First and last element in each row is 1.
                3. Every term is the sum of above two terms or [i-1][j]+[i-1][j-1].
                 */
                for (int i = 0; i < n; i++) {
                    ans[i] = new int[i + 1];
                    ans[i][0] = ans[i][i] = 1;

                    for(int j=1; j<i; j++){
                        ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
                    }
                }
               // print_Matrix(ans);
                return ans;
            }
            public void reverse_IP(int[] arr){
                int i=0;
                int j=arr.length-1;
                while(i<j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            public void rotate_Matrix_By_90_degree(int[][] arr, int r, int c){
//                transpose_InPlace(arr, r, c);
//                reverse_Each_Row_2DArray(arr);
                for(int i=0; i<c; i++){
                    /*
                      For taking transpose of matrix.
                    */
                    for(int j=i; j<r; j++){
                        int temp = arr[i][j];
                        arr[i][j] = arr[j][i];
                        arr[j][i] = temp;
                    }
                }
                /*
                For taking reverse of arraylength.
                */
                for(int i=0; i<r; i++) {
                    reverse_IP(arr[i]);
                }
                System.out.println("Matrix Rotation by 90 degrees is: ");
                print_Matrix(arr);
            }
            public void transpose_InPlace(int[][] arr, int r, int c){
                for(int i=0; i<c; i++){
                    for(int j=i; j<r; j++){
                        int temp = arr[i][j];
                        arr[i][j] = arr[j][i];
                        arr[j][i] = temp;
                    }
                }
                //System.out.println("Transpose of given Matrix is: ");
                //print_Matrix(arr);
            }
            public int[][] transpose(int[][] arr, int r, int c){
                int[][] ans = new int[c][r];
                for(int i=0; i<c; i++){
                    for(int j=0; j<r; j++){
                        ans[i][j] = arr[j][i];
                    }
                }
                System.out.println("Transpose of Matrix is: ");
                print_Matrix(ans);
                return ans;
            }
            public void sum_In_GivenRange(int[][] arr, int p, int q, int x, int y){
                int sum = 0;
                for(int i=p; i<=q; i++){
                    for(int j=x; j<=y; j++){
                        sum+=arr[i][j];
                    }
                }
                System.out.println("Sum in a given range is: "+sum);
            }
            public void element_present_SortedMatrix(int[][] arr, int x){
                for(int i=0; i<arr.length; i++){
                    for(int j=0; j<arr[i].length; j++){
                        if(arr[i][j] == x){
                            System.out.println("Row = "+i);
                            System.out.println("Coulumn = "+j);
                            return;
                        }
                    }
                }
                System.out.println("Element is not present: -1");
            }
            public void reverse_Each_Row_2DArray(int[][] arr){
                int i=0;
                int j=arr.length;
                while(i<j){
                    reverseArray_InPlace(arr[i], 0, arr[i].length-1);
                    i++;
                }
               // print_Matrix(arr);
            }
            public void convert_1D_to_2D(int[] arr, int m, int n) {
                int[][] a = new int[m][n];
                int k=0;
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                            a[i][j] = arr[k];
                            k++;
                        }
                    }
                print_Matrix(a);
                }
            public void number_Present(int[][] arr, int x){
                for(int i=0; i<arr.length; i++){
                    for(int j=0; j<arr[i].length; j++){
                        if(arr[i][j] == x){
                            System.out.println("Row = "+i+"");
                            System.out.println("Coulumn = "+j+"");
                            return;
                        }
                    }
                }
                System.out.println(-1);
            }
            public void print_Matrix(int[][] arr){
                for(int i=0; i<arr.length; i++){
                    for(int j=0; j<arr[i].length; j++){
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            public void multiplication_Matrix(int[][] c, int r1, int c1, int[][] d, int r2, int c2){
                if(c1!=r2){
                    System.out.println("Wrong Input: Matrix Multiplication not possible. ");
                    return;
                }

                int[][] mul = new int[r1][c2];
                for(int i=0; i<r1; i++){
                    for(int j=0; j<c2; j++){
                        for(int k=0; k<c1; k++)
                        mul[i][j] += (c[i][k]*d[k][j]);
                    }
                }
                System.out.println("Multiplication of two matrices are: ");
                print_Matrix(mul);
            }
            public void sumOf_Matrix(int[][] c, int r1, int c1, int[][] d, int r2, int c2) {
                if (r1 != r2 || c1 != c2) { //Corner case
                    System.out.println("Wrong Input: Matrix Addition not possible.");
                    return;
                }
                int[][] sum = new int[r1][c1];
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        sum[i][j] = c[i][j] + d[i][j];
                    }
                }
                print_Matrix(sum);
            }
            public void suffixSum_InPlace(int[] arr){
                int n=arr.length;

                for(int i=n-2; i>0; i--){
                    arr[i]+=arr[i+1];
                }
            }
            public int[] suffixSum(int[] arr){
                int n = arr.length;
                int[] ans = new int[n];
                ans[ans.length-1] = arr[arr.length-1];
                for(int i=n-2; i>=0; i--){
                    ans[i] = arr[i]+ans[i+1];
                }
                return ans;
            }
            public int toTalSum(int[] arr){
                int totalSum = 0;

                for(int i=0; i<arr.length; i++){
                    totalSum+=arr[i];
                }
                return totalSum;
            }
            public boolean prefix_Suffix(int[] arr){
                int totalSum = toTalSum(arr);
                int prefixSum = 0;

                for(int i=0; i<arr.length; i++){
                    prefixSum+=arr[i];
                    int suffixSum = totalSum-prefixSum;
                    if(prefixSum==suffixSum){
                        return true;
                    }
                }
                return false;
            }
            public void sumIn_GivenRange(int[] arr){
            int n = arr.length;
            int sum = 0;
            Scanner sc = new Scanner(System.in);

            int[] ans = prefix_Sum(arr); //Calling a method so that array changes to prefix/running sum array.
                System.out.println("Enter q queries: ");
                int q = sc.nextInt();

                while(q-->0){
                    System.out.println("Enter Range");
                    System.out.println("Enter the value of l: ");
                    int l = sc.nextInt();
                    System.out.println("Enter the value of r: ");
                    int r = sc.nextInt();

                    sum = ans[r]-ans[l-1];
                    System.out.println("Sum in a given Range is: "+sum);

                }
            }
            public int[] prefix_Sum(int[] arr){
                int n = arr.length;
                for(int i=1; i<n; i++){
                    arr[i] += arr[i-1];
                }
                return arr;
            }
            public void index_find(int[] arr){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the value of x: ");
                int x = sc.nextInt();
                int n = arr.length;

                for(int i=0; i<n; i++){
                    for(int j=i+1; j<n; j++){
                    if(arr[i] + arr[j] == x){
                        System.out.println("Indices are: "+(i+1)+" and "+(j+1));
                    }
                    }
                }
            }
            public int[] squared_Array(int[] arr) {
                int n = arr.length;
                int[] ans = new int[n];
                int k=n-1;
                int left=0;
                int right=n-1;

                while(left<=right){
                    if(Math.abs(arr[left])>Math.abs(arr[right])) {
                        ans[k--] = arr[left]*arr[left];
                        left++;
                    }
                    else{
                        ans[k--] = arr[right]*arr[right];
                        right--;
                    }
                }
                return ans;
            }
            public void even_InPlace(int[] arr){
                int n = arr.length;
                int left = 0;
                int right = n-1;

                while(left<right){
                    if(arr[left]%2!=0 && arr[right]%2==0){
                        swapByAnotherVariable(arr, left, right);
                        left++;
                        right--;
                    }

                    if(arr[left]%2==0){
                        left++;
                    }

                    if(arr[right]%2!=0){
                        right--;
                    }
                }
            }
            public int[] even_At_Beginning(int[] arr){
                int n = arr.length;
                int[] ans = new int[n];
                int j = 0;
                for(int i=0; i<arr.length; i++){
                    if(arr[i]%2==0){
                        ans[j++] = arr[i];
                    }
                }
                for(int i=0; i<arr.length; i++){
                    if(arr[i]%2!=0){
                        ans[j++] = arr[i];
                    }
                }
                return ans;
            }
            public void sort(int[] arr) {
                int i = 0;
                int j = arr.length-1;
                while (i < j) {
                    if (arr[i] == 1 && arr[j] == 0) {
                        swapByAnotherVariable(arr, i, j);
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
            public int[] arrangement_Array(int[] arr) {
            int n = arr.length;
            int[] ans = new int[n];
            int j = 0;
            int positive = 0;
            int negative = 0;

            for (int i = 0; i < n; i++) { // To check more (+) or more (-) numbers present in the array.
                if (arr[i] > 0) {
                    positive++;
                } else {
                    negative++;
                }
            }

            if (positive > negative) {
                for (int i = 0; i < n; i++) { //For to put negative element in array.
                    if (arr[i] < 0) {
                        ans[j++] = arr[i];
                    }
                }
                for (int i = 0; i < n; i++) { //For to put positive element in array.
                    if (arr[i] > 0) {
                        ans[j++] = arr[i];
                    }
                }
            }
            else {
                for (int i = 0; i < n; i++) { //For to put positive element in array.
                    if (arr[i] > 0) {
                        ans[j++] = arr[i];
                    }
                }
                for (int i = 0; i < n; i++) { //For to put negative element in array.
                    if (arr[i] < 0) {
                        ans[j++] = arr[i];
                    }
                }
            }
            return ans;
        }
            public int first_Repeating_Index ( int[] arr){
                int n = arr.length;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (arr[i] == arr[j]) {
                            return i + 1;
                        }
                    }
                }
                return -1;
            }
            public void make_Freq_Array ( int[] arr){
                Scanner sc = new Scanner(System.in);
                int[] freq = new int[100001];
                int n = arr.length;
                for (int i = 0; i < n; i++) {
                    freq[arr[i]]++;
                }
                System.out.println("Enter number of Queries: ");
                int q = sc.nextInt();
                while (q-- > 0) {
                    System.out.println("Enter number to be searched: ");
                    int x = sc.nextInt();
                    if (freq[x] > 0) {
                        System.out.println("Present: Yes");
                    } else {
                        System.out.println("Present: No");
                    }
                }
            }
            public void rotateArray_InPlace ( int[] arr, int k){
                int n = arr.length;
                k = k % n;
                reverseArray_InPlace(arr, 0, n - k - 1);
                reverseArray_InPlace(arr, n - k, n - 1);
                reverseArray_InPlace(arr, 0, n - 1);
            }
            public int[] rotate_Array ( int[] arr, int n, int k){
                k = k % n;
                int[] ans = new int[n];
                int j = 0;
                for (int i = n - k; i < arr.length; i++) {
                    ans[j++] = arr[i];
                }
                for (int i = 0; i < n - k; i++) {
                    ans[j++] = arr[i];
                }
                //for(int )
                return ans;
            }
            public int[] reverseArray ( int[] arr, int n){
                int[] ans = new int[n];
                int j = 0;
                for (int i = arr.length - 1; i >= 0; i--) {
                    ans[j++] = arr[i];
                }
                return ans;
            }
            public void reverseArray_InPlace ( int[] arr, int i, int j){
                int n = arr.length;
                while (i < j) {
                    swapByAnotherVariable(arr, i, j);
                    i++;
                    j--;
                }
            }
            public void printArray ( int[] arr){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            public void swapByXOR ( int c, int d){//By using Bitwise operator.
                c = c ^ d;
                d = c ^ d;
                c = c ^ d;
                System.out.println("After swapping : " + c);
                System.out.println("Aftre swapping: " + d);
            }
            public void swapSumAndSubtraction ( int c, int d){
                c = c + d;
                d = c - d;
                c = c - d;
                System.out.println("After swapping: " + c);
                System.out.println("After swapping: " + d);

            }
            public void swapByAnotherVariable ( int[] arr, int i, int j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //System.out.println("After swapping"+c+" and "+d+"");
            }
            public void kthSmallest ( int[] arr, int k){
                System.out.println(arr[k - 1]);
            }
            public void occurrence ( int[] arr, int x){
                int ans = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == x) {
                        ans++;
                    }
                }
                System.out.println("Occurence of " + x + " in given array is: " + ans);
            }
            public boolean findDifferencePairs ( int[] arr, int x){
                boolean check = false;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] - arr[i] == x) {
                            check = true;
                        }
                    }
                }
                System.out.println("Pairs Exists: " + check);
                return check;
            }
            public int max ( int[] arr){
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                return max;
            }
            public int secondMax ( int[] arr){
                int SecondMax = max(arr);
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == SecondMax) {
                        arr[i] = Integer.MIN_VALUE;
                    }
                }
                int ans = max(arr);
                return ans;
            }
            public int secondSmallest ( int[] arr){
                System.out.println("Second smallest Element in the given array is: " + arr[1]);
                return arr[1];
            }
            public int firstRepeatition ( int[] arr){
                for (int i = arr.length - 1; i >= 1; i--) {
                    for (int j = arr.length - 2; j >= 1; j--) {
                        if (arr[i] == arr[j]) {
                            //System.out.println("First repeating element is: "+arr[i]);
                            return arr[i];
                        }
                    }
                }
                return -1;
            }
            public void secondLargest ( int[] arr){
                System.out.println("Second largest element in the given array is: " + arr[arr.length - 2]);
            }
            public void unique ( int[] arr){
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            arr[i] = 0;
                            arr[j] = 0;
                        }
                    }
                }
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0) {
                        System.out.println("Unique index in the given array which is not repeated: " + arr[i]);
                    }
                }
            }
            public int pairs ( int[] arr, int x){
                int ans = 0;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        for (int k = j + 1; k < arr.length; k++) {
                            if (arr[i] + arr[j] + arr[k] == x) {
                                System.out.println("Pairs of triplet are: {" + arr[i] + "" + arr[j] + "" + arr[k] + "}");
                                ans++;
                            }
                        }
                    }
                }
                System.out.println("Total number of pairs in the given array is: " + ans);
                return ans;
            }
            public boolean equality ( int[] arr, int[] arr1){
                boolean check = true;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != arr1[i]) {
                        check = false;
                        break;
                    }
                }
                System.out.println("Is equal: " + check);
                return check;

            }
            public int[] array ( int[] arr, int n){
                int[] ans = new int[n];
                int j = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= 0) {
                        ans[j++] = arr[i];
                    }
                }

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < 0) {
                        ans[j++] = arr[i];
                    }
                }
                return ans;
            }
            public boolean sorted ( int[] arr){
                boolean check = true;
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < arr[i - 1]) {
                        check = false;
                    }
                }
                System.out.println("Is sorted: " + check);
                return check;
            }
            public int strictlyGreater ( int[] arr, int x){
                int count = 0;
                for (int i = 0; i < arr.length; i++) { //1,2,3,4,5
                    if (arr[i] > x) {
                        count++;
                    }
                }
                System.out.println("Number of elements is strictly greater than " + x + " is: " + count);
                return count;
            }
            public int lastOccurrence ( int[] arr, int x){
                int lastIndex = -1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == x) {
                        lastIndex = i;
                    }
                }
                System.out.println("Last occurence of element " + x + " is: " + lastIndex);
                return lastIndex;
            }
            public int occurence ( int[] arr, int x){
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == x) {
                        count++;
                    }
                }
                System.out.println("Number of occurrence of " + x + " in a given array is: " + count);
                return count;
            }
            public void stringIntoArray () {
                String[] arr = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
                for (int i = 0; i < arr.length; i++) {
                    if (i % 2 != 0) {
                        System.out.println(arr[i]);
                    }
                }
            }
            public void peakElement () {
                int[] arr = {1, 2, 3, 4, 5, 3, 4, 1, 5, 7, 9, 6};
                for (int i = 1; i < arr.length - 1; i++) {
                    if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                        ;
                        System.out.println("Given peak element in the array is: " + arr[i]);
                        break;
                    }
                }
            }
            public void even () {
                int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
                for (int arr : array) {
                    if (arr % 2 == 0) {
                        System.out.println(arr);
                    }
                }

            }
            public void positive () {
                int[] arr = {2, 6, -5, -1, 0, 4, -9};

                for (int i = 0; i < 7; i++) {
                    if (arr[i] >= 0) {
                        System.out.println(arr[i]);
                    }
                }
            }
            public void findElement () {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of array: ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                int ans = -1;

                System.out.println("Enter the elements of Array: ");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == n) {
                        ans = i;
                        break;
                        //  System.out.println("Resulting Index is: "+ans);
                        // break;

                    }
                    System.out.println("Found  " + ans);
                }
            }
            public void maxOfArray () {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of array: ");
                int n = sc.nextInt();
                int[] array = new int[n];

                for (int i = 0; i < n; i++) {
                    array[i] = sc.nextInt();
                }

                //int[] array = new int[n];
                int ans = 0;

                for (int i = 0; i < array.length; i++) {
                    if (array[i] > ans) {
                        ans = array[i];
                    }
                }
                System.out.println("Maximum value in a given Array is: " + ans);

            }
            public void sumArray () { // To calculate sum of array.
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of array: ");
                int n = sc.nextInt();
                int[] array = new int[n];
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    array[i] = sc.nextInt();
                }

                for (int i = 0; i < array.length; i++) {
                    sum += array[i];
                }
                System.out.println("Sum of the given array is: " + sum);
                // return sum;
            }
        }
    public class sumOfArray {
        static void printArray(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Arr a = new Arr();
            //System.out.println("Enter the size of 1st array: ");
//            int r = sc.nextInt();
//            int c = sc.nextInt();
            System.out.println("Enter the value of n: ");
            int n = sc.nextInt();
            //  int[][] ans = a.spiral_different(n);
            //  printArray(ans);
            int[] arr = new int[n];
            System.out.print("Enter the elements of 1st array: ");
            for (int i = 0; i < n; i++) {
                //  for (int j = 0; j < n; j++)
                arr[i] = sc.nextInt();
            }
            a.subArray(arr);
        }
    }
//            a.perfect_Square_Matrix(arr, n);
//            System.out.println("Enter the boundaries of Rectangle");
//            int l1 = sc.nextInt();
//            int r1 = sc.nextInt();
//            int l2 = sc.nextInt();
//            int r2 = sc.nextInt();

//            a.prefixSum_RowAndCoulumn_Wise(arr);
//    System.out.println("Sum is : "+a.rectangle_Sum(arr, l1, l2, r1, r2));
//    System.out.println("Sum is : "+a.rectangle_Sum_PrefixSum_In_HorizontalRow(arr,l1, l2, r1, r2));
//    a.rectangleSum_with_PrefixSum_RowAndCoulmn(arr, l1, r1, l2, r2);


//            System.out.println("Spiral Order matrix is: ");
//            int[][] ans = a.spiral_Matrix_Print(n);
//            a.print_Matrix(ans);
//            a.spiral_Order_Traversal(arr, r, c);
//            a.teoplitz_Matrix(arr, r, c);
//            a.matrix_Rotation_Into_90_Anticlockwise(arr, r, c);
//            System.out.println("Enter the value of n: ");
//            int n = sc.nextInt();
//            int[][] ans = a.Pascals_Triangle(n);
//            a.print_Matrix(ans);
//            a.rotate_Matrix_By_90_degree(arr, r, c);
//            a.transpose_InPlace(arr, r, c);
//            System.out.println("Enter Range of rows");
//            int p = sc.nextInt();
//            int q = sc.nextInt();
//            System.out.println("Enter Range of coulums");
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            a.sum_In_GivenRange(arr, p, q, x, y);
//            a.reverse_Each_Row_2DArray(arr);
//            System.out.println("Enter size of array");
//            int m = sc.nextInt();
//            int n = sc.nextInt();
//            int[] arr = new int[m*n];
//            System.out.println("Enter "+m*n+"array elements");
//            for(int i=0; i<arr.length; i++){
//                arr[i] = sc.nextInt();
//            }
//.           element_present_SortedMatrix(arr, x);
//              a.number_Present(arr, x);
//            System.out.print("Enter the size of 2nd array: ");
//            int r2 = sc.nextInt();
//            int c2 = sc.nextInt();
//            int[][] d = new int[r2][c2];
//            System.out.print("Enter the elements of array: ");
//            for (int i=0; i<r2; i++) {
//                for (int j = 0; j < c2; j++) {
//                    d[i][j] = sc.nextInt();
//                }
//            }
//            a.multiplicationMatrix(c, r1, c1, d, r2, c2);
        //    a.multiplication_Matrix(c, r1, c1, d, r2, c2);
            //a.sumOf_Matrix(c, r1, c1, d, r2, c2);
            //System.out.println("Sum of the two matrices is: ");
            //printArray(sum);

    //          System.out.println("Is PrefixSum equal to the SuffixSum: "+a.prefix_Suffix(arr));

//            System.out.println("Enter first Number : ");
//            int c = sc.nextInt();
//            System.out.println("Enter second Number : ");
//            int d = sc.nextInt();
            //  a.swapByXOR(c, d);
            // a.swapSumAndSubtraction(c, d);
            //  a.swapByAnotherVariable(c, d);
           // a.sumIn_GivenRange(arr);


            //System.out.println();
            //a.prefix_Sum(arr);
           // a.index_find(arr);
            //a.make_Freq_Array(arr);
//            System.out.println("Enter the value of k: ");
//            int k = sc.nextInt();

            //printArray(arr);
           // a.rotateArray_InPlace(arr, k);
           // printArray(arr);
            // int[] ans = a.rotate_Array(arr, n, k);
            //a.reverse_Array(arr);
            //Arrays.sort(arr);

            //System.out.println("Enter the value of k: ");
            //int k = sc.nextInt();

            //a.kthSmallest(arr, k);
            //a.occurrence(arr, x);
            // a.findDifferencePairs(arr, x);
            //a.max(arr);
            //System.out.println("Second Maximum is: "+(a.secondMax(arr)));

            //Arrays.sort(arr);
            //a.secondSmallest(arr);
            //System.out.println("Last Repeating ineteger is: "+a.firstRepeatition(arr));
            //a.secondLargest(arr);
            //            Arrays.sort(arr);
            //            System.out.println("Enter the value of x: ");
            //            int x = sc.nextInt();
            // a.pairs(arr, x);
            //            int k = sc.nextInt();
            //            System.out.println(""+k+" smallest element in the given array is: "+arr[k-1]);
            //      a.kShort(arr, k);
            //

            //            a.equality(arr, arr1);
            //            a.union(arr, arr1);
            //System.out.print("Given array is: ");
            //            printArray(arr);
            //            System.out.println();
            //            int[] ans = a.array(arr, n);
            //            System.out.print("Changed array is: ");
            //            printArray(ans);

            //            System.out.print("Enter the value of x: ");
            //            int x = sc.nextInt();

            //a.sorted(arr);
           //a.strictlyGreater(arr, x);
           //a.lastOccurrence(arr, x);
           // a.inputArray();
           // a.maxOfArray();
           // a.sumArray();
           // a.findElement();
           // a.positive();
           // a.even();
           //a.peakElement();
           // a.stringIntoArray();
            //arr[0] = 5;
            //          arr[1] = 6;
            //            arr[2] = 7;
            //            arr[3] = 8;
            //            arr[4] = 9;
            //            System.out.println("Original array: ");
            //            printArray(arr);
            //            int[] arr2 = Arrays.copyOfRange(arr, 2, 4);
            //            System.out.println("Printed array: ");
            //            printArray(arr2);
            // (arr2);
            //        System.out.println("By for each loop");
            //        for(int arr : array){ //For each loop
            //            System.out.println(arr);
            //        }
            //        System.out.println("By while loop");
            //        int i=0;
            //        while(i<n){
            //            System.out.println(array[i]);
            //            i++;
            //        }


