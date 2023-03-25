/*
Checking if a number is Circular Prime Number
A number is a circular prime number if the number itself
and all it's permutations are prime
*/
package circprime;
import java.util.*;     // import java util package
public class CircPrime {

    int num;
    int flag;
    int num2;
    
    void input(){       // method to input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        num2 = num;
        System.out.println("____________________________");
        System.out.println("OUTPUT: ");
    }
    
    void circular(){     // method to call method checkprime() to check if that permutation is prime 
       CircPrime ob1 = new CircPrime();
               // System.out.println("CHECK 1  " + num);
       checkprime(num);
        System.out.println(num);
        
        String str = String.valueOf(num);
        int len = str.length();
        char ch = str.charAt(0);
        String str2 = str.substring(1);
        str2 = str2 + ch;
        num = Integer.valueOf(str2);
        
            
        if(num != num2){
            circular();
        }
    }
    
    void checkprime(int N){    // method to check if a permutation of a number is prime 
        for(int i = 2; i < N; i++){
            if(N % i == 0)
                flag = 5;
        }
    }
    
    void display(){
        
        System.out.println("____________________________");
        if(flag == 5){
            System.out.println(num2 + " IS NOT A CIRCULAR PRIME");
        }
        else
            System.out.println(num2 + " IS CIRCULAR PRIME");
    }
    
    public static void main(String[] args) {

        CircPrime ob = new CircPrime();  // class object created to call methods
        ob.input();
        ob.circular();
        ob.display();
    }
    
}
