package com.spark.platform.flowable.biz;

import com.spark.platform.common.security.annotation.EnableSparkResourceServer;
import com.spark.platform.flowable.biz.config.DatabaseAutoConfiguration;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import(value={DatabaseAutoConfiguration.class})
@SpringBootApplication
@EnableDiscoveryClient
@EnableSparkResourceServer
@EnableSwagger2Doc
public class SparkFlowableBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparkFlowableBizApplication.class, args);
    }

}
