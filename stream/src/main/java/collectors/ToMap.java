package collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMap {

    static class Obj {
        int var1;
        String var2;

        public Obj(int var1, String var2) {
            this.var1 = var1;
            this.var2 = var2;
        }

        @Override
        public String toString() {
            return "Obj{" +
                    "var1=" + var1 +
                    ", var2='" + var2 + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        var result = Stream.of(new Obj(1, "1"), new Obj(2, "2"))
                .collect(Collectors.toMap(
                        it -> it.var1,
                        it -> it.var2
                ));

        System.out.println(result);
    }
}