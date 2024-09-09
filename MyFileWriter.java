
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;


public class MyFileWriter {
    public static void main(String[] args) throws IOException {
        // String data = "Hello, World!";
        // String fileName1 = "example.txt";
        // String fileName2 = "example2.txt";
        // String fileName3 = "example3.txt";
        // String fileName4 = "example4.txt";
        // String fileName5 = "example5.txt";

        // 1. Using FileWriter
        // try (FileWriter writer = new FileWriter(fileName1)) {
        //     writer.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 2. Using BufferedWriter
        // try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hiddenpassword.txt"))) {
        //     bufferedWriter.write(data);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        BufferedWriter bw = new BufferedWriter(new FileWriter(".hiddenpassword.txt"));
        bw.write ("lake123");
        bw.close();

        File hiddenFolder = new File (".hiddenFolder");
        if (!hiddenFolder.exists())
            hiddenFolder.mkdir();
        File hiddenFile = new File (hiddenFolder, "classified");
        BufferedWriter bw2 = new BufferedWriter(new FileWriter(hiddenFile));
        bw2.write ("this is top secret");
        bw2.close();
        // 3. Using FileOutputStream
        // try (FileOutputStream outputStream = new FileOutputStream(fileName3)) {
        //     outputStream.write(data.getBytes());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 4. Using BufferedOutputStream
        // try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName4))) {
        //     bufferedOutputStream.write(data.getBytes());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 5. Using Files (java.nio.file)
        // try {
        //     Files.write(Paths.get(fileName5), data.getBytes(StandardCharsets.UTF_8));
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }
}