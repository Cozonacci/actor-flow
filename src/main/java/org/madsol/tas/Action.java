package org.madsol.tas;

import lombok.Data;
import lombok.NonNull;

@Data
public class Action implements Performable {

    @NonNull
    private final String name;

    @Override
    public void performedBy(final Actor actor) {
        System.out.println(String.format("[%s performed by %s]", this, actor));
    }
}
