package Shop;

import java.util.HashSet;

public class shop 
{
	public static void main(String[] args) 
	{	
		HashSet<product> Makeup = new HashSet<>();
		product makeup1 = new product();
		makeup1.setName("Mascara");
		makeup1.setCost("5$");
		makeup1.setCountryOfOrigin("Italy");
		
		Makeup.add(makeup1);
		
		product makeup2 = new product();
		makeup2.setName("Eye Shadow");
		makeup2.setCost("2$");
		makeup2.setCountryOfOrigin("China");
		
		Makeup.add(makeup2);
		
		product makeup3 = new product();
		makeup3.setName("Lipstick");
		makeup3.setCost("3$");
		makeup3.setCountryOfOrigin("Greece");
		
		Makeup.add(makeup3);
		
		System.out.println("Makeup:");
		for (product makeup : Makeup) {
			System.out.println("Name of the product: " +  makeup.getName() + " ,Cost: " + makeup.getCost() + " ,Country of origin: " + makeup.getCountryOfOrigin());
		}
		

		HashSet<product> Clothes = new HashSet<>();
		product clothes1 = new product();
		clothes1.setName("T-Shirt");
		clothes1.setCost("15$");
		clothes1.setCountryOfOrigin("Sweden");
		
		Clothes.add(clothes1);
		
		product clothes2 = new product();
		clothes2.setName("Pants");
		clothes2.setCost("10$");
		clothes2.setCountryOfOrigin("China");
		
		Clothes.add(clothes2);
		
		product clothes3 = new product();
		clothes3.setName("Dress");
		clothes3.setCost("20$");
		clothes3.setCountryOfOrigin("Turkey");
		
		Clothes.add(clothes3);
		
		System.out.println("Clothes:");
		for (product clothes : Clothes) 
		{
			System.out.println("Name of the product: " +  clothes.getName() + " ,Cost: " + clothes.getCost() + " ,Country of origin: " + clothes.getCountryOfOrigin());
	}
		
	}
}
