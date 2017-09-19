
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		
		
		for(int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i-1;
			
			for( ; j >= 0 && a[j] > temp; j--) {

//				int temp = a[j];
//				if(a[j] > temp) {
					a[j+1] = a[j];
//				}
				
			}
			a[ j+1] = temp;
		}
	}

}
