package Lorry;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Transport {
	public static void main(String[] args) {
		int speed = 100;
		int distance = 700;
		LocalDateTime now = LocalDateTime.of(2023,03,11, 15,23 );
		Lorry obj = new Lorry(speed, distance, now);
		obj.calculateArrivalTime();
	}
}

class Lorry {
	int speed;
	int distance;
	LocalDateTime departureTime;

	public Lorry(int speed, int distance, LocalDateTime departureTime) {
		this.speed = speed;
		this.distance = distance;
		this.departureTime = departureTime;
	}
	public void calculateArrivalTime() {
		int totalTime = (distance / speed);
		int totalNoOfDays = 0;
		
		if (totalTime % 8 == 0) {
			totalNoOfDays = totalTime / 8;
		}
		else {
			totalNoOfDays = (totalTime / 8) + 1;
		}
		int i = 0;
		LocalTime currentTime=departureTime.toLocalTime();
		int remaining_time=totalTime%8;
		if(totalTime<=8) {
			remaining_time=totalTime;
		}
	    int arrival_time=remaining_time+currentTime.getHour();
	    int arrival_time1=currentTime.getMinute();
		LocalDateTime currentDate = departureTime;

		while (i < totalNoOfDays - 1) {
			if (isHoliday(currentDate)) {
				currentDate = currentDate.plusDays(1);

			} else {
				i++;
				currentDate = currentDate.plusDays(1);

			}

		}
		while(isHoliday(currentDate)) {
			currentDate = currentDate.plusDays(1);
		}
		System.out.println("ARRIVAL DATE:"+currentDate.getDayOfMonth()+":"+currentDate.getMonthValue()+":"+currentDate.getYear());
        System.out.println("ARRIVAL TIME:"+ arrival_time+":"+arrival_time1);
	}

	public boolean isHoliday(LocalDateTime date) {
		LocalDate localDate = date.toLocalDate();
		int dayOfYear = localDate.getDayOfYear();
		int dayOfMonth=localDate.getDayOfMonth();
        int month=localDate.getMonthValue();
		boolean isHoliday = (localDate.getDayOfWeek().getValue() == 7) // Sunday
				|| (dayOfYear == 1) // New Year's Day
				|| (month == 1 && dayOfMonth==26) // Republic Day
				|| (month == 8 && dayOfMonth==15) // Independence Day
				|| (month==12 && dayOfMonth==25); // Christmas
		Locale locale = Locale.ROOT;
	  //  System.out.println(is);
		int weekOfMonth = date.get(WeekFields.of(locale).weekOfMonth());
		if (weekOfMonth == 2 && localDate.getDayOfWeek().getValue() == 6) { // second saturday
			isHoliday = true;
			}
		DayOfWeek day=localDate.getDayOfWeek();
		System.out.println(isHoliday+""+month+""+dayOfMonth+""+day);
		return isHoliday;
	}
}
