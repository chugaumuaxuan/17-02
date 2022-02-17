package DinhNghiaEnum;
import DinhNghiaEnum.EnumOutside.Car;
import DinhNghiaEnum.EnumOutside.Car.*;

enum Month{
	Jan, Feb, Mar, April, May, June, July, Aug, Sep, Oct, Nov, Dec;
}

public class EnumInClass {
	public enum Season{
		Spring, Summer, Autumn, Winter	
	}
	
	
	public static void main(String[] args) {
		Season s = Season.Autumn;
		Month m = Month.Sep;
		
		System.out.println(s + " in " + m);
		
		for(Season season: Season.values()) {
			System.out.println(season);
		}
		
		for(Month month : Month.values()) {
			System.out.println(month);
		}
		
		for(Car car : Car.values()) {
			System.out.println(car +" " + car.getBrandname());
		}
		
	}
}



