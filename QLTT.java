/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._trantheanh;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author admin
 */
public class QLTT {

    List<SinhVien> qlsv;
    List<TuongTac> qlctt;
    List<BaiHoc> qlbh;

    public QLTT() {
        qlsv = new ArrayList<>();
        qlctt = new ArrayList<>();
        qlbh = new ArrayList<>();
    }

    public void themSV(SinhVien... sv) {
        qlsv.addAll(Arrays.asList(sv));
    }

    public void themBH(BaiHoc... bh) {
        qlbh.addAll(Arrays.asList(bh));
    }

    public void themTT(TuongTac...tt){
        qlctt.addAll(Arrays.asList(tt));
    }
            public void hienThiSV() {
        qlsv.stream().filter(p -> p.getNgaysinh().getMonthValue() == 1).forEach(p -> System.out.println(p.toString()));
    }

    public void hienThiSvDaLike(int mabaihoc) {
        qlctt.stream().filter(p -> p.getBaihoc().getMabai() == mabaihoc && p.getLoaitt().ThichorKhongThich.equals("like")).forEach(p -> p.getSv().toString());

    }

    public void hienThiBL(int mabaihoc) {
        qlctt.stream().filter(p -> p.getBaihoc().getMabai() == mabaihoc && p.getThoidiemtt().getDayOfMonth() +2 >= LocalDate.now().getDayOfMonth()).forEach(p -> System.out.println(p));
    }
    public void sapXep(){
        qlbh.stream().sorted(Comparator.comparing(BaiHoc::getMabai)).forEach(p->System.out.println(p.toString()));
    }

}
