/* IMPORTANT: Multiple classes and nested static classes are supported */

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {

static int cntSubSeq(int arr[], int n) 
{ 
	// To store the count of positive 
	// elements in the array 
	int pos_count = 0; 

	// To store the count of negative 
	// elements in the array 
	int neg_count = 0; 

	int result; 

	for (int i = 0; i < n; i++) 
	{ 

		// If the current element 
		// is positive 
		if (arr[i] > 0) 
			pos_count++; 

		// If the current element 
		// is negative 
		if (arr[i] < 0) 
			neg_count++; 
	} 

	// For all the positive 
	// elements of the array 
	result = (int) Math.pow(2, pos_count); 

	// For all the negative 
	// elements of the array 
	if (neg_count > 0) 
		result *= Math.pow(2, neg_count - 1); 
	else
		result = 0 ; 

	return result; 
} 

// Driver code 
	public static void main(String[] args) throws IOException 
	{ 
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int t = br.read();
		while(t>0){
			int size = br.read();
			int myArray[] = new int [size];
			
			for(int i = 0; i<size; i++) {
				myArray[i] = br.read();
			}
			System.out.print(myArray);
			System.out.print(cntSubSeq(myArray, size)); 
			t--;
		}
	}    
} 

// This code is contributed by ANKITKUMAR34 

