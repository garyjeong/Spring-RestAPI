package com.gary.restapidocs;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RestController
public class indexController {
    @GetMapping("/index")
    public String index() {
        log.debug("디버그");
        log.info("인포");
        log.warn("경고");
        log.error("에러");
        return "index ok";
    }

}
