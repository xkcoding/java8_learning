package com.xkcoding.java8.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * <p>
 * Duration 示例
 * </p>
 *
 * @package: com.xkcoding.java8.datetime
 * @description： Duration 示例
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午5:31
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class DurationExample {

	public static void main(String[] args) throws InterruptedException {

		// 创建Duration实例
		Instant first = Instant.now();
		Thread.sleep(3000);
		Instant second = Instant.now();
		Duration duration = Duration.between(first, second);

		// 访问Duration的时间
		long seconds = duration.getSeconds();

		System.out.println("相差 : " + seconds + " 秒");

		LocalDateTime from = LocalDateTime.now();
		LocalDateTime to = from.plusDays(5);
		Duration duration2 = Duration.between(from, to);

		System.out.println("从 from 到 to 相差 : " + duration2.toDays() + " 天");
	}
}
