import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        Stream<String> stream = Files.lines(Paths.get(
                Main.class.getClassLoader().getResource("mnem.txt").getPath()
        ));

        System.out.println(MnemDel.func_1(stream));
    }

}
