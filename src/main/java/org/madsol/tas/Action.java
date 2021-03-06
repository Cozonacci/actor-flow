package org.madsol.tas;

import lombok.Data;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.madsol.tas.util.StringUtil;

@Data
@Log4j2
public class Action implements Performable {

    @NonNull
    private final String name;

    @Override
    public void performedBy(final Actor actor, final Context context) {
        tracePerformance(actor, context);
    }

    private void tracePerformance(Actor actor, Context context) {
        int level = Integer.valueOf(context.get(Context.Metadata.EXECUTION_LEVEL).toString());
        String logPrefix = StringUtil.repeat(":", level) + ">";
        log.info("{} {} performed by {}", logPrefix, this, actor);
    }
}
