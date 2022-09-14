package week3;

public class SmartPhone extends Phone  {
	private boolean hasBluetooth;
	
	public SmartPhone() {
		this("None", 0, false);
	}
	public SmartPhone(String m, int p, boolean b) {
		super(m, p);
		this.hasBluetooth = b;
	}
		
	public boolean getHasBluetooth() {
		return this.hasBluetooth;
		
	}
	
	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

//	public boolean isHasBluetooth() {
//		return hasBluetooth;
//	}
//	public void setHasBluetooth(boolean hasBluetooth) {
//		this.hasBluetooth = hasBluetooth;
//	}
	@Override
	public String toString() {
		return "Phone[maker=" + getMaker() + ", price=" + getPrice() + "], "
				+ "SmartPhone[hasBluetooth=" + hasBluetooth + "]";
	}

}
