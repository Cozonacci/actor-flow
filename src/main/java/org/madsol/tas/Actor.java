package org.madsol.tas;

import lombok.Data;
import lombok.NonNull;

@Data
public class Actor {

    @NonNull
    private final String id;

    public void performs(final Performable performable){
        performable.performedBy(this);
    }
}
