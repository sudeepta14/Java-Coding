package PracticeLeetCode;

import java.util.Arrays;

public class _048RotateImage {
	public static void main(String[] args) {
		rotate(new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}});
	}
	public static void rotate(int[][] matrix) {
		int n=matrix.length;
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < Math.ceil((double)n/(double)2); j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[n-1-j][i];
				matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
				matrix[j][n-1-i]=temp;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}

