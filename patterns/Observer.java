package com.bupt.kcrosswind.patterns;

public class Observer {

	public static void main(String[] args) {
		ConcreteSubject cs = new ConcreteSubject();
		ConcreteObserver co = new ConcreteObserver(cs);//������һ��д�����˹��캯�����ȫ���Բ�����

		cs.setData("hehe");
	}
}
