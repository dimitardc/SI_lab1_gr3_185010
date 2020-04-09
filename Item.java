class Item {
	int id;
	String name;
	double price;
	char A;

	public Item(int id, String name, double price, char a) {
		this.id = id;
		this.name = name;
		this.price = price;
		A = a;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setA(char a) {
		A = a;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public char getA() {
		return A;
	}

	double taxReturn () {
		return price*0.15;
	}
}