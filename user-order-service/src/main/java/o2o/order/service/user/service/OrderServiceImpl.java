package o2o.order.service.user.service;

import o2o.order.service.user.dao.MySQLConfig;
import o2o.order.service.user.facade.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class OrderServiceImpl implements OrderService {

    private final static Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private MySQLConfig mySQLConfig;

    @RequestMapping(path = "/createOrder")
    @Override
    public void createOrder() {
        logger.info("config test: {}", mySQLConfig.getHost());
    }
}
