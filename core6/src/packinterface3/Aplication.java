package packinterface3;

public class Aplication {

	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator(2, 4);
		System.out.println("Результат додавання = "+ cal.plus() + "; Результат віднімання = "+ cal.minus()+ "; Результат множення = "+ cal.multiply()
		+"; Результат ділення = "+ cal.devide());

	}

}
