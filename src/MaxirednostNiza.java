public class MaxirednostNiza {

    public static void main(String[] args) {

        int[] mojNiz = {55, 67, -20, 0, 88};
        int max = mojNiz[0];

        for (int i = 1; i < 5; i++) {
            if (mojNiz[i] > max) {
                max = mojNiz[i];
            }
        }
        System.out.println(max);

    }

}

// pretpostavimo da je max vrednost prvi clan niza. Kroz petlju pitamo da li je drugi clan niza veci od prvog,
// ako jeste, drugi clan niza stavljamo u max i tako prolazimo sve clanove niza. Na kraju stampamo max vrednost.
