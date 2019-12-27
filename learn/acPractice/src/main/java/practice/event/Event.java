package practice.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Event {


    public static void main(String[] args) {

        //创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //增加监听器
        context.addApplicationListener(new MyApplicationListener());

        //启动上下文
        context.refresh();


        context.publishEvent(new MyApplicationEvent("111111这是里是事件"));


    }



    //自定义监听
    private static class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {


        @Override
        public void onApplicationEvent(MyApplicationEvent event) {
            System.out.println(event.getSource().toString());
        }
    }


    //自定义事件
    private static class MyApplicationEvent extends ApplicationEvent {


        /**
         * Create a new {@code ApplicationEvent}.
         *
         * @param source the object on which the event initially occurred or with
         *               which the event is associated (never {@code null})
         */
        public MyApplicationEvent(Object source) {
            super(source);
        }
    }

}
