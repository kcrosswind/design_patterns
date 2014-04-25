package com.bupt.kcrosswind.patterns;

public class ConcreteObserver implements ObserverMine, DisplayElement {

	private String data;
	private Subject concreteSubject;

	// ���캯����Ϊ�˷��㣬�ڴ����۲��ߺ�ֱ�Ӷ������⣬��ʵ���Ժܴ󣬷��������Զ���
	public ConcreteObserver(Subject concreteSubject) {
		this.concreteSubject = concreteSubject;
		concreteSubject.registerObserver(this);
	}

	@Override
	public void update(String data) {// ��������ã�����ֱ�Ӵ�������
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
