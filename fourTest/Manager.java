package HumanResources;

class Manager extends Staff {

    private String chucDanh;
    private double heSoLuong;

    public static final double BusinessLeader = 8000000;
    public static final double ProjectLeader = 5000000;
    public static final double TechnicalLeader = 6000000;

    public Manager(String maSo, String hoTen, int tuoi, double heSoLuong, String ngayVao, String boPhan, int soNgayPhep, String chucDanh) {
        super(maSo, hoTen, tuoi, heSoLuong, ngayVao, boPhan, soNgayPhep);
        this.chucDanh = chucDanh;
    }
    
    public String getChucDanh() {
        return chucDanh;
    }

   // public double getHeSoLuong() {
    //    return heSoLuong;
    //}

    @Override
    public double calculateSalary() {
        if ("BusinessLeader".equals(chucDanh)) {
            return (double) (heSoLuong * 5000000 + 8000000);
        }else if ("ProjectLeader".equals(chucDanh)) {
            return (double) (heSoLuong * 5000000 + 5000000);
        } else  {
            return (double) (heSoLuong * 5000000 + 6000000); 
        }
    }

    @Override
    public void displayInformation() {
        System.out.println("Ma nhan vien: " + getMaSo() + ", Ten nhan vien: " + getHoTen() + ", Tuoi: " + getTuoi() +
         ", He so luong: " + getHeSoLuong() + ", Ngay vao cong ty: " + getNgayVao() + "," + "\n" +" Bo phan lam viec: " +
          getBoPhan() + ", So ngay nghi phep: "  + getSoNgayPhep() + ", Chuc danh: " + chucDanh + ", Luong: " 
          + calculateSalary()); 
         
        System.out.println();
    }
}
