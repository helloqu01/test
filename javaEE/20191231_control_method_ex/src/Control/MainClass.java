package Control;

public class MainClass {
	public static void main (String [] args) {
		/*String[] code={"JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE","KR"};
		System.out.println(code[0]);//방을 지정하여 그 방에 값을 가져옴
		System.out.println(code.length);//배열의 총개수를 알수 있는 방법(length) 10개의 결과값을 가지고 있다.

		//일본(jp)지역에 근무(code)하고 있는 사원의 인원수를 알고 싶다. 찾을 때 마다 1씩 증가시킨다.count(int변수)누적값은 ;만 들어가면 안되며 0값을 넣어야한다. 
		//int count = 0;
		//count = count +1;

		//if문을 사용하는 법
		int count = 0;

		//문자를 서로 비교하여 같거나 다름을 나타 내려면 ==표시가 아니라 equals(기본적으로 제공해주는 '매소드'라고 부른다.)를 넣어 같음과 다름을 비교한다.
		// 코드 []방에 jp를 true와 false로 결과값을 내보낸다.

		if(code[0].equals("JP")){ //true
		count=count+1;//내용을 표시하는 것(개수를 셀 수 있도록)
		}

		if(code[1].equals("JP")){ //false 이 부분이 실행 불가로 됨
		count=count+1;
		}

		if(code[2].equals("JP")){ //true
		count=count+1;
		}

		if(code[3].equals("JP")){ //false
		count=count+1;
		}

		if(code[4].equals("JP")){ //false
		count=count+1;
		}

		if(code[5].equals("JP")){ //false
		count=count+1;
		}

		if(code[6].equals("JP")){ //false
		count=count+1;
		}

		if(code[7].equals("JP")){ //true
		count=count+1;
		}

		if(code[8].equals("JP")){ //false
		count=count+1;
		}

		if(code[9].equals("JP")){ //false
		count=count+1;
		}

		System.out.println(count);

		​
		// 좋은 코드는 남이 봤을 때 보기 편한 코드가 좋은 코드.(길지라도) 주석으로 내용을 적어주자.

		​

		//count=count+1;-> count++;로 나타낼 수 있다.
		if(code[9].equals("JP")){ //false
		count=count++;
		}

		//반복문 배우기 (for문)

		*/
		String[] code={"JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE","KR"};
		int[] age={27,34,28,26,41,28,42,29,29,32};

		/*1번 사원의 나이의 합
		int sum = 0;//누적을 시키는 것(합누적변수)

		//sum=sum+age[0];~~sum=sum+age[9];
		for(int a = 0; a < age.length; a++){//age 배열의 개수를 넣어야해서 age를 넣어야 함 
			sum = sum+age[a];
		}

		System.out.println("사원나이의 합 :"+sum);

		}*/
		
		//2번 국내("KR")에 근무라는 사원 나이의 합

		int sum = 0;//누적함수
		for(int m = 0; m < code.length; m++){//10번 반복 시키는 것
			if(code[m].equals("KR")){ //검색(for아님 if) 만약 KR이라면(실행이 됬다면)
				sum= sum+age[m];//그 age를 더하라(age의 m번방 값을 가져와라)
				}
			}

		System.out.println(sum);

		}
}
