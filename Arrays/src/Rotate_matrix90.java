import java.util.Arrays;

public class Rotate_matrix90 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };



        int [][]result=rotated(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));

        }
        int [][] optresult=rotated_Matrix(arr2);
        for (int i = 0; i < optresult.length; i++) {
            System.out.println(Arrays.toString(optresult[i]));

        }




    }

    static int[][] rotated(int [][] arr){
        int n= arr.length;
        int [][] rotate=new int [n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                rotate[j][n-i-1]=arr[i][j];

            }

        }
        return rotate;
    }

    static int[][] rotated_Matrix(int [][]arr){
        //transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }

        //reverse

        for (int i = 0; i < arr.length; i++) {
            int left=0;
            int right= arr.length-1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }

        }
        return arr;
    }
}
