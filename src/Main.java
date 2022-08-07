import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {0,2,4,6,8,10};
        int x;
        int index_del=-1;
        System.out.println("Mang ban dau: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n Nhap phan tu can xoa" );
        Scanner input=new Scanner(System.in);
        x= input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                index_del=i;
                break;
            }
        }
        if(index_del==-1){
            System.out.println("Khong tim thay phan tu can xoa:");
        }else{
            System.out.println("Da xoa phan tu "+x);
            for (int i = index_del; i < arr.length-1 ; i++) {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");

        }
    }
}
