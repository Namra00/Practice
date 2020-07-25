import java.io.File;

public class RemoveFiles {
    public static void main(String[] args) {
        File folder = new File("D:\\IMCS_Training\\TestFolder");
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.getName().startsWith("s") || f.getName().startsWith("S")) {
                    f.delete();
                }
            }
        }
    }
}