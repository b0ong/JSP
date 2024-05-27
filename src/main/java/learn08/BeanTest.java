package learn08;

// 디폴트 생성자
// 멤버변수
// setter, getter
public class BeanTest {
	// 멤버변수
	private String name = "Adam";
	
	// getter & setter
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
}

/*
 * <jsp:useBean id="빈이름" class="자바빈 클래스 이름" scope="범위" />
 * <태그의 속성>id : JSP페이지에서 자바빈 객체에 접근 할 때 사용하는 이름이다.
 * class : 패키지 이름을 포함한 자바빈 클래스의 완전한 이름을 입력
 * scope : 자바빈 객체가 저장될 영역을 지정. page, request, session, application 중 하나를 값으로 갖는다. 기본값은 pag
 */