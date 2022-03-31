package cn.zeroclian.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZeroClian
 * @date 2022-03-31 11:20 下午
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${spring.cloud.nacos.config.server-addr}")
    private String serverAddr;

    @GetMapping("/addr")
    public String getServerAddr() {
        return serverAddr;
    }
}
