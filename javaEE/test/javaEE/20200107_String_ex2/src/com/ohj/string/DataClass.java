package com.ohj.string;

import java.util.ArrayList;

public class DataClass {
	
	
	ArrayList<NewsClass> newsList=new ArrayList<NewsClass>();
	
	public DataClass() {
		String str="[지디넷코리아]"+
				"IT서비스 '빅3'가 기존 소프트웨어(SW)개발방식에 웹기술이 확산될 것이란 공통 전망을 내놨다. 삼성SDS, LG CNS, SK C&C 모두 자체 기술과 해외 오픈소스 및 상용 솔루션을 접목해 향후 늘어날 것으로 보이는 프로젝트 수요에 대응할 뜻을 밝혔다."+
				"15일 업계에 따르면 3사가 맡고 있는 프로젝트에 센차터치와 ExtJS, 제이쿼리(jQuery)와 제이쿼리모바일, 티타늄과 폰갭과 앱스프레소 등 이미 상용화된 개발프레임워크가 일부 도입됐거나 관련 문의가 다수 들어온 것으로 확인됐다."+ 
				"SK C&C는 티타늄, 폰갭, 앱스프레소는 국내시장서 역할이 크지 않지만 중국서 사전영업 지원시 고객들로부터 관심을 받고 있는 기술들이라고 묘사했다. 무료버전 모바일 애플리케이션(이하 '앱') 개발환경으로 지금처럼 모바일웹과 앱개발 환경이 발전하고 시장 성숙도가 높아지는 시기에 그 활용이 늘 거란 전망이다. "+
				"삼성SDS는 티타늄, 폰갭, 앱스프레소같은 '하이브리드프레임워크'가 도입비용 감소, 운영 효율화를 요구하는 시장 상황에서 발생한다고 설명했다. 단일 소스코드로 여러 단말기를 지원시 장점이 있다는 분석이다. 현재 윈도가 정복한 PC와 달리 모바일에는 iOS와 안드로이드 등 여러 운영체제(OS)가 존재한다는 이유에서다. "+
				"LG CNS는 상용솔루션인 센차터치와 오픈소스인 제이쿼리모바일이 현재 모바일시장에서 가장 대표적인 HTML5 자바스크립트 프레임워크라고 평했다. 2가지 기술에 장단점이 있어 프로젝트 상황에 따라 선택적으로 활용하게 된다고 덧붙였다. 어도비의 폰갭은 하이브리드앱 개발 프레임워크에 속하며 역시 종종 도입된다고 언급했다."+ 
				"■모바일오피스-스마트워크로 기업시장에 확산되는 웹기술 "+
				"하이브리드앱 개발기술과 UI프레임워크는 HTML5 표준과 자바스크립트같은 웹기술로 SW를 만들 수 있게 해주는 도구지만 현업에서는 용도가 구별된다. "+
				"우선 제이쿼리와 센차터치 등 UI프레임워크는 SW사용자가 접하는 단말기 표시화면과 반응체계 등 UI 개발을 간편케 해주는 용도다. 개인 개발자와 중소규모 앱개발사가 모바일앱을 만들면서 여러 단말기에 맞춰 UI를 개발할 수 있게 돕는 기술로 쓰이기 시작했다. "+
				"국내 기업시장으로의 도입이 표면화된 건 최근이다. 지난해부터 미래웹기술연구소는 센차와 손잡고 그 기술 공인교육을 진행중이다. 모바일솔루션업체 인크로스도 제이쿼리파운데이션과 손잡고 제이쿼리 개발자 생태계 확산에 나서며 연계된 웹앱개발 솔루션 '다빈치스튜디오'도 선보였다. 전문 기술인력과 잘 정비된 툴을 요구하는 시장수요에 대응하는 차원으로 이해된다."+ 
				"그리고 하이브리드앱 기술은 상이한 단말 운영체제(OS)나 단말 플랫폼 등에 한 번에 대응하는 SW개발을 지원한다. 어도비가 폰갭을, KTH가 앱스프레소를 들고 저변확대에 나섰다. "+
				"하이브리드앱 기술은 지난 2011년부터 관심을 모은 모바일 전사 앱플랫폼(MEAP)이라 불리는 기업용 솔루션의 장점과 일부 겹치는 것처럼 비치기도 한다. 하지만 실제로 2가지 기술은 상호보완적이다. MEAP 솔루션에는 전통적인 애플리케이션수명주기(ALM) 관점의 역할이 더 크게 요구된다. 기업내 SW개발조직이 모바일앱 개발을 기존 솔루션 지원처럼 체계적으로 맡을 때 쓰이는 것이다."+ 
				"■같은 듯 다른 하이브리드앱 개발 대응전략 "+
				"당장 하이브리드앱 개발 기술의 실사용이 아주 많은 상황이라고 단정하긴 어려울 수도 있다. 기술 수요에 대해 3사가 인지하는 온도차를 보인다. 하지만 새해 HTML5와 자바스크립트 기술을 활용하는 웹기반 프레임워크 도입이 산업계 프로젝트에 늘어날 것이란 전망은 맥을 같이 한다. 자체 MEAP 솔루션과 외부 하이브리드앱 개발기술의 접목을 시도하는 노력도 진행형이다. "+
				"SK C&C는 고객들의 문의가운데 자사 '넥스코어모바일플랫폼(NMP)'과의 호환성 측면에 대한 질문이 적잖다고 밝혔다. 실제 도입환경에선 NMP의 라이브러리와 오픈소스 기술 혼용사례가 많고 개발조직내 경험에 따라서 상용 솔루션도 쓰인다고 설명했다. 향후 오픈소스 활용이 늘고 곧 데스크톱 웹앱 영역에서도 HTML5 프레임워크 활용이 주류를 형성할 것이라고 전망했다. "+
				"삼성SDS도 이런 기술 도입은 일시적 현상이 아니라 더 늘어난다는 예상을 내놨다. 모바일 환경에서 여전히 제조사별 OS와 플랫폼간 특성차 때문이다. 향후 윈도폰 등 신규OS를 채택한 단말기 출시도 줄을 이을 전망이고 같은 안드로이드OS도 제조사별 구동환경이 조금씩 다른 상황이라는 근거를 들었다. 다만 자체 기술개발이나 향후 대응계획은 구체적으로 언급하지 않았다."+
				"LG CNS 진단은 비교적 구체적이다. 그에 따르면 HTML5가 표준화될 때까지 향후 2~3년간 하이브리드앱 개발 프레임워크에 대한 수요가 이어지다, 일부 사라지는 기술도 나타난다. 업계엔 순수하게 HTML5를 지원하는 프레임워크만 남는다. 회사는 이에 대비해 오픈소스와 상용솔루션 활용과 더불어 자체 UI플랫폼 '디브온M스크린'과 하이브리드앱 플랫폼 'MXP'솔루션 개발에 주력했다고 밝혔다."+
				"개인 개발자와 중소규모 벤처업체들의 웹기술 활용이 주로 B2C 시장을 겨냥한 모바일 플랫폼 대응에 그쳤다면, 이같은 주요 IT서비스업체들의 전략은 그 주 고객층인 대규모 조직들의 PC기반의 전통적 업무환경과 만나는 스마트폰, 태블릿간의 연계성 요구에 따른 것으로 이해된다."+
				"모바일과 노트북 및 데스크톱을 넘나드는 환경에서 다양한 사용자 환경과 단말기 특성차를 최소화하는 해법으로 웹표준 기술과 그 활용을 도와주는 개발플랫폼의 중요성이 점차 강조될 전망이다. 업계에 따르면 삼성SDS와 LG CNS가 사용중인 센차터치와 ExtJS 유료 버전이 마이크로소프트(MS) 윈도폰과 삼성 타이젠을 지원할 가능성도 있는 것으로 알려졌다."+
				"Copyright ⓒ 2012 CBS Interactive Inc.";

	newsList.add(new NewsClass(str));//arratList에 추가가 되어있음 NewsClass n에 저장된 것을 가져온다.
	}

	
	
}
