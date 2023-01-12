package com.example.EmailSendingTest.EmailPackage;


import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;




@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;

    //    Method 3 -- with html pg
    String a = "abc";

    @Override
    public String sendEmailString(EmailDetails_DTO mail) {

        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
            helper.setSubject("Welcome " + a);

            String html = " <!doctype html>\n" +
                    " <html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"\n" +
                    "      xmlns:th=\"http://www.thymeleaf.org\">\n" +
                    " <head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\"\n" +
                    "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                    "    <title>Email</title>\n" +
                    " </head>\n" +
                    " <body>\n" +
                    " <p>\n" +
                    "    Hello, <span >Peter Static " + mail.getTo_name() + "</span>!\n" +
                    " </p>\n" +
                    " <p  >\n" +
                    "   <b> <u>" + mail.getTitle() + "</u></b>" +
                    " </p>\n" +
                    " <p>\n" +
                    " You have been successfully subscribed to the <b>CodingNConcepts</b> on\n" +
                    " <span>28-12-2012</span>\n" +
                    " </p>\n" +
                    " <p>We write on following technologies:-</p>\n" +
                    " <ul th:remove=\"all-but-first\">\n" +
                    "    <li >Java</li>\n" +
                    "    <li>JavaScript</li>\n" +
                    "    <li>CSS</li>\n" +
                    " </ul>\n" +
                    " <p>\n" +
                    "    Regards, <br/>\n" +
                    "    <em>" + mail.getFrom_name() + "</em>\n" +
                    " </p>\n" +
                    " </body>" +
                    " </html>\n";
            helper.setText(html, true);
            helper.setTo(new String[]{"jithmim808@gmail.com", "ms19808444@my.sliit.lk"});
//            helper.setTo(mail.getRecipient());
            helper.setFrom(sender);
            javaMailSender.send(mimeMessage);
            return "Mail sent Successfully";

        } catch (Exception e) {
            e.printStackTrace();
            return "Mail sent error";
        }


    }


}





