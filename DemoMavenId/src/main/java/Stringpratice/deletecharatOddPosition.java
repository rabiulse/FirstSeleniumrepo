package Stringpratice;

public class deletecharatOddPosition {

	void deletecharatOddPosition1() {

		String s1 = "Rabiulsd34";
		System.out.println(s1);

		char[] chararray = s1.toCharArray();

		char[] newcharArray;

		System.out.println(chararray);
		for (int i = 1; i < chararray.length; i = i + 2) {
			// extract the odd position element and print it to console
			System.out.print(chararray[i]);
		}

		// System.out.println("aftreremoving element at odd position " + chararray);

	}

	static public void main(String[] args) {
		deletecharatOddPosition f = new deletecharatOddPosition();
		f.deletecharatOddPosition1();

	}

}
