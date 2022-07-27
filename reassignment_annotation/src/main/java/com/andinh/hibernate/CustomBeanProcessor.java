package com.andinh.hibernate;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Component
public class CustomBeanProcessor implements BeanPostProcessor, BeanFactoryAware, DisposableBean {

    private BeanFactory beanFactory;

    private List<Object> prototypeBeans = new ArrayList<>();

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanFactory.isPrototype(beanName)) {
            synchronized (prototypeBeans) {
                prototypeBeans.add(bean);
            }
        }

        return bean;
    }


    @Override
    public void destroy() throws Exception {
        System.out.println(prototypeBeans);

        synchronized (prototypeBeans) {
            for (Object bean :
                    prototypeBeans) {
                if (bean instanceof DisposableBean) {
                    DisposableBean disposableBean = (DisposableBean) bean;
                    try {
                        disposableBean.destroy();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            prototypeBeans.clear();
        }
    }
}
