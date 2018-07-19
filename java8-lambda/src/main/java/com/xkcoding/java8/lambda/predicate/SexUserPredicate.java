package com.xkcoding.java8.lambda.predicate;

import com.xkcoding.java8.lambda.Sex;
import com.xkcoding.java8.lambda.User;
import com.xkcoding.java8.lambda.UserPredicate;

/**
 * <p>
 * 性别过滤器
 * </p>
 *
 * @package: com.xkcoding.java8.lambda.predicate
 * @description： 性别过滤器
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午3:26
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class SexUserPredicate implements UserPredicate {
	private Sex sex;

	public SexUserPredicate(Sex sex) {
		this.sex = sex;
	}

	/**
	 * 性别过滤
	 *
	 * @param user 用户实体
	 * @return <code>true</code>符合条件，<code>false</code>不符合条件
	 */
	@Override
	public boolean test(User user) {
		return this.sex.equals(user.getSex());
	}
}
