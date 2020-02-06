
public class Date {
 private int year, day, month;
 
 Date(int theMonth, int theDay, int theYear){
	 year = theYear;
	 day = theDay;
	 month = theMonth;
 }
 
 public int getYear() {
	return year;
 }
 public int getDay() {
	 return day;
 }
 public int getMonth() {
	 return month;
 }
 public int dayOfYear(){
		int totalDays = 0;
		 switch (month) {
		 case 12: totalDays += 30;
		 case 11: totalDays += 31;
		 case 10: totalDays += 30;
		 case 9 : totalDays += 31;
		 case 8 : totalDays += 31;
		 case 7 : totalDays += 30;
		 case 6 : totalDays += 31;
		 case 5 : totalDays += 30;
		 case 4 : totalDays += 31;
		 case 3 : totalDays += 28;
		 case 2 : totalDays += 31;
	}
      totalDays += day;
      return totalDays;
	
}
	public int compare(Date dt) {
		int diff = Math.abs((dayOfYear() + 365 * year)-(dt.dayOfYear() + 365 * dt.year));
		
		int numMonths = diff/30;
		
		if (numMonths > 60){
			numMonths = 60;
		}
		
		return numMonths;
	}
	
}
