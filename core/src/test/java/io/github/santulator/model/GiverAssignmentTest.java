package io.github.santulator.model;

import io.github.santulator.test.AbstractBeanTest;

import static io.github.santulator.model.TestRequirementsTool.EDITH;
import static io.github.santulator.model.TestRequirementsTool.FRED;

public class GiverAssignmentTest extends AbstractBeanTest<GiverAssignment> {
    @Override
    protected GiverAssignment buildPrimary() {
        return new GiverAssignment(EDITH, FRED);
    }

    @Override
    protected GiverAssignment buildSecondary() {
        return new GiverAssignment(FRED, EDITH);
    }
}