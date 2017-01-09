package com.busnoseat.demoRabbitCon.service;

/**
 * The type UserListener.
 *
 * @author xubo
 * @Description:
 * @Date 2017/1/6
 */

public class UserListener {

    public void listen(Object data) {
        System.out.println("UserListener类listen方法接收参数:" + data);
    }
}
