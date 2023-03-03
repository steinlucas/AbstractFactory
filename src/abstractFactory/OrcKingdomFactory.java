package abstractFactory;

public class OrcKingdomFactory {
	
	public OrcKing MakeKing() {
		return new OrcKing();
	}
	
	public OrcCastle MakeCastle() {
		return new OrcCastle();
	}
	
	public OrcArmy MakeArmy() {
		return new OrcArmy();
	}
}