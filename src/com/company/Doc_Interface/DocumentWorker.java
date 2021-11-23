package com.company.Doc_Interface;

public class DocumentWorker implements Interface_WorkerDoc {

    @Override
    public void EditDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }

    @Override
    public void SaveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");

    }
}
