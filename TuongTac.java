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
public class TuongTac {
    private SinhVien sv;
    private BaiHoc baihoc;
    private LocalDate thoidiemtt;
    private LoaiTT loaitt;

    public TuongTac(SinhVien sv, BaiHoc baihoc, LocalDate thoidiemtt, LoaiTT loaitt) {
        this.sv = sv;
        this.baihoc = baihoc;
        this.thoidiemtt = thoidiemtt;
        this.loaitt = loaitt;
    }

    public TuongTac() {
    }
    

    /**
     * @return the sv
     */
    public SinhVien getSv() {
        return sv;
    }

    /**
     * @return the baihoc
     */
    public BaiHoc getBaihoc() {
        return baihoc;
    }

    /**
     * @return the thoidiemtt
     */
    public LocalDate getThoidiemtt() {
        return thoidiemtt;
    }

    /**
     * @return the loaitt
     */
    public LoaiTT getLoaitt() {
        return loaitt;
    }

    @Override
    public String toString() {
        return "TuongTac{" + "sv=" + sv + ", baihoc=" + baihoc + ", thoidiemtt=" + thoidiemtt + ", loaitt=" + loaitt + '}';
    }
   
    
}
