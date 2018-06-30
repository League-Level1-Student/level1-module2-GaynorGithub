
public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		
		
		if(isKnighted == true) {
			if(isWoman == true) {
				return "Hello Lady " + name;
			}
			if(isWoman == false) {
				return "Hello Sir " + name;
			}
			else {
				return "Wrong!";
			}
		}
		if(isKnighted == false) {
			if(isWoman == true) {
				return "Hello Ms. " + name;
			}
			if(isWoman == false) {
				return "Hello Mr. " + name;
			}
			else {
				return "Wrong!";
			}
		}
		else {
			return "";
		}
		
		
		
    }
}
