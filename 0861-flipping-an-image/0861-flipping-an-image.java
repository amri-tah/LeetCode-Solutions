class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row<image.length; row++){
            int left = 0, right = image[row].length-1;
            while (left<right){
                int temp = image[row][right];
                image[row][right] =  image[row][left];
                image[row][left] = temp;
                left++;
                right--;
            }
            for (int j = 0; j<image[row].length; j++){
                image[row][j] = (image[row][j]==0)?1:0;
            }
        }
        return image;
    }
}