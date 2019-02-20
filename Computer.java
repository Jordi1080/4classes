import java.util.HashSet;
import java.util.Set;

public class Computer {
	Set<Game> games; //  = new HashSet<Game>();
	boolean staatAan;
	
	public Computer(Set<Game> games, boolean staatAan){
		this.games = games;
		this.staatAan = staatAan;
	}
}
