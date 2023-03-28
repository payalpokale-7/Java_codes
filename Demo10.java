//Getters and Setters
class Book
{
	int bid;
	String bnm,ba;
	float bPrice;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBnm() {
		return bnm;
	}
	public void setBnm(String bnm) {
		this.bnm = bnm;
	}
	public String getBa() {
		return ba;
	}
	public void setBa(String ba) {
		this.ba = ba;
	}
	public float getbPrice() {
		return bPrice;
	}
	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}
	public class Demo10{
		public static void main(String[] args) {
			Book b1=new Book();
			b1.setBid(123);
			b1.setBnm("Java");
			b1.setBa("James");
			b1.setbPrice(1473.5f);
			System.out.println(b1.getBid()+" "+b1.getBnm()+" "+b1.getBa()+" "+b1.getbPrice());
		}
	}
}