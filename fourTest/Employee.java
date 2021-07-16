package HumanResources;

class Employee extends Staff {
    
    private int gioLamThem;
    
    public Employee(String maSo, String hoTen, int tuoi, double heSoLuong, String ngayVao, String boPhan, 
    int soNgayPhep, int gioLamThem) {

        super(maSo, hoTen, tuoi, heSoLuong, ngayVao, boPhan, soNgayPhep);
        this.gioLamThem = gioLamThem;
    }
 
    @Override
    public double calculateSalary() {
        return (double) (getHeSoLuong() * 3000000 + gioLamThem * 200000);
    }
    @Override
    public void displayInformation() {

        System.out.println("Ma nhan vien: " + getMaSo() + ", Ten nhan vien: " + getHoTen() + ", Tuoi: " + getTuoi() +
         ", He so luong: " + getHeSoLuong() + ", Ngay vao cong ty: " + getNgayVao()  + "," + "\n" + " Bo phan lam viec: " 
         + getBoPhan() + ", So ngay nghi phep: " + getSoNgayPhep() + ", Gio lam them: " + gioLamThem + ", Luong: "
         + calculateSalary());

        System.out.println();
    }
}