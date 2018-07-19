package com.xkcoding.java8.lambda;

import lombok.Builder;
import lombok.Data;

/**
 * <p>
 * 用户
 * </p>
 *
 * @package: com.xkcoding.java8.lambda
 * @description： 用户
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午3:16
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Builder
@Data
public class User {
	private Integer id;
	private String name;
	private Integer age;
	private Sex sex;
}
