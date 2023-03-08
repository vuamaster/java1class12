package KiemTra.cau3;

import java.util.StringTokenizer;

public class VanBan {
    private String noiDung;

    public VanBan() {
    }

    public VanBan(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
    public String vietHoa(){
        String viethoa = noiDung.toUpperCase();
        return viethoa;
    }
    public String vietThuong(){
        String vietthuong = noiDung.toLowerCase();
        return vietthuong;
    }
    public int demSoTu(){
        StringTokenizer stringTokenizer =new StringTokenizer(noiDung);
        int sotu = stringTokenizer.countTokens();
        return sotu;
    }
    public String chuanHoaNoiDung(){
        String chuanhoa = noiDung.trim().replaceAll("\\s+"," ");
        return chuanhoa;
    }
    public String vietHoaChuCaiDau(){
        String tudautien = noiDung.substring(0,1);
        String cactuconlai = noiDung.substring(1,noiDung.length());
        tudautien = tudautien.toUpperCase();
        String viethoa = tudautien + cactuconlai;
        return viethoa;
    }

    @Override
    public String toString() {
        return "VanBan[" +
                "noiDung= " + noiDung +
                ']';
    }
}
