package com.ssm.simple.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 工具类：时间处理
 *
 * @Author peanutnowing
 * @Date 2019/3/29
 */
public class DateUtil {

    public static final String YYYYMMDD = "yyyyMMdd";

    public static final String YYYYMM = "yyyyMM";

    public static final String YYYY_MM_DD = "yyyy-MM-dd";

    public static final String YY_MM_DD = "yy-MM-dd";

    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    public static final String YY = "yy";

    public static final String MM = "MM";

    public static final String DD = "dd";

    public static final String MM月DD日_HH_MM = "MM月dd日 HH:mm";

    public static final String MM月DD日 = "MM月dd日";

    public static final String YYYY年MM月DD日HH时mm分 = "yyyy年MM月dd日HH时mm分";

    public static final String YYYY年MM月DD日 = "yyyy年MM月dd日";

    public static final String HH_MM_SS = "HH:mm:ss";

    public static final String[] weeks = new String[]{"周一", "周二", "周三", "周四", "周五", "周六", "周日"};

    private static final GregorianCalendar calendar = (GregorianCalendar) GregorianCalendar.getInstance();

    /**
     * SimpleDateFormat线程安全的使用方式
     */
    private static final ThreadLocal<SimpleDateFormat> formatLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(YYYY_MM_DD);
        }
    };
    private static final ThreadLocal<SimpleDateFormat> YYYYMMDDFormatLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(YYYYMMDD);
        }
    };

    private static final ThreadLocal<SimpleDateFormat> dateTimeFormatLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        }
    };

    private static final ThreadLocal<SimpleDateFormat> monthDayFormatLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(MM月DD日);
        }
    };

    private static final ThreadLocal<SimpleDateFormat> monthDateFormatLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(YYYYMM);
        }
    };

    private static final ThreadLocal<SimpleDateFormat> dateChinaFormatLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(YYYY年MM月DD日);
        }
    };

    /**
     * Date转换字符串yyyy-MM-dd
     * @param date
     * @return
     */
    public static String format(Date date) {
        return formatLocal.get().format(date);
    }

    /**
     * 字符串转Date
     * @param dateStr
     * @return
     * @throws ParseException
     */
    public static Date parse(String dateStr) throws ParseException {
        return formatLocal.get().parse(dateStr);
    }

    public static String formatByDateTime(Date date) {
        return dateTimeFormatLocal.get().format(date);
    }

    public static Date parseByDateTime(String dateStr) throws ParseException {
        return dateTimeFormatLocal.get().parse(dateStr);
    }

    public static String formatToyyyyMMdd(Date date) {
        return YYYYMMDDFormatLocal.get().format(date);
    }

    public static String formatMonthDateDay(Date date) {
        return monthDateFormatLocal.get().format(date);
    }

    public static String formatMonthDay(Date date) {
        return monthDayFormatLocal.get().format(date);
    }

    public static String formatToChina(Date date) {
        return dateChinaFormatLocal.get().format(date);
    }

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
