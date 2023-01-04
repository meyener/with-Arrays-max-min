import java.util.Scanner;
import java.util.Arrays;
import javax.print.DocFlavor.STRING;

public class MaxandMin {/**
 * @param args
 */
public static void main(String[] args) {
    
    Scanner scanner=new Scanner(System.in);
    int ent,min,num1,finish;
    boolean x=false;
    
    System.out.print("How many number will you enter : ");
    ent=scanner.nextInt();
    int[] maxmin=new int[ent];
    
    for (int i = 0; i < ent; i++) {
        System.out.println("press "+(i+1)+". number");
        num1=scanner.nextInt();
        maxmin[i]=num1;
    }
    System.out.println(Arrays.toString(maxmin));
    while (!x) {
        
    x=true;
    for (int i = 0; i < maxmin.length-1; i++) {
        
        if (maxmin[i]>maxmin[i+1]) {;
            min=maxmin[i];
            maxmin[i]=maxmin[i+1];
            maxmin[i+1]=min;
            x=false;

        }System.out.println(">>>"+Arrays.toString(maxmin));
        
    }}System.out.println(Arrays.toString(maxmin));
    System.out.println("En büyük sayi : "+maxmin[ent-1]);
    System.out.println("En küçük sayi : "+maxmin[0]);
}
    
}
