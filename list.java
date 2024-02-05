import java.util.Scanner;

class Operations{
	private int arr[],size,i,capacity;
	private static final int InitialCapacity = 5;
	
Operations(){
	@SuppressWarnings("unused")
	int size = 0;
	arr = new int[InitialCapacity];
	capacity = InitialCapacity;
}

private void expandCapacity() {
	capacity = capacity*2;
	arr = java.util.Arrays.copyOf(arr,capacity);
}

public void addValue(int val) {
	
	if(size == capacity) {
		expandCapacity();
	}
	arr[size] = val;
	size++;
}

public void display() {
	System.out.println("Elements in the List:");
	for(i=0;i<size;i++) {
		System.out.print(arr[i] + " ");
	}
}
	
public void InsertAtPos(int pos,int val) {
	if(size == capacity) {
		expandCapacity();
	}
	
	for(i=size-1;i>=pos;i--) {
		arr[i+1] = arr[i];
		
	}
	
	arr[pos] = val;
	size++;
	
}

public void DeleteAtPos(int pos){
	for(i=pos;i<size;i++) {
		arr[i] = arr[i+1];
	}
	size--;
}

public void DeleteAtEnd() {
	size--;
}

public void DeleteAtBegi() {
	for(i=0;i<size;i++) {
		arr[i] = arr[i+1];
	}
	size--;
}
	
public void InsertAtBegi(int val) {
	for(i=size-1;i>=0;i--) {
		arr[i+1]=arr[i];
	}
	arr[0] = val;
	size++;
}

public void GetIndex(int val) {
	for(i=0;i<size;i++) {
		if(val == arr[i]) {
			System.out.println("Index is:" + i);
		}
	}
}

public void Update(int pos,int val) {
	arr[pos] = val;
	
}

public void SearchVal(int val) {
	int isTrue =0;
	for(i=0;i<size;i++){
		isTrue =0;
		if(val == arr[i]) {
			isTrue =1;
		}
	}
	
	if(isTrue == 1) {
		System.out.println("Yes your Value Presented In This Array");
	}
	
	else {
		System.out.println("No your Value is Not Presented In This Array");
	}
}

public void Clear() {
	size = 0;
}
	
}

public class list {
	public static void main(String[] args) {
		int val,pos,choice;
		
		Scanner scanner = new Scanner(System.in);
		
		Operations o = new Operations();
		
		System.out.println("\n--------------------------------------Operations--------------------------------------");
		System.out.println("1.Insert a Value.");
		System.out.println("2.Display Values Of the List.");
		System.out.println("3.Insert a Value At Specified Position.");
		System.out.println("4.Delete a Value At Specified Position.");
		System.out.println("5.Delete At End.");
		System.out.println("6.Delete At Beginning.");
		System.out.println("7.Insert At Beginning.");
		System.out.println("8.get(Index).");
		System.out.println("9.Update(Index).");
		System.out.println("10.Search Value.");
		System.out.println("11.Clear.");
		System.out.println("--------------------------------------------------------------------------------------\n");
		
		while(true) {
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1:System.out.print("Number Of Values:");
				int n = scanner.nextInt();
				System.out.println("Enter Values:");
				for(int i=0;i<n;i++) {
					val = scanner.nextInt();
					o.addValue(val);
				}
				
				break;
			   
		case 2:o.display();
			   break;
			   
		case 3:System.out.println("Enter Position");
				pos = scanner.nextInt();
				if(pos<0) {
				  System.out.println("Invalid Position");
				}
				System.out.println("Enter Value");
				val = scanner.nextInt();
				o.InsertAtPos(pos,val);
				break;
			  
		case 4:System.out.println("Enter Position");
		 		pos = scanner.nextInt();
		 		if(pos<0) {
		 			System.out.println("Invalid Position");
		 		}
		 		o.DeleteAtPos(pos);
		 		break;
			   
		case 5:o.DeleteAtEnd();
		   		break;
		   		
		case 6:o.DeleteAtBegi();
   				break;   		
		   
		case 7:System.out.println("Enter Value");
				val = scanner.nextInt();
				o.InsertAtBegi(val);
		   		break;
		   
		case 8:System.out.println("Enter Value");
				val = scanner.nextInt();
				o.GetIndex(val);
		   		break;
		   
		case 9:System.out.println("Enter Position");
				pos = scanner.nextInt();
				if(pos<0) {
					System.out.println("Invalid Position");
				}
				System.out.println("Enter Value");
				val = scanner.nextInt();
				o.Update(pos,val);
		   		break;
		   
		case 10:System.out.println("Enter Value");
				val = scanner.nextInt();
				o.SearchVal(val);
		   		break;
		   
		case 11:o.Clear();
		   		break;
		case 12:System.exit(0);
				scanner.close();
			  
		default:System.out.println("Invalid Choice");	   
		}
		
		}
		
	}

}

