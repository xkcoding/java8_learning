package com.xkcoding.java8.datetime;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

/**
 * <p>
 * Clock 示例
 * </p>
 *
 * @package: com.xkcoding.java8.datetime
 * @description： Clock 示例
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午5:31
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class ClockExample {

	public static void main(String[] args) {
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();
		Instant instant = clock.instant();
		Date legacyDate = Date.from(instant);   // legacy java.util.Date
		System.out.println(millis);
		System.out.println(legacyDate);
	}
}
