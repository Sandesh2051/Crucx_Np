package Lec_2;
import java.util.*;
public class Pattern_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		while (row <= n) {

			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// next Prep
			row++;
			System.out.println();
			star++;
		}
	}

}
