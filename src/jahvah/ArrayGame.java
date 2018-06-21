package jahvah;

import java.util.*;

public class ArrayGame {
	public static boolean canWin(int leap, int[] game) {	
		
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		
		stack.push(0);
		
		while(!stack.isEmpty()) {
			int index = stack.pop();
			if(index < 0 || game[index] == 1) {
				continue;
			}
			if((index + 1 == game.length - 1 && game[index + 1] != 1) || index + leap > game.length - 1) {
				return true;
			}
			game[index] = 1;
			stack.push(index + 1);
			stack.push(index - 1);
			stack.push(index + leap);
		}
		
		return false;
		
//		boolean win = false;
//		try {
//		for(int i = 0; i < game.length; i++) {
//			if(game[i + leap] == 0) {
//				for(int j = i+leap; j > 0; j--) {
//					if(game[j]==1) {
//						j+=1;
//						i=j;
//						break;
//					}
//				}
//			}
//		}
//		}
//		catch(Exception e) {
//			win = true;
//		}
//		return win;
		
		
//		// Return true if you can win the game; otherwise, return false.
//		boolean win = true;
//		try {
//			for (int j = 0; j < game.length; j++) {
//				if (game[j + 1] != 0) {
//					if (leap <= 0) {
//						win = false;
//						break;
//					}
//					if (game[j + leap] == 0) {
//						j = j + leap - 1;
//					} else {
//						int k;
//						for (k = j; k >= 0; k--) {
//							if (game[k] == 0) {
//								if (game[k + leap] == 0) {
//									k = k + leap;
//									if (k > j) {
//										j = k;
//									} else {
//										win = false;
//									}
//									break;
//								}
//							} else {
//								win = false;
//								break;
//							}
//						}
//						if (k == -1) {
//							win = false;
//						}
//					}
//				}
//				if (!win) {
//					break;
//				}
//			}
//		} catch (Exception e) {
//			// win = true;
//		}
//		return win;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}
			//System.out.print(q + " " + n + " " + leap);
			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}
}
