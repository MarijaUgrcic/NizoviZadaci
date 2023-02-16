import java.util.Random;

public class RandomPoker {
    public static void main(String[] args) {

        Random random = new Random();
        String[] niz = {"Heart", "Cherry", "Coin", "Melon", "Jocker"}; //pocetni niz

        String[] niz2 = {"Jocker", "Melon", "Melon", "Heart", "Coin"}; // ocekivani niz na izlazu
        String[] niz3 = {"Heart", "Cherry", "Coin", "Melon", "Jocker"}; //niz koji stampamo a koji treba da bude isti kao niz2


        while (!(niz3[0].equals("Jocker") && niz3[1].equals("Melon") && niz3[2].equals("Melon")
                && niz3[3].equals("Heart") && niz3[4].equals("Coin"))) {

            int index = random.nextInt(niz.length);
            niz3[0] = niz[index];
            int index1 = random.nextInt(niz.length);
            niz3[1] = niz[index1];
            int index2 = random.nextInt(niz.length);
            niz3[2] = niz[index2];
            int index3 = random.nextInt(niz.length);
            niz3[3] = niz[index3];
            int index4 = random.nextInt(niz.length);
            niz3[4] = niz[index4];

        }

        for (int i = 0; i < niz3.length; i++) {
            System.out.println(niz3[i]);
        }
    }
}
