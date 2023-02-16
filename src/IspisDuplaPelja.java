public class IspisDuplaPelja {
    public static void main(String[] args) {

        int [][] niz2d = new int[][]{{1,2,8}, {3,4,10}, {5,6,15}};

        for (int i = 0; i < niz2d.length; i++) {
            for (int j = 0; j < niz2d[i].length; j++) {
                System.out.println("Index i je: " + i + " , clan je: " + niz2d[i][j]);
            }
            System.out.println();
        }
    }
}

//sa i itertiramo kroz indekse (podnozove). Sa drugom j iteracijom prolazimo kroz clanove indeksa tj podniza i.