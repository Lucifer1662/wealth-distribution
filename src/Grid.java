import java.util.ArrayList;
import java.util.List;

public class Grid {
	
	private List<Person> population;
	private List<List<Cell>> cells;
	
	Grid(int size, int numPeople){
		cells = new ArrayList<List<Cell>>();
		for(int x = 0; x < size; x ++) {
			var column = new ArrayList<Cell>();
			for(int y = 0; y < size; y++ ) {
				column.add(new Cell(x,y));
			}
			cells.add(column);
		}
		
		population = new ArrayList<Person>();
		for(int i = 0; i < numPeople; i ++) {
			population.add(new Person(this));
		}
	}
	
	public Cell cellAt(int x, int y) {
		return null;
	}
	
	public void tick() {
		
		
	}
	
	public List<Person> getPopulation(){
		return population;
	}
}
