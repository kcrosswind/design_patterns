package com.bupt.kcrosswind.patterns;

public class SimpleRemoteControl {// 相当于服务员，对订单进行统一操作

	Command slot;

	public SimpleRemoteControl() {
	};

	public void SetCommand(Command command) {// 接受订单
		slot = command;
	}

	public void buttonWasPressed() {
		slot.excute();
	}
}
