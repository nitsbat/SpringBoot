package drawing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.List;

@Repository("circleId")
public class Circle implements Shape, ApplicationEventPublisherAware {

    @Resource(name = "point4")
    private Point center;

    @Value("Nitin")
    private String name;

    @Value("#{listValue}")
    private List<String> circleTypes;

    public List<String> getCircleTypes() {
        return circleTypes;
    }

    public void setCircleTypes(List<String> circleTypes) {
        this.circleTypes = circleTypes;
    }

    public ApplicationEventPublisher getApplicationEventPublisher() {
        return applicationEventPublisher;
    }

    //    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private MessageSource messageSource;

    public Point getCenter() {
        return center;
    }


    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println(messageSource.getMessage("starting", null, "Exception", null));
        System.out.println(messageSource.getMessage("drawing.circle",
                new Object[]{center.getX(), center.getY(), getName()}, "circle default", null));
        System.out.println(messageSource.getMessage("circle.type",
                new Object[]{getCircleTypes()}, "circle types", null));
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
