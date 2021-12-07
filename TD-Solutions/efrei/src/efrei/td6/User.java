package efrei.td6;

public class User {

	private int id;
	private String name;
	private String lastName;

	public User(int id, String name, String lastName) {
		this.setId(id);
		this.setName(name);
		this.setLastName(lastName);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
}
