package com.aciworldwide.BEC.controller;

import com.aciworldwide.BEC.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring4.SpringTemplateEngine;
import javax.mail.internet.MimeMessage;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/testapp")
@Controller

public class EmailSender {
	
	@Autowired
    SpringTemplateEngine templateEngine;

    @Autowired
    private JavaMailSender sender;

    @RequestMapping("/getdetails")
    public @ResponseBody Book sendMail(@RequestBody Book book) throws Exception {

        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,
                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                StandardCharsets.UTF_8.name());

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("title",book.getTitle());
        model.put("currentStock",book.getNoInStock());
        model.put("stopOrder",book.getStopOrder());

        Context context = new Context();
        context.setVariables(model);
        String html = templateEngine.process("email-template", context);

        try {
            helper.setTo("mehak1598@outlook.com");
            helper.setText(html,true);
            helper.setSubject("Test Mail");
        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        }
        sender.send(message);

        return book;

    }

}
