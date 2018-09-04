
public class JamesBond {
	private Vault vault;
	
	
	JamesBond(Vault vault) {
		this.vault = vault;
	}
	
	
	int findCode(Vault vault) {
		
		for (int i = 0; i < 1000000; i++) {
			if(vault.tryCode(i)) {
				return i;
			}
		}
		
		return 0;
		
	}
}
