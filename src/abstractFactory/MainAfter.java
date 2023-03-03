package abstractFactory;

public class MainAfter {
	
	public static void main(String[] args) {
		Kingdom kingdom;
		
		kingdom = new Kingdom(new ElfKingdomFactory());
		kingdom.getDescription();
	
		kingdom = new Kingdom(new OrcKingdomFactory());
		kingdom.getDescription();
	}
}