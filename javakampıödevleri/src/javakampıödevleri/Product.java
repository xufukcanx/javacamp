package javakamp��devleri;

public class Product {

	int id;
	String name;
    String detail;
    double unitPrice;
    
	public Product() {
		System.out.println("Y�kleniyor");
	}
		
	public Product(int id, String name, String detail, double unitPrice) {
			
		    this();
			this.id =id;
			this.name =name;
			this.detail =detail;
			this.unitPrice =unitPrice;
		}
	
	

}
