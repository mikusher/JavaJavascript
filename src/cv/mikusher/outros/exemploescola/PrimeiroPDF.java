/*
 * Copyright (C) 2016 Miky Mikusher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */

package cv.mikusher.outros.exemploescola;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Luis Amilcar D. N. Tavares
 * @nickname Miky Mikusher
 */

public class PrimeiroPDF {
    public static void main(String[] args) throws Exception{
        Document doc = null;
        OutputStream os = null;
        
        try {
            doc = new Document(PageSize.A4, 72, 72, 72, 72);
            
            os = new FileOutputStream("C://outPdf.pdf");
            
            PdfWriter.getInstance(doc, os);
            
            
            doc.open();
            Font ftT = new Font(Font.FontFamily.COURIER, 20, Font.BOLD);
               
            Paragraph pr_1 = new Paragraph("Meu primeiro arquivo PDF.", ftT);
            doc.add(pr_1);
            
            Paragraph pr_2 = new Paragraph("Ola mundo, um documento PDF criado em JAVA");
            doc.add(pr_2);
            
            //Image img = Image.getInstance("mikusher.jpg");
            //img.setAlignment(Element.ALIGN_CENTER);
            //doc.add(img);
            
        } finally {
            if (doc != null){
                doc.close();
            }
            if (os != null) {
                os.close();
            }
        }
    }
}