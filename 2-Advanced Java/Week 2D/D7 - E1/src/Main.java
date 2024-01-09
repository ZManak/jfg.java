import java.util.ArrayList;
import logic.Directory;

public class Main {
    public static void main(String[] args) {


        ArrayList<Directory> level1 = new ArrayList<>();
        ArrayList<Directory> level2 = new ArrayList<>();
        ArrayList<Directory> level3 = new ArrayList<>();

        Directory root = new Directory("root", null, level1);

        Directory dir1 = new Directory("dir1", root, level2);

        level1.add(dir1);

        Directory dir4 = new Directory("dir4", dir1, level3);
        Directory dir5 = new Directory("dir5", dir1, level3);

        level2.add(dir4);
        level2.add(dir5);

        Directory dir6 = new Directory("dir6", dir4, null);
        Directory dir7 = new Directory("dir7", dir4, null);

        level3.add(dir6);
        level3.add(dir7);

        root.scan();

    }
}
