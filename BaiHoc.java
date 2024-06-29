/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._trantheanh;

/**
 *
 * @author admin
 */
public class BaiHoc {
    private int mabai;
    private static int dem = 0;
    private String tenbai;
    private String noidung;
    
    {
        mabai = ++dem;
    }

    public BaiHoc( String tenbai, String noidung) {
        
        this.tenbai = tenbai;
        this.noidung = noidung;
    }

    /**
     * @return the mabai
     */
    public int getMabai() {
        return mabai;
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @return the tenbai
     */
    public String getTenbai() {
        return tenbai;
    }

    /**
     * @return the noidung
     */
    public String getNoidung() {
        return noidung;
    }

    @Override
    public String toString() {
        return "BaiHoc{" + "mabai=" + mabai + ", tenbai=" + tenbai + ", noidung=" + noidung + '}';
    }
    
    
}

