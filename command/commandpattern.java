package com.bupt.kcrosswind.patterns;

public class commandpattern {// ������ǿͻ���

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();// �����͹ݣ���������Ա

		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);// ��д����//��Ҫ��չʱ ֻ��չ�����Ϳ�����

		remote.SetCommand(lightOn);// ����Ա���ݶ���
		remote.buttonWasPressed();// ����

		// ����Ա�����Ľ����� ���ͷ��ͽ��շ�
	}
}
