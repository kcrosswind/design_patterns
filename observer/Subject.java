package com.bupt.kcrosswind.patterns;

public interface Subject {
	public void registerObserver(ObserverMine o);// ע��۲���

	public void removeObserver(ObserverMine o);// ɾ���۲���

	public void notifyObservers();// ֪ͨ�۲���
}
