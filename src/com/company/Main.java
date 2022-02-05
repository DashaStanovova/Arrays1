package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.valueOf(scanner.nextLine());
        int arr[]=new int[n];
        String[] str = scanner.nextLine().split(" ");
        for (int i=0; i<n; i++){
            arr[i]=Integer.valueOf(str[i]);
        }
        for (int i=0;i<n-2;i++){
            int a=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=a;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
