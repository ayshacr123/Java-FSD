// Constructor for the Ustian's.main class where their details are created;


package functionintefrace;

/**
 * @author Administrator
 *
 */
public class UstiansFood {
	private String uID;
	private String name;
	public UstiansFood(String uID, String name) {
		super();
		this.uID = uID;
		this.name = name;
	}
	public String getuID() {
		return uID;
	}
	public void setuID(String uID) {
		this.uID = uID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
