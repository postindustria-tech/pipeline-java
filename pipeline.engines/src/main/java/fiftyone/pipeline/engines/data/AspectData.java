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

package fiftyone.pipeline.engines.data;

import fiftyone.pipeline.core.data.ElementData;
import fiftyone.pipeline.engines.flowelements.AspectEngine;

import java.util.List;
import java.util.concurrent.Future;

/**
 * Represents an ElementData instance that is generated by an
 * {@link AspectEngine}. This data object will contain property values that
 * relate to a specific aspect.
 */
public interface AspectData extends ElementData {

    /**
     * Get the engines that generated the data withing this data instance.
     * @return engines which generated the data
     */
    List<AspectEngine<? extends AspectData, ? extends AspectPropertyMetaData>> getEngines();

    /**
     * If the engine is configured for lazy loading, this property returns a
     * {@link Future} that will complete once the engine has finished
     * processing. Otherwise, it will be null.
     * @return lazy loading future or null
     */
    Future<?> getProcessFuture();
}
