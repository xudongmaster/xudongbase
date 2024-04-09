package com.xudongmaster.xudongbase.common.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
@Slf4j
class DefaultValueUtilTests {

    @Test
    void defaultValue() {
        String str1 = null;
        BigDecimal num1 = null;
        Integer num2 = null;
        Long num3 = null;
        Boolean num4 = null;
        LocalDateTime num5 = null;
        LocalDate num6 = null;
        log.info("String null:[{}]", DefaultValueUtil.defaultValue(str1));
        log.info("BigDecimal null:[{}]", DefaultValueUtil.defaultValue(num1));
        log.info("Integer null:[{}]", DefaultValueUtil.defaultValue(num2));
        log.info("Long null:[{}]", DefaultValueUtil.defaultValue(num3));
        log.info("Boolean null:[{}]", DefaultValueUtil.defaultValue(num4));
        log.info("LocalDateTime null:[{}]", DefaultValueUtil.defaultValue(num5));
        log.info("LocalDate null:[{}]", DefaultValueUtil.defaultValue(num6));
    }

}
