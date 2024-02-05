import java.util.Scanner;

public class PerformOperations {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		System.out.println("---------------------------Operations-------------------------------");
		System.out.println("1.Insert Values.");
		System.out.println("2.DisplayForward.");
		System.out.println("3.DisplayReverse.");
		System.out.println("--------------------------------------------------------------------");
		
		 Scanner scanner = new Scanner(System.in);
		 int val,i,n;
		 
		 while(true) {
			 
			System.out.println("Enter Option");
			int choice = scanner.nextInt();
			
			switch(choice) {
			 case 1:System.out.println("Enter How Many Values You  Want To Assign:");
			 		n = scanner.nextInt();
			 		for(i=0;i<n;i++) {
			 			val = scanner.nextInt();
			 			list.InsertVal(val);
			 		}
			 		break;
			 		
			 case 2:list.displayforw();
			 		break;
			 		
			 case 3:list.displayrev();
			 		break;
			 		
			 default:System.out.println("Invalid Number");
			 
			 }
			 
			 
		 }
		 
	}

}
