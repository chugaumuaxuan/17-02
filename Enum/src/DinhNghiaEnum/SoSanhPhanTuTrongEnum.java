package DinhNghiaEnum;

public class SoSanhPhanTuTrongEnum {
	enum City{
		HaNoi, HaNam, HaDong, HaTay
	}
	
	public static void main(String[] args) {
		City city1 = City.HaNoi;
		City city2 = City.HaNam;
		
		if(city1.equals(city2)) {
			System.out.println("Day la Ha Noi");
		}else {
			System.out.println("Day khong phai la Ha Noi");
		}
		
		if(city1 == City.HaNoi) {
			System.out.println("Day la Ha Noi");
		}else {
			System.out.println("Day khong phai la Ha Noi");
		}
		
		
	}
}
