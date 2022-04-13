package StructuralPattern.CompositePattern.ex2;

public class FileLeaf implements FileComponent{
    private String name;
    private long size;

    public FileLeaf(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showProperty() {
        System.out.println(this.toString());
    }

    @Override
    public long totalSize() {
        return size;
    }

    @Override
    public String toString() {
        return "FileLeaf{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
