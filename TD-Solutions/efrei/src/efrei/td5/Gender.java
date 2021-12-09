package efrei.td5;

public enum Gender {
	FEMALE((byte) 2), 
	MALE((byte) 1), 
	NON_BINARY((byte) 3), 
	OTHER((byte) 4);

	public final byte genderCode;

	private Gender(byte genderCode) {
		this.genderCode = genderCode;
	}

	public static Gender fromGenderCode(byte genderCode) {
		for (Gender g : Gender.values()) {
			if (g.genderCode == genderCode)
				return g;
		}
		return OTHER;
	}
}
