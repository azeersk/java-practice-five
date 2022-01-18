import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.stream.Stream;

public class interfaceJavaClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(874);
        arrayList.add(594);
        arrayList.add(832);
        arrayList.add(243);
        arrayList.add(945);
        arrayList.forEach(System.out::println);
        System.out.println();
        arrayList.stream().sorted().forEach(System.out::println);

        LocalDate d = LocalDate.now();
        System.out.println();
        System.out.print("Today date is: ");
        System.out.print(d);

        LocalTime t = LocalTime.now();
        System.out.println();
        System.out.print("present time is: ");
        System.out.println(t);

        t = LocalTime.of(12,45,8);
        System.out.println("time: "+t);
        d = LocalDate.of(2000,10,17);
        System.out.println("date: "+d);

    }
}
