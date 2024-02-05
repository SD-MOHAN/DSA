import java.util.Scanner;

public class processCheck {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int val,pos;
		LinkedList list = new LinkedList();
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("1.Insert Values.");
		System.out.println("2.Display.");
		System.out.println("3.Insert At Pos.");
		System.out.println("4.Get Input.");
		System.out.println("5.Delete At Position.");
		System.out.println("6.Update.");
		System.out.println("7.Reverse.");
		System.out.println("-----------------------------------------------------------");
		
		while(true) {
			System.out.println("Enter Option");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1: System.out.println("Enter How Many Values You Need To Insert:");
				   	int n=scanner.nextInt();
				   	for(int i=0;i<n;i++) {
				   		val = scanner.nextInt();
						list.InsertValues(val);
				   	}
				   	break;
				   	
			case 2: System.out.println("Values");
					list.display();
					break;
					
			case 3:System.out.println("\nEnter Pos And Value:");
					pos = scanner.nextInt();
					val = scanner.nextInt();
					list.InsertAtPos(pos,val);
					break;
					
			case 4:System.out.println("Enter Value");
					val = scanner.nextInt();
					list.getIndex(val);
					break;
			
			case 5:System.out.println("Enter Position");
					pos = scanner.nextInt();
					list.DeleteAtPos(pos);
					break;
			
			case 6:System.out.println("Enter Pos And Value");
					pos = scanner.nextInt();
					val = scanner.nextInt();
					list.UpdateVal(pos,val);
				   	break;
			
			case 7: list.reverse();
					System.out.println("Reversed List");
					break;
					
			default:System.out.println("Invalid Number");
			}
		}
		
	}

}
