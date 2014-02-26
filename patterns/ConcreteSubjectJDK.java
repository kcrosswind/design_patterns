package com.bupt.kcrosswind.patterns;

import java.util.Observable;

public class ConcreteSubjectJDK extends Observable {
	private String data;

	public ConcreteSubjectJDK() {// �۲����б���observable���Լ�ʵ���ˣ�
	}

	public void dataChanged() {
		setChanged();// �Դ�������ָʾ״̬�Ѿ��ı�
		notifyObservers();// û�д������ݣ�ʹ�õ��ǡ������ķ���������
	}

	public void setData(String data) {
		this.data = data;
		dataChanged();
	}

	public String getData() {// ��ȡ����ʱ���õ�
		return data;
	}

}
