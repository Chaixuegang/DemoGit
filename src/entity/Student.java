package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		// Date date = new Date();
		// System.out.println(dateFormat.format(date));
		// Date date2 = new Date(2015, 1, 13);
		// System.out.println((date2.getTime() - date.getTime())
		// / (1000 * 60 * 60 * 24));
		// Date date3=new Date(date.getTime()+(1000 * 60 * 60 * 24));
		// System.out.println(dateFormat.format(date3));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));// 今天的日期
		calendar.set(Calendar.DAY_OF_MONTH,
				calendar.get(Calendar.DAY_OF_MONTH) + 1);// 让日期加1
		System.out.println(calendar.get(Calendar.DATE));// 加1之后的日期Top
	}
}
