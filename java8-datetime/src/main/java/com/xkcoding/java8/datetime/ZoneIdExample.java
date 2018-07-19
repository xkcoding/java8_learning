package com.xkcoding.java8.datetime;

import java.time.ZoneId;
import java.util.TimeZone;

/**
 * <p>
 * ZoneId 示例
 * </p>
 *
 * @package: com.xkcoding.java8.datetime
 * @description： ZoneId 示例
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午5:31
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class ZoneIdExample {

	public static void main(String[] args) {

		// 获取系统默认时区
		ZoneId defaultZoneId = ZoneId.systemDefault();
		ZoneId shanghaiZoneId = ZoneId.of("Asia/Shanghai");

		// TimeZone 转换为 ZoneId
		ZoneId oldToNewZoneId = TimeZone.getDefault().toZoneId();

		System.out.println(defaultZoneId);
		System.out.println(shanghaiZoneId);
		System.out.println(oldToNewZoneId);

		System.out.println(ZoneId.getAvailableZoneIds());
	}
}
