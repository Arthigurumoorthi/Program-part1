package IQ;
public class DuplicationArray {
public static void main(String[] args) {
		String[] arr= {"Apple","Orange","Orange","Grapes"};
		System.out.print("Duplication in Fruit: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j <arr.length; j++) {
				if(arr[i]==arr[j])
			System.out.println(arr[j]);
				}
			
		}
	}

}
