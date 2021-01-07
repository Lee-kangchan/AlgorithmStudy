package Sort.src.q2751;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
// 수 정렬하기 (퀵정렬)
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = sc.nextInt();
		
		int A[] = new int[T];
		for (int i = 0 ; i<T ; i ++) {
			A[i]=sc.nextInt();	
		}
		quickSort(A,0,T-1);
		for (int i = 0 ; i<T ; i ++) {
			System.out.println(A[i]);	
		}
		

	}
	private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

	static void quickSort(int[] nums, int left, int right) {
        int pl = left;
        int pr = right;
        int x = nums[(pl + pr) / 2];

        do {
            while (nums[pl] < x) pl++;
            while (nums[pr] > x) pr--;
            if (pl <= pr)
                swap(nums, pl++, pr--);

        } while (pl <= pr);
        if (left < pr) quickSort(nums, left, pr);
        if (right > pl) quickSort(nums, pl, right);
    }}

