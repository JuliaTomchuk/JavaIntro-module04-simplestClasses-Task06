package by.home.module04.task06.logic;

import by.home.module04.task06.entity.Time;

public class TimeLogic {

	public int addSeconds(int second, Time time) {

		int currentSecond = time.getSecond();

		if ((currentSecond + second) < 60) {
			time.setSecond(second + currentSecond);

		} else {

			int countOfSeconds = currentSecond + second;
			int countOfMinutes = 0;

			while (countOfSeconds >= 60) {

				countOfSeconds = countOfSeconds - 60;
				countOfMinutes++;

			}

			time.setSecond(countOfSeconds);

			addMinutes(countOfMinutes, time);

		}
		return time.getSecond();

	}

	public int addMinutes(int minute, Time time) {

		int currentMinutes = time.getMinute();
		int countOfMinutes = currentMinutes + minute;
		if (countOfMinutes < 60) {
			time.setMinute(countOfMinutes);

		} else {
			int countOfHours = 0;
			while (countOfMinutes >= 60) {
				countOfMinutes = countOfMinutes - 60;

				countOfHours++;
			}
			time.setMinute(countOfMinutes);
			addHours(countOfHours, time);
		}
		return time.getMinute();
	}

	public int addHours(int hour, Time time) {

		int currentHour = time.getHour();
		if ((currentHour + hour) < 24) {
			time.setHour(currentHour + hour);

		} else {
			time.setHour(0);
		}
		return time.getHour();
	}

}
