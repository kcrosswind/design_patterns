package com.bupt.kcrosswind.patterns;

public class LightOnCommand implements Command {

	Light light;

	// ĳһ���˵Ķ������൱�ڽ�����������

	public LightOnCommand(Light light) {// ����Ҫ��ɵĶ���Ϊ������
		this.light = light;// ����this���ô�����
	}

	@Override
	public void excute() {// ���ý��ն���ķ���
		// TODO Auto-generated method stub

		light.on();
	}

}
