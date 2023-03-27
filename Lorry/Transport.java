package Lorry;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Transport {
	public static void main(String[] args) {
		int speed = 100;
		int distance = 2000;
		LocalDateTime now = LocalDateTime.of(1999, 12, 31, 10, 30);
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
		int remaining_time=totalNoOfDays%8;
	    int time=(totalTime%8);
	    int arrival_time=remaining_time+currentTime.getHour();
	    int arrival_time1=remaining_time+currentTime.getMinute();
		LocalDateTime currentDate = departureTime;

		while (i < totalNoOfDays - 1) {
			if (isHoliday(currentDate)) {
				currentDate = currentDate.plusDays(1);

			} else {
				i++;
				currentDate = currentDate.plusDays(1);

			}

		}
		System.out.println("ARRIVAL DATE:"+currentDate.getDayOfMonth()+":"+currentDate.getMonthValue()+":"+currentDate.getYear());
        System.out.println("ARRIVAL TIME:"+ arrival_time+":"+arrival_time1);
	}

	public boolean isHoliday(LocalDateTime date) {
		LocalDate localDate = date.toLocalDate();
		int dayOfYear = localDate.getDayOfYear();

		boolean isHoliday = (localDate.getDayOfWeek().getValue() == 7) // Sunday
				|| (dayOfYear == 1) // New Year's Day
				|| (dayOfYear == 15) // Republic Day
				|| (dayOfYear == 197) // Independence Day
				|| (dayOfYear == 361); // Christmas
		Locale locale = Locale.ROOT;
		int weekOfMonth = date.get(WeekFields.of(locale).weekOfMonth());
		if (weekOfMonth == 2 && localDate.getDayOfWeek().getValue() == 6) { // second saturday
			isHoliday = true;
			}
		return isHoliday;
	}
}
