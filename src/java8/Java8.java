package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {

  public static void main(String[] args) {
    mapLoop();
    filterExample();
    sortMap();
    groupingByToMap();
    arrayToStream();
  }

  public static void mapLoop() {
    Map<String, Integer> map = new HashMap<>();
    map.put("test", 10);
    map.put("best", 20);

    map.forEach((k, v) -> {
      System.out.println(k+","+v);
      if(k.equals("test")) {
        System.out.println("If condition");
      }
    });

//    for(Map.Entry<String, Integer> ent: map.entrySet()) {
//      System.out.println(ent.getKey()+","+ent.getValue());
//    }

  }

  public static void filterExample() {
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(10);

    List<Integer> listInt = list.stream()
            .filter(x -> {if(x==2) return true;
            return false;})
            .map(x -> x*2)
            .collect(Collectors.toList());

//    List<StaffPublic> result = staff.stream().map(temp -> {
//      StaffPublic obj = new StaffPublic();
//      obj.setName(temp.getName());
//      obj.setAge(temp.getAge());
//      if ("mkyong".equals(temp.getName())) {
//        obj.setExtra("this field is for mkyong only!");
//      }
//      return obj;
//    }).collect(Collectors.toList());
  }

  public static void groupingByToMap() {
    List<String> list = Arrays.asList("bat", "ball");
    Map<String, Long> map = list.stream()
            .collect(
                    Collectors.groupingBy(Function.identity(), Collectors.counting())
            );

//    Map<BigDecimal, Set<String>> result =
//            items.stream().collect(
//                    Collectors.groupingBy(Item::getPrice,
//                            Collectors.mapping(Item::getName, Collectors.toSet())
//                    )
//            );
  }

  public static void arrayToStream() {
    String[] array = {"a", "b"};

    Stream<String> test = Arrays.stream(array);
    test.forEach(x -> System.out.println("test"));
  }

  public static void sortMap() {
    Map<String, Integer> map = new HashMap<>();
    map.put("test", 10);
    map.put("best", 20);

    Map<String, Integer> newMap = map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(Map.Entry:: getKey, Map.Entry :: getValue,
                    (oldValue, newValue) -> oldValue, LinkedHashMap:: new));

    //reverse order sort by value
    Map<String, Integer> result = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                    (oldValue, newValue) -> oldValue, LinkedHashMap::new));

    List<String> listKeys = new ArrayList<>();
    List<Integer> listValues = map.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
    .peek(k -> listKeys.add(k.getKey()))
    .map(v -> v.getValue()).collect(Collectors.toList());

// Convert Map keys to a List
//    List<String> result = new ArrayList(map.keySet());

// Convert Map values to a List
//    List<String> result2 = new ArrayList(map.values());
  }

}
