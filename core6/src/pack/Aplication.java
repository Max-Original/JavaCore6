package pack;

import java.io.ObjectInputStream.GetField;

public class Aplication {

	public static void main(String[] args) {
		HourMan hm = new HourMan(10, 5);
		System.out.println("�������� �� "+ hm.getHour() +" ����� = " + hm.count());
		MountMan mm = new MountMan(2);
		System.out.println("�������� �� "+ mm.getMounts() + " ����� = " + mm.count());
	}

}
