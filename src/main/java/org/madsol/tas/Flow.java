package org.madsol.tas;

import java.util.List;

public class Flow {

    private final List<Action> actions;

    public Flow(final List<Action> actions) {
        assert actions != null : "Cannot create a Flow from null actions";
        this.actions = actions;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void performedBy(final Actor actor) {
        getActions().forEach(action -> action.performedBy(actor));
    }
}
