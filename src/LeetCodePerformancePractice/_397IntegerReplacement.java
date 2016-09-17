package LeetCodePerformancePractice;

public class _397IntegerReplacement {
	public static void main(String[] args) {
		System.out.println(integerReplacement(7));
	}

	public static int integerReplacement(int n) {
		return replacement(n,0);
	}

	private static int replacement(int n, int count) {
		if(n==1)
			return count;
		if(n%2==0)
			return replacement(n/2, count+1);
		else
			return Math.min(replacement(n+1, count+1), replacement(n-1, count+1));
	}
}
