package practice;

public class Duplicate_Character_String {

	public static void main(String[] args) {

		String s = "Nehaa Yash Harsh Priya";
		char ch[] = s.toCharArray();
		int count;

		System.out.println(" Duplicate characters in a given string:  ");

		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}
			}
			if (count > 1 && ch[i] != '0')
				System.out.println(s + " contains " + ch[i] + " " + count + " times");
		}

	}
}
