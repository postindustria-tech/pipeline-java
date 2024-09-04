/* *********************************************************************
 * This Original Work is copyright of 51 Degrees Mobile Experts Limited.
 * Copyright 2023 51 Degrees Mobile Experts Limited, Davidson House,
 * Forbury Square, Reading, Berkshire, United Kingdom RG1 3EU.
 *
 * This Original Work is licensed under the European Union Public Licence
 * (EUPL) v.1.2 and is subject to its terms as set out below.
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

package fiftyone.pipeline.core.exceptions;

/**
 * Exception that can be thrown when the available data does not match that
 * which is expected.
 */
public class PipelineDataException extends RuntimeException {
    /**
     * Serializable class version number, which is used during deserialization.
     */
    private static final long serialVersionUID = -8356317224796833579L;

    /**
     * Constructor.
     */
    public PipelineDataException() {
        super();
    }

    /**
     * Constructor
     * @param message the exception message
     */
    public PipelineDataException(String message) {
        super(message);
    }

    /**
     * Constructor
     * @param message the exception message
     * @param cause the exception which triggered this exception
     */
    public PipelineDataException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor
     * @param cause the exception which triggered this exception
     */
    public PipelineDataException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor
     * @param message the exception message
     * @param cause the exception which triggered this exception
     * @param enableSuppression whether or not suppression is enabled
     *                          or disabled
     * @param writableStackTrace whether or not the stack trace should
     *                           be writable
     */
    protected PipelineDataException(
        String message,
        Throwable cause,
        boolean enableSuppression,
        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
