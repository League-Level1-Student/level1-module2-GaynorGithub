
public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault(396582);
		JamesBond bond = new JamesBond(vault);
		vault.tryCode(1000000000);
		System.out.println(vault.tryCode(396582));
		System.out.println(bond.findCode(vault));
	}
}
