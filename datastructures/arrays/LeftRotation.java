/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.arrays;

import java.util.Scanner;

public class LeftRotation {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();
        printArray(n , d, a);
    }

    static void printArray(int n, int d, int[] a) {
            while(d > 0){
                int move = a[0];
                for(int i = n-1 ; i>=0; i--){
                    int tmp = a[i];
                    a[i] = move;
                    move = tmp;
                }
                d--;
            }
        for (int i = 0; i< n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
