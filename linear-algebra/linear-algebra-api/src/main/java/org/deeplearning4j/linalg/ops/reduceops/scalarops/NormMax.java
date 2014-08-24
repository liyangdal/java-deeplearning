package org.deeplearning4j.linalg.ops.reduceops.scalarops;

import org.deeplearning4j.linalg.api.ndarray.INDArray;

/**
 *
 * Over all normmax of an ndarray
 * @author Adam Gibson1
 */
public class NormMax extends BaseScalarOp {
    public NormMax() {
        super(0);
    }

    @Override
    public double accumulate(INDArray arr, int i, double soFar) {
        double abs = Math.abs((double) arr.getScalar(i).element());
        return abs > soFar ? abs : soFar;
    }
}