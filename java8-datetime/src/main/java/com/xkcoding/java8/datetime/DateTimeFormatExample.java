package com.xkcoding.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * <p>
 * DateTimeFormatter 示例
 * </p>
 *
 * @package: com.xkcoding.java8.datetime
 * @description： DateTimeFormatter 示例
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午5:31
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class DateTimeFormatExample {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		String formattedDate = formatter.format(LocalDate.now());
		String formattedZonedDate = formatter.format(ZonedDateTime.now());

		System.out.println("LocalDate          : " + formattedDate);
		System.out.println("formattedZonedDate : " + formattedZonedDate);

		LocalDateTime dateTime = LocalDateTime.now();
		String strDate1 = dateTime.format(DateTimeFormatter.BASIC_ISO_DATE);    // 20180719
		String strDate2 = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);    // 2018-07-19
		String strDate3 = dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME);    // 当前时间
		String strDate4 = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));   // 2018-07-19
		// 今天是：2018年 七月 19日 星期四
		String strDate5 = dateTime.format(DateTimeFormatter.ofPattern("今天是：YYYY年 MMMM dd日 E", Locale.CHINESE));

		System.out.println(strDate1);
		System.out.println(strDate2);
		System.out.println(strDate3);
		System.out.println(strDate4);
		System.out.println(strDate5);

		// 将一个字符串解析成一个日期对象
		String strDate6 = "2018-07-19";
		String strDate7 = "2018-07-19 17:35:05";

		LocalDate date = LocalDate.parse(strDate6, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDateTime dateTime1 = LocalDateTime.parse(strDate7, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

		System.out.println(date);
		System.out.println(dateTime1);
	}
}
