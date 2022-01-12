public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";
        switch (nilai){
            case "A":
                System.out.println("wow, Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Belum Cukup Baik");
            case "D":
                System.out.println("Anda Tidak Lulus");
            default:
                System.out.println("Mungkin Anda Salah Jurusan");


        }
    }
}
