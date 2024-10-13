package homeWork;

public class homeWork_0717_Payment {
	int purchaseNum;
	int cardnum;
	int totalPrice;
	String appldate;
	String appltime;
	
	public void setPurchaseNum(int purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	
	public void setCardnum(int cardnum) {
		this.cardnum = cardnum;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setAppldate(String appldate) {
		this.appldate = appldate;
	}
	public void setAppltime(String appltime) {
		this.appltime = appltime;
	}
	
	public int getPurchaseNum() {
		return purchaseNum;
	}
	public int getCardnum() {
		return cardnum;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public String getAppldate() {
		return appldate;
	}
	public String getAppltime() {
		return appltime;
	}

}
