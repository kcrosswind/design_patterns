package com.bupt.kcrosswind.patterns;

public class commandpattern {// 这个就是客户了

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();// 来到餐馆，叫来服务员

		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);// 填写订单//需要扩展时 只扩展订单就可以了

		remote.SetCommand(lightOn);// 服务员传递订单
		remote.buttonWasPressed();// 做菜

		// 服务员完美的解耦了 发送方和接收方
	}
}
