package setterinjection;

public class Key {
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "[key=" + key + "]";
	}
	
}
