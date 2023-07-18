package dd9999.p2;
import java.util.Scanner;

class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {		
		
		if(power == false) {
			System.out.println("전원을 킵니다");
		}else {
			System.out.println("전원을 끕니다");
		}
		
		power = !power;
		
		System.out.println(power);
		System.out.println();
	}
	
	void channelUp() {
		
		if(power == true) {
			channel++;
			System.out.println("채널 : "+channel);
		}else {
			System.out.println("전원부터 키세요");
		}
		
		System.out.println();
	}
	
	void channelDown() {
		
		if(power == true) {
			channel--;
			System.out.println("채널 : "+channel);
		}else {
			System.out.println("전원부터 키세요");
		}
		
		System.out.println();
    }
	
	void channelChange(int i) {
		
		if(power == true) {
			channel=i;
			System.out.println("채널 : "+channel);
		}else {
			System.out.println("전원부터 키세요");
		}
		
		System.out.println();
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Tv t =new Tv();
		int consol=0;
		
		for (int i=0; ;i++) { //while(true)가 효율 더 좋음
			                  //t/f만 검사하면되서 i++가 안굴러감
			System.out.println("전원버튼=1, 다음채널=2, "
					+ "이전채널=3, 직접입력=4, 시퀀스종료=5");
			consol = sc.nextInt();
			
			if(consol == 1) {
				
				t.power();
				
			}else if(consol==2){
				
				t.channelUp();
				
			}else if(consol==3) {
				
				t.channelDown();
				
			}else if(consol==4 && t.power==true) {
				
				System.out.println("채널을 입력하세요");
				int consol2 = sc.nextInt();
				t.channelChange(consol2);
				
			}else if(consol==4 && t.power==false) {
				
				System.out.println("전원부터 키세요");
				
			}else if(consol==5) {
				
				System.out.println("리모컨을 끕니다");
				break;
			}
		}
	}
}
