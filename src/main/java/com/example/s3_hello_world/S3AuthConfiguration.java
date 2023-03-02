package com.example.s3_hello_world;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;

@Configuration
public class S3AuthConfiguration {
    @Value("${aws.accessKeyId}")
    private String accessKey;

    @Value("${aws.secretKey}")
    private String secretKey;

    @Bean
    AwsBasicCredentials createBasicCreds(){
        return AwsBasicCredentials.create(accessKey, secretKey);
    }

//    @PostConstruct
//    public void setSystemProperty(){
//        SystemSettingUtilsTestBackdoor.addEnvironmentVariableOverride("AWS_ACCESS_KEY_ID", accessKey);
//        SystemSettingUtilsTestBackdoor.addEnvironmentVariableOverride("AWS_SECRET_ACCESS_KEY", secretKey);
//    }
}
