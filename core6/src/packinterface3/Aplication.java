package packinterface3;

public class Aplication {

	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator(2, 4);
		System.out.println("��������� ��������� = "+ cal.plus() + "; ��������� �������� = "+ cal.minus()+ "; ��������� �������� = "+ cal.multiply()
		+"; ��������� ������ = "+ cal.devide());

	}

}
