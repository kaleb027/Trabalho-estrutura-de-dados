public class Idades {
    public static void main(String[] args) {
        int[] idades = {12, 25, 17, 30, 15, 20, 19, 40, 10, 22};
        System.out.println("Idades maiores que 18:");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 18) {
                System.out.println(idades[i]);
            }
        }
    }
}
