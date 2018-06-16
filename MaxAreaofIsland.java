package leetcode;

public class MaxAreaofIsland {
    public int maxAreaOfIsland(int[][] grid) {
    	int max_area = 0;
    	for(int i=0;i<grid.length;i++) {
    		for(int j=0;j<grid[0].length;j++) {
    			if(grid[i][j]==1)
    				max_area = Math.max(max_area, findAreaOfIsland(grid,i,j));
    		}
    	}    	
        return max_area;
    }
    
    private int findAreaOfIsland(int[][] grid, int i, int j) {
    	if(i>=0&&i<grid.length&&j>=0&&j<grid[0].length&&grid[i][j]==1) {
    		grid[i][j]=0;
    		return 1+findAreaOfIsland(grid,i+1,j)+findAreaOfIsland(grid,i-1,j)+findAreaOfIsland(grid,i,j+1)+findAreaOfIsland(grid,i,j-1);
    	}
    	return 0;
    }
}
