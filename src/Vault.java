
public class Vault {
	private int code;
	
	Vault(int code) {
		this.code = code;
	}
	
	boolean tryCode(int code) {
		
		if(this.code == code) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
}
