package java20240719_approach1;

import java20240719_approach.MyDate;

public class MyDateChild extends MyDate{

	/*
	public void setDay(int day) {
		this.day = day;
	}
	*/
	// protected int month
	// protected 멤버는 다른 패키지 내에서도 상속이 된다.
	public void setMonth(int month) {
		this.month = month;
	}
	
	// 다른 패키지에서 default 멤버는 상속되지 않음
	/*
	private void setYear(int year) {
		this.year = year;

	}
	*/
	
}
