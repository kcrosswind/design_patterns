package com.bupt.kcrosswind.patterns;

public class ConcreteObserver implements ObserverMine, DisplayElement {

	private String data;
	private Subject concreteSubject;

	// 构造函数，为了方便，在创建观察者后直接订阅主题，其实弹性很大，方法可以自定义
	public ConcreteObserver(Subject concreteSubject) {
		this.concreteSubject = concreteSubject;
		concreteSubject.registerObserver(this);
	}

	@Override
	public void update(String data) {// 供主题调用，参数直接传进来了
		// TODO Auto-generated method stub

		this.data = data;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		System.out.println(data);
	}

}
