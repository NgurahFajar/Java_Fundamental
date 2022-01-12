public class ElseStatement{
    public static void main(String[] args) {
        var nilai = 80;
        var absen = 70;

        var lulusNilai = nilai>= 75;
        var lulusAbsen = absen >= 75;

        var lulus = lulusNilai && lulusAbsen;

        if(nilai >= 75 && absen >= 75) {
            System.out.println("Selamat Anda Lulus");
        } else {
                System.out.println("Silakan Coba Lagi Tahun Depan");
            }
        }

    }