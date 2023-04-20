package com.edu;

//customer class
class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	public Customer(int id, String name,double walletBalance,String address){
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}
}

//class Item
class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	public Item(int id,String name,String companyName,double price,boolean isInStock) {
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
		
	}
}

//class shoppingWebsite
class shoppingWebsite{
	public String purchaseItem(Item i,Customer c) throws ItemOutOfStockException , InsufficientBalanceException{
		
		//wallet insufficient
		if(i.price>c.walletBalance) 
			throw new InsufficientBalanceException("customer wallet balance is not sufficient");
		
		//outofStock
		else if(!i.isInStock)
			throw new ItemOutOfStockException("item is out of stock");
		else
			return "Order Successful";
	}
}

// InsufficientBalanceException
class InsufficientBalanceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String message){
		super(message);
	}
}

//ItemOutOfStockException
class ItemOutOfStockException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ItemOutOfStockException(String message) {
		super(message);
	}
}


public class Question2 {

	public static void main(String[] args) throws ItemOutOfStockException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		Customer cusDest = new Customer(927392,"steve",5000.0,"USA");
		Item itemDet = new Item(27392,"T-shirt","US polo",800,true);
		shoppingWebsite obj = new shoppingWebsite();
		String out = obj.purchaseItem(itemDet, cusDest);
		System.out.println(out);
	}

}
