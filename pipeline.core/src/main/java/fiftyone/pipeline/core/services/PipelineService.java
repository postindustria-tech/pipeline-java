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

package fiftyone.pipeline.core.services;

import fiftyone.pipeline.core.flowelements.PipelineBuilder;

/**
 * Service interface used by {@link PipelineBuilder} to hand out services to
 * elements which required them. This is extended by any service which wants
 * to have the same instance used by all elements in a pipeline which require
 * it. All required services should be added to the pipeline builder, and
 * included as a constructor parameter to any element builders which required
 * it to build their element.
 *
 * For example, the DataUpdateService can be added to the pipeline builder.
 * Then, when building from configuration, the builder will automatically hand
 * this the update service out to any on-premise elements which require it.
 */
public interface PipelineService {
}
