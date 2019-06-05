package org.madsol.tas;

public class ExecutionContext {

    private final Actor actor;
    private final Performable[] acts;
    private final Context context;

    public ExecutionContext(Actor actor, Performable... acts) {
        this.actor = actor;
        this.acts = acts;
        this.context = new Context();
    }

    public ExecutionContext(Actor actor, Context inheritedContext, Performable... acts) {
        this.actor = actor;
        this.acts = acts;
        this.context = inheritedContext;
    }

    public void run() {
        for (Performable act : acts) {
            act.performedBy(actor, context);
        }
    }
}
