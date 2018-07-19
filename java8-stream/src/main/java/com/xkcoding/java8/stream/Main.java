package com.xkcoding.java8.stream;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/**
 * <p>
 * Stream 测试类
 * </p>
 *
 * @package: com.xkcoding.java8.stream
 * @description： Stream 测试类
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午5:31
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class Main {
	public static void main(String[] args) {
		List<User> users = buildData();

		// 获取所有大于 25 岁的用户
		List<User> users1 = users.stream().filter(user -> user.getAge() > 25).collect(Collectors.toList());

		// 平均年龄
		OptionalDouble average = users.stream().mapToInt(User::getAge).average();
		if (average.isPresent()) {
			System.out.println(average.getAsDouble());
		}

		// 按照年龄正序排序
		users.sort(Comparator.comparing(User::getAge));

		// 按照年龄倒序排序
		users = users.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());

	}

	/**
	 * mock 假数据
	 */
	private static List<User> buildData() {
		List<User> userList = Lists.newArrayList();

		userList.add(User.builder().id(1).name("测试用户1").age(18).sex(Sex.MALE).build());
		userList.add(User.builder().id(2).name("测试用户2").age(5).sex(Sex.MALE).build());
		userList.add(User.builder().id(3).name("测试用户3").age(20).sex(Sex.FEMALE).build());
		userList.add(User.builder().id(4).name("测试用户4").age(28).sex(Sex.MALE).build());
		userList.add(User.builder().id(5).name("测试用户5").age(23).sex(Sex.FEMALE).build());
		userList.add(User.builder().id(6).name("测试用户6").age(40).sex(Sex.FEMALE).build());
		userList.add(User.builder().id(7).name("测试用户7").age(37).sex(Sex.MALE).build());
		userList.add(User.builder().id(8).name("测试用户8").age(30).sex(Sex.MALE).build());
		userList.add(User.builder().id(9).name("测试用户9").age(20).sex(Sex.MALE).build());

		return userList;
	}
}
