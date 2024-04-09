package com.xudongmaster.xudongbase.common.util;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 默认值工具类
 * 设计初衷：避免空指针异常
 *
 * @author xudongmaster
 */
public class DefaultValueUtil {

    public static <T> T value(T displayValue, T defaultValue) {
        if (ObjectUtil.isNull(displayValue)) {
            return defaultValue;
        }
        return displayValue;
    }

    public static BigDecimal defaultValue(BigDecimal displayValue) {
        return value(displayValue, BigDecimal.ZERO);
    }

    public static Integer defaultValue(Integer displayValue) {
        return value(displayValue, 0);
    }

    public static Long defaultValue(Long displayValue) {
        return value(displayValue, 0l);
    }

    public static String defaultValue(String displayValue) {
        return value(displayValue, StrUtil.EMPTY);
    }

    public static Boolean defaultValue(Boolean displayValue) {
        return value(displayValue, Boolean.FALSE);
    }

    public static LocalDateTime defaultValue(LocalDateTime displayValue) {
        return value(displayValue, LocalDateTime.now());
    }

    public static LocalDate defaultValue(LocalDate displayValue) {
        return value(displayValue, LocalDate.now());
    }

}
