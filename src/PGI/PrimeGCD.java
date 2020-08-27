package PGI;
import java.util.Scanner;
class Methods{
    public void gcd(){
        Scanner numbers = new Scanner (System.in);
        System.out.println("Type the number of numbers of gcd: ");
        int p= numbers.nextInt();
        if (p<=0){
                    System.out.println("ERORR! Type a number more than or equal one.");
        }
        else{
            int y=0,z=0,r=0;
            System.out.println("Type the numbers: ");
                 int [] x = new int [p];
                 for (int i=0; i<p ; i++){
                     x[i]= numbers.nextInt();
                 }
                 for (int i=0;i<p;i++){
                     if (p<=i+1){
                         System.out.println("GCD of numbers is: "+z);
                     }
                     else{
                     y=x[i];
                     z=x[i+1];
                     for (int j=0 ; y!=0; j++){
                         r= (z %  y);
                         z=y;
                         y=r;
                     }
                     x[i+1]=z;
                     } 
                 }
            }
    }
    public void prime(){
        int bb=0;
        int start,end, counter=0,nuum=0;
        Scanner answer = new Scanner (System.in);
        while (bb==0){
        System.out.println("1)determine range of prime numbers.");
        System.out.println("2)Is prime?");
        int res = answer.nextInt();
        if (res==1){
            bb=1;
            System.out.println("Starts from: ");
            start= answer.nextInt();
            System.out.println("End by: ");
            end= answer.nextInt();
            for (int i=start; i<=end ; i++){
            for (int j=1; j<=i;j++){
                if (i%j==0)
                    counter++;
                
            }
            if (counter==2){
                    System.out.println(i+" is prime");
                    nuum++;
            }
            counter=0;
        }
            System.out.println("Total prime numbers: "+ nuum);
            
            
        }
        else if (res==2){
            bb=1;
            int num = answer.nextInt();
            for (int j=1; j<=num;j++){
                if (num%j==0)
                    counter++;
            }
            if (counter==2)
                System.out.println(num +" is Prime");
            else
                System.out.println(num + " isn't prime");
        }
        else
        {
            System.out.println("Error, Choose correct number 1 or 2");
        }
        }
}

}

public class PrimeGCD {
    public static void main(String[] args) {
        Scanner res = new Scanner(System.in);
        String re="yes";
        while (re=="yes"){
        System.out.println("Type \"1\" for GCD\n\"2\" for PRIME");
        int ans = res.nextInt();
        if (ans==1){
            re="no";
            Methods gcd = new Methods();
            gcd.gcd();
        }
        else if (ans ==2){
            re="no";
            Methods prime = new Methods();
            prime.prime();
        }
        else{
            System.out.println("Error! Type 1 or 2");
        }
        }
    }
    
}
