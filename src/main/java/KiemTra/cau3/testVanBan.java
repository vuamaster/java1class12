package KiemTra.cau3;

public class testVanBan {
    public static void main(String[] args) {
        VanBan v1 = new VanBan();
        v1.setNoiDung("  viết   chương   trình thử nghiệm  ");
        System.out.println(v1);
        //dếm số từ
        System.out.println(v1.demSoTu());

        // chuẩn hóa
        v1.setNoiDung(v1.chuanHoaNoiDung());
        System.out.println(v1);

        // viết hoa toàn bộ
        v1.setNoiDung(v1.vietHoa());
        System.out.println(v1);

        // viết thường toàn bộ
        v1.setNoiDung(v1.vietThuong());
        System.out.println(v1);


        // viết hoa chữ cái đầu
        v1.setNoiDung(v1.vietHoaChuCaiDau());
        System.out.println(v1);



    }
}
