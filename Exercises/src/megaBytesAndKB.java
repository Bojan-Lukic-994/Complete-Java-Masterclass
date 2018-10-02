public class megaBytesAndKB {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-10);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){

        int MB = kiloBytes / 1024;
        int rest = kiloBytes % 1024;

        //prints out the number of KB and MB
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else
            System.out.println(kiloBytes + (" KB = ") + MB+(" MB and ")+rest+(" KB"));
    }
}
