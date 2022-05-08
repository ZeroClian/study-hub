package cn.zeroclian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZeroClian
 * @date 2022-05-07 3:42 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MiniApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiniApplication.class, args);
    }
}
