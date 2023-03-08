package KiemTra.cau2;

public class KyThuat extends NhanVien {
    private String chuyenNganh;

    public KyThuat() {
    }

    public KyThuat(String maNhanVien, String hoTen) {
        super(maNhanVien, hoTen);
    }

    public KyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String moTaCongViec() {
        return "Hỗ trợ setup và sửa chữa thiết bị trong công ty";
    }

    @Override
    public String toString() {
        return "KyThuat[" + super.toString() +
                " ,chuyenNganh= " + chuyenNganh +
                ']';
    }
}
