package learn08;

// form 데이터를 쓸 수 있는 class를 만들어줘야 한다.
public class BeanCalc {
	private int num1;
	private int num2;
	private String op;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	
	public int calc() {
		int result = 0;
		
		switch (op) {
		case "+":
			result = num1+num2;
			break;
			
		case "-":
			result = num1-num2;
			break;
			
		case "*":
			result = num1*num2;
			break;
			
		case "/":
			result = num1/num2;
			break;
		
		}
		return result;
		
	}
}
