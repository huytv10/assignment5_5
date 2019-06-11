public class Person {
    String gioiTinh;
    int tuoi;
    String diaChi;

    public Person() {

    }

    public Person(String gioiTinh, int tuoi, String diaChi) {
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
