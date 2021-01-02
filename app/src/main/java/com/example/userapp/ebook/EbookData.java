package com.example.userapp.ebook;

public class EbookData {

    private String pdfTittle,pdfUrl;

    public EbookData() {
    }

    public EbookData(String pdfTittle, String pdfUrl) {
        this.pdfTittle = pdfTittle;
        this.pdfUrl = pdfUrl;
    }

    public String getPdfTittle() {
        return pdfTittle;
    }

    public void setPdfTittle(String pdfTittle) {
        this.pdfTittle = pdfTittle;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }
}
