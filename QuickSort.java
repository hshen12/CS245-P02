
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		
		qsort(a, 0, a.length-1);
	}

	private void qsort(int[] a, int top, int bot) {
		// TODO Auto-generated method stub
		
		int point = pathiton(a, top, bot);
		if(top < point-1) {
			qsort(a, top, point-1);
		}
		if(bot > point) {
			qsort(a, point, bot);
		}
		
		
	}

	private int pathiton(int[] a, int top, int bot) {
//		System.out.println(top);
		// TODO Auto-generated method stub
		int i = top; 
		int j = bot;
		int point = (top+bot)/2;
		while(i <=j) {
			while(a[i] < a[point]) {
				i++;
			}
			while(a[j] > a[point]) {
				j--;
			}
			
			if(i <= j) {
		
			
				if(i == point) {
					point = j;
				}else if(j == point) {
					point = i;
				}
				swap(a, i, j);
				i++;
				j--;
			}

		}
		return i;
	}
	
	
	public void swap(int[] a, int i, int j) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	

}
