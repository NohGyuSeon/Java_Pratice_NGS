package NGS.NHN.code.day07;

public interface IPrintable {
	void print();
}

class Message implements IPrintable {
	private String message;

	public Message(String message) {
		this.message = message;
	}
	
	@Override
	public void print() {
		System.out.println(this.message);
	}
	
}
