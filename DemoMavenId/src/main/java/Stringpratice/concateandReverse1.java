package Stringpratice;

// Given two strings S1 and S2 as input. 
//Your task is to concatenate two strings and then reverse the string. 
//Finally print the reversed string.
public class concateandReverse1 {

	public static void concateandReverse() {

		String s1 = "Rabiul";
		String s2 = "Uzzaman";

		String s3 = s1.concat(s2);

		System.out.println("original string after concate: " + s3);

		StringBuffer sb = new StringBuffer(s3);
		sb.reverse();
		System.out.println("after revering the string " + sb);

	}

	public static void main(String[] args) {
		concateandReverse();

		int count = 0;
		for (int i = 0; i <= 5; i++) {
			if (i == 3) {
				count = count + i;
				break;
			} else {
				count = count + i;

			}

		}

		System.out.println("Total count is:  " + count);
	}

}
