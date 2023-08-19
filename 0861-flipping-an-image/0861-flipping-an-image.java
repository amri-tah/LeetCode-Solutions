class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length; row++) {
            int n = image[row].length - 1;
            for (int i = 0; i <= n / 2; i++) {  
                int temp = image[row][n - i]^1;  
                image[row][n - i] = image[row][i]^1;  
                image[row][i] = temp;
            }
        }
        return image;
    }
}
