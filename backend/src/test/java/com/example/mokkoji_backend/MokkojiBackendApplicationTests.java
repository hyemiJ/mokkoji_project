package com.example.mokkoji_backend;

import com.example.backend.domain.SmtpDTO;
import com.example.backend.service.smtp.SendMessageService;
import com.example.backend.service.smtp.SmtpEmailServiceImpl;

import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class MokkojiBackendApplicationTests {

	@Autowired
    private JavaMailSender javaMailSender;  // JavaMailSender를 MockBean으로 주입

    @Autowired
    private SmtpEmailServiceImpl emailService;  // 실제 메일 서비스 구현체 주입
    

    @Autowired
    private SendMessageService sendMessageService;
    @Test
    public void testSendEmail() {
     
        SmtpDTO dto = SmtpDTO.builder()
                .contentMail("yacobleeee@hanmail.net") 
                .contentMain("테스트 내용입니다. 문의 사항은 여기로")
                .contentTitle("문의글 제목입니다.")
                .build();

        emailService.sendMessage("test","test1","test2");
        System.out.println("Email sent successfully.");
        //verify(javaMailSender, times(1)).send(any(SimpleMailMessage.class)); 
    }
    
    
    
  
    public void testSms () {
    	   // Given: 메시지 객체를 생성합니다.
        Message message = new Message();
        message.setFrom("01040529406");  // 발신자 번호
        message.setTo("01040529406");    // 수신자 번호
        message.setText("테스트 메시지입니다. JUnit을 통해 보냅니다.");

        // When: SMS를 실제로 전송합니다.
        SingleMessageSentResponse response = sendMessageService.sendOne(new SingleMessageSendingRequest(message));

        // Then: 응답이 null이 아님을 확인합니다.
        assertNotNull(response);
        System.out.println("SMS 전송 응답: " + response);
    }
    
}
