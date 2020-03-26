
import java.util.ArrayList;

public class MainClass {//String에 대해 자세히 들어가
	
	public static void main(String[] args) {
/* 문제 1. 위의 str 데이터 중 "HTML5"과 "하이브리드앱"라는 단어가 몇번 노출되는 지

노출 횟수를 resultNum이라는 배열명으로 저장하여 출력

​

1.검색키워드 변수에 저장 String keyword1="HTML5";

String keyword2="하이브리드앱";

2.전체 데이터를 띄어쓰기("")기준으로 분리

String[] split = dc.newsList.get(0).news.split("");

2-1. dc: DataClass dc = new DataClass()'

2-2. newClass : ArrayList<NewsClass> newList = new ArratList<NewsList>();

2-3. get(0) : ArrayList 내의 데이터를 추출하는 메소드(현재 add()된 객체가 1개이므로)

2-4 news: NewsClass 객체의 멤버 변수(즉 실제 기사인 문자열로 저장)

2-5. split("") : 전체 기사에 단어들이 띄어쓰기로 구분 되어 있으므로

2-6 String[] split = : String 의 split()는 반환 형태가 String 배열이므로

3. 키워드를 찾을 때마다 1씩 증가 시킬 배열 선언,키워드가 두 개이므로 배열의 크기(길이)를 두개로 설정 단 1씩 증가해야하므로 초기값을 0으로 설정

resultNum[0]:"HTML5"을 찾을 때마다 1씩증가(resultNum[0]++)==(resultNum[0]=resultNum[0]+1;)

resultNum[1]:"하이브리드앱"을 찾을 때마다 1씩증가

int[] resultNum={0,0};

4.분리괸 단어들과 키워드를 비교검색

for(int i=0;i<Spilit.length;i++{

if(split[i].contains(keyword1)){//"HTML5"

resultNum[0]++;

}

}

for(int i=0;i<Spilit.length;i++{

if(split[i].contains(keyword2)){//"하이브리드앱"

resultNum[1]++;

}

}

5.검색결과 출력

syso(keyword1+":"+resultNum[0]);

syso(keyword2+":"+resultNum[1]);*/
			DataClass dc= new DataClass();
					
			String keyword1="HTML5";
			String keyword2="하이브리드앱";
			String[] split = dc.newsList.get(0).news.split(" ");
			int[] resultNum=new int[2];
	
			resultNum[0]=0;
			resultNum[1]=0;
			//int[] resultNum={0,0};
	
			for(int i=0;i<split.length;i++){
				if(split[i].contains(keyword1)){//"HTML5"
					resultNum[0]++;
				}	
				if(split[i].contains(keyword2)){//"HTML5"		
					resultNum[1]++;
					}
			}

			System.out.println(keyword1+":"+resultNum[0]);
			System.out.println(keyword2+":"+resultNum[1]);
//문제 2. 위의 str 데이터를 모두 역순(space기준)으로 
// resultStr 변수저장하여 출력
//오름차순 내림차순 할때 이것을 쓴다.
			String[] resultStr = new String[split.length];
			int index = split.length-1;
			
			for(int i=0;i<resultStr.length;i++){
				resultStr[i]=split[index];
				index--;
			}

//역순 출력
			
			for(int i=0;i<resultStr.length;i++){	
				System.out.println(resultStr[i]);
				}
			}
}