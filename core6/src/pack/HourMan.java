package pack;

public class HourMan implements Countable{

	int	HourPay;
	int Hour;

	
	
	public HourMan(int HourPay, int Hour) {
		super();
		this.HourPay = HourPay;
		this.Hour = Hour;
	}



	public int getHourPay() {
		return HourPay;
	}



	public void setHourPay(int HourPay) {
		this.HourPay = HourPay;
	}



	public int getHour() {
		return Hour;
	}



	public void setHour(int Hour) {
		this.Hour = Hour;
	}



	@Override
	public String toString() {
		return "HourMan [HourPay=" + HourPay + ", Hour=" + Hour + "]";
	}



	@Override
	public int count() {
		return Hour * HourPay;
		
	}





}
