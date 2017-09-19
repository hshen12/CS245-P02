//referenced by: http://www.geeksforgeeks.org/merge-sort/


public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		sort(a, 0, a.length-1);
	}

	private void sort(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		if(left < right) {
			int mid = (left+right)/2;
			sort(a, left, mid);
			sort(a, mid+1, right);
			
			merge(a, left, mid, right);
		}
		
		
	}

	private void merge(int[] a, int left, int mid, int right) {
		// TODO Auto-generated method stub
		
		int m = mid-left+1;
		int n = right-mid;
		
		int[] leftArr = new int[m];
		int[] rightArr = new int[n];
		
		for(int i = 0; i < m; ++i) {
			leftArr[i] = a[left+i];
			
		}
		for(int j = 0; j < n; ++j) {
			rightArr[j] = a[mid+1+j];
		}
		
		int i = 0;
		int j = 0; 
		
		int k = left;
		while(i < m && j < n) {
			if(leftArr[i] <= rightArr[j]) {
				a[k] = leftArr[i];
				i++;
			}else {
				a[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i < m) {
			a[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < n) {
			a[k] = rightArr[j];
			j++;
			k++;
			
		}
		
		
		
	}




}
