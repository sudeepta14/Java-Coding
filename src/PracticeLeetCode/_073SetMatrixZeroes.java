package PracticeLeetCode;

import java.util.Arrays;

public class _073SetMatrixZeroes {
	public static void main(String[] args) {
		setZeroes(new int[][]{{0},{1}
		/*{1,0,1,1},
			{1,1,1,1},
			{1,1,0,1},
			{0,1,1,1}*/
		/*			{0,0,0,5},
			{4,3,1,4},
			{0,1,1,4},
			{1,2,1,3},
			{0,0,1,1}*/
		});
	}

	public static void setZeroes(int[][] matrix) {
		if(matrix==null||matrix.length==0)
			return;
		boolean firstRow=false,firstCol=false;
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[0][i]==0)
			{
				firstCol=true;
				break;
			}
		}
		for (int i = 0; i < matrix[0].length; i++) {
			if(matrix[i][0]==0)
			{
				firstRow=true;
				break;
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if(matrix[i][j]==0)
				{
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if(matrix[i][0]==0||matrix[0][j]==0)
				{
					matrix[i][j]=0;
				}
			}
		}
		if(firstRow)
		{
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[0][i]=0;
			}
		}
		if(firstCol)
		{
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0]=0;
			}
		}
	}
}
