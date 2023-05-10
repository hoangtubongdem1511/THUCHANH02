/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chon;
        Account acc = new Account();
        AccountList acclist = new AccountList();

        do {
        acc.menuChinh();
        System.out.print("Lua chon: ");
        chon = sc.nextInt();
        switch (chon) 
        {
            case 1 -> 
            {
                acclist.nhap();
                break;
            }
            case 2 -> 
            {
                acclist.dem();
                break;
            }
            case 3 ->
            {
                acclist.xuat();
                break;
            }
            case 4 ->
            {
                acc.napTien();
                break;
            }
            case 5 ->
            {
                acc.rutTien();
                break;
            }
            default -> {
                break;
            }
        }
        } while (chon != 0);
    }
}