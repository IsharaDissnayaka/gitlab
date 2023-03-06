package LAB_test;

//IT21174780
//D.M.M.I.T.dissanayaka
//group 2.1
//malabe
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MaxSize=8;
		int decimal_number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal Number 0-255 :- ");
        decimal_number = sc.nextInt();
        sc.close();
       
        StackX s1 = new StackX(8);
        
        if(decimal_number<=255 && decimal_number>=0) {
        	while(decimal_number>0) {
            	int mod = decimal_number % 2 ;
            	decimal_number = decimal_number/2;
            	s1.push(mod);
            }
        }else {
        	System.out.println("please Input the valid length");
        }
        
        System.out.print("Your binary number is :- ");
        while(!(s1.isEmpty())) {
        	if(s1.isEmpty()==true) {
        		System.out.print(0);
        	}
        	System.out.print(s1.pop());
        }
	}

}
