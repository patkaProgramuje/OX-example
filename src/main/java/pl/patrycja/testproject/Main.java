package pl.patrycja.testproject;

public class Main {

    public static void main(String[] args) {

        int[][] tab = new int[1000][1000];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = 0;
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
