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


import fr.opensagres.xdocreport.document.images.IImageProvider;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * User: Kevin Senechal <kevin@dooapp.com>
 * Date: 21/09/2015
 * Time: 11:05
 */
public class FakeTemplateContextDelegator {
    private FakeTemplateContext context;

    public FakeTemplateContextDelegator(FakeTemplateContext context) {
        this.context = context;
    }

    public FakeTemplateContext getContext() {
        return context;
    }

    public String getProjectDescription() {
        return "";
    }

    public String getProjectName(ZoneProject zoneProject) {
        return "";
    }

    public boolean isGoalReached() {
        return false;
    }

    public boolean isGoalReached(ZoneProject zoneProject) {
        return false;
    }

    public boolean hasSynthesis() {
        return true;
    }

    public boolean hasSampling() {
        return true;
    }

    public String format(BigDecimal number) {
        return "";
    }


    public List<CalibrationParameter> getCalibrationParameters(GaSample sample) {
        List<CalibrationParameter> calibrationParameters = new LinkedList();
        return calibrationParameters;
    }

    public String getBuildingEnvelopesDiagnosisDescription(ZoneProject zoneProject) {
        return "";
    }

    public List getLeakCategories() {
        return Arrays.asList();
    }

    public boolean hasLeaks(ZoneProject zoneProject, Object leakDomain) {
        return !getLeaks(zoneProject, leakDomain).isEmpty();
    }

    public List getLeaks(ZoneProject zoneProject, Object leakDomain) {
        return new ArrayList();
    }

    public String getGeneralComment(ZoneProject zoneProject) {
        return "";
    }

    public List getGeneralCommentDocuments(ZoneProject zoneProject) {
        return new ArrayList();
    }

    public List getBuildingConditionnings(ZoneProject zoneProject) {
        return new ArrayList();
    }

    public List getSensibleElements(ZoneProject zoneProject) {
        return new ArrayList();
    }

    public String getAdditionalInformations(ZoneProject zoneProject) {
        return "";
    }

    public List getDevices(ZoneProject zoneProject) {
        return new ArrayList();
    }

    public List getSamples(ZoneProject zoneProject) {
        return new ArrayList();
    }

    public String getResultAnalysis(ZoneProject zoneProject) {
        return "<div>todo</div>";
    }

    public double getQ4PaSurf(ZoneProject zoneProject) {

        return 1.0;
    }

    public String getConstructionDate(ZoneProject zoneProject) {
        return "12/12/2015";
    }


    public String getRenovationDate(ZoneProject zoneProject) {
        return "12/12/2015";
    }

    public boolean displayRenovationDate(ZoneProject zoneProject) {
        return true;
    }

    public String getBuildingPermitNumber(ZoneProject zoneProject) {
        return "";
    }

    public String getHeight(ZoneProject zoneProject) {
        return "";
    }

    public String isGroupedPermit(ZoneProject zoneProject) {
        return "";
    }

    public String getNumberOfFloors(ZoneProject zoneProject) {
        return "";
    }

    public String getV(ZoneProject zoneProject) {
        return "TODO";
    }

    public String getVIncertitudePercentage(ZoneProject zoneProject) {
        return "TODO";
    }

    public String getConstructionMode(ZoneProject zoneProject) {
        return "";
    }

    public String getBuildingType(ZoneProject zoneProject) {
        return "";
    }

    public String getShonRT(ZoneProject zoneProject) {
        return "";
    }

    public String getMaterial(ZoneProject zoneProject) {
        return "";
    }


    public String getIsolation(ZoneProject zoneProject) {
        return "";
    }

    public String getAtbat(ZoneProject zoneProject) {
        return "";
    }

    public String getHeatingType(ZoneProject zoneProject) {
        return "";
    }

    public String getCoolingType(ZoneProject zoneProject) {
        return "";
    }

    public String getZoneUsage(ZoneProject zoneProject) {
        return "";
    }

    public String getATBatSource(ZoneProject zoneProject) {
        return "";
    }

    public String getATBatIncertitude(ZoneProject zoneProject) {
        return "TODO";
    }

    public String getSU(ZoneProject zoneProject) {
        return "";
    }

    public String getTechnicianName(ZoneProject zoneProject) {
        return "";
    }

    public String getTechnicianAuthorizationNumber(ZoneProject zoneProject) {
        return "";
    }

    public String getBuildingSituation(ZoneProject zoneProject) {
        return "";
    }

    public String getMeasureMethod(ZoneProject zoneProject) {
        return "";
    }

    public String getMeasureMethodJustification(ZoneProject zoneProject) {
        return "";
    }

    public String getBlowerdoorPosition(ZoneProject zoneProject) {
        return "";
    }

    public String getMethodCondition(ZoneProject zoneProject) {
        return "";
    }

    public String getQ4PaSurfGoal(ZoneProject zoneProject) {
        return "";
    }

    public String getQ4PaSurfGoalComment(ZoneProject zoneProject) {
        return "";
    }

    public String getCalibrationDate(Object device) {
        return "";
    }

    public String getAltitude(ZoneProject zoneProject) {
        return "";
    }

    public String getTechnicianNameThatSign() {
        return "";
    }

    public IImageProvider getZoneScale(ZoneProject zoneProject) {
        return null;
    }

    public IImageProvider getZoneChart(ZoneProject zoneProject) {
        return null;
    }
}
