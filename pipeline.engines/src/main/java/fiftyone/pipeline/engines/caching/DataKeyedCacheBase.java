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

package fiftyone.pipeline.engines.caching;

import fiftyone.caching.PutCache;
import fiftyone.pipeline.core.data.DataKey;
import fiftyone.pipeline.core.data.EvidenceKeyFilter;
import fiftyone.pipeline.core.data.FlowData;
import fiftyone.pipeline.engines.configuration.CacheConfiguration;

import java.io.IOException;

public abstract class DataKeyedCacheBase<V> implements DataKeyedCache<V> {

    private PutCache<DataKey, V> internalCache;

    public DataKeyedCacheBase(CacheConfiguration configuration) {
        try {
            internalCache = (PutCache<DataKey, V>) configuration
                .getCacheBuilder()
                .build(internalCache, configuration.getSize());
        } catch (ClassCastException e) {
            throw new ClassCastException(
                "Cache builder '" +
                    configuration.getCacheBuilder().getClass().getSimpleName() +
                    "' does not produce caches conforming to 'PutCache'");
        }
    }

    @Override
    public V get(FlowData flowData) {
        return internalCache.get(flowData.generateKey(getFilter()));
    }

    @Override
    public void put(FlowData flowData, V value) {
        internalCache.put(flowData.generateKey(getFilter()), value);
    }

    protected abstract EvidenceKeyFilter getFilter();

    @Override
    public void close() throws IOException {
        internalCache.close();
    }
}
