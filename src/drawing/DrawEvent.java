package drawing;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public DrawEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Event Draw Event";
    }
}
