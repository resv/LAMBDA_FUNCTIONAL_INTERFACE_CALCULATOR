package inClassAnonClass.LAMBDA_FI_CALCULATOR;

public class MyCalc {

	Calculator<Integer> sum = (num1, num2)-> {
		int result = (num1+num2);
		return result;
	};
	
	Calculator<Integer> subtract = (num1,num2)->{
		int result = (num1-num2);
		return result;
	};
	
	Calculator<Float> multiply = (num1,num2)->{
		Float result = (num1*num2);
		return result;
	};
	
	Calculator<Float> divide = (num1,num2)->{
		Float result = (num1/num2);
		return result;
	};
	
}
