package fastut.util.generics.tree;

import fastut.util.generics.visitor.TypeTreeVisitor;

/**
 * Common supertype for all nodes that represent type expressions in the generic signature AST.
 */
public interface TypeTree extends Tree {

    /**
     * Accept method for the visitor pattern.
     *
     * @param v - a <tt>TypeTreeVisitor</tt> that will process this tree
     */
    void accept(TypeTreeVisitor<?> v);
}
