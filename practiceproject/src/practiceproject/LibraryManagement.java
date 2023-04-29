package practiceproject;
import java.util.*;
class Book{
	public String booktitle;
	public String author;
	public int price;
	public Boolean avilability;	
	public Book(String booktitle, String author,int price, Boolean avilability){
		this.booktitle = booktitle;
		this.author = author;
		this.price = price;
		this.avilability = avilability;
	}

}

class Library{
	Book [] books = new Book[100];
	void add(Book book) {
	    for(int i = 0; i < books.length; i++) {
	        if(books[i] == null) {
	            books[i] = book;
	            System.out.println("Your book " + book.booktitle + " is now added in my library");
	            return;
	        }
	    }
	    System.out.println("Sorry, the library is full and cannot add any more books");
	}
	
	//show all books , it shows if it is not avialble
	void show() {
	    boolean found = false;
	    for(int i = 0; i < books.length; i++) {
	        if(books[i] != null) {
	            found = true;
	            System.out.println((i+1) + "\t" + books[i].booktitle + "\t" + books[i].author + "\t" + books[i].price + "\t" + books[i].avilability);
	        }
	    }
	    if(!found) {
	        System.out.println("No book in library");
	    }
	}
	
	//return true if book is available
	public boolean search(String key) {
		boolean avilable = false;
		System.out.println("sr no \t Book name \t author name \t price \t avilability");
		 for(int i = 0; i < books.length; i++) {
		        if(books[i] != null && books[i].booktitle.equals(key) && books[i].avilability) {
		        	avilable = true;
		        }
		    }
		return avilable;
	}
	
	public boolean borrow(String key) {
		boolean avilable = false;
		 for(int i = 0; i < books.length; i++) {
		        if(books[i] != null && books[i].booktitle.equals(key) && books[i].avilability) {
		        	avilable = true;
		        	books[i].avilability = false;
		        }
		    }
		return avilable;
	}
	
	 public boolean returnBook(String boook){
		 boolean breturn = false;
		 for(int i = 0; i < books.length; i++) {
		        if(books[i] != null && books[i].avilability==false && books[i].booktitle.equals(boook)) {
		        	books[i].avilability = true;
		        	breturn = true;  	
		        }
		    }
		return breturn;
	}
	 
	 public void delete(String dbook) {
		 boolean deleteBook = false;
		 for(int i = 0; i<books.length;i++) {
			 if(books[i]!=null && books[i].booktitle.equals(dbook.toLowerCase())) {
				 books[i] = null;
				 deleteBook = true;
				 break;
			 }
		 }
		 if(deleteBook)
		 {
			 System.out.println("Book is deleted succesfully");
		 }
			 else {
				 System.out.println("unable to delete book");
			 }
	 }
}
public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		
		int next;  // variable to continue operation if user say y
		boolean avilability;
		String userDecision = "";
		System.out.println("Welcome to Library");
		//Menu 
		do {
		System.out.println("1. Add a Book");
		System.out.println("2. Delete a Book");
		System.out.println("3. show all Book");
		System.out.println("4. Search a Book");
		System.out.println("5. Borrow a Book");
		System.out.println("6. Return the book");
		System.out.println("7. exit");
		
		System.out.println("Enter your input");
		next = scanner.nextInt();
		
			switch(next) {
			case 1:
				Scanner sc = new Scanner(System.in);
				System.out.println("which book you want to add into library");
				System.out.println("Book name");
				String bookname = sc.nextLine();
				System.out.println("author name");
				String authorname = sc.nextLine();
				System.out.println("what is the price of book");
				int price = sc.nextInt();
				avilability = true;
				Book book = new Book(bookname,authorname,price,avilability);
				library.add(book);
				
				break;
			case 2:
				System.out.println("which book you want to delete from library");
				Scanner dbook = new Scanner(System.in);
				String bname = dbook.next();
				library.delete(bname);
				break;
			case 3:
				System.out.println("display all the books");
				library.show();
				break;
			case 4:
				System.out.println("which book you want to search");
				Scanner search = new Scanner(System.in);
				String key = search.next();
				Boolean res = library.search(key);
				if(res)
					System.out.println("Book is avilable");
				else
					System.out.println("Book is not avilabale");
				break;
			case 5:
				System.out.println("which book you want to borrow from library");
				Scanner borrow = new Scanner(System.in);
				String brw = borrow.next();
				Boolean status = library.borrow(brw);
				if(status)
					System.out.println("Book is now borrowed");
				else
					System.out.println("something is wrong");
				break;
			case 6:
				System.out.println("which book you want to return to library");
				Scanner returnBook = new Scanner(System.in);
				String rtn = returnBook.next();
				Boolean st = library.returnBook(rtn);
				if(st)
					System.out.println("Book is now avialble in libaray again");
				else
					System.out.println("something is wrong");
				break;
			case 7:
				System.out.println("okay bye.. please visit my library next time");
				System.exit(1);
				break;
			default:
				System.out.println("ohho you enterd wrong input...please try again");
				break;
			}
			System.out.println("Do you want to continue yes or no");
			userDecision = scanner.next().toLowerCase();
		}while(userDecision.equals("yes"));
		System.exit(0);

	}

}
