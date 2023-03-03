package abstractFactory;

public class ElfKingdomFactory {
	
	public ElfKing MakeKing() {
		return new ElfKing();
	}
	
	public ElfCastle MakeCastle() {
		return new ElfCastle();
	}
	
	public ElfArmy MakeArmy() {
		return new ElfArmy();
	}
}