import java.util.stream.Stream;

public class MnemDel {

    // todo: прочитай последнеюю строку в mnem.txt и исправь
    private static String regEx = "&(\\w|\\d|#)(\\w|\\d){1,};";

    public static String func_1(Stream<String> stream) {
        return stream.map(s -> s.replaceAll(regEx, "*")).reduce(String::concat).get();
    }

    public static String func_2() {
        return null;
    }

    public static String func_3() {
        return null;
    }

    public static String func_4() {
        return null;
    }

    public static String func_5() {
        return null;
    }

}
