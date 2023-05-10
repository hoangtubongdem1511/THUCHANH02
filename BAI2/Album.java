/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class Album {
    private int maCD;
    private String tenCD;
    private String caSy;
    private int soBH;
    private float giaThanh;

    public Album() {
        
    }

    public Album(int maCD, String tenCD, String caSy, int soBH, float giaThanh) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSy = caSy;
        this.soBH = soBH;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }
 
    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }
 
    public String getTenCD() {
        return tenCD;
    }
 
    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }
 
    public String getCaSy() {
        return caSy;
    }
 
    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }
 
    public int getSoBH() {
        return soBH;
    }
 
    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }
 
    public float getGiaThanh() {
        return giaThanh;
    }
 
    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "Album{" +
                "cD=" + maCD +
                ", tenCD='" + tenCD +  
                ", caSy='" + caSy + 
                ", soBH=" + soBH +
                ", giaThanh=" + giaThanh +
                '}';
    }

    public void hienThiAlbum(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",maCD,tenCD,caSy,soBH,giaThanh);
    }
    
    public void menuChinh() {
        System.out.println("------CHUONG TRINH QUAN LI ALBUM ------");
        System.out.println("1. Nhap thong tin cd");
        System.out.println("2. Xuat danh sach album");
        System.out.println("3. Tinh tong gia thanh");
        System.out.println("4. Tong so luong cd");
        System.out.println("5. Sap xep giam dan theo gia thanh");
        System.out.println("6. Sap xep tang dan theo tua cd");
        System.out.println("-----Nhan phim 0 de thoat chuong trinh, xin cam on!-----");
    }
 
}