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

package fiftyone.pipeline.engines.services;

import fiftyone.pipeline.core.services.PipelineService;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Interface used by the {@link DataUpdateService} to process HTTP requests.
 */
public interface HttpClient extends PipelineService {

    /**
     * Connect to a URL.
     * @param url the URL to connect to
     * @return the open HTTP connection
     * @throws IOException if a connection error occurred
     */
    HttpURLConnection connect(URL url) throws IOException;

    /**
     * Post data to a connection opened by the {@link #connect(URL)} method.
     * @param connection open connection to post to
     * @param headers HTTP header to send with the request
     * @param data data to post
     * @return response message from request
     * @throws IOException if an HTTP exception occurred
     */
    String postData(
        HttpURLConnection connection,
        Map<String, String> headers,
        byte[] data) throws IOException;

    /**
     * Carry out a get request to a connection opened by the {@link #connect(URL)}
     * method and return the response string.
     * @param connection open connection to get
     * @return response string from request
     * @throws IOException if an HTTP exception occurred
     */
    String getResponseString(HttpURLConnection connection) throws IOException;
}
