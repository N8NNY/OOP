package Merge;
import java.util.Scanner;
import java.util.Arrays;

public class Merge{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 : ");
        int countList1 = input.nextInt();
        int[] arrayList1 = new int[countList1];
        for(int i = 0;i < countList1;i++){
            arrayList1[i] = input.nextInt();
        }
        System.out.print("Enter list2 : ");
        int countList2 = input.nextInt();
        int[] arrayList2 = new int[countList2];
        for(int i = 0;i < countList2;i++){
            arrayList2[i] = input.nextInt();
        }
        System.out.print("The merge list is : ");
        int[] result = merge(arrayList1, arrayList2);
        for(int i = 0;i < result.length;i++)
            System.out.print(result[i] + " ");
    }

    public static int[] merge(int[] list1, int[] list2){
        int length = list1.length + list2.length;
        int[] merge = new int[length];
        for(int i = 0;i < list1.length;i++){
            merge[i] = list1[i];
        }
        for(int i = 0;i < list2.length;i++){
            merge[i+list1.length] = list2[i];
        }
        Arrays.sort(merge);
        return merge;
    }
}