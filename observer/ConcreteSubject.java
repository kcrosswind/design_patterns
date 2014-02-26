package com.bupt.kcrosswind.patterns;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

	private ArrayList observers;// 可以用于发布订阅的主题，必须有一个容器存储观察者列表
	private String data;

	public ConcreteSubject() {
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(ObserverMine o) {
		// TODO Auto-generated method stub

		observers.add(o);
	}

	@Override
	public void removeObserver(ObserverMine o) {
		// TODO Auto-generated method stub

		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub

		for (int i = 0; i < observers.size(); i++) {
			ObserverMine observer = (ObserverMine) observers.get(i);
			observer.update(data);
		}
	}

	public void dataChanged() {// 更新数据后同步推送到观察者！这个推送模式！！
		notifyObservers();
	}

	public void setData(String data) {// 外部接口，用于改变主题类的数据
		this.data = data;
		dataChanged();

	}

}
