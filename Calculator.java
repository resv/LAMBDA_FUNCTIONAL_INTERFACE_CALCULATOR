package inClassAnonClass.LAMBDA_FI_CALCULATOR;

@FunctionalInterface
public interface Calculator<T> {

	public T compute(T num1, T num2);
}
