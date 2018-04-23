/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Lenovo-PC
 */
public class Customer extends Employee {

    public String loai_khach_hang;

    public void nhapThongTin() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien:");
        ten = s.nextLine();
        System.out.println("Nhap dia chi:");
        dia_chi = s.nextLine();
        System.out.println("Nhap bang cap:");
        bang_cap = s.nextLine();
        System.out.println("Nhap so dien thoai:");
        so_dien_thoai = s.nextInt();
        s.nextLine();
        System.out.println("Nhap email:");
        email = s.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Dia chi: " + dia_chi);
        System.out.println("Bang cap: " + bang_cap);
        System.out.println("SDT: " + so_dien_thoai);
        System.out.println("Email: " + email);
    }
}
