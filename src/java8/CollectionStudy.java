package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionStudy {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("aa","bb","cc","aa","dd");
        List<String> list2 = Arrays.asList("cc","hh","kk","aa","jj");
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs =
        numbers1.stream()
        .flatMap(i -> numbers2.stream().map(j -> new int[]{i, j}))
        .collect(Collectors.toList());
        
        list2.stream().anyMatch(l -> "hh".equals(l));//查询list中间否是有符合谓词的元素
        list2.stream().allMatch(l -> "hh".equals(l));//查询list中元素知否全部符合谓词
        
    }
}
