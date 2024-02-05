package prj230222;

public class Serie {
	
	private int Position;
	private String Club;
	private int Played;
	private int Won;
	private int Drawn;
	private int Lost;
	private int Points;
	
	
	public Serie() {}
	
	public Serie(int Position,String Club,int Won,int Drawn,int Lost) {
		this.Position=Position;
		this.Club=Club;	
		this.Played=Won+Drawn+Lost;
		this.Won=Won;
		this.Drawn=Drawn;
		this.Lost=Lost;
		this.Points=Won*3+Drawn;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Position+"\t"+Club+"\t"+Played+"\t"+Won+"\t"+Drawn+"\t"+Lost+"\t"+Points;

	}

}
