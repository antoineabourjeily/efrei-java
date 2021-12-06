package efrei.td5;

public enum Gender {
	FEMALE((byte)2),
	MALE((byte)1),
	NON_BINARY((byte)3),
	OTHER((byte)4);
	
	public final byte genderCode;
	private Gender(byte genderCode) {
		this.genderCode = genderCode;
	}
}
