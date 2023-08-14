
package book;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
public class Book {
         
         public static String title;
         public static String author;  
         public static ArrayList<String> bookTitle = new ArrayList<>();
         public static ArrayList<String> bookAuthor = new ArrayList<>();

         public static String getTitle() {
                  return title;
         }

         public static void setTitle(String title) {
                  Book.title = title;
         }

         public static String getAuthor() {
                  return author;
         }

         public static void setAuthor(String author) {
                  Book.author = author;
         }
         
         
         public static void main(String[] args) {
                  
  
                  Scanner input = new Scanner(System.in);                 
                  Boolean stop = false;
                  while(stop==true){
                           System.out.println("""
                                              1 Add a book
                                              2 display all books in the librart
                                              3 Search for a book by title
                                              4 remove a book by title
                                              5 exit program""");    
                           int option = input.nextInt();
                           switch (option) {
                                    case 1:
                                             
                                             addBook();
                                             break;
                                    case 2:
                                             displayLibrary();
                                             break;
                                    case 3:
                                             searchByTitle();
                                             break;         
                                    case 4:
                                             removeBook();
                                             break;
                                    case 5:
                                             stop = true;
                                             
                                             break;
                                    default:
                                             System.out.println("invalid option");
                                             break;
                           }
                  
                  
                  }
                           
                           
                  
                  
         }
         public static void addBook(){
                  System.out.println("what is the title of the book");
                  title = input.nextLine();

                  System.out.println("what is the author of the book");
                  author = input.nextLine();
                  bookTitle.add(title) ;
                  bookAuthor.add(author);
         }
         
         public static void displayLibrary(){
                  System.out.println("Arraylist:");
                  for(int i=0; i < bookTitle.size(); i++){
                           
                           System.out.print(bookTitle.get(i)+" by ");
                           System.out.println(bookAuthor.get(i));
                           
                  }
         }
         public static void searchByTitle(){
                  System.out.println("please enter the title of the book");
                  title = input.nextLine();
                  for(int i=0; i < bookTitle.size(); i++){
                           if (bookTitle.get(i).equalsIgnoreCase(title)) {
                                    System.out.println("The books name is "+bookTitle.get(i) +"and the author is "+bookAuthor.get(i) );
                           }else{
                                    System.out.println("The title does not exist");
                           }
                  }
         }

         public static void removeBook(){
                 System.out.println("what is the title of the book you want to delete");
                 int remove = input.nextInt(); 
                 
                 for(int i=0; i < bookTitle.size(); i++){
                           if (bookTitle.get(i).equalsIgnoreCase(title)) {
                                    String str1 = bookTitle.remove(remove-1);
                                    System.out.println("Updated arraylist: "+bookTitle);
                                    System.out.println("Removed Element: "+str1);
                                    
                                    String str2 = bookAuthor.remove(remove-1);
                                    System.out.println("Updated arraylist: "+bookAuthor);
                                    System.out.println("Removed Element: "+str2);
                           }else{
                                    System.out.println("The title does not exist");
                           }
                  }
                 
                 
                  
                  
         }
}
