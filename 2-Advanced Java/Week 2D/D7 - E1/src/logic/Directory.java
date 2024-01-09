package logic;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Directory {
    private String name;
    private Directory parent;
    private ArrayList<Directory> children;

    public Directory() {
    }
    public Directory(String name, Directory parent, ArrayList<Directory> children) {
        this.name = name;
        this.parent = parent;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    public List<Directory> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Directory> children) {
        this.children = children;
    }

    public void addChild(Directory child) {
        this.children.add(child);
    }


    private void scan(Directory dir, int level) { // level 0 means root
        for (int i = 0; i < level; i++) {
            System.out.print("      ");
        }
        for (int i = level - 1; i < level; i++) {
            System.out.print("|_____");
        }
        System.out.println(dir.getName());
        if (dir.getChildren() == null) {
            return;
        }
        for (Directory child : dir.getChildren()) { // recursion explores all children
            scan(child,  level + 1);
        }
    }

    public void scan() {
        scan(this, 0);
    }

public void scan(String name) { // scan a specific directory
        for (Directory child : this.getChildren()) {
            if (child.getName().equals(name)) {
                scan(child, 0);
                return;
            }
        }
        System.out.println("Directory not found");
    }

    public void print() {
        System.out.println("Directory name: " + this.getName());
        System.out.println("Parent name: " + this.getParent().getName());
        System.out.println("Children names: ");
        for (Directory child : this.getChildren()) {
            System.out.println(child.getName());
        }
    }

    public void printAll() { // print all directories - recursive
        System.out.println("Directory name: " + this.getName());
        System.out.println("Parent name: " + this.getParent().getName());
        System.out.println("Children names: ");
        for (Directory child : this.getChildren()) {
            System.out.println(child.getName());
            child.printAll();
        }
    }

}
