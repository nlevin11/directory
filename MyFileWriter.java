
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;


public class MyFileWriter {
    public static void main(String[] args) throws IOException {
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(".hiddenpassword.txt"));
        bw.write ("lake123");
        bw.close();
        printFileSize(".hiddenpassword.txt");

        File hiddenFolder = new File (".hiddenFolder");
        if (!hiddenFolder.exists())
            hiddenFolder.mkdir();
        File hiddenFile = new File (hiddenFolder, ".classified.dat");
        BufferedWriter bw2 = new BufferedWriter(new FileWriter(hiddenFile));
        bw2.write ("this is top secret");
        bw2.close();
        printFileSize (".hiddenFolder/.classified.dat");
        printTotalFileSize("file1.txt", "directory1/file2.txt", ".hiddenDirectory/file3.txt");
        
        
    }

    // Calculate and print the file size using the File class
    private static void printFileSize(String fileName) {
        File file = new File (fileName);
        long bytes = file.length();
        System.out.println (bytes);
    }

    private static void printTotalFileSize(String... fileNames) {
        long totalSize = 0;
        for (String fileName : fileNames) {
            File file = new File(fileName);
            if (file.exists()) {
                totalSize += file.length();
            }
        }
        System.out.println("Total size of all files: " + totalSize + " bytes");
    }
}