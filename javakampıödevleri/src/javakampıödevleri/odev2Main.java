package javakamp��devleri;


public class odev2Main {

	public static void main(String[] args) {
		
		Product material1 = new Product (1, "Bosch S�p�rge", "1500 WATT", 1299.99);
		
		Product material2 = new Product (2, "Arzum S�p�rge", "1300 WATT", 1000.99);

		Product material3 = new Product (3, "Philips S�p�rge", "1800", 1499.99);
		
		
		Product[] materials = {material1, material2, material3};
		
		
		for (Product material : materials) {
		
			System.out.println(material.name); 
				}
		System.out.println(materials.length);
        Category category1 = new Category();
        category1.id =1;
        category1.name ="Elektrikli E�yalar";
        
        Category category2 = new Category();
        category2.id =2;
        category2.name ="Elektrikli S�p�rgeler";

				
	}

}
