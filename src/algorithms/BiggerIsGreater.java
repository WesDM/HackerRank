package algorithms;

public class BiggerIsGreater {
	static String biggerIsGreater(String w) {
		// Complete this function

		String noAnswer = "no answer";

		if (w == null || w.length() <= 1) {
			return noAnswer;
		}

		String originalWord = w;

		int swapIndex = 0;
		for (int i = w.length() - 1; i >= 1; i--) {
			if (Character.compare(w.charAt(i), w.charAt(i - 1)) > 0) {
				swapIndex = i - 1;
				break;
			}
		}

		for (int i = w.length() - 1; i >= 1; i--) {
			if (Character.compare(w.charAt(swapIndex), w.charAt(i)) < 0) {
				w = String.valueOf(swap(w, swapIndex, i));
				String lastPart = w.substring(swapIndex + 1, w.length());
				String lastPartReversed = new StringBuilder(lastPart).reverse().toString();
				w = w.substring(0, swapIndex + 1) + lastPartReversed;
				break;
			}
		}

		if (originalWord.equalsIgnoreCase(w)) {
			return noAnswer;
		}

		return w;
	}

	static char[] swap(String str, int i, int j) {
		char ch[] = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return ch;
	}

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// int T = in.nextInt();
		// for(int a0 = 0; a0 < T; a0++){
		String w = "zalqxykemvzzgaka";// in.next();
		String result = biggerIsGreater(w);
		System.out.println(w.compareTo(result));
		System.out.println(result);
		// }
		// in.close();
	}
}
