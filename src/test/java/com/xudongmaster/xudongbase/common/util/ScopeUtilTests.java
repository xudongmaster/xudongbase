package com.xudongmaster.xudongbase.common.util;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Map;

@SpringBootTest
@Slf4j
class ScopeUtilTests {

    @Test
    void scope() {
        int num1 = 1;
        int num2 = 6;
        int num3 = 4;
        int num4 = 9;
        log.info("{}是否在[{}-{}],结果：{}", num2, num3, num4, ScopeUtil.isBetween(num2, num3, num4));
        log.info("{}是否在[{}-{}],结果：{}", num1, num3, num4, ScopeUtil.isBetween(num1, num3, num4));
        log.info("[{}-{}]和[{}-{}]是否存在交集,结果：{}", num1, num2, num3, num4, ScopeUtil.isIntersection(num1, num2, num3, num4));
        log.info("[{}-{}]和[{}-{}]是否存在交集,结果：{}", num1, num3, num2, num4, ScopeUtil.isIntersection(num1, num3, num2, num4));
        LocalDate localDate1 = LocalDate.parse("2024-04-01");
        LocalDate localDate2 = LocalDate.parse("2024-04-06");
        LocalDate localDate3 = LocalDate.parse("2024-04-04");
        LocalDate localDate4 = LocalDate.parse("2024-04-09");
        log.info("{}是否在[{}~{}],结果：{}", localDate2, localDate3, localDate4, ScopeUtil.isBetween(localDate2, localDate3, localDate4));
        log.info("{}是否在[{}~{}],结果：{}", localDate1, localDate3, localDate4, ScopeUtil.isBetween(localDate1, localDate3, localDate4));
        log.info("[{}~{}]和[{}~{}]是否存在交集,结果：{}", localDate1, localDate2, localDate3, localDate4, ScopeUtil.isIntersection(localDate1, localDate2, localDate3, localDate4));
        log.info("[{}~{}]和[{}~{}]是否存在交集,结果：{}", localDate1, localDate3, localDate2, localDate4, ScopeUtil.isIntersection(localDate1, localDate3, localDate2, localDate4));

    }

}
