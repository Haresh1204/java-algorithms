import java.util.*;

class Bubble {
    public static void main(String[] args) {
        int a[]= new int[1000];
        for(int i=0;i<1000;i++){
            a[i]=i;
        }
        long s= System.nanoTime();
        int swap =0;
        int comp=0;
        for (int i=0;i<999;i++)
        {
           

            for (int j=0;j<999;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap++;
                }
                comp++;
            }
        }
        System.out.println("sorted array is:");
        long e = System.nanoTime();
        for(int i=0;i<1000;i++)
        {
            System.out.print(a[i]+",");
        }
       System.out.println("\ntotal time in nano secoend:"+(e-s)); 
       System.out.println("no of swap: "+swap);  
       System.out.println("no of comparisons: "+comp);  
    }
}