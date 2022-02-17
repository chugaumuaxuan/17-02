package DinhNghiaEnum;

public class EnumOutside {
	public enum Car {
		
		Honda("xe may Honda"), Suzuki("xe may Suzuki"), Yamaha("xe may Yamaha");

		private String brandname;

		Car(String brandname) {
			this.brandname = brandname;
		}

		public String getBrandname() {
			return brandname;
		}
		
		public void setBrandname(String brandname) {
			this.brandname = brandname;
		}
		
	}
	
	enum Transport{
		moto("Xe may"), bike("Xe dap"), car("Xe hoi"), train("Tau Hoa"), ship("Tau Thuy");

		private String nameTransport;

		Transport(String nameTransport) {
			this.nameTransport = nameTransport;
		}

		public String getNameTransport() {
			return nameTransport;
		}

		public void setNameTransport(String nameTransport) {
			this.nameTransport = nameTransport;
		}
	}
	
	public static void main(String[] args) {
		Transport t = Transport.moto;;
		System.out.println(t + " "  + t.getNameTransport());
		
		for(Transport transport : Transport.values()) {
			System.out.println(transport + " " + transport.getNameTransport());
		}
	}
}
