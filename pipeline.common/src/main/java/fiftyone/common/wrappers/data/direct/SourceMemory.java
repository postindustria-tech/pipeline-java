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

package fiftyone.common.wrappers.data.direct;

import fiftyone.common.wrappers.data.Source;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class SourceMemory implements Source {

    private final byte[] memory;

    public SourceMemory(byte[] memory) {
        this.memory = memory;
    }

    public ByteBuffer createStream() {
        return (ByteBuffer) ByteBuffer.allocate(memory.length)
            .order(ByteOrder.LITTLE_ENDIAN)
            .put(memory)
            .position(0);
    }
}
