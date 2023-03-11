package ETC;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Generics {
    private void run(){
//        List<Integer> list = new LinkedList<>();
//        list.add(new Integer(1));
//        Integer i = list.iterator().next();
    }

    public <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

}
