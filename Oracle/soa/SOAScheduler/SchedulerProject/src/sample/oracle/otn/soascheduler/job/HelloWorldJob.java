package sample.oracle.otn.soascheduler.job;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import sample.oracle.otn.soascheduler.proxy.Helloworld_client_ep;
import sample.oracle.otn.soascheduler.proxy.HelloWorld;

import javax.xml.ws.WebServiceRef;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class HelloWorldJob implements Job {
    @WebServiceRef
    private static Helloworld_client_ep helloworldprocess_client;

    public HelloWorldJob() {
        helloworldprocess_client = new Helloworld_client_ep();
    }

    public void execute(JobExecutionContext jobExecutionContext) {
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("HelloWorldJob started");
        try {
            helloworldprocess_client = new Helloworld_client_ep();
            HelloWorld helloWorldProcess =
                helloworldprocess_client.getHelloWorld_pt();
            // Add your code to call the desired methods.
            System.out.println("HelloWorld Response: " +
                               helloWorldProcess.process("SOAScheduler@" +
                                                         df.format(date)));
        } catch (Exception e) {
            System.out.println("HelloWorld Process failed: " + e.toString());
            e.printStackTrace();
        }
    }
}
