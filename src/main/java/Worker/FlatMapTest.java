package Worker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

    public static void main(String[] args) {

        ArrayList<Empp> emppList = new ArrayList<>(List.of(
                new Empp(Arrays.asList(12345, 6789)),
                new Empp(Arrays.asList(13627, 61418)),
                new Empp(Arrays.asList(89612, 629912))
                ));

        List<Integer> collect = emppList.stream()
                                        .flatMap(empp -> empp.getPhoneNumbers().stream())
                                        .collect(Collectors.toList());
        System.out.println(collect);
    }
}


class Empp{
    private List<Integer> phoneNumbers;

    public Empp() {
    }

    public Empp(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Empp{" + "phoneNumbers=" + phoneNumbers + '}';
    }
}