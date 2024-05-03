# Java 21 warnings

## `pipeline.core`

- [exceptions/AggregateException.java:[47,32]](./pipeline.core/src/main/java/fiftyone/pipeline/exceptions/AggregateException.java#L47C32):
  - possible 'this' escape before subclass is fully initialized
- [exceptions/AggregateException.java:[58,32]](./pipeline.core/src/main/java/fiftyone/pipeline/exceptions/AggregateException.java#L58C32):
  - possible 'this' escape before subclass is fully initialized
- [core/flowelements/FlowElementBase.java:[72,25]](./pipeline.core/src/main/java/fiftyone/pipeline/core/flowelements/FlowElementBase.java#L72C25):
  - possible 'this' escape before subclass is fully initialized
- [util/FiftyOneLookup.java:[96,45]](./pipeline.core/src/main/java/fiftyone/pipeline/util/FiftyOneLookup.java#L96C45):
  - possible 'this' escape before subclass is fully initialized

## `pipeline.caching`

- [LruLoadingCache.java:[62,13]](./pipeline.caching/src/main/java/fiftyone/caching/LruLoadingCache.java#L62C13):
  - possible 'this' escape before subclass is fully initialized
- [LruLoadingCache.java:[74,23]](./pipeline.caching/src/main/java/fiftyone/caching/LruLoadingCache.java#L74C23):
  - previous possible 'this' escape happens here via invocation

## `pipeline.engines`

- [engines/services/DataUpdateServiceDefault.java:[599,63]](./pipeline.engines/src/main/java/fiftyone/pipeline/engines/services/DataUpdateServiceDefault.java#L599C63):
  - URL(java.lang.String) in java.net.URL has been deprecated
- [engines/exceptions/PropertyMissingException.java:[60,23]](./pipeline.engines/src/main/java/fiftyone/pipeline/engines/exceptions/PropertyMissingException.java#L60C23):
  - possible 'this' escape before subclass is fully initialized
- [engines/exceptions/PropertyMissingException.java:[79,23]](./pipeline.engines/src/main/java/fiftyone/pipeline/engines/exceptions/PropertyMissingException.java#L79C23):
  - possible 'this' escape before subclass is fully initialized
- [engines/data/AspectPropertyValueDefault.java:[52,17]](./pipeline.engines/src/main/java/fiftyone/pipeline/engines/data/AspectPropertyValueDefault.java#L52C17):
  - possible 'this' escape before subclass is fully initialized
- [engines/flowelements/OnPremiseAspectEngineBuilderBase.java:[99,31]](./pipeline.engines/src/main/java/fiftyone/pipeline/engines/flowelements/OnPremiseAspectEngineBuilderBase.java#L99C31):
  - possible 'this' escape before subclass is fully initialized
- [engines/services/DataUploaderHttp.java:[56,42]](./pipeline.engines/src/main/java/fiftyone/pipeline/engines/services/DataUploaderHttp.java#L56C42):
  - URL(java.lang.String) in java.net.URL has been deprecated
- [engines/flowelements/OnPremiseAspectEngineBase.java:[72,27]](./pipeline.engines/src/main/java/fiftyone/pipeline/engines/flowelements/OnPremiseAspectEngineBase.java#L72C27):
  - possible 'this' escape before subclass is fully initialized

### `pipeline.engines` Tests

- [engines/testhelpers/flowelements/EmptyEngine.java:[50,95]](./pipeline.engines/src/test/java/fiftyone/pipeline/engines/testhelpers/flowelements/EmptyEngine.java#L50C95):
  - possible 'this' escape before subclass is fully initialized
- [engines/testhelpers/flowelements/EmptyEngine.java:[58,84]](./pipeline.engines/src/test/java/fiftyone/pipeline/engines/testhelpers/flowelements/EmptyEngine.java#L58C84):
  - possible 'this' escape before subclass is fully initialized
- [engines/services/HttpClientTests.java:[58,53]](./pipeline.engines/src/test/java/fiftyone/pipeline/engines/services/HttpClientTests.java#L58C53):
  - URL(java.lang.String) in java.net.URL has been deprecated
- [engines/services/HttpClientTests.java:[79,53]](./pipeline.engines/src/test/java/fiftyone/pipeline/engines/services/HttpClientTests.java#L79C53):
  - URL(java.lang.String) in java.net.URL has been deprecated

## `pipeline.cloudrequestengine`

- [cloudrequestengine/flowelements/CloudRequestEngineDefault.java:[211,59]](./pipeline.cloudrequestengine/src/main/java/fiftyone/pipeline/cloudrequestengine/flowelements/CloudRequestEngineDefault.java#L211C59):
  - URL(java.lang.String) in java.net.URL has been deprecated
- [cloudrequestengine/flowelements/CloudRequestEngineDefault.java:[396,63]](./pipeline.cloudrequestengine/src/main/java/fiftyone/pipeline/cloudrequestengine/flowelements/CloudRequestEngineDefault.java#L396C63):
  - URL(java.lang.String) in java.net.URL has been deprecated
- [cloudrequestengine/flowelements/CloudRequestEngineDefault.java:[426,63]](./pipeline.cloudrequestengine/src/main/java/fiftyone/pipeline/cloudrequestengine/flowelements/CloudRequestEngineDefault.java#L426C63):
  - URL(java.lang.String) in java.net.URL has been deprecated
- [cloudrequestengine/flowelements/CloudRequestEngineDefault.java:[154,17]](./pipeline.cloudrequestengine/src/main/java/fiftyone/pipeline/cloudrequestengine/flowelements/CloudRequestEngineDefault.java#L154C17):
  - possible 'this' escape before subclass is fully initialized
- [cloudrequestengine/CloudRequestException.java:[41,39]](./pipeline.cloudrequestengine/src/main/java/fiftyone/pipeline/cloudrequestengine/CloudRequestException.java#L41C39):
  - non-transient instance field of a serializable class declared with a non-serializable type
- [cloudrequestengine/flowelements/CloudAspectEngineBase.java:[123,30]](./pipeline.cloudrequestengine/src/main/java/fiftyone/pipeline/cloudrequestengine/flowelements/CloudAspectEngineBase.java#L123C30):
  - possible 'this' escape before subclass is fully initialized

### `pipeline.cloudrequestengine` Tests

- [cloudrequestengine/flowelements/CloudRequestEngineTestsBase.java:[48,33]](./pipeline.cloudrequestengine/src/test/java/fiftyone/pipeline/cloudrequestengine/flowelements/CloudRequestEngineTestsBase.java#L48C33):
  - URL(java.lang.String) in java.net.URL has been deprecated

## `pipeline.engines.fiftyone`

- [engines/fiftyone/flowelements/ShareUsageBase.java:[413,26]](./pipeline.engines.fiftyone/src/main/java/fiftyone/pipeline/engines/fiftyone/flowelements/ShareUsageBase.java#L413C26):
  - possible 'this' escape before subclass is fully initialized
- [engines/fiftyone/flowelements/SetHeadersElement.java:[86,33]](./pipeline.engines.fiftyone/src/main/java/fiftyone/pipeline/engines/fiftyone/flowelements/SetHeadersElement.java#L86C33):
  - possible 'this' escape before subclass is fully initialized
- [engines/fiftyone/flowelements/FiftyOneOnPremiseAspectEngineBuilderBase.java:[78,25]](./pipeline.engines.fiftyone/src/main/java/fiftyone/pipeline/engines/fiftyone/flowelements/FiftyOneOnPremiseAspectEngineBuilderBase.java#L78C25):
  - possible 'this' escape before subclass is fully initialized
- [engines/fiftyone/flowelements/ShareUsageElement.java:[548,59]](./pipeline.engines.fiftyone/src/main/java/fiftyone/pipeline/engines/fiftyone/flowelements/ShareUsageElement.java#L548C59):
  - URL(java.lang.String) in java.net.URL has been deprecated
- [engines/fiftyone/flowelements/ShareUsageBuilderBase.java:[360,23]](./pipeline.engines.fiftyone/src/main/java/fiftyone/pipeline/engines/fiftyone/flowelements/ShareUsageBuilderBase.java#L360C23):
  - URL(java.lang.String) in java.net.URL has been deprecated
- [engines/fiftyone/data/FiftyOneAspectPropertyMetaDataDefault.java:[80,34]](./pipeline.engines.fiftyone/src/main/java/fiftyone/pipeline/engines/fiftyone/data/FiftyOneAspectPropertyMetaDataDefault.java#L80C34):
  - possible 'this' escape before subclass is fully initialized

## `pipeline.jsonbuilder`

- [jsonbuilder/flowelements/JsonBuilderElement.java:[88,17]](./pipeline.jsonbuilder/src/main/java/fiftyone/pipeline/jsonbuilder/flowelements/JsonBuilderElement.java#L88C17):
  - possible 'this' escape before subclass is fully initialized

## `pipeline.web`

- [web/services/ClientsidePropertyServiceCore.java:[136,21]](./pipeline.web.packages/pipeline.web/src/main/java/fiftyone/pipeline/web/services/ClientsidePropertyServiceCore.java#L136C21):
  - possible 'this' escape before subclass is fully initialized
