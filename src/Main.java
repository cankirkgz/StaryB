public class Main {
    public static void main(String[] args) {
        int row = 7;
        int col = 7;
        char[][] letterB = new char[row][col];

        // Harf "B"yi oluşturan yıldızları atama
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == 0 || j == col - 1 || (i == row / 2 && j < col - 2) || (i == 0 && j < col - 2) || (i == row - 1 && j < col - 2))
                    letterB[i][j] = '*';
                else
                    letterB[i][j] = ' ';
            }
        }

        // Harf "B"yi ekrana yazdırma
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(letterB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
