package com.xkcoding.java8.lambda.predicate;

import com.xkcoding.java8.lambda.User;
import com.xkcoding.java8.lambda.UserPredicate;

/**
 * <p>
 * 年龄过滤器
 * </p>
 *
 * @package: com.xkcoding.java8.lambda.predicate
 * @description： 年龄过滤器
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午3:20
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class AgeUserPredicate implements UserPredicate {
	private Integer min;
	private Integer max;

	public AgeUserPredicate(Integer min, Integer max) {
		this.min = min;
		this.max = max;
	}

	/**
	 * 过滤年龄大于 min 且小于 max 的用户
	 *
	 * @param user 用户实体
	 * @return <code>true</code>符合条件，<code>false</code>不符合条件
	 */
	@Override
	public boolean test(User user) {
		return user.getAge() > min && user.getAge() < max;
	}
}
