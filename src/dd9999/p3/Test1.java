package dd9999.p3;

class A{
	
	public String Solution(int n){
		String answer = "";
		
		for(int i=1; i<=n;i++) {
			if(n>10000) {
				break;
			} else if(i%2 == 1) {
				answer += "수";
			} else {
				answer += "박";
			}
		}
        System.out.println(answer);
		return answer;
	}
	
}

public class Test1 {
	public static void main(String[]args) {
		A a = new A();
		a.Solution(3);
		a.Solution(4);
		a.Solution(10000);
		a.Solution(10001);
		
	}


}
