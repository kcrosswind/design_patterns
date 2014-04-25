package com.bupt.kcrosswind.patterns;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

	private ArrayList observers;// �������ڷ������ĵ����⣬������һ�������洢�۲����б�
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

	public void dataChanged() {// �������ݺ�ͬ�����͵��۲��ߣ��������ģʽ����
		notifyObservers();
	}

	public void setData(String data) {// �ⲿ�ӿڣ����ڸı������������
		this.data = data;
		dataChanged();

	}

}
