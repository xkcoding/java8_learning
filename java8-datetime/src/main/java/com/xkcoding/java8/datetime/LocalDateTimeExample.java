package com.xkcoding.java8.datetime;

import java.time.LocalDateTime;

/**
 * <p>
 * LocalDateTime 示例
 * </p>
 *
 * @package: com.xkcoding.java8.datetime
 * @description： LocalDateTime 示例
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午5:31
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class LocalDateTimeExample {

	public static void main(String[] args) {

		// 创建一个LocalDateTime实例
		LocalDateTime localDateTime = LocalDateTime.now();

		// 使用指定的年月日、时分秒、纳秒来新建对象
		LocalDateTime localDateTime2 = LocalDateTime.of(2018, 7, 19, 17, 40, 36, 123);

		// 3年后的现在
		LocalDateTime dt1 = localDateTime.plusYears(3);
		// 3年前的现在
		LocalDateTime dt2 = localDateTime.minusYears(3);

		System.out.println("localDateTime  : " + localDateTime);
		System.out.println("localDateTime2 : " + localDateTime2);
		System.out.println("dt1            : " + dt1);
		System.out.println("dt2            : " + dt2);
	}
}
