/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._trantheanh;

import static com.mycompany._trantheanh.CauHinh.FORMATTER;
import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class SinhVien {
    private String masv;
    private String ten;
    private LocalDate ngaysinh;

    public SinhVien(String masv, String ten,LocalDate ngaysinh) {
        this.masv = masv;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
    }
TuongTac tt  = new TuongTac();
    /**
     * @return the masv
     */
    public String getMasv() {
        return masv;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @return the ngaysinh
     */
    public LocalDate getNgaysinh() {
        return ngaysinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "masv=" + masv + ", ten=" + ten + ", ngaysinh=" + ngaysinh.format(FORMATTER) + '}';
    }
    public void thucHienTT(String tuongtac)
            {
                if(tuongtac =="binhluan")
                    {
                        tt.getLoaitt().BinhLuan.CauLenh(tuongtac);
                    }
                else
                    {
                        tt.getLoaitt().ThichorKhongThich.CauLenh(tuongtac);
                    }
            }
    
    
}
