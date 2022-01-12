 public class Variable {
    public static void main(String[] args) {

        /* Variable tidak boleh mengandung whitespace
            (spasi,enter,tab), dan tidak boleh seluruhnya number
         */
        String name;
        name = "Ngurah Fajar";
        System.out.println(name);

        int age = 30;
        String address = "Indonesia";
        System.out.println(age);
        System.out.println(address);

        name = "Ngurah aja";
        System.out.println(name);

        /*
        Var bisa langsung tapi isi langsung valuenya
         */
        var nama = "Agung"; // sukses


        /*
            Kata kunci final tidak bisa diubah lagi atau konstant
         */

        final String application = "Belajar Java";



    }
}
