package com.xkcoding.java8.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.*;

/**
 * <p>
 * 函数式接口测试类
 * </p>
 *
 * @package: com.xkcoding.java8.functional
 * @description： 函数式接口测试类
 * @author: yangkai.shen
 * @date: Created in 2018/7/19 下午5:11
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public class Main {
	/**
	 * 断言
	 */
	public void predicate() {
		Predicate<String> namesStartingWithS = name -> name.startsWith("s");
		boolean hello = namesStartingWithS.test("Hello"); // false
	}

	/**
	 * 消费数据
	 */
	public void consumer() {
		Consumer<String> messageConsumer = message -> System.out.println(message);
		Consumer<String> messageConsumer1 = System.out::println;
		messageConsumer.accept("Java8");  // Java8"
		messageConsumer1.accept("Java8");  // Java8"
	}

	/**
	 * 转换
	 */
	public void function() {
		Function<String, String> toUpperCase = name -> name.toUpperCase();
		Function<String, String> toUpperCase1 = String::toUpperCase;
		toUpperCase.apply("Java"); // JAVA
	}

	/**
	 * 提供数据
	 */
	public void supplier() {
		Supplier<String> uuidGenerator = () -> UUID.randomUUID().toString();
		System.out.println(uuidGenerator.get());

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 300; i < 400; i++) {
			list.add(i);
		}

		IntPredicate evenNumbers = (int i) -> i % 2 == 0;
		evenNumbers.test(1000);

		Predicate<Integer> oddNumbers = (Integer i) -> i % 2 == 1;
		oddNumbers.test(1000);

		Function<Integer, Integer> add1 = x -> x + 1;
		Function<String, String> concat = x -> x + 1;

		Integer two = add1.apply(1); // 2
		String answer = concat.apply("0 + 1 = "); // "0 + 1 = 1"

		BinaryOperator<Integer> sum = (a, b) -> a + b;
		Integer res = sum.apply(1, 2); // 3

	}
}
