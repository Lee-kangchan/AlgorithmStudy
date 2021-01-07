package heap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Heap1 {
	public static void heap(int[] data, int number) {
		for (int i = 1; i < number; i++) {
			int child = i;
			while (child > 0) {
				int parent = (child - 1) / 2;
				if (data[child] > data[parent]) {
					int temp = data[parent];
					data[parent] = data[child];
					data[child] = temp;
				}
				child = parent;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 9, 10, 12 };
		int K = 12;

		int a = solution(arr, K);
		System.out.println(a);

	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		for (int i = 0; i < scoville.length; i++) {
			que.offer(scoville[i]);
		}

		while (que.peek() <= K) {
			if (answer == scoville.length - 1) {
				return -1;
			}

			que.offer( que.poll() + (que.poll() * 2));
			answer++;
		}

		return answer;
	}

	public static int solution2(int[] scoville, int K) {
		int answer = 0;
		
		int a, b;
		while(true) {
			heap(scoville, scoville.length);
			if(scoville[0] > K) {
				break;
			}
			int result = scoville[0] + (scoville[1]*2);
			
		}
		return answer;
	}

}
