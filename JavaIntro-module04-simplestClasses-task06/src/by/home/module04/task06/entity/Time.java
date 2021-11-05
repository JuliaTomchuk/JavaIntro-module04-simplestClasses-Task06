package by.home.module04.task06.entity;

/*Cоствьте описание класса для предоставления времени. Предусмотрите возможности установки времени
 *  и изменения его отдельных полей (час, минута, секунда)
 *  с проверкой допустимости вводимых значений. В случае недопустимых значений полей, поле устанавливается  в значение 0. 
 *  Создать методы изменения времени на заданное количество часов, минут и секунд*/
public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public void setHour(int hour) {
		if (hour > 23 || hour < 0) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setMinute(int minute) {
		
		if (minute > 59 || minute < 0) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
		

	}

	public int getMinute() {
		return minute;
	}

	public void setSecond(int second) {
		if (second > 59 || second < 0) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}

	public int getSecond() {
		return second;
	}

	@Override

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + hour;
		result = result * prime + minute;
		result = result * prime + second;
		return result;
	}

	@Override

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Time other = (Time) o;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;

		return true;

	}

	@Override

	public String toString() {

		return getClass().getSimpleName() + " [ hour = " + hour + ", minute = " + minute + ", second = " + second
				+ " ]";
	}

}
