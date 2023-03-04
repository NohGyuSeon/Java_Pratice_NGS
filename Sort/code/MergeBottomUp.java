package NGS.Sort.code;

public class MergeBottomUp {

	static int[] testArray = { 3, 6, 7, 3, 46, 34, 53, 3, 34, 67 };
	private static int[] sorted; // 합치는 과정에서 정렬하여 원소를 담을 임시배열

	public static void mergeSort(int[] array) {
		sorted = new int[array.length];
		mergeSort(array, 0, array.length - 1);
		sorted = null;
	}

	// Bottom-Up 방식 구현
	private static void mergeSort(int[] a, int left, int right) {
		/*
		 * 1 - 2 - 4 - 8 - ... 식으로 1부터 서브리스트를 나누는 기준을 두배씩 늘린다.
		 */
		for (int size = 1; size <= right; size += size) {
			/*
			 * 두 부분리스트를 순서대로 병합해준다. ex) 현재 부분리스트의 크기가 1(size=1)일 때 왼쪽 부분리스트(low ~ mid)와 오른쪽
			 * 부분리스트(mid+1 ~ high)를 생각하면 왼쪽 부분리스트는 low = mid = 0 이고, 
			 * 오른쪽 부분리스트는 mid+1부터 low + (2*size)-1 = 1이 된다.
			 * 
			 * 이 때, high가 배열의 인덱스를 넘어갈 수 있으므로 right와 둘 중 작은 값이 병합되도록 해야 한다.
			 */
			for (int l = 0; l <= right - size; l += (2 * size)) {
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(l + (2 * size) - 1, right);
				merge(a, low, mid, high); // 병합작업
			}
		}
	}

	/**
	 * 합칠 부분리스트는 a배열의 left ~ right 까지이다.
	 * 
	 * @param a     정렬할 배열
	 * @param left  배열의 시작점
	 * @param mid   배열의 중간점
	 * @param right 배열의 끝 점
	 */
	private static void merge(int[] array, int left, int mid, int right) {
		int l = left; // 왼쪽 부분리스트 시작점
		int r = mid + 1; // 오른쪽 부분리스트의 시작점
		int idx = left; // 채워넣을 배열의 인덱스

		while (l <= mid && right <= right) {
			/*
			 * 왼쪽 부분리스트 1번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을 경우 
			 * 왼쪽의 1번째 원소를 새 배열에 넣고 1과 idx를 1 증가시킨다.
			 */
			if (array[l] <= array[r]) {
				sorted[idx] = array[l];
				idx++;
				l++;
			}
			/*
			 * 오른쪽 부분리스트 r번째 원소과 왼쪽 부분리스트 1번째 원소보다 작을 경우
			 * 오른쪽 r번째 원소를 새 배열에 넣고 r과 idx를 1 증가시킨다.
			 */
			else {
				sorted[idx] = array[r];
				idx++;
				r++;
			}
		}
		
		/*
		 * 왼쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (l > mid)
		 * = 오른쪽 부분리스트 원소가 아직 남아있을 경우
		 * 오른쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
		 */
		if (l > mid) {
			while(r <= right) {
				sorted[idx] = array[r];
				idx++;
				r++;
			}
		}
		/*
		 * 오른쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (r > right)
		 * = 왼쪽 부분리스트 원소가 아직 남아있을 경우
		 * 왼쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
		 */  
		else {
			while(l <= mid) {
				sorted[idx] = array[l];
				idx++;
				l++;
			}
		}
		
		/*
		 * 정렬된 새 배열을 기존의 배열에 복사하여 옮겨준다.
		 */
		for (int i = left; i <= right; i++) {
			array[i] = sorted[i];
		}
	}
	
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printArray(testArray);
		mergeSort(testArray);
		printArray(testArray); 
   	}
	
}
