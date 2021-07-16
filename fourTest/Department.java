package HumanResources;

public class Department {
    private String maBoPhan;
    private String tenBoPhan;
    private int soLuongNV;

    public Department(String maBoPhan, String tenBoPhan, int soLuongNV) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.soLuongNV = soLuongNV;
    }

    public String getMaBoPhan() {
        return maBoPhan;
    }
    public String getTenBoPhan() {
        return tenBoPhan;
    }
    public int getSoLuongNV() {
        return soLuongNV;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }
    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }
    public void setSoLuongNV(int soLuongNV) {
        this.soLuongNV = soLuongNV;
    }

    public String toString() {
        return "Ma bo phan: " + getMaBoPhan() + ", Ten bo phan: " + getTenBoPhan() + ", So luong nhan vien: " 
        + getSoLuongNV();
    }
     
    public void display() {
        System.out.println(toString());
        System.out.println();
    }
}
