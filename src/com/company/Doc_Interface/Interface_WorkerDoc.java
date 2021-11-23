package com.company.Doc_Interface;

public interface Interface_WorkerDoc {
default void OpenDocument(){
    System.out.println("Документ открыт");
}
    void EditDocument();

    void SaveDocument();
}
