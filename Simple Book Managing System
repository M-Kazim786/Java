package book;

public class Book {
   private String title;
   private String author;
   private String isBn;
   private double price;
   
   public Book() {
	   
   }
   public Book(String title,String author,String isBn,double price) {
	   this.title=title;
	   this.author=author;
	   this.isBn=isBn;
	   this.price=price;
   }
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getIsBn() {
	return isBn;
}
public void setIsBn(String isBn) {
	this.isBn = isBn;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
   
}

package book;

public class EBook extends Book {
  private double fileSize;
  
  public EBook() {
	  
  }
  
  public EBook(String title,String author,String isBn,double price) {
	  super(title,author,isBn,price);
	  
  }
  
  public EBook(double fileSize) {
	  this.fileSize=fileSize;
  }
  
  public EBook(String title,String author,String isBn,double price, double fileSize ) {
	  super(title,author,isBn,price);
	  this.fileSize=fileSize;
  }

public double getFileSize() {
	return fileSize;
}

public void setFileSize(double fileSize) {
	this.fileSize = fileSize;
}
  
  
  
  
}

package book;

public class PrintedBook extends Book {
    private double weight;
    
    public PrintedBook() {
    	
    }
    
    public PrintedBook(String title,String author,String isBn,double price) {
    	super(title,author,isBn,price);
    }
    
    public PrintedBook(String title,String author,String isBn,double price,double weight) {
    	super(title,author,isBn,price);
    	this.weight=weight;
    }

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
    
    
    
    
}

package library;
import book.*;
public class Library {
   private static int bookCount=1;
   private Book[] books;
   private int capacity;
   private int currentCount;
   
   public Library() {
	 
   }
   
   public Library(int capacity) {
	   this.capacity=capacity;
	   this.books= new Book[capacity];
	   this.currentCount=0;
   }
   
   public void addBook(Book book) {
	   if(currentCount<capacity) {
		   books[currentCount] = book;
		   currentCount++;
		   bookCount++;        
	   }
	   else {
		   System.out.println("Library is full");
	   }
   }
   
   
   public void removeBook(String isBn) {
      for(int i=0;i<currentCount;i++) {
    	  if(books[i].getIsBn().equals(isBn)) {
    		  books[i]=books[currentCount-1];
    		  books[currentCount-1]=null;
    		  currentCount--;
    		  bookCount--;
    		  
    	  }
      }
}
   
   
   public Book findBook(String isBn) {
	   for(int i=0;i<currentCount;i++) {
		   if(books[i].getIsBn().equals(isBn)) {
			   return books[i];
		   }
	   }
	   return null;
   }
   
   public void displayBooks() {
	   for(int i=0;i<currentCount;i++) {
	   Book book=books[i];
	   System.out.println("Title:"+book.getTitle() +"/nAuthor:"+book.getAuthor() +"/nISBN:"+book.getIsBn() +"/nPrice:"+book.getPrice());
	   }
   }
                       
   public int getBookCount() {
	   return bookCount;
   }
   
}
