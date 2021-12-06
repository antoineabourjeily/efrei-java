package efrei.td5;

import java.util.Date;

public class Person {
	private String nom;
	private String prenom;
	private byte age;
	Date doB;
	Gender gender;
	private double indiceSante = 0.8d;
	
	protected final String getFullName() {
		return String.format("%s, %s", nom.toUpperCase(), prenom);
	}

	public static Person initPerson() {
		return new Person();
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		if (age < 0) {
			System.out.println("C'est Benjamin Bottom?");
		} else if (age > 100) {
			System.out.println("C'est un vieux ou un éternel?");
		} else {
			this.age = age;
		}
	}

	public double getIndiceSante() {
		return indiceSante * 100;
	} 

	public void setIndiceSante(double indiceSante) {
		this.indiceSante = Math.max(0,Math.min(1, indiceSante / 100));
	}
	
	public boolean isInGoodShape() {
		return this.age * this.indiceSante > 10;
	}
	
	
}
