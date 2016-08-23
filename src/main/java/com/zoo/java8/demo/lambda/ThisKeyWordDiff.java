package com.zoo.java8.demo.lambda;
/**
 * this关键字的不同:<br/>
 * <li>在lambda表达式中的this，表示创建该lambda表达式的对象。</li>
 * @author yankai913@gmail.com
 * @date 2016年8月22日
 */
public class ThisKeyWordDiff {

	public void doWork() {
		Runnable r = () -> {
			System.out.println(this.toString());
		};
		r.run();
	}

	public void doWork2() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println(this.toString());
			}

			@Override
			public String toString() {
				return "r";
			}
		};
		r.run();
	}

	@Override
	public String toString() {
		return "person";
	}

	public static void main(String[] args) {
		ThisKeyWordDiff p = new ThisKeyWordDiff();
		p.doWork();
		p.doWork2();
	}

}
