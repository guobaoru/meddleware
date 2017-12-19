import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

public class Redis {
    public static void getKeys(){
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost",6379);
        System.out.println("连接成功");
        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it=keys.iterator() ;
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }
    }
    public static void main(String[] args) {
        getKeys();
    }
}
