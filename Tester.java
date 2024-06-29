/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._trantheanh;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class Tester {

    public static void main(String[] args) {
        QLTT qltt = new QLTT();
        LocalDate date1 = LocalDate.of(2004, 01, 13);
        LocalDate date2 = LocalDate.of(2004, 01, 23);
        LocalDate date3 = LocalDate.of(2004, 05, 23);

        LocalDate date4 = LocalDate.of(2024, 01, 13);
        LocalDate date5 = LocalDate.of(2024, 05, 23);
        LocalDate date6 = LocalDate.of(2024, 05, 23);

        SinhVien sv1 = new SinhVien("001", "TranTheAnh", date1);
        SinhVien sv2 = new SinhVien("002", "MinhTuyet", date2);
        SinhVien sv3 = new SinhVien("003", "NhatHa", date3);
        BaiHoc baihoc1 = new BaiHoc("Baitap1", "Java");
        BaiHoc baihoc2 = new BaiHoc("Baitap2", "C#");
        BaiHoc baihoc3 = new BaiHoc("Baitap3", "Python");
        TuongTac tt1 = new TuongTac(sv1, baihoc1, date4, LoaiTT.ThichorKhongThich);

        TuongTac tt2 = new TuongTac(sv2, baihoc2, date5, LoaiTT.BinhLuan);
        TuongTac tt3 = new TuongTac(sv3, baihoc3, date6, LoaiTT.ThichorKhongThich);
        qltt.themTT(tt1,tt2,tt3);
        qltt.themBH(baihoc1, baihoc2, baihoc3);
        System.out.println("-----------------1.HIEN THI DS SV THANG 1");
        qltt.themSV(sv1, sv2, sv3);
        qltt.hienThiSV();
        System.out.println("-------------------2. SINH VIEN THUC HIEN TUONG TAC");
        sv1.thucHienTT("binhluan");
        sv2.thucHienTT("unlike");
        sv3.thucHienTT("like");
        System.out.println("--------------------3.HIEN THI DANH SACH");
        qltt.hienThiSvDaLike(1);
        System.out.println("------------------5. HIen Thi tuong tac");
        qltt.hienThiBL(2);
        System.out.println("--------------6.SAP XEP");
        qltt.sapXep();
    }

}
