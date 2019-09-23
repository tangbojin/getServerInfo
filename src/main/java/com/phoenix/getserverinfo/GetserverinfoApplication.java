package com.phoenix.getserverinfo;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class GetserverinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetserverinfoApplication.class, args);
    }
}
