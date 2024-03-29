package o2o.order.service.user;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import sun.plugin.net.proxy.PluginProxyInfo;

@SpringBootApplication
@Configuration
@EnableApolloConfig
public class O2OApp {

    private final static Logger logger = LoggerFactory.getLogger(O2OApp.class);

    public static void main(String[] args) {
        SpringApplication.run(O2OApp.class, args);
        logger.info("O2O user service started ");

        // print internal state
//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(lc);
    }
}
