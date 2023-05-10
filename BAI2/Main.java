/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
import java.util.Scanner;
 
public class Main {
    static Scanner sc = new Scanner(System.in);
    static void nhapAlbum(Album ab) {
        System.out.print("Nhap ma CD: ");
        ab.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ten CD : ");
        ab.setTenCD(sc.nextLine());
        System.out.print("Nhap ten ca si : ");
        ab.setCaSy(sc.nextLine());
        System.out.print("Nhap so luong bai hat : ");
        ab.setSoBH(sc.nextInt());
        System.out.print("Nhap gia thanh : ");
        ab.setGiaThanh(sc.nextFloat());
    }
    public static void main(String[] args) {
        Album ab = new Album();
        Album alb[] = null;
        int a, n = 0;
        do {
            ab.menuChinh();
            System.out.print("Chon: ");
            a = sc.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.print("Nhap so luong CD : ");
                    n = sc.nextInt();
                    alb = new Album[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thu " + (i + 1)+": ");
                        alb[i] = new Album();
                        nhapAlbum(alb[i]);
                    }
                }
                case 2 -> {
                    System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Ma CD", "Ten CD", "Ten ca si", "So bai hat", "Gia thanh");
                    for (int i = 0; i < n; i++) {
                        alb[i].hienThiAlbum();
                    }
                }
                case 3 -> {
                    int tong = 0;
                    for (int i = 0; i < n; i++) {
                        tong += alb[i].getGiaThanh();
                    }
                    System.out.println("" + "Tong gia thanh la : " + tong);
                }
                case 4 -> System.out.println("Tong so luong CD la : " + n);
                case 5 -> {
                    Album temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getGiaThanh() < alb[j].getGiaThanh()) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sap xep thanh cong!");
                }
                case 6 -> {
                    Album temp = alb[0];
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (alb[i].getTenCD().compareTo(alb[j].getTenCD())>0) {
                                temp = alb[j];
                                alb[j] = alb[i];
                                alb[i] = temp;
                            }
                        }
                    }
                    System.out.println("Sap xep thanh cong!");
                }
                default -> {
                    break;
                }
            }
        }while (a != 0) ;
    }
}
