package cn.kgc.spider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动类
 * @ServletComponentScan 开启过滤器
 */

@SpringBootApplication
@MapperScan("cn.kgc.spider.mapper")
@ServletComponentScan
public class SpiderStart {

	public static void main(String[] args) {
		SpringApplication.run(SpiderStart.class, args);
	}
}
