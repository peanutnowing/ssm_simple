package com.ssm.simple.utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * 工具类：时间处理
 *
 * @Author peanutnowing
 * @Date 2019/3/29
 */
public class DateUtil {
    /**
     * localDate转换为Date
     *
     * @param localDate
     * @return
     */
    public static Date getDateByLocalDate(LocalDate localDate) {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
        Date date = Date.from(instant);
        return date;
    }
}
