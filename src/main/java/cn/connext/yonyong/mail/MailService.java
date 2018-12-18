package cn.connext.yonyong.mail;

public interface MailService {
    void sendSimpleMail(String to, String subject, String content);
}
