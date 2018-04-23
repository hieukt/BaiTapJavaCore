/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Lenovo-PC
 */
public class Employees {

    public String ten_nhan_vien;
    public String noi_sinh;
    public String ngay_sinh;
    public String gioi_tinh;
    public String trinh_do;
    public int so_dien_thoai;
    public String email;

    public void nhapThongTin() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien:");
        ten_nhan_vien = s.nextLine();
        System.out.println("Nhap noi sinh:");
        noi_sinh = s.nextLine();
        System.out.println("Nhap ngay sinh:");
        ngay_sinh = s.nextLine();
        System.out.println("Nhap gioi tinh:");
        gioi_tinh = s.nextLine();
        System.out.println("Nhap trinh do:");
        trinh_do = s.nextLine();
        System.out.println("Nhap so dien thoai:");
        so_dien_thoai = s.nextInt();
        s.nextLine();
        System.out.println("Nhap email:");
        email = s.nextLine();
    }

    public void thongTinNhanVien() {
        System.out.println("Ten: " + ten_nhan_vien);
        System.out.println("Noi sinh: " + noi_sinh);
        System.out.println("Ngay sinh: " + ngay_sinh);
        System.out.println("Gioi tinh: " + gioi_tinh);
        System.out.println("Trinh do: " + trinh_do);
        System.out.println("SDT: " + so_dien_thoai);
        System.out.println("Email: " + email);
    }

    public Employees() {
    }

   
}
