package com.example.pratica_jonathas.adapter.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "EnviarNotificacaoClient",
        url = "https://util.devi.tools/api/v2/authorize"
)
public interface AutorizarTransferenciaClient {

    @GetMapping("/autorizar/{autorizacao}")
    String autorizar(@PathVariable("autorizacao") String autorizacao);

}
