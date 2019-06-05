package org.madsol.tas;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.madsol.tas.util.StringUtil;

import java.util.List;

@Data
@Log4j2
public class Task implements Performable {

    @NonNull
    private final String name;
    @NonNull
    @ToString.Exclude
    private final List<Performable> actions;

    @Override
    public void performedBy(final Actor actor, final Context context) {
        int level = Integer.valueOf(context.get(Context.Metadata.EXECUTION_LEVEL).toString());
        String logPrefix = StringUtil.repeat(":", level) + ">";
        log.info("{} {} performed by {}", logPrefix, this, actor);
        context.set(Context.Metadata.EXECUTION_LEVEL, ++level);
        actions.forEach(action -> action.performedBy(actor, context));
    }
}