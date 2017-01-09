package com.busnoseat.denoRabbitPro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The type DemoProducer.
 *
 * @author xubo
 * @Description:
 * @Date 2017/1/9
 */

@Controller
public class DemoProducer {

    @RequestMapping("demoMessage")
    public String demoMessage() {
        System.out.println("成功进入DemoProducer");
        RabbitMqUtil.sendDate("com.busnoseat.use1r.user","HelloWorld");
        return "index";
    }
}
