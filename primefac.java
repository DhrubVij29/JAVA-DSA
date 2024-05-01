import java.util.*;
public class primefac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int primfac=2;
        while (n!=1) {
            if (n%primfac==0) {
               
           
                n=n/primfac;
               
                System.out.println(primfac);
               

             }else{
                 primfac=primfac+1;
             }
            }

            
        }
    }

