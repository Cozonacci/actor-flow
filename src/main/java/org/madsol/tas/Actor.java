package org.madsol.tas;

public class Actor {

    private final String id;

    public Actor(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //ToDo: Implement a side-effect free return time model
    public void performs(final Action action) {
        action.performedBy(this);
    }

    public void performs(final Flow flow) {
        flow.performedBy(this);
    }

    @Override
    public String toString() {
        return String.format("Actor(id='%s')", id);
    }
}
