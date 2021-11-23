package com.company.Doc;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void SaveDocument() {
        super.SaveDocument();{
            System.out.println("Документ сохранен в новом формате");
        }
    }
}
