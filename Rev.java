import java.util.Scanner;
public class Rev {
    static void reverse(int arr[],int start,int end){
int n=arr.length;
int temp=0;
for(int i=0;i<n;i++){
while (start < end)
        {
            temp = arr[start]; 
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
    }
}
    public static void main(String args[]){
        int i,n,arr[];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        n=in.nextInt();
        arr=new int[n];
        System.out.println("Enter those elements:");
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
             }
             System.out.println("array before rev");
        for(i=0;i<n;i++){
            System.out.println(arr[i]+"");
        }
        int last=arr.length-1;
        reverse(arr,0,last);
        System.out.println("array after rev:");
        for(i=0;i<n;i++){
            System.out.println(arr[i]+"");
        }
          

    }
}
