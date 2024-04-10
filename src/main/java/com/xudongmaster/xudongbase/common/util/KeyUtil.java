package com.xudongmaster.xudongbase.common.util;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;

/**
 * key工具类
 * 设计初衷：为了方便从map取数据
 *
 * @author xudongmaster
 */
public class KeyUtil {
    public static String concatKey(String... strs) {
        if (ObjectUtil.isNull(strs) || strs.length == 0) {
            return StrUtil.EMPTY;
        }
        return StrUtil.join(StrUtil.COMMA, (Object) strs);
    }
}
