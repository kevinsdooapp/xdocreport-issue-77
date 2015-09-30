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


import formatter.*;
import fr.opensagres.xdocreport.core.document.SyntaxKind;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;
import fr.opensagres.xdocreport.template.formatter.NullImageBehaviour;

import java.util.ArrayList;

/**
 * <p>
 * User: Kevin Senechal <kevin@dooapp.com>
 * Date: 30/09/2015
 * Time: 16:23
 */
public class FakeTemplateContext {

    public void fillContext(IContext context) {
        // CONTEXT
        FakeTemplateContextDelegator delegator = new FakeTemplateContextDelegator(this);
        context.put("report", delegator);
        context.put("context", delegator);
        // FORMATTER
        context.put("deviceFormat", ReportDeviceUtils.INSTANCE);
        context.put("b", BigDecimalFormat.INSTANCE);
        context.put("dateF", DateFormat.INSTANCE);
        context.put("bool", BooleanFormat.INSTANCE);
        context.put("doc", DocumentsConvert.INSTANCE);
        // GLOBAL VARIABLES
        context.put("project_image", null);
        context.put("firm_logo", null);
        context.put("technician_signature", null);
        context.put("zonesLabel", "TODO");
        context.put("zoneSHLabel", "TODO");
        context.put("firm", new Contact());
        context.put("project", new Project());
        context.put("address", new Address());
        context.put("client", new Contact());
        context.put("applicationVersion", "1.0.0");
        // SYNTHESIS
        context.put("synthesis", new FakeSynthesisReportContext());
        context.put("synthesisScale", null);
        // SAMPLING
        context.put("sampling", new FakeSamplingReportContext());

        // ANNEXES
        context.put("annexes", new ArrayList());
        context.put("protocol", null);
        context.put("resultAnalysis", "<div>Test</div>");

    }

    public void fillFieldsMetadata(FieldsMetadata fieldsMetadata) {
        fieldsMetadata.addFieldAsImage("firm_logo", NullImageBehaviour.RemoveImageTemplate);
        fieldsMetadata.addFieldAsImage("technician_signature", NullImageBehaviour.RemoveImageTemplate);
        fieldsMetadata.addFieldAsImage("project_image", NullImageBehaviour.RemoveImageTemplate);
        fieldsMetadata.addFieldAsImage("synthesisScale", "synthesisScale", NullImageBehaviour.RemoveImageTemplate);
        fieldsMetadata.addFieldAsImage("annexe", "annexeDocument", NullImageBehaviour.RemoveImageTemplate);
        fieldsMetadata.addFieldAsImage("chart", "$context.getZoneChart($zoneProject)", NullImageBehaviour.RemoveImageTemplate);
        fieldsMetadata.addFieldAsImage("zoneScaleImg", "$context.getZoneScale($zoneProject)", NullImageBehaviour.RemoveImageTemplate);
        fieldsMetadata.addFieldAsImage("picturedDiagnosisImage", "documentA");
        fieldsMetadata.addFieldAsImage("general_comment_img", "comment");
        fieldsMetadata.addFieldAsImage("protocol", NullImageBehaviour.RemoveImageTemplate);
        fieldsMetadata.addFieldAsTextStyling("resultAnalysis", SyntaxKind.Html.name(), true);
    }






}
