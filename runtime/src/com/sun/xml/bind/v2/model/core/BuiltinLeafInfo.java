package com.sun.xml.bind.v2.model.core;

import javax.xml.namespace.QName;

/**
 * JAXB spec designates a few Java classes to be mapped to leaves in XML.
 *
 * <p>
 * Built-in leaves also have another priviledge; specifically, they often
 * have more than one XML type names associated with it.
 *
 * @author Kohsuke Kawaguchi
 */
public interface BuiltinLeafInfo<T,C> extends LeafInfo<T,C> {
    /**
     * {@inheritDoc}
     *
     * <p>
     * This method returns the 'primary' type name of this built-in leaf,
     * which should be used when values of this type are marshalled.
     *
     * @return
     *      never null.
     */
    public QName getTypeName();

    /**
     * Returns all the type names recognized by this bean info.
     *
     * @return
     *      Always non-null. Do not modify the returned array.
     */
    public QName[] getTypeNames();
}
