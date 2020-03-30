/* *********************************************************************
 * This Original Work is copyright of 51 Degrees Mobile Experts Limited.
 * Copyright 2019 51 Degrees Mobile Experts Limited, 5 Charlotte Close,
 * Caversham, Reading, Berkshire, United Kingdom RG4 7BY.
 *
 * This Original Work is licensed under the European Union Public Licence (EUPL) 
 * v.1.2 and is subject to its terms as set out below.
 *
 * If a copy of the EUPL was not distributed with this file, You can obtain
 * one at https://opensource.org/licenses/EUPL-1.2.
 *
 * The 'Compatible Licences' set out in the Appendix to the EUPL (as may be
 * amended by the European Commission) shall be deemed incompatible for
 * the purposes of the Work and the provisions of the compatibility
 * clause in Article 5 of the EUPL shall not apply.
 * 
 * If using the Work as, or as part of, a network application, by 
 * including the attribution notice(s) required under Article 5 of the EUPL
 * in the end user terms of the application under an appropriate heading, 
 * such notice(s) shall fulfill the requirements of that article.
 * ********************************************************************* */

package fiftyone.pipeline.engines.fiftyone.flowelements;

import fiftyone.pipeline.core.data.ElementData;
import fiftyone.pipeline.core.data.ElementPropertyMetaData;
import fiftyone.pipeline.core.data.EvidenceKeyFilter;
import fiftyone.pipeline.core.data.EvidenceKeyFilterWhitelist;
import fiftyone.pipeline.core.data.FlowData;
import fiftyone.pipeline.core.data.factories.ElementDataFactory;
import fiftyone.pipeline.core.flowelements.FlowElementBase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;

public class SequenceElement 
    extends FlowElementBase<ElementData, ElementPropertyMetaData> {

    public SequenceElement(Logger logger) {
        super(logger, null);
    }

    @Override
    protected void processInternal(FlowData data) throws Exception {
        Map<String, Object> evidence = data.getEvidence().asKeyMap();
        
        // If the evidence does not contain a session id then create a new one.
        if (evidence.containsKey(Constants.EVIDENCE_SESSIONID) == false) {
            data.addEvidence(Constants.EVIDENCE_SESSIONID, getNewSessionId());
        }

        // If the evidence does not have a sequence then add one.
        if (evidence.containsKey(Constants.EVIDENCE_SEQUENCE) == false) {
            data.addEvidence(Constants.EVIDENCE_SEQUENCE, 1);
        } else {
            Object sequence = evidence.get(Constants.EVIDENCE_SEQUENCE);
            int seq = (int) sequence;
            data.addEvidence(Constants.EVIDENCE_SEQUENCE, seq + 1);
        }
    }

    @Override
    public String getElementDataKey() {
        return "sequence-element";
    }

    @Override
    public EvidenceKeyFilter getEvidenceKeyFilter() {
        return new EvidenceKeyFilterWhitelist(new ArrayList<String>());
    }

    @Override
    public List<ElementPropertyMetaData> getProperties() {
        return new ArrayList<>();
    }

    @Override
    protected void managedResourcesCleanup() {
    }

    @Override
    protected void unmanagedResourcesCleanup() {
    }
    
    private String getNewSessionId() {
        UUID u = UUID.randomUUID();
        return u.toString();
    }
}
