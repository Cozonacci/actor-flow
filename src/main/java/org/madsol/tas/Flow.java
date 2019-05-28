package org.madsol.tas;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class Flow implements Performable {

    @NonNull
    private final List<Action> actions;

    @Override
    public void performedBy(final Actor actor) {
        getActions().forEach(action -> action.performedBy(actor));
    }
}
