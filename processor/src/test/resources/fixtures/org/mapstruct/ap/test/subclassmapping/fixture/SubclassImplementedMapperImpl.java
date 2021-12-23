/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.subclassmapping.fixture;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-12T14:37:10+0200",
    comments = "version: , compiler: Eclipse JDT (Batch) 3.20.0.v20191203-2131, environment: Java 11.0.12 (Azul Systems, Inc.)"
)
public class SubclassImplementedMapperImpl implements SubclassImplementedMapper {

    @Override
    public ImplementedParentTarget map(ImplementedParentSource item) {
        if ( item == null ) {
            return null;
        }

        if (item instanceof SubSource) {
            return subSourceToSubTarget( (SubSource) item );
        }
        else if (item instanceof SubSourceOther) {
            return subSourceOtherToSubTargetOther( (SubSourceOther) item );
        }
        else {
            ImplementedParentTarget implementedParentTarget = new ImplementedParentTarget();

            return implementedParentTarget;
        }
    }

    protected SubTarget subSourceToSubTarget(SubSource subSource) {
        if ( subSource == null ) {
            return null;
        }

        SubTarget subTarget = new SubTarget();

        subTarget.setValue( subSource.getValue() );

        return subTarget;
    }

    protected SubTargetOther subSourceOtherToSubTargetOther(SubSourceOther subSourceOther) {
        if ( subSourceOther == null ) {
            return null;
        }

        String finalValue = null;

        finalValue = subSourceOther.getFinalValue();

        SubTargetOther subTargetOther = new SubTargetOther( finalValue );

        return subTargetOther;
    }
}
