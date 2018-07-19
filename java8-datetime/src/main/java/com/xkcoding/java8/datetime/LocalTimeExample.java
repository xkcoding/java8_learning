package com.xkcoding.java8.datetime;

import java.time.LocalTime;

/**
 * <p>
 * LocalTime 示例
 * </p>
 *
 * @package: com.xkcoding.java8.datetime
 * @description： LocalTime 示例
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午5:37
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class LocalTimeExample {

	public static void main(String[] args) {

		// 创建一个LocalTime实例
		LocalTime localTime = LocalTime.now();

		// 使用指定的时分秒和纳秒来新建对象
		LocalTime localTime2 = LocalTime.of(17, 40, 48, 11001);

		// 3小时后
		LocalTime localTimeLater = localTime.plusHours(3);
		// 3小时前
		LocalTime localTimeEarlier = localTime.minusHours(3);

		System.out.println("localTime       : " + localTime);
		System.out.println("localTime2      : " + localTime2);
		System.out.println("localTimeLater  : " + localTimeLater);
		System.out.println("localTimeEarlier: " + localTimeEarlier);
	}
}
