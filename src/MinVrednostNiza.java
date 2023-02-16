public class MinVrednostNiza {
    public static void main(String[] args) {

        int[] mojNiz = {55, 67, -20, 0, 88};
        int min = mojNiz[0];

        for (int i = 1; i < 5; i++) {
            if (mojNiz[i] < min) {
                min = mojNiz[i];
            }
        }
        System.out.println(min);

    }

}

//suprotno od max
