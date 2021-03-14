package com.study.worker.tasks;

import com.study.kafka.application.domain.model.Order;
import com.study.kafka.application.domain.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScheduledTasks {

    @Autowired
    private OrderService orderService;

    @Scheduled(cron = "0 0/1 * * * *")
    public void reportCurrentTime() {
        orderService.cadastrar(new Order());
        log.info("Scheduler job rodando");
    }
}
