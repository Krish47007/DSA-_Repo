package array_op;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOperationsMain {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of the array\n");
		
		int size = Integer.parseInt(br.readLine());
		
		ArrayOperations op = new ArrayOperations(size);
		
		while(true)
		{
			System.out.println("\n1. Insert Begin\n2.Insert End\n3.Insert at any pos\n4.Display" +
					"\n5. Delete Begin\n6. Delete End\n7. Delete at any pos\n8.Exit");
			System.out.println("\nEnter your choice");
			int ch = Integer.parseInt(br.readLine());
			
			switch (ch) {
			
			case 1: System.out.println("Enter element:\n");
					op.insertBegin(Integer.parseInt(br.readLine()));				
					break;
			case 2: System.out.println("Enter element: ");
					op.insertEnd(Integer.parseInt(br.readLine()));				
					break;
			case 3:	System.out.println("Enter element: ");
					int element = Integer.parseInt(br.readLine());
					System.out.println("Enter position ( 1-based) : ");
					int pos = Integer.parseInt(br.readLine());
					op.insertAny(element,pos);
					break;
			
			case 4:	op.display();
					break;

			case 5:	int retVal = op.deleteBegin();
					if (retVal == -999) {
						System.out.println("Array empty...nothing to delete ");
					} else {
						System.out.println("Deleted element is : " + retVal);
					}
					break;
			case 6:	 retVal = op.deleteEnd();
					if (retVal == -999) {
						System.out.println("Array empty...nothing to delete ");
					} else {
						System.out.println("Deleted element is : " + retVal);
					}
					break;
			case 7 : System.out.println("Enter position (1-based) : ");
			         retVal = op.deleteAny(Integer.parseInt(br.readLine()));
					if (retVal == -999) {
						System.out.println("Array empty...nothing to delete ");
					} else {
						System.out.println("Deleted element is : " + retVal);
					}
					break;
			case 8: System.exit(0);
				default:
				break;
			}
		}

	}

}
