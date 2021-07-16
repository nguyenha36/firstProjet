package HumanResources;

public abstract class Staff implements ICalculator {
    private  String maSo;
    private  String hoTen;
    private  int tuoi;
    private  String ngayVao;
    private  String boPhan;
    private int soNgayPhep;
    private double heSoLuong;

    public Staff(String maSo, String hoTen, int tuoi, double heSoLuong, String ngayVao, String boPhan, int soNgayPhep) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.heSoLuong = heSoLuong;
        this.ngayVao = ngayVao;
        this.boPhan = boPhan;
        this.soNgayPhep = soNgayPhep;
    } 
    
    protected String getMaSo() {
        return maSo;
    }
    public String getHoTen() {
        return hoTen;
    }
    public int getTuoi() {
        return tuoi;
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    public String getNgayVao() {
        return ngayVao;
    }
    public String getBoPhan() {
        return boPhan;
    }
    public int getSoNgayPhep() {
        return soNgayPhep;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void seHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public void setNgayVao(String ngayVao) {
        this.ngayVao = ngayVao;
    }
    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }
    public void setSoNgayPhep(int soNgayPhep) {
        this.soNgayPhep = soNgayPhep;
    }

    public abstract void displayInformation();

    public void displaySalary() {
        System.out.println("Ma nhan vien: " + maSo + ", Ho ten nhan vien: " + hoTen + ", luong: " + calculateSalary());
        System.out.println();
    }
 }
