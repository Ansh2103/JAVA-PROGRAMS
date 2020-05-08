public class Pyramid_Star_Pattern2 {
    public static void main(String[] args) {
        int i, j, k = 1;

        for (i = 1; i <= 4; i++) {

            for (j = 0; j < k; j++)
                System.out.print(" * ");

            k = k + 2;
            System.out.println();
        }
    }
}
