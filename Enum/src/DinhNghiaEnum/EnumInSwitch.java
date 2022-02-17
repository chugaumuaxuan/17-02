package DinhNghiaEnum;

public class EnumInSwitch {
	enum Day{
		mon, tues, wed, thus, fri, sat, sun
	}
	
	public static void main(String[] args) {
		Day day = Day.thus;
		
		switch(day) {
			case mon: System.out.println("Hom nay la thu hai");
			break;
			case tues: System.out.println("Hom nay la thu ba");
			break;
			case wed: System.out.println("Hom nay la thu tu");
			break;
			case thus: System.out.println("Hom nay la thu nam");
			break;
			case fri: System.out.println("Hom nay la thu sau");
			break;
			case sat: System.out.println("Hom nay la thu bay");
			break;
			case sun: System.out.println("Hom nay la chu nhat");
			break;	
		}
	}
}
