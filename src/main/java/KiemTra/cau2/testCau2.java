package KiemTra.cau2;

import java.util.Scanner;

public class testCau2 {
    public static void main(String[] args) {
        // đối tượng tạo sẵn dữ liệu
        NhanVien kt1 = new KyThuat("KT1","Hoàng Ngọc Giao","10/01/2222","langson","ĐTVT");
        System.out.println(kt1);
        System.out.println(kt1.moTaCongViec());

        // Nhập từ bàn phím
        Scanner in = new Scanner(System.in);
        System.out.print("nhập mã nhân viên: ");
        String manhanvien = in.nextLine();
        System.out.print("nhập họ tên: ");
        String hoten = in.nextLine();
        System.out.print("nhập ngày tháng năm sinh: ");
        String namsinh = in.nextLine();
        System.out.print("nhập địa chỉ : ");
        String diachi = in.nextLine();
        System.out.print("nhập chuyên ngành: ");
        String chuyennganh = in.nextLine();

        NhanVien kt2 = new KyThuat(manhanvien,hoten,namsinh,diachi,chuyennganh);
        System.out.println(kt2);
        System.out.println(kt2.moTaCongViec());
    }
}
