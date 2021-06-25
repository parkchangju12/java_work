package java문제풀이1;
import java.util.Scanner;
public class Chapter7_11 {
	static int pow2(int n) {
		int result=1;
		for (int i=0; i<n; i++) {
			result *= 2;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x = sc.nextInt();
		System.out.print("n: ");
		int n = sc.nextInt();
		int pow2 = pow2(n);
		int result1, result2, result3, result4;
		
		System.out.print("[a] x * (2의"+n+"승)= ");
		result1 = x*pow2(n);
		System.out.println(result1);
		
		System.out.print("[b] x / (2의"+n+"승)= ");
		result2 = x/pow2(n);
		System.out.println(result2);
		
		System.out.print("[c] x <<"+ n+" = ");
		result3 = x<<n;
		System.out.println(result3);
		
		System.out.print("[c] x >>"+ n+" = ");
		result4 = x>>n;
		System.out.println(result4);
		
		if (result1 == result3) {
			System.out.println("[a]와 [c]의 값이 일치 합니다.");
		}
		if (result2 == result4) {
			System.out.println("[b]와 [d]의 값이 일치 합니다.");
		}
		sc.close();
	}

}
