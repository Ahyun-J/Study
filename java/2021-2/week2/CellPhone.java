package week2;

public class CellPhone {
	private String telNum;
	private boolean power = true;
	private static int count;
	private String p = "on";
	
//	CellPhone(){
//		this("null");
//	}
//	
//	CellPhone(String t){
//		this.telNum = t;
//		count++;
//	}

	CellPhone(){
		this("",false);
	}
	
	CellPhone(String t, boolean b){
		this.telNum = t;
		this.power = b;
		count++;
	}
	public void setTel(String e) {
		this.telNum = e;
	}

	public String getTel() {
		return this.telNum;
	}
	
	public void setPow(boolean r) {
		this.power = r;
	}

	public boolean getPow() {
		return this.power;
	}

	public void powerToggle() {
		if(power = true) {
			power = false;
			p = "off";
		}
		else {
			power = true;
			p = "on";
		}
	}
	public void p(){
	if(power = true) {
		power = false;
		p = "off";
	}
	else {
		power = true;
		p = "on";
	}
}

	@Override
	public String toString() {
		return "전화 번호 : " + telNum + ", 전원 상태 : " + p ;
	}
	
	static int getCount() {
		return count;
	}

}
