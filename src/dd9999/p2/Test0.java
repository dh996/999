package dd9999.p2;
import java.util.Scanner;
public class Test0 {
	public static void main(String[] args) {
		{
			Scanner gcd =new Scanner(System.in);
			System.out.println("최소공배수 찾기");
			System.out.print("작은 수 입력 : ");
			int small = gcd.nextInt();
			System.out.print("큰 수 입력 : ");
			int big = gcd.nextInt();
			int i = small;
			int j = big;
			int lcm;
			for (int k = small;; k++) {
				if (k % small == 0 && k % big == 0) {
					lcm = k;
					break;
				}
			}
			System.out.println(lcm);
			for (int k = small;; k++) {
				if (k == lcm) {
					System.out.println("------------");
					System.out.printf("%d %d\n", k, k);
					System.out.printf("%d와%d의 최소공배수=%d\t", small, big, lcm);
					break;
				} else if (i<=lcm) {
					System.out.printf("%d %d\n", i, j);
				}
				i += small;
				j += big;
			}
			//gcd.close();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		{
			System.out.println("최대공약수 찾기");
			Scanner lcm =new Scanner(System.in);
			System.out.print("수 입력1 : ");
			int i = lcm.nextInt();
			System.out.print("수 입력2 : ");
			int j = lcm.nextInt();
			int min;
			if (i <= j) {
				min = i;
			} else {
				min = j;
			}
			int gcd=0;
			for (int k = 1; k <= min; k++) {
				if (i % k == 0 && j % k == 0) {
					gcd = k;
				}
			}
			System.out.println(i + "와" + j + "의 최대공약수="+gcd);
			//lcm.close();
		}
	}
}