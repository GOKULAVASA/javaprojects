package javaMock;

public class compare_Three_intArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,5};
		int b[]= {1,2,4,5,8,3,9};
		int c[]= {1,2,4,5,4,5,8,10};

		int result= findGreatestUnique(a,b,c);
		System.out.println(result+"  "+"idhan periya number ");


	}
	public static int findGreatestUnique(int aa[],int bb [],int cc[]) {

		int max=Integer.MIN_VALUE;
		for (int num :aa) {
			if(num>max && !isDuplicate(num, bb)&& !isDuplicate(num,cc)) {
				max=num;
			}
		}

		for (int num :bb) {
			if(num>max && !isDuplicate(num, cc)&& !isDuplicate(num,aa)) {
				max=num;
			}
		}

		for (int num :cc) {
			if(num>max && !isDuplicate(num, aa)&& !isDuplicate(num,bb)) {
				max=num;
			}
		}
		return max;
	}

	public static boolean isDuplicate(int num ,int arr[]) {
		int count =0;
		for(int values: arr) {
			if(values==num) {
				count++;
			}
		}
		return count>1;
	}

}
