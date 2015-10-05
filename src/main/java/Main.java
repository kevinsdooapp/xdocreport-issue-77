/*
 * Copyright (c) 2013, dooApp <contact@dooapp.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name of dooApp nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;

import java.io.*;

/**
 * <p>
 * User: Kevin Senechal <kevin@dooapp.com>
 * Date: 30/09/2015
 * Time: 16:58
 */
public class Main {

    public static void main(String[] args) {
        // will be ok
        generateReport("TEMPLATE_OK_DO_NOT_EDIT.docx", "target/report_generated_with_TEMPLATE_OK_DO_NOT_EDIT.docx");
        // edit the template TEMPLATE_OK_EDIT_TO_FAIL_PARSING and save it => it will fail
        generateReport("TEMPLATE_OK_EDIT_TO_FAIL_PARSING.docx", "target/report_generated_with_TEMPLATE_OK_EDIT_TO_FAIL_PARSING.docx");
        // TEMPLATE_OK_DO_NOT_EDIT opened and saved with word 2010, I removed at lot of stuff to reduce the template size and have a good understanding of the problem
        generateReport("TEMPLATE_FAIL_LESS.docx", "target/report_generated_with_TEMPLATE_FAIL.docx");
        // TEMPLATE_OK_DO_NOT_EDIT opened and saved with word 2010 => it will fail
        generateReport("TEMPLATE_FAIL.docx", "target/report_generated_with_TEMPLATE_FAIL.docx");
    }

    private static void generateReport(String templateFileName, String outputFileName) {
        try {
            // 1) Load Docx file by filling Velocity template engine and cache it to the registry
            InputStream in = Main.class.getResourceAsStream(templateFileName);
            IXDocReport report = XDocReportRegistry.getRegistry().loadReport(in, TemplateEngineKind.Velocity);

            // 2) Create context Java model
            IContext context = report.createContext();
            FakeTemplateContext fakeReportContext = new FakeTemplateContext();
            fakeReportContext.fillContext(context);
            fakeReportContext.fillFieldsMetadata(report.createFieldsMetadata());


            // 3) Generate report by merging Java model with the Docx
            OutputStream out = new FileOutputStream(new File(outputFileName));
            report.process(context, out);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XDocReportException e) {
            e.printStackTrace();
        }
    }
}
