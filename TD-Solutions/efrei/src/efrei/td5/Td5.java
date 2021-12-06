package efrei.td5;

import java.util.Scanner;

public class Td5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Person p = new Person();
//		boolean wrongGenderChoice = true;
//		do {
//			System.out.println("Choose your gender: Male(M) Female(F) NonBinary(N) Other(O)");
//			String genderChoice = sc.next().toUpperCase();
//			wrongGenderChoice = false;
//			if (genderChoice.equals("M")) {
//				p.gender = Gender.MALE;
//			} else if (genderChoice.equals("F")) {
//				p.gender = Gender.FEMALE;
//			} else if (genderChoice.equals("N")) {
//				p.gender = Gender.NON_BINARY;
//			} else if (genderChoice.equals("O")) {
//				p.gender = Gender.OTHER;
//			} else {
//				wrongGenderChoice = true;
//			}
//		} while (wrongGenderChoice);
//		System.out.println(p.gender);
//		System.out.println(p.gender.genderCode);
//		
//		
//		for (Gender g : Gender.values()) {
//			System.out.printf("%s\t%d\t%d\n", g.name(), g.ordinal(), g.genderCode);
//		}
		
//		Gender g = Gender.FEMALE;
//		switch(g) {
//			case FEMALE: System.out.println("Une femme"); break;
//			case MALE: System.out.println("Un homme"); break;
//			case NON_BINARY: System.out.println("Un non genré"); break;
//			case OTHER: System.out.println("Autre"); break;
//			default: System.out.println("Valeur invalide");
//		}
//		System.out.println("Age?");
//		Person p = Person.initPerson();
//		p.setAge(sc.nextByte());
//		System.out.println(p.getAge());
//		sc.close();
		
//		Lampe l = new LampeAIncandescence();
//		l.on();
//		l.off();
//		LampeLED lLED = (LampeLED) l;
//		System.out.println(lLED.nbOfLights);
		
		Lampe[] lamps = {new LampeLED(), new LampeAIncandescence() };
		for(Lampe l : lamps) {
//			System.out.println(((LampeLED)l).nbOfLights);
			l.on();
		}
		
		for(Lampe l : lamps) {
			l.off();
		}
	}
}
