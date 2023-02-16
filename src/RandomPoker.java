import java.util.Random;

public class RandomPoker {
    public static void main(String[] args) {

        Random random = new Random();
        String[] niz = {"Heart", "Cherry", "Coin", "Melon", "Jocker"}; //pocetni niz

        String[] niz2 = {"Jocker", "Melon", "Melon", "Heart", "Coin"}; // ocekivani niz na izlazu
        String[] niz3 = {"Heart", "Cherry", "Coin", "Melon", "Jocker"}; //niz koji stampamo a koji treba da bude isti kao niz2


        while (!(niz3[0].equals("Jocker") && niz3[1].equals("Melon") && niz3[2].equals("Melon")
                && niz3[3].equals("Heart") && niz3[4].equals("Coin"))) {

            for (int j = 0; j < 5; j++) {

                int index = random.nextInt(niz.length);
                niz3[j] = niz[index];
            }
        }

        for (int i = 0; i < niz3.length; i++) {
            System.out.println(niz3[i]);
        }
    }
}