import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MnemDel {


    public static void func_1(String file){
        final String regEx = "&.*?;";

        try (Stream<String> stream = Files.lines(Paths.get(file))){
            stream.map(s -> s.replaceAll(regEx, "*")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final String fileName = "/home/vladimir/Documents/Programms/Java/MnemDel/src/main/resources/mnem.txt";
        func_1(fileName);

    }
}
