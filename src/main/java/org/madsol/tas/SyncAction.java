package org.madsol.tas;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class SyncAction extends Action {

    @NonNull
    @ToString.Exclude
    private final Driver driver;

    public SyncAction(@NonNull String name, @NonNull Driver driver) {
        super(name);
        this.driver = driver;
    }
}
