import java.util.*;
public class rotate {
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int k =sc.nextInt();
        int temp=n;
        int count =0;
        while (temp!=0) { 
             temp=temp/10;
          
          
          
            count ++;
            
        }
        k=k%count;
        if(k<0){
            k=k+count;
        }

        int div=1;
        int multi=1;
        for (int i=1; i<=count; i++){
            if(i<=k){
            div=div*10;

        }
        else{
            multi=multi*10;
        }
        
    }
    int q=n/div;
        int r=n%div;
        int pe =r*multi+q;
    System.out.println(pe);

     
    }
    
}
