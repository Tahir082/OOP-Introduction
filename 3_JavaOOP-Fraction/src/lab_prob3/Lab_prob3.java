
package lab_prob3;

import java.util.Scanner;

class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public void add(Fraction fraction){
        int lcm, ans_num, ans_den;
        lcm=(this.denominator>fraction.denominator)? this.denominator: fraction.denominator;
        
        while(true){
            if(lcm%this.denominator==0 && lcm%fraction.denominator==0){
                break;
            }
            lcm++;
        }
        
        ans_den=lcm;
        ans_num= ((lcm/this.denominator)*this.numerator) + ((lcm/fraction.denominator)*fraction.numerator);
        System.out.println("The Answering Fraction: "+ans_num+"/"+ans_den);
    }
    
    public void sub(Fraction fraction){
        int lcm, ans_num, ans_den;
        lcm=(this.denominator>fraction.denominator)? this.denominator: fraction.denominator;
        
        while(true){
            if(lcm%this.denominator==0 && lcm%fraction.denominator==0){
                break;
            }
            lcm++;
        }
        
        ans_den=lcm;
        ans_num= ((lcm/this.denominator)*this.numerator) - ((lcm/fraction.denominator)*fraction.numerator);
        System.out.println("The Answering Fraction: "+ans_num+"/"+ans_den);
    }
    
    public void multiplication(Fraction fraction){
        int ans_num, ans_den;
        ans_num= this.numerator* fraction.numerator;
        ans_den= this.denominator* fraction.denominator;
        System.out.println("The Answering Fraction: "+ans_num+"/"+ans_den);
        
    }
    
    public void division(Fraction fraction){
        int ans_num, ans_den;
        ans_num= this.numerator* fraction.denominator;
        ans_den= this.denominator* fraction.numerator;
        System.out.println("The Answering Fraction: "+ans_num+"/"+ans_den);
    }
        
}
public class Lab_prob3 {

    
    public static void main(String[] args) {
        
        while(true){
            Scanner in= new Scanner(System.in);
            System.out.println("Type 1st fraction: ");
            System.out.println("Numerator: ");
            int num=in.nextInt();
            System.out.println("Denominator: ");
            int den= in.nextInt();
            System.out.println("Type 2nd fraction: ");
            System.out.println("Numerator: ");
            int num2=in.nextInt();
            System.out.println("Denominator: ");
            int den2= in.nextInt();
            Fraction obj1= new Fraction(num, den);
            Fraction obj2=new Fraction(num2, den2);
            System.out.println("Select one of the following operations: ");
            System.out.println("Press 1: ADDITION");
            System.out.println("Press 2: SUBTRACTION");
            System.out.println("Press 1: MULTIPLICATION");
            System.out.println("Press 1: DIVISION");
            int choice= in.nextInt();
            switch(choice){
                case 1:
                    obj1.add(obj2);          
                    break;
                case 2:
                    obj1.sub(obj2); 
                    break;
                case 3:
                    obj1.multiplication(obj2); 
                    break;
                case 4:
                    obj1.division(obj2); 
                    break;
                default:
                    System.out.println("Wrong Input!!! Try Again!!!");
                    break;
            }
        }
        
    }
    
}
