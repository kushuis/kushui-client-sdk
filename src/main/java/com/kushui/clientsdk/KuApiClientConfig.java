package com.kushui.clientsdk;

import com.kushui.clientsdk.client.KuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("kuapi.client")
@Data
@ComponentScan
public class KuApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public KuApiClient kuApiClient() {
        return new KuApiClient(accessKey, secretKey);
    }

}
