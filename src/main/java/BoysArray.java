import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class BoysArray {
    public static void main(final String[] args) {
        final ArrayList<Boy> boys = new ArrayList<>() {{
            add(new Boy("Николай", 68));
            add(new Boy("Пётр", 53));
            add(new Boy("Василий", 25));
            add(new Boy("Михаил", 19));
            add(new Boy("Алексей", 6));
            add(new Boy("Николай", 86));
            add(new Boy("Пётр", 35));
            add(new Boy("Михаил", 111));
            add(new Boy("Алексей", 22));
            add(new Boy("Михаил", 1));
            add(new Boy("Яков", 30));
        }};
        Map<Object, Long> boysMap = boys.stream()
                .filter(x -> x.getAge() >= 18)
                .distinct().limit(4)
                .sorted(Comparator.comparing(Boy::getName))
                .collect((Collectors.groupingBy((p) -> p.getName(), Collectors.counting())));
        System.out.println(boysMap);

    }

}
