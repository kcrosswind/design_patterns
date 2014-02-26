package com.bupt.kcrosswind.patterns;

public interface Subject {
	public void registerObserver(ObserverMine o);// 注册观察者

	public void removeObserver(ObserverMine o);// 删除观察者

	public void notifyObservers();// 通知观察者
}
