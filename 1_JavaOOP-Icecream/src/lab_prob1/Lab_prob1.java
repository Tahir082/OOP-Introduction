
package lab_prob1;

import java.util.Scanner;

class Icecream{
    private String icecreamType;
    private String icecreamCompany;
    private double icecreamPrice;
    
    Icecream(){
        this.icecreamType=null;
        this.icecreamCompany=null;
        this.icecreamPrice=0;
    }
    Icecream(String type, String company, double price){
        this.icecreamType=type;
        this.icecreamCompany=company;
        this.icecreamPrice=price;
    }
    
    public String getIcecreamType(){
        return this.icecreamType;
    }
    
    public String getIcecreamCompany(){
        return this.icecreamCompany;
    }
    
    public double getIcecreamPrice(){
        return this.icecreamPrice;
    }
    public String toString(){
        String str="Icecream Type: "+ icecreamType+"\n "
                + "Company: "+this.icecreamCompany+"\n "
                + "Price: "+this.icecreamPrice;
        return str;
    }
    
    boolean equals(Icecream i){
        return true;
    }
    public int compareTo(Icecream i){
        int ret_value=0;
        if(this.icecreamCompany.equals(i.icecreamCompany)){
            ret_value=1;
        }
        return ret_value;
    }
    
    
}
public class Lab_prob1 {

    
    public static void main(String[] args) {
        Icecream[] icecream= new Icecream[5];
        Scanner in=new Scanner(System.in);
        String type, company;
        double price;
        System.out.println("Type some icecream information");
        for(int i=0; i<5; i++){
            System.out.println("Type Icecream Type: ");
            in.nextLine();
            type=in.nextLine();
            System.out.println("Type Icecream Company Name: ");
            company=in.nextLine();
            System.out.println("Type Icecream Price: ");
            price=in.nextInt();
            icecream[i]= new Icecream(type, company, price);
        }
        System.out.println("Now Type a Company name to find out which icecreams this Company makes: ");
        in.nextLine();
        String search= in.nextLine();
        searchByCompany(search, icecream);
        
    }
    
    public static void searchByCompany(String Company, Icecream[] ice){
        Icecream search_comp = new Icecream(null ,Company, 0);
        System.out.println("Icecream Manufactured By "+ search_comp.getIcecreamCompany()+": ");
        for(int i=0; i<5; i++){
            int check= search_comp.compareTo(ice[i]);
            if(check==1){
                
                System.out.println("Icecream Type: "+ ice[i].getIcecreamType());
                System.out.println("Icecream Price: "+ice[i].getIcecreamPrice());
            }
        }
    }
    
}
