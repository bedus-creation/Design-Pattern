package com.adapter;

import com.adapter.PdfReader;

public class FileReaderAdapter implements FileReaderInterface{

    protected PdfReader pdfReader;

    public FileReaderAdapter(PdfReader pdfReader){
        this.pdfReader=pdfReader;
    }

    public void read(){
        this.pdfReader.readPdfFile();
    }

}