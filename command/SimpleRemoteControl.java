package com.bupt.kcrosswind.patterns;

public class SimpleRemoteControl {// �൱�ڷ���Ա���Զ�������ͳһ����

	Command slot;

	public SimpleRemoteControl() {
	};

	public void SetCommand(Command command) {// ���ܶ���
		slot = command;
	}

	public void buttonWasPressed() {
		slot.excute();
	}
}
