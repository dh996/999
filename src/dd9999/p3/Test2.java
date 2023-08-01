package dd9999.p3;

import java.util.Arrays;



//https://school.programmers.co.kr/learn/courses/30/lessons/135808



class Solution_2{

	public int solution(int k, int m, int[] score) {
		

		boolean trg_1 = true;
		boolean trg_2 = true;
		boolean trg_3 = true;
		boolean trg_4 = true;
		int answer = 0;
		int o = 1;	

		for(int i=0; i<score.length-1; i++) {

			if(score[i]<1 | score[i]>k) {
				trg_1 = false;
				System.out.println("조건1 불만족");
			}
		}


		if(k<3 | k>9) {
			trg_2 = false;
			System.out.println("조건2 불만족");
		}

		if(m<3 | m>10) {
			trg_3 = false;
			System.out.println("조건3 불만족");
		}

		if(score.length<1 | score.length>1000000) {
			trg_4 = false;
			System.out.println("조건4 불만족");
		}
		

	if(trg_1==true && trg_2==true && trg_3==true && trg_4==true) {

		for(int i=0; i<score.length-1; i++) {

			int j;
			if(score[i]<score[i+1]) {

				j=score[i];
				score[i]=score[i+1];
				score[i+1]=j;
				System.out.print("정렬"+o+"회 ");
				System.out.println(Arrays.toString(score));
				o+= 1;
				i= -1;
			}
		}
		System.out.print("정렬 결과 ");
		System.out.println(Arrays.toString(score));

		int[] box = new int[m];

		for(int j=0; j<=score.length/m; j++) {

			int other[] = new int[score.length];

			for(int i=0; i<=score.length-1; i++) {

				if(i<=m-1) {
					box[i] = score[i];
				} else if(i>m-1){
					other[i-m] = score[i];
				} else if(score[m-1] == 0) {
					System.out.println("중단");
					break;
				}
			}
			
			System.out.print("박스 ");
			System.out.println(Arrays.toString(box));
			answer += (box[m-1]*m);
			System.out.println("중간값 "+answer);
			System.out.print("나머지 ");
			System.out.println(Arrays.toString(other));
			score = other;
		}
	}

	    System.out.println();
	    System.out.println( "결과값"+answer);
		return answer;
	}
}


public class Test2 {

	public static void main(String[]args) {

		Solution_2 s = new Solution_2();
		int[] sco = new int[] {1,2,3,1,2,3,1};
		s.solution(3,4,sco);
	}
}