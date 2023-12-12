package sample.cafekiosk.spring.client.mail;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
// 이메일을 실제로 전송하는 역할을 하는 클래스
public class MailSendClient {
    public boolean sendEmail(String fromEmail, String toEmail, String subject, String content) {
        log.info("메일 전송");
        throw new IllegalArgumentException("메일 전송");
    }

    public void a() {
        log.info("a");
    }
    public void b() {
        log.info("b");
    }

    public void c() {
        log.info("c");
    }
}