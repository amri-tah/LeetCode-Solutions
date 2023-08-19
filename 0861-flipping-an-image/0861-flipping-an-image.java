class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length; row++) {
            int n = image[row].length - 1;
            for (int i = 0; i <= n / 2; i++) {  
                int temp = image[row][n - i];  
                image[row][n - i] = image[row][i];  
                image[row][i] = temp;
            }
            for (int j = 0; j <= n; j++) {  
                image[row][j] = (image[row][j] == 0) ? 1 : 0;
            }
        }
        return image;
    }
}
