package com.company.Doc;

public class Main {
    public static void main(String[] args) {
        int key_ext = 2;
        int key_pro = 1;
        DocumentWorker doc=null;

        switch (key_pro) {
            case 1:
                System.out.println(" You Use PRO version:  ");
        doc = new DocumentWorker();
        break;
            case 2:
                System.out.println("You User Expert version: ");
                doc = new ExpertDocumentWorker();
                break;
            default:
                doc= new DocumentWorker();
        }

        System.out.println(key_pro);
        doc.EditDocument();
        doc.OpenDocument();
        doc.SaveDocument();

    }
}
