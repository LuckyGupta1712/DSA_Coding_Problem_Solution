class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc]==color){
            return image;
        }
        fill(image,sr,sc, image[sr][sc],color);
        
        return image;
    }
    private void fill(int[][] image, int sr, int sc, int initialColor, int color){
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=initialColor){
            return;
        }
        image[sr][sc]=color;
        fill(image,sr+1,sc, initialColor,color);
        fill(image,sr-1,sc, initialColor,color);
        fill(image,sr,sc+1, initialColor,color);
        fill(image,sr,sc-1, initialColor,color);
    }
}
