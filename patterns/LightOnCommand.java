package com.bupt.kcrosswind.patterns;

public class LightOnCommand implements Command {

	Light light;

	// 某一道菜的订单，相当于将订单参数化

	public LightOnCommand(Light light) {// 以需要完成的对象为构造器
		this.light = light;// 找找this的用处！！
	}

	@Override
	public void excute() {// 调用接收对象的方法
		// TODO Auto-generated method stub

		light.on();
	}

}
