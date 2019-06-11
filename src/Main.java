import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student = inputInfo();
        if (student.is18(student)) {
            showInfo(student);
        }
    }

    public static Student inputInfo() {
        Scanner scanner = new Scanner(System.in);
        String g, d;
        int n;
        System.out.print("nhap gioi tinh: ");
        g = scanner.next();
        System.out.print("nhap tuoi: ");
        n = scanner.nextInt();
        System.out.print("nhap dia chi: ");
        d = scanner.next();

        return new Student(g, n, d);
    }

    public static void showInfo(Student p) {
        System.out.println("gioi tinh: " + p.getGioiTinh() + ", ngay sinh: " + p.getTuoi() + ", dia chi: " + p.getDiaChi());
    }
}
