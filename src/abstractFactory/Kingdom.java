package abstractFactory;

public class Kingdom {
	
	String KingdomFactoryType = "";
	
	public Kingdom(ElfKingdomFactory factory) {
		ElfKing elfKing = factory.MakeKing();
		ElfCastle elfCastle = factory.MakeCastle();
		ElfArmy elfArmy = factory.MakeArmy();
		
		KingdomFactoryType = elfKing.getDescription() + "\n" +
			             	 elfCastle.getDescription() + "\n" +
			             	 elfArmy.getDescription();
	}
	
	public Kingdom(OrcKingdomFactory factory) {
		OrcKing orcKing = factory.MakeKing();
		OrcCastle orcCastle = factory.MakeCastle();
		OrcArmy orcArmy = factory.MakeArmy();
		
		KingdomFactoryType = orcKing.getDescription() + "\n" +
				     		 orcCastle.getDescription() + "\n" +
				             orcArmy.getDescription();
	}

	public void getDescription() {
		System.out.println(KingdomFactoryType);
	}
}