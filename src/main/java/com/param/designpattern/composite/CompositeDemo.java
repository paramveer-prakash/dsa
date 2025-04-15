package com.param.designpattern.composite;

public class CompositeDemo {

    public static void main(String[] args) {
        FileSystemComponent file1 = new File("Resume.pdf");
        FileSystemComponent file2 = new File("Photo.png");

        Folder documents = new Folder("Documents");
        documents.add(file1);

        Folder pictures = new Folder("Pictures");
        pictures.add(file2);

        Folder root = new Folder("Root");
        root.add(documents);
        root.add(pictures);

        root.showDetails("");
    }
}
