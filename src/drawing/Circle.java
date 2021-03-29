package drawing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Repository
public class Circle implements Shape, ApplicationEventPublisherAware {

    private Point center;

//    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private MessageSource messageSource;

    public Point getCenter() {
        return center;
    }

    @Resource(name = "pointB")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println(messageSource.getMessage("starting", null, "Exception", null));
        System.out.println(messageSource.getMessage("drawing.circle",
                new Object[]{center.getX(), center.getY()}, "circle default", null));
        applicationEventPublisher.publishEvent(new DrawEvent(this));
    }

    @PostConstruct
    public void init() {
        System.out.println(" Initialising bean ");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(" Destroying bean ");
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
