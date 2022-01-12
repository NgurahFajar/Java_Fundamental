public class TernaryOperator {
    public static void main(String[] args) {
/*
        var nilai = 75;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Anda Lulus";
        } else {
            ucapan = "Anda Tidak Lulus";
        }
        System.out.println(ucapan);
        */

        // Dengan Ternary Operator
        var nilai = 75;
        String ucapan = nilai >= 75 ? "Anda Lulus" : "Anda Tidak Lulus ";

        System.out.println(ucapan);
    }
}
