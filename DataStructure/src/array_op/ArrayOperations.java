package array_op;

public class ArrayOperations {
	
	private int[] array;
	private int size;	//Size of the array
	private int index;	//Points to the next empty space in the array
	
	public ArrayOperations(int size) {
		super();
		this.size = size;
		this.array = new int[size];
	}

	void insertBegin(int element) {
		if (index == size) {
			System.out.println(element + " can't be inserted as the array is full");
		} else if (index == 0)    //If the array is completely empty
		{
			array[index++] = element;
		} else {
			for (int i = index; i > 0; i--)
				array[i] = array[i - 1];    //Shifting the elements from beginning

			array[0] = element;
			index++;    //Incremented as it always points to last element
		}

	}
	
	void insertEnd(int element) {
		if (index == size) {
			System.out.println(element + " can't be inserted as the array is full");
		} else {
			array[index++] = element;
		}

	}

	/**
	 * @param element  item to be inserted in array
	 * @param pos position number where the element to be inserted (1-based)
	 */
	void insertAny(int element,int pos)
	{
		pos--;

		if(!(pos >= 0 && pos <= index))
			System.out.println("Invalid position specified");
		else if(index == array.length)
		{
			System.out.println("Array is full...shifting of element is not possible hence replacing the element at "+(pos + 1 ));
			array[pos] = element;
		}
		else if (index == pos)
			array[index++] = element;
		else
		{
			for(int i = index ;i>pos;i--)
				array[i] = array[i-1];

			array[pos] = element;
			index++;
		}
	}
	
	void display() {
		if (array.length == 0 || index == 0) {
			System.out.println("Array is empty..nothing to display");
		} else {
			for (int i = 0; i < index; i++)
				System.out.print(array[i] + "\t");
		}

	}

	int deleteBegin() {
		int retVal = 0;
		if (index == 0)
			retVal = -999;
		else if (index == 1)
		{
			retVal = array[0];
			index--;
		}
		else {
			retVal = array[0];
			for (int i = 1; i < index; i++)
				array[i - 1] = array[i];
			index--;
		}
		return retVal;
	}

	int deleteEnd()
	{
		int retVal = 0;
		if(index == 0)
			retVal = -999;
		else
			retVal = array[--index];

		return  retVal;
	}

	int deleteAny(int pos)
	{
		int retVal = 0;
		pos--;
		if(!(pos >= 0 && pos <= index))
			System.out.println("Invalid position specified.");
		if(index == 0)
			retVal = -999;
		else if( pos+1 ==index)
		{
			retVal = array[pos];
			index--;
		}
		else
		{
			retVal = array[pos];
			for (int i = pos;i<index-1;i++)
				array[i] = array[i+1];

			index--;
		}

		return  retVal;
	}
}
