/*  find the largest number by array 
 * if we want to find the smallest number in arrary need to change a[i]<a[j]
 * 
 * 
 */
public class Countingnumbers {
	public static int smallestnumber(int[] a, int total) {
		int temp;
		for (int i = 0; i <total; i++) {
			for (int j = i + 0; j < total; j++) {
				if (a[i] >a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 1];

	}

	public static void main(String[] args) {
		int a[] = { 86, 9, 1, 2, 98, 4 };
		int largestnumber = smallestnumber(a, 6);
		System.out.println(largestnumber);
	}

}
// 