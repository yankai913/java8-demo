package com.zoo.java8.demo.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;


/**
 * lambda表达式的写法。
 * 
 * @author yankai913@gmail.com
 * @date 2016年8月22日
 */
public class LambdaWriting {

	void print_1() {
		// 无参数
		Runnable r = () -> {
			System.out.println("hello");
		};
		assert r != null;
	}

	void print_2() {
		// 有参数
		String[] arr = new String[] { "abc", "bc", "c" };
		Arrays.sort(arr, (first, second) -> Integer.compare(first.length(), second.length()));
	}
	
	void print_3() {
		//有返回类型
		BiFunction<String, String, Integer> f = (first, second) -> {
			return Integer.compare(first.length(), second.length());
		};
		assert f != null;
		
		Comparator<Integer> c = (first, second) -> {
			return Integer.compare(first, second);
		};
		assert c != null;
	}
	
	void print_4() {
		//方法引用
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.forEach(System.out::println);
		//等同于
		list.forEach(s -> System.out.println(s));
	}
}
