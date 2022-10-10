import java.util.*;
public class Quick {
      static int count = 0;
        public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size of array:");
            int n=sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=(int)(Math.random()*100);
            }
            long s =System.nanoTime();
            Quick ob = new Quick();
            ob.quick(a,0,a.length - 1);
            long e=System.nanoTime();
            System.out.println("total time is: "+(e-s));
            System.out.println("sorted  array is:");
            for(int i=0;i<n;i++){
             System.out.println(""+a[i]);
            }
            System.out.println("number of partition call is:"+count);
          }
        void quick(int a[],int p,int r){
             if(p < r){
                int q = part(a,p,r);
                count++;
                quick(a, p, q-1);
                quick(a, q+1, r);
             }
           }
        int part(int a[],int p,int r){
               int pivot=a[r];
               int i=p-1;
               for(int j=p;j<=r-1;j++){
                  if(a[j]<=pivot){
                    i++;
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                  }
               }
               int temp=a[i+1];
               a[i+1]=a[r];
               a[r]=temp;
               return (i+1);
        }

}
