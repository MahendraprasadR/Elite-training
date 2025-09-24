import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,50,30,25,7};
        System.out.println("Number");
        int key = sc.nextInt();
        int pos = -1;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]==key){
            pos = i;
            break;
            }
        }
        if(pos == -1){
        System.out.println("not found");
        }
        else{
            System.out.println(pos);
        }
    }
}
