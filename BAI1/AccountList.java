/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class AccountList{
    private ArrayList <Account> acc;
    Account acclist;
    public int count;

    public AccountList(ArrayList<Account> acc, AccountList acclist, int count) {
        this.acc = acc;
        this.count = count;
    }

    public AccountList(){
        
    }

    public ArrayList<Account> getAcc() {
        return acc;
    }

    public void setAcc(ArrayList<Account> acc) {
        this.acc = acc;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void nhap() {
        System.out.println("----------------------------------------------");
        nhapDS();
    }
    
    public void xuat() {
        xuatDS();
    }
    
    public void nhapDS() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so account can them: ");
        int n = sc.nextInt();
        acc = new ArrayList<>();
        for(int i=0; i<n; i++) {
            acclist= new Account();
            acclist.nhapThongTin();
            acc.add(acclist);
            System.out.println("----------------------------------------------");
        }
    }
    
    public void xuatDS() {
        System.out.println("----------------------------------------------");
        for(Account x: acc) {
            x.xuatThongTin();
            System.out.println("----------------------------------------------");
        }
    }
    
    
    public void xoa() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ten tk can xoa: ");
    String ten = sc.nextLine();
    for (Account c : acc) {
        if (c.getTenTK().equals(ten)) {
            acc.remove(c);
            System.out.println("Da xoa thong tin " + ten);
            return;
        }
    }
        System.out.println("Khong tim thay thong tin " + ten);
    }
    
    public void dem() {
        int Count = 0;
        for (Account c : acc) {
            Count++;
        }
        System.out.println("So account hien co: " + Count);
    }
    
    public void timKiem() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ten tk can tim kiem: ");
    String ten = sc.nextLine();
    System.out.println("----------------------------------------------");
    for (Account c : acc) {
        if (c.getTenTK().equals(ten)) {
            c.xuatThongTin();
            System.out.println("Da tim thay thong tin " + ten);
            return;
        }
    }
        System.out.println("Khong tim thay thong tin " + ten);
    }
}  