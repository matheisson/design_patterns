package factory2.impl;

import factory2.Operation;

/**
 * Created by levente on 2017.06.08..
 */
public class Division implements Operation {
    @Override
    public int operation(int a, int b) {
        return a/b;
    }
}
