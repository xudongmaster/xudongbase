package com.xudongmaster.xudongbase.common.util;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
@Slf4j
class KeyUtilTests {

    @Test
    void key() {
        Map<String, String> map = Maps.newHashMap();
        String key1 = KeyUtil.concatKey("1", "2");
        map.put(key1, "2");
        String key2 = KeyUtil.concatKey("3", "4");
        map.put(key2, "12");
        log.info("key1[{}] value[{}]", key1, map.get(key1));
        log.info("key2[{}] value[{}]", key2, map.get(key2));
    }

}
