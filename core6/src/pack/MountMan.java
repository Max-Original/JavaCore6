package pack;

public class MountMan implements Countable{

	int MountPay = 1000;
	int Mounts;





public MountMan(int mounts) {
		super();
		Mounts = mounts;
	}

public int getMountPay() {
	return MountPay;
}

public void setMountPay(int mountPay) {
	this.MountPay = mountPay;
}

public int getMounts() {
	return Mounts;
}

public void setMounts(int mounts) {
	this.Mounts = mounts;
}

@Override
public String toString() {
	return "MountMan [MountPay=" + MountPay + ", Mounts=" + Mounts + ", count()=" + count() + ", getMountPay()="
			+ getMountPay() + ", getMounts()=" + getMounts() + "]";
}


@Override
public int count() {
		return MountPay * Mounts;
}


}
