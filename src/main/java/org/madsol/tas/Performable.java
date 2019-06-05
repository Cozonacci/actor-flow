package org.madsol.tas;

/**
 * A performable is any item that can be performed by an Actor
 */
public interface Performable {

    String getName();

    void performedBy(Actor actor, Context context);

}
