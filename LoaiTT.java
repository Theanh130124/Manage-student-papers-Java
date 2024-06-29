/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._trantheanh;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public enum LoaiTT {
    BinhLuan {
        @Override
        public void CauLenh(String lenh) {
           if(lenh=="binhluan")
               {
                   System.out.println("MOI BAN NHAP VAO NOI DUNG BINH LUAN");
                   String a = sc.nextLine();
                   System.out.println("NOI DUNG CUA BAN LA"+a);
               }
           else
               {
                   System.out.println("Cau lenh binh luan khong dung");
               }
          
        }
    },
    ThichorKhongThich {
        @Override
        public void CauLenh(String lenh) {
           if(lenh=="like")
                System.out.println("BAN DA THICH");
           else if(lenh=="unlike")
                System.out.println("BAN KHONG THICH");
           else
                System.out.println("KHONG CO TRANG THAI");
        }
    };
    
  
    public abstract void CauLenh(String lenh);
    
    Scanner sc =new Scanner(System.in);
}
