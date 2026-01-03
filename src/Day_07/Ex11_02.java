
class Product{
	private String name;
	private int price;
	
	public void setName(String new_name) {
		name = new_name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int new_price) {
		price = new_price;
	}
	public int getPrice() {
		return price;
	}
}

public class Ex11_02 {

	public static void main(String[] args) {
		Product p01=new Product();
		p01.setName("커피"); p01.setPrice(150);
		
		System.out.println("출력: 자판기 => 제품목록");
		System.out.println(p01.getName() + " " + p01.getPrice() + "원");
		
		Product p02 = new Product();
		p02.setName("비타500"); p02.setPrice(500);
		System.out.println(p02.getName() + " " + p02.getPrice()+ "원");
	}

}
