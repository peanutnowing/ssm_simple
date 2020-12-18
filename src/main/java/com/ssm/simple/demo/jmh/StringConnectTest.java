package com.ssm.simple.demo.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;


import java.util.concurrent.TimeUnit;

/**
 * JMH demo
 *
 * @Author peanutnowing
 * @Date 2020/6/11
 */
@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 5, time = 5)
@Threads(4)
@Fork(1)
@State(value = Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class StringConnectTest {
    @Param(value = {"10", "50", "100"})
    private int length;

    @Benchmark
    public void testStringAdd(Blackhole blackhole) {
        String a = "";
        for (int i = 0; i < length; i++) {
            a += i;
        }
        blackhole.consume(a);
    }

    @Benchmark
    public void testStringBuilderAdd(Blackhole blackhole) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(i);
        }
        blackhole.consume(sb.toString());
    }

    public static void main(String[] args) throws RunnerException {
    String str = "1\u0001\u00010\u0001913007545793142785\u0001{\"entityTitle\":\"直击女塔吊司机的私下生活, 两个事情让她们难堪\",\"content\":\"妇女能顶半边天\",\"user\":{\"id\":48847268496915,\"uname\":\"krn7bc\",\"headImg\":\"//pic1.58cdn.com.cn/m1/bigimage/n_v2e9d96e714b5145028c7b937c6f8d3a12.jpg\",\"uip\":null,\"userIDStr\":null,\"userType\":null,\"userTelephone\":null,\"vuser\":null,\"wuser\":null,\"userIdentity\":null,\"subscribeState\":null,\"medalList\":null,\"userEbtInfo\":null,\"cvipInfo\":null},\"toUser\":null,\"likeNum\":0,\"commentaryNum\":0,\"createdTime\":1506512936432,\"modifiedTime\":1573709032543,\"essencedTime\":null,\"partnerID\":0,\"whoLike\":null,\"isdel\":0,\"checkStatus\":1,\"commentID\":913007545793142785,\"businessID\":1,\"entityID\":8962521,\"purchaseNote\":{\"entityType\":null,\"platform\":null,\"additionalStatus\":null,\"semanticScore\":{\"bayesScore\":0.5},\"guanshui\":false},\"rejectReason\":null,\"category\":null,\"source\":null,\"likeNumPlus\":null,\"shareNum\":null,\"rankNum\":null,\"replyIDs\":null}\n" +
            "1\u0001\u00010\u0001917210127390498816\u0001{\"entityTitle\":\"false\",\"content\":\"@董平: ￥rIom048y6je\",\"user\":{\"id\":29585230205189,\"uname\":\"董平\",\"headImg\":\"//pic1.58cdn.com.cn/m1/bigimage/n_v2df116af8234b4dbabf6e1fda0e26bd5b.jpg\",\"uip\":null,\"userIDStr\":null,\"userType\":null,\"userTelephone\":null,\"vuser\":null,\"wuser\":null,\"userIdentity\":null,\"subscribeState\":null,\"medalList\":null,\"userEbtInfo\":null,\"cvipInfo\":null},\"toUser\":{\"id\":29585230205189,\"uname\":\"董平\",\"headImg\":\"//pic1.58cdn.com.cn/m1/bigimage/n_v2df116af8234b4dbabf6e1fda0e26bd5b.jpg\",\"uip\":null,\"userIDStr\":null,\"userType\":null,\"userTelephone\":null,\"vuser\":null,\"wuser\":null,\"userIdentity\":null,\"subscribeState\":null,\"medalList\":null,\"userEbtInfo\":null,\"cvipInfo\":null},\"likeNum\":0,\"commentaryNum\":0,\"createdTime\":1507514909966,\"modifiedTime\":1573709032557,\"essencedTime\":null,\"partnerID\":913214149096394752,\"whoLike\":null,\"isdel\":0,\"checkStatus\":3,\"commentID\":917210127390498816,\"businessID\":1,\"entityID\":8350702,\"purchaseNote\":{\"entityType\":null,\"platform\":null,\"additionalStatus\":null,\"semanticScore\":{\"bayesScore\":0.5},\"guanshui\":false},";


    String[] a = str.split("\1");
        System.out.println(a[2]);
    }


}
