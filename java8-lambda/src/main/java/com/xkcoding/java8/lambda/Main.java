package com.xkcoding.java8.lambda;

import cn.hutool.json.JSONUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.google.common.collect.Lists;
import com.xkcoding.java8.lambda.predicate.AgeUserPredicate;
import com.xkcoding.java8.lambda.predicate.SexUserPredicate;

import java.util.Comparator;
import java.util.List;

/**
 * <p>
 * Lambda 测试类
 * </p>
 *
 * @package: com.xkcoding.java8.lambda
 * @description： Lambda 测试类
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午3:31
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class Main {
	private static final Log log = LogFactory.get();

	public static void main(String[] args) {
		List<User> userList = buildData();

		List<User> usersFilterByAge = filterUser(userList, new AgeUserPredicate(20, 30));
		log.info("【年龄在20-30之间的用户】：{}", JSONUtil.toJsonStr(usersFilterByAge));

		List<User> usersFilterBySex = filterUser(userList, new SexUserPredicate(Sex.MALE));
		log.info("【所有的男性用户】：{}", JSONUtil.toJsonStr(usersFilterBySex));

		// 不使用 lambda
		List<User> usersFilterById1 = filterUser(userList, new UserPredicate() {
			@Override
			public boolean test(User user) {
				return user.getSex().equals(Sex.FEMALE) && user.getAge() > 20;
			}
		});
		log.info("【大于20岁的女性用户】：{}", JSONUtil.toJsonStr(usersFilterById1));

		// 使用 lambda
		List<User> usersFilterById2 = filterUser(userList, user -> user.getId() > 4);
		log.info("【id大于4的用户】：{}", JSONUtil.toJsonStr(usersFilterById2));

		// 方法引用
		userList.sort(Comparator.comparing(User::getAge));
		log.info("【按照年龄排序】：{}", JSONUtil.toJsonStr(userList));

		// 构造线程
		// 不使用 lambda
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				log.info("测试线程1");
			}
		});
		// 使用 lambda
		Thread thread2 = new Thread(() -> log.info("测试线程2"));


		thread1.start();
		thread2.start();

	}

	public static List<User> filterUser(List<User> userList, UserPredicate predicate) {
		List<User> users = Lists.newArrayList();
		for (User user : userList) {
			if (predicate.test(user)) {
				users.add(user);
			}
		}
		return users;
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
