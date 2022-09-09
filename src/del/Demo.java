package del;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;


public class Demo
{

	public static void main(String[] args) {
		Demo demo = new Demo();
		//demo.reverseString();
		//demo.trimStringSpaces();
		//demo.sortArray();
		//demo.sortArrLogic();
		demo.getLargestPalindrome();
	}

	private  void getLargestPalindrome() {
		String test = "bananas";
		char [] arr = test.toCharArray();
		StringBuilder sb = new StringBuilder();

		int largestK = 0;
		int largestJ = 0;

		for (int i = 0; i < arr.length ; i++) {
			//0...12
			for (int j = i+1; j <arr.length; j ++ ) {
				//1...12

				for (int k = 1; j+ k < arr.length; k++)
					if (arr[j - k] != arr[j + k]) {
						break;
					} else{
						if ( k > largestK){
							largestK  = k;
							largestJ = j;
						}

					}

			}
		}

		System.out.println("j = " + largestJ + ", k = " + largestK);
		for (int i = largestJ -largestK; i <= largestJ +largestK; i++ ){
			sb.append(arr[i]);
		}

		System.out.println("sb = " + sb);

	}
	private  void sortArrLogic(){
		int [] arr = {34,53,21,54,65,77,6,2,4};
		//int [] arr2 = new int[8];
		int x ;

		for (int i = 0; i < arr.length; i++){
			for (int j = i; j < arr.length; j++)
			if (arr[i] > arr[j]) {
				x= arr[i];
				arr[i] = arr[j];
				arr[j] = x;
			}
		}
		for(int k = 0; k < arr.length; k++){
			System.out.println(arr[k]);
		}
	}
	private void sortArray(){
		int [] arr = {34,54,21,54,65,77,4,2,4};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	private void trimStringSpaces(){
		String test = " reyt ";
		System.out.println(test.trim());
	}

	private void reverseString()
	{
		String test = "iurwueyiuwer312ksdjhs";
		char[] chars = test.toCharArray();
		StringBuilder sb = new StringBuilder();

		for(int i = chars.length-1; i >= 0; i--){
			sb.append(chars[i]);
		}

		System.out.println(sb);
	}


}