package com.xkcoding.java8.functional.lambda;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * <p>
 * lambda + functional
 * </p>
 *
 * @package: com.xkcoding.java8.functional.lambda
 * @description： lambda + functional
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午5:22
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class Main {
	public static void main(String[] args) {
		List<User> userList = buildData();

		// 取所有女性的名称
		List<String> names = getNames(userList, user -> user.getSex().equals(Sex.FEMALE), User::getName);
		System.out.println(names);
	}

	public static <R> List<R> getNames(List<User> userList, Predicate<User> predicate, Function<User, R> function) {
		List<R> names = new ArrayList<>();

		for (User user : userList) {
			if (predicate.test(user)) {
				names.add(function.apply(user));
			}
		}
		return names;
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
