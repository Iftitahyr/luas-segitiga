public class Main {
    public static double hitungLuas(double radius) {
            return Math.PI * radius * radius;
    }
    public static double hitungKeliling(double radius) {
            return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        double radius = 7.0;
        double luas = hitungLuas(radius);
        double keliling = hitungKeliling(radius);
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}