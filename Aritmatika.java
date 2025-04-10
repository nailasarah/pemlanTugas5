public class Aritmatika {

    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }

    public double hitungPembagian(String nil1, String nil2) {
        double a = Double.parseDouble(nil1);
        double b = Double.parseDouble(nil2);

        if (b == 0) {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }

        return a / b;
    }
}
