package org.madsol.tas;

/**
 * A performable is any items that can be performed by an Actor
 */
public interface Performable {

    void performedBy(Actor actor);

}
