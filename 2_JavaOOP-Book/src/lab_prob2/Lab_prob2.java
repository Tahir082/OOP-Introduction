
package lab_prob2;

import java.util.Scanner;

class Book{
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    static int count;
    
    Book(int ISBN, String Title, int numOfPages){
        this.ISBN= ISBN;
        this.bookTitle= Title;
        this.numberOfPages= numOfPages;
        count++;
    }
    Book(){
        this.ISBN=0;
        this.bookTitle="";
        this.numberOfPages= 0;
        count++;
    }
    public String toString(){
        String str="Book ISBN: "+ this.ISBN+"\n Book Title: "+this.bookTitle+"\n Number of Pages: "+this.numberOfPages; 
        return str;
    }

    public int compareTo(Book ob){
        if(ob.ISBN== this.ISBN && ob.bookTitle.equals(this.bookTitle) && ob.numberOfPages==this.numberOfPages){
            return 1;
        }
        else{
            return 0;
        }
        
    }
    public static int getCount(){
        return count;
    }
    public int getNumOfPages(){
         return this.numberOfPages;
    }
}

public class Lab_prob2 {

    
    public static void main(String[] args) {
        
            Scanner in= new Scanner(System.in);
            System.out.println("How many Books you want to input?");
            int size=in.nextInt();
            Book bk[]= new Book[size];
    while(true){
            System.out.println("Press 1: ADD NEW BOOK");
            System.out.println("Press 2: DISPLAY ALL BOOK");
            System.out.println("Press 3: COMPARE");
            System.out.println("Press 4: BOOK WEIGHT");
            int choice;
            System.out.println("Enter Your Choice: ");
            choice=in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("==========ADD NEW BOOK==========");
                    for(int i=0; i<size ;i++ ){
                        System.out.println("Type Book Title: ");
                        in.nextLine();
                        String title= in.nextLine();
                        System.out.println("Number of Pages: ");
                        int pages= in.nextInt();
                        System.out.println("ISBN number has been set automatically by the system!!");
                        bk[i]=new Book((i+1), title, pages); 
                    }
                    break;
                case 2:
                    System.out.println("=========DISPLAY ALL BOOK=========");
                    for(int i=0; i<size; i++){
                        System.out.println("Book no. "+(i+1) );
                        System.out.println(bk[i].toString());
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("===========COMPARE===========");
                    System.out.println("Type a book Title: ");
                    String title= in.nextLine();
                    System.out.println("Number of Pages: ");
                    int nop= in.nextInt();
                    Book comp= new Book(size, title, nop);
                    for(int i=0; i<size; i++){
                        int checker=comp.compareTo(bk[i]);
                        if(checker==1){
                            System.out.println("Match Found!!!");
                            System.out.println(bk[i].toString());
                        }
                        else{
                            System.out.println("Book was not found!!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Type a book Title: ");
                    String title_2= in.nextLine();
                    System.out.println("Number of Pages: ");
                    int nop_2= in.nextInt();
                    Book obj= new Book(size, title_2, nop_2);
                    boolean check= isHeavier(obj);
                    if(check==true){
                        System.out.println("The Book seems Heavy");
                    }
                    else{
                        System.out.println("The book does not seem heavy!! ");
                    }
                    break;
                default:
                    System.out.println("Wrong Input!!! Try Again!!!!");
            }
            
            
            
        }
    }

    private static boolean isHeavier(Book obj) {
        if(obj.getNumOfPages()>500){
            return true;
        }
        else{
            return false;
        }
    }
    
}
