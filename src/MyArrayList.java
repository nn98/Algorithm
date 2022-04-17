
public class MyArrayList {
	private int[] listArray;
	private int listLength;

	public MyArrayList(int capacity) {
		listArray=new int[capacity];
		listLength=0;
	}
	private void copy(int[] origin, int[] renew) {
		for (int i = 0 ; i < listLength ; i++) {
			renew[i] = origin[i];
		}
	}

	public void add(int item) {

		listArray[listLength]=item;
		listLength++;

	}
	@Override
	public String toString() {
		String result="(";
		for(int i=0;i<listLength-1;i++) {
			result+=listArray[i];
			result+=",";
		}
		result+=listArray[listLength-1];
		result+=")";
		return result;
	}
	public void add(int index, int item) {
		if (index >= listLength) { // add
			add(item);

		} else { // insert
			int[] backupListArray = new int[listArray.length];

			copy(listArray, backupListArray);

			listArray[index] = item;
			listLength++;

			for (int i = index ; i < listLength ; i ++) {
				listArray[i + 1] = backupListArray[i];
			}
		}
	}

	public int remove(int index) {
		int ret = listArray[index];
		int[] backupListArray = new int[listArray.length];

		copy(listArray, backupListArray);

		listArray[index] = listArray[index + 1];
		listLength--;

		for (int i = index + 1 ; i < listLength ; i ++) {
			listArray[i] = backupListArray[i+1];
		}

		return ret;

	}

}
