package com.bupt.kcrosswind.patterns;

import java.util.Observable;

public class ConcreteSubjectJDK extends Observable {
	private String data;

	public ConcreteSubjectJDK() {// 观察者列表在observable内自己实现了！
	}

	public void dataChanged() {
		setChanged();// 自带方法，指示状态已经改变
		notifyObservers();// 没有传送数据，使用的是”拉“的方法！！！
	}

	public void setData(String data) {
		this.data = data;
		dataChanged();
	}

	public String getData() {// 拉取数据时会用到
		return data;
	}

}
