/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BAI1;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class Account {
    private String trangThai;
    private String tenTK;
    private long sotk;
    public double soTien;
    
    public Account() {
        this.sotk = 999999;
        this.tenTK = "chua xac dinh";
        this.soTien = 50;
        this.trangThai = "";
    }

    public Account(String trangThai, String tenTK, int sotk, double soTien) {
        setTenTK(tenTK);
        setSotk(sotk);
        setSoTien(soTien);
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        if (tenTK == null) {
            this.tenTK = "ten khong hop le";
        } 
        this.tenTK = tenTK;
    }

    public String getSotk() {
        if (this.sotk != -1) {
            return String.valueOf(sotk);
        }
        return "so tk khong hop le";
    }

    public void setSotk(int sotk) {
        if (sotk > 0 && sotk != 9999999) {
            this.sotk = -1;
        } 
        this.sotk = sotk;
    }

    public String getSoTien() {
        if (this.soTien != -1) {
            return String.valueOf(soTien);
        }
        return "so tien khong hop le";
    }

    public void setSoTien(double soTien) {
        if (soTien >= 50) {
            this.soTien = -1;
        } 
        this.soTien = soTien;
    }
    
    public void nhapThongTin() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ten tai khoan: ");
        tenTK = sc.nextLine();
        System.out.print("Nhap so tai khoan: ");
        sotk = sc.nextInt();  
        System.out.print("Nhap so tien: ");
        soTien = sc.nextDouble();
    }
    
    public void xuatThongTin() {
        System.out.println("Ten tai khoan: " + tenTK);
        System.out.println("So tai khoan: " + sotk);
        System.out.println("So tien: " + soTien);
    }
 
   
    public double napTien() {
        Scanner sc= new Scanner(System.in);
        double nap;
        System.out.print("Nhap so tien can nap: ");
        nap = sc.nextDouble();
        
        if (nap >= 0) {
            soTien += nap;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);
            System.out.println(str1 + " da duoc nap vao tai khoan.");
        } else {
            System.out.println("So tien nap vao khong hop le!");
        }
        return nap;
    }
 
    
    public double rutTien() {
        Scanner sc= new Scanner(System.in);
        double phi = 5;
        double rut;
        System.out.print("Nhap so tien can rut: ");
        rut = sc.nextDouble();
        
        if (rut <= (soTien - phi)) {
            soTien = soTien - (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println(str1 + " da duoc rut tu tai khoan. Phi la $5.");
        } else {
            System.out.println("So tien rut khong hop le!");
            return rutTien();
        }
        return rut;
    }
 
    
    public double daoHan() {
        double laiSuat = 0.035;
        soTien = soTien + soTien * laiSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTien);
        System.out.println(str1 + "da duoc đáo hạn 1 tháng");
        return soTien;
    }
    
    void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(soTien);
        System.out.printf("%-10d %-20s %-20s \n", sotk, tenTK, str1);
    }
 
    public void menuChinh() {
        System.out.println("------CHUONG TRINH QUAN LI ACCOUNT ------");
        System.out.println("1. them tai khoan");
        System.out.println("2. So tk hien co");
        System.out.println("3. In thong tin tk");
        System.out.println("4. Nap tien");
        System.out.println("5. Rut tien");
        System.out.println("-----Nhan phim 0 de thoat chuong trinh, xin cam on!-----");
    }
}
