package com.ljk.spring.cloud.controller;

import com.ljk.spring.cloud.service.FeignService;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;

/**
 * 手动创建 Feign client：https://cloud.spring.io/spring-cloud-openfeign/reference/html/#creating-feign-clients-manually
 *
 * @author jiangkui
 * @version 1.0, 2019-10-01 12:26
 */
@Import(FeignClientsConfiguration.class)
public class FeignController {

    private FeignService fooClient;

    private FeignService adminClient;

    @Autowired
    public FeignController(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        this.fooClient = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("user", "user"))
                .target(FeignService.class, "https://PROD-SVC");

        this.adminClient = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("admin", "admin"))
                .target(FeignService.class, "https://PROD-SVC");
    }
}
