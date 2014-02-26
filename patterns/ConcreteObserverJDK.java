package com.bupt.kcrosswind.patterns;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserverJDK implements Observer, DisplayElement {

	Observable observable;
	private String data;

	public ConcreteObserverJDK(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(data);
	}

	@Override
	public void update(Observable o, Object arg) {// 这是在主动的拉数据
		// TODO Auto-generated method stub

		if (o instanceof ConcreteSubjectJDK) {
			ConcreteSubjectJDK cojdk = new ConcreteSubjectJDK();
			this.data = cojdk.getData();
			display();
		}
	}

}
