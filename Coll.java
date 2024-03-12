package Assg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

class Book{
    int Bookid;
    String Bookname;
    String AuthorName;
    public Book(int Bookid, String Bookname, String AuthorName){
        System.out.println(Bookid+" "+Bookname+" "+AuthorName);
        // System.out.println(Bookname);
        // System.out.println(AuthorName);
    }
}

public class Coll {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();


        
        
        list.add(new Book(100, "java", "shyam"));
        list.add(new Book(101, "Python", "ram"));
        list.add(new Book(102, "Math", "Sahu"));
        list.add(new Book(103, "DataStructure", "Kumar"));
        list.add(new Book(104, "Cotloin", "Ajit"));
        list.add(new Book(105, "C", "Shiva"));
        list.add(new Book(106, "c++", "Amarjeet"));
        // System.out.println(list);

        for(Book b:list){
            System.out.println(b);
        }
        

    }
    
}
