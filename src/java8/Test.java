package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public class Test {

    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList();
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("name", "liukai");
        map1.put("dptId", "2");
        map1.put("age", 32);
        map1.put("salary", 3000);
        map1.put("sex", 1);
        list.add(map1);
        
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("name", "zhangsan");
        map2.put("dptId", "2");
        map2.put("age", 33);
        map2.put("salary", 4000);
        map2.put("sex", 1);
        list.add(map2);
        
        Map<String, Object> map3 = new HashMap<String, Object>();
        map3.put("name", "lisi");
        map3.put("dptId", "3");
        map3.put("age", 28);
        map3.put("salary", 3500);
        map3.put("sex", 0);
        list.add(map3);
        
        Map<String, Object> map4 = new HashMap<String, Object>();
        map4.put("name", "wangwu");
        map4.put("dptId", "3");
        map4.put("age", 34);
        map4.put("salary", 10000);
        map4.put("sex", 0);
        list.add(map4);
        
        //Map<Object, List<Map<String, Object>>> map =  list.stream().collect(Collectors.groupingBy(m -> m.get("dptId")));
        //int s = list.stream().mapToInt(m -> Integer.parseInt(m.get("salary").toString())).sum();
        //OptionalDouble s = list.stream().mapToInt(m -> Integer.parseInt(m.get("salary").toString())).average();
        int s = list.stream().map(m -> Integer.parseInt(m.get("salary").toString())).reduce(0, (t1, t2) -> t1+t2);
        System.out.println(s);

    }

}
