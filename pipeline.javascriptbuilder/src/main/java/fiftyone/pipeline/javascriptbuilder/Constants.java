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

package fiftyone.pipeline.javascriptbuilder;

public class Constants {
    public static final String EVIDENCE_HOST_KEY = 
            fiftyone.pipeline.core.Constants.EVIDENCE_HTTPHEADER_PREFIX +
            fiftyone.pipeline.core.Constants.EVIDENCE_SEPERATOR +
            "Host";
    
    public static final String EVIDENCE_PROTOCOL = 
            fiftyone.pipeline.core.Constants.EVIDENCE_HTTPHEADER_PREFIX +
            fiftyone.pipeline.core.Constants.EVIDENCE_SEPERATOR +
            "protocol";
    
    public static final String EVIDENCE_OBJECT_NAME_SUFFIX =
            "fod-js-object-name";
    
    public static final String EVIDENCE_OBJECT_NAME = 
             fiftyone.pipeline.core.Constants.EVIDENCE_QUERY_PREFIX +
             fiftyone.pipeline.core.Constants.EVIDENCE_SEPERATOR +
            EVIDENCE_OBJECT_NAME_SUFFIX;
    
    public static final String DEFAULT_PROTOCOL = "https";
    
    public static final String TEMPLATE = "/fiftyone/pipeline/javascriptbuilder/templates/JavaScriptResource.mustache";
}
