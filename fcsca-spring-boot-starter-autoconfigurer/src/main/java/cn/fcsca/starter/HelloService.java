package cn.fcsca.starter;

import lombok.Data;

/**
 * HelloService
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 21:06 2018-08-14
 */
@Data
public class HelloService {

    HelloProperties helloProperties;

    public String sayHelloFcsca(String name) {
        return helloProperties.getPrefix()+ "-" + name + "-" + helloProperties.getSuffix();
    }
}
