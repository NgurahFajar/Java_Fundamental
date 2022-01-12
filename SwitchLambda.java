public class SwitchLambda {
    public static void main(String[] args) {
        //Switch biasa
        var nilai = "A";
        switch (nilai) {
            case "A":
                System.out.println("wow, Anda Lulus");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Belum Cukup Baik");
            case "D":
                System.out.println("Anda Tidak Lulus");
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }
        // Switch Lambda (hanya java 14 keatas, syntax lebbih simple)
        switch (nilai){
            case "A" -> System.out.println("Wow, Anda Lulus");
            case "B", "C" -> System.out.println("Nilai Anda Belum Cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default ->
                System.out.println("Mungkin Anda Salah Jurusan");
        }
        // switch tanpa yield
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Wow, Anda Lulus";
            case "B", "C" -> ucapan = "Nilai Anda Belum Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default ->
             ucapan = "Mungkin Anda Salah Jurusan";
        }
        System.out.println(ucapan);

        // Menggunakan Yield (harus pake : tidak bisa ->)
        ucapan = switch (nilai){
            case "A":
                yield "Wow, Anda Lulus";
            case "B", "C":
                    yield "Nilai Anda Cukup Baik";
            case "D": yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";

        };
        System.out.println(ucapan);
        }
}
