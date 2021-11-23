package com.company.Doc;

public class ProDocumentWorker extends DocumentWorker {

    @Override
    public void SaveDocument() {
        super.SaveDocument();{
            System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии	" +
                    "Эксперт");
        }
    }

    @Override
    public void EditDocument() {
        super.EditDocument();{
            System.out.println("Документ отредактирован");
        }
    }
}
