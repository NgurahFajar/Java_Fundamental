public class ForEach {
    public static void main(String[] args) {

        String[] array = {
                "EKO", "Kurniawan", "Khannedy",
                "Program", "Jaman", "Now"
        };
/*
Tanpa For Each

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);

 */
        // Dengan For Each :
        System.out.println("ForEach");
        for (var name: array){
            System.out.println(name);
        }

        }
    }
