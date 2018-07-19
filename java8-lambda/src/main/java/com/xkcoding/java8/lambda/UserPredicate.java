package com.xkcoding.java8.lambda;

/**
 * <p>
 * 用户过滤器
 * </p>
 *
 * @package: com.xkcoding.java8.lambda
 * @description： 用户过滤器
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午3:15
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public interface UserPredicate {

	/**
	 * 过滤方法
	 *
	 * @param user 用户实体
	 * @return <code>true</code>符合条件，<code>false</code>不符合条件
	 */
	boolean test(User user);
}
