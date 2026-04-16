import java.util.ArrayList;

public class spiral_traverse {
    public static void main(String[] args) {


        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        ArrayList<Integer> result = spiral(arr);
        System.out.println(result);

    }
    static ArrayList<Integer> spiral(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0;
        int left = 0;
        int bottom = arr.length - 1;
        int right = arr[0].length - 1;

        while (left <= right && top <= bottom) {
            //Left → Right (top row)
            for (int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;

            //Top → Bottom (right column)

            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;


            //Right → Left (bottom row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }


            // Bottom → Top (left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;

    }
}