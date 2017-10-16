
public class Model {
	private Tile[][] tiles;
	
	public Model () {
		this.tiles = new Tile[16][16];
	}
	
	public Model (int size) {
		this.tiles = new Tile[size][size];
	}

	public Tile[][] getTiles() {
		return this.tiles;
	}
	
	public boolean[] getWallsFromTile (int row, int col) {
		return tiles[row][col].getWalls();
	}
	
	public boolean tileHasRobot(int row, int col) {
		return tiles[row][col].hasRobot();
	}
	
	public int[] findRobot(int id) {
		
		for (int i = 0; i < tiles.length; i++) { 
			for (int j = 0; j < tiles[j].length; j++) { 
				if (id == tiles[i][j].getRobot().getId()) {
					int[] position = {i,j};
					return position;
				}
			}
		}
		int[] empty = {0,0};
		return empty;

	}
}
