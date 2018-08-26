package cn.fcsca.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * HelloProperties
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 21:07 2018-08-14
 */
@Data
@ConfigurationProperties(prefix = "fcsca.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;
}
