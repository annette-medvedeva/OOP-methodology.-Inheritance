package com.company.Doc_Interface;

public class ExpertWorker extends ProDocumentWorker
{
    @Override
    public void SaveDocument()
    {
        System.out.println("Документ сохранен в новом формате");
    }
}
