package HumanResources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HumanResources {

    static List<Staff>listStaff;
    static List<Department>listDepart;
    
    public static void main(String[] args) {

        initEmployeeList();

        initDepartList();

        int luaChon;
        String maBoPhan;
        String boPhan;

        Scanner sc = new Scanner(System.in);

        do {
            showMenu();
            System.out.println("Lua chon: ");
            luaChon = Integer.parseInt(sc.nextLine());

            switch(luaChon) {

                case 1: 
                    for (int i = 0; i < listStaff.size(); i++) {
                        Staff staff = listStaff.get(i);
                        staff.displayInformation();
                    }
                    break;

                case 2: 
                    for (Department d : listDepart) {
                        d.display();
                    }
                    break;

                case 3: 
                    // Nhap bo phan
                    System.out.println("Nhap ma bo phan: ");
                    maBoPhan = sc.nextLine();

                    // Lay ra thong tin bo phan và so sanh voi maBoPhan duoc nhap vao
                    // Hien thi thong tin
                    for (Staff s : listStaff) {
                        if (s.getBoPhan().equals(maBoPhan)) {
                            s.displayInformation();
                        }
                    }
                    break;

                case 4:
                    int chon;
                    // Kiem tra thong tin nhan vien can nhap
                    do {
                        System.out.println("Ban muon nhap thong tin (0: Nhan vien, 1: Quan ly): ");
                        chon = Integer.parseInt(sc.nextLine());
                    } while (chon!=0 && chon != 1);

                    // Nhap thong tin chung cho tat ca nhan vien

                    System.out.print("Nhap ma nhan vien: ");
                    String maSo = sc.nextLine();

                    System.out.print("Nhap ho ten nhan vien: ");
                    String hoTen = sc.nextLine();

                    System.out.print("Nhap tuoi: ");
                    int tuoi = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhap he so luong: ");
                    double heSoLuong = Double.parseDouble(sc.nextLine());

                    System.out.print("Nhap ngay vao cong ty: ");
                    String ngayVao = sc.nextLine();

                    System.out.print("Nhap bo phan: ");
                    boPhan = sc.nextLine();

                    System.out.print("So ngay nghi phep: ");
                    int soNgayPhep = Integer.parseInt(sc.nextLine());
                    
                    // Nhap thong tin rieng cho Employee va them vao listStaff
                    if (chon==0) {
                        System.out.print("So gio lam them: ");
                        int gioLamThem = Integer.parseInt(sc.nextLine());

                        Employee employee  = new Employee(maSo, hoTen, tuoi, heSoLuong, ngayVao, boPhan, soNgayPhep, gioLamThem);
                        listStaff.add(employee);

                    // Nhap thong tin rieng cho Manager va them va listStaff
                    } else {
                        System.out.print("Chuc danh: ");
                        String chucDanh = sc.nextLine();

                        Manager manager = new Manager(maSo, hoTen,  tuoi, heSoLuong, ngayVao, boPhan, soNgayPhep, chucDanh);
                        listStaff.add(manager);
                    }
                    break;

                case 5: 
                    // Nhap thong tin tim kiem
                    System.out.print("Nhap tim kiem: ");
                    String thongTin = sc.nextLine();

                    // So sanh va in ra thong tin
                    for (Staff s : listStaff) {
                        if (s.getHoTen().cequals(thongTin) || s.getBoPhan().equals(thongTin)) {
                            s.displayInformation();
                        }
                    }
                    break;

                case 6:
                    for (Staff s : listStaff) {
                        s.displaySalary();
                    }
                    break;
                    
                case 7:
                    Collections.sort(listStaff, new Comparator<Staff>(){

                        @Override
                        public int compare(Staff o1, Staff o2) {
                            return Double.compare(o1.calculateSalary(), o2.calculateSalary());
                        }
                    });

                    for (Staff s : listStaff) {
                        s.displaySalary();
                    }
                    break;

                case 8:
                    System.out.println("Hen gap lai");
                    break;
                    
                default:
                    System.out.println("Nhap sai! Vui long chon lai.");
                    break;
            }
        } while (luaChon != 8);
    }
    
    static void showMenu() {
        System.out.println("1. Hien thi danh sach nhan vien hien co trong cong ty");
        System.out.println("2. Hien thi cac bo phan trong cong ty");
        System.out.println("3. Hien thi cac nhan vien theo tung bo phan");
        System.out.println("4. Them nhan vien moi vao cong ty");
        System.out.println("5. Tim kiem thong tin nhan vien theo ten hoac ma nhan vien");
        System.out.println("6. Hien thi bang luong cua nhan vien toan cong ty");
        System.out.println("7. Hien thi bang luong cua nhan vien theo thu tu tang dan");
        System.out.println("8. Thoat");
    }

    public static void initEmployeeList() {
        // Khoi tao listStaff;
        listStaff = new ArrayList<>();

        Employee employee = new Employee("A001", "Nguyen Van A", 20, 1.2, "2021-02-02", "B01", 2, 10);
        listStaff.add(employee);
        Manager manager =  new Manager("M001", "Phan Thi M", 30, 1.5, "2021-03-03", "D02", 13, "Business Leader");
        listStaff.add(manager);
    }
    public static void initDepartList() {
        listDepart = new ArrayList<>();

        Department department1 = new Department("D01", "Nhan su", 3);
        listDepart.add(department1);

        Department department2 = new Department("D02", "Dao tao", 2);
        listDepart.add(department2);

        Department department3 = new Department("B01", "San xuat", 100);
        listDepart.add(department3);

        Department department4 = new Department("D04", "Van phong", 10);
        listDepart.add(department4);
    }
}
