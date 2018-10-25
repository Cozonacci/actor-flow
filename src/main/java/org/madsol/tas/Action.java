package org.madsol.tas;

public class Action {

    private final String name;

    public Action(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void performedBy(final Actor actor) {
        System.out.println(String.format("[%s performed by %s]", this, actor));
    }

    @Override
    public String toString() {
        return String.format("Action(name='%s')", name);
    }
}
