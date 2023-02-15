package study;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * 클래스 설명
 *
 * @author : yunji
 * @version : 1.0.0
 * @date : 2023/02/15
 */
public class FileConverter {

    public static void main(String arg[]) throws IOException {
        String originDir = "/Users/admin/yunji.project/algorithm-study/array_algorithm/";
        Set<String> files = listFilesUsingFilesList(originDir);

        for(String fileName : files) {
            Path oldFile = Paths.get(originDir+fileName);
            Path newFile = Paths.get(originDir+fileName + "_");
            try {
                BufferedReader reader = Files.newBufferedReader(oldFile, Charset.forName("EUC-KR"));
                BufferedWriter writer = Files.newBufferedWriter(newFile, StandardCharsets.UTF_8);

                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }

                writer.flush();
                reader.close();
                writer.close();

                Files.copy(newFile, oldFile, REPLACE_EXISTING);
                Files.deleteIfExists(newFile);

            } catch (Exception e) {
                System.out.println(e.getClass().getName() + "  " +e.getMessage());
                continue;
            }
        }
    }

    public static Set<String> listFilesUsingFilesList(String dir) throws IOException {
        try (Stream<Path> stream = Files.list(Paths.get(dir))) {
            return stream
                    .filter(file -> !Files.isDirectory(file))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toSet());
        }
    }
}
