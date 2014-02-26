package com.bupt.kcrosswind.patterns;

public class Observer {

	public static void main(String[] args) {
		ConcreteSubject cs = new ConcreteSubject();
		ConcreteObserver co = new ConcreteObserver(cs);//订阅这一步写死在了构造函数里，完全可以不这样

		cs.setData("hehe");
	}
}
