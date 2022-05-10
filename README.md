# design-patterns-studty
<h2>1.생성패턴</h2>

1.싱글톤 패턴
인스턴스를 오직 한개만 제공하는 클래스 
- 시스테 런타임 환경 세팅에 대한 정보 등 인스턴스가 여러개 일 때 문제가 생길 수 있는 경우가 있다. 인스턴스를 오직 한개만 만들어 제공하는 클래스가 필요하다

실무
* 스프링에서 빈의 스코프 중에 하나로 싱클톤 스코프
* 자바 java.lang.Runtime
* 다른 디자인 패턴(빌더, 퍼사드, 추상 팩토리등) 구현체의 일부로 쓰이기도 한다.
 
 
 
 
2. 팩토리 메소드 패턴 
- 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
- 다양한 구현체가 있고 그중에서 특정한 구현제를 만들 수 있는 다양한 팩토리를 제공할 수 있다.


