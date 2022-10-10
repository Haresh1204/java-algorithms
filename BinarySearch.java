import java.util.*;
import javax.lang.model.element.Element;
import javax.lang.model.util.ElementScanner14;
import javax.swing.text.html.StyleSheet;
class BinarySearch{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int []a=new int[n];
        int high=a.length-1;
        int low=0;
        for(int i=0;i<n;i++){
            a[i]=i+1;
        }
        System.out.println("enter number to find in array between 1 - "+n+":");
        int key=sc.nextInt();
        long s =System.nanoTime();
        binary(a,key,low,high);
        long e=System.nanoTime();
        System.out.println("total time is: "+(e-s));
    }
    static void binary(int a[],int key,int low,int high){
       int mid = (high+low)/2;
       int found=0;
       if(low > high){
          System.out.println("number is not found in array.");
       }
       else if(key==a[mid]){
         System.out.println("number is find at index: "+mid);
       }  
       else if(key>a[mid]){
          binary(a,key,mid+1,high);
       }
      else{
        binary(a,key,low,mid-1);
      }
    }
}