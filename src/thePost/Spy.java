package thePost;

 /*Spy – шпион, который логгирует о всей почтовой переписке, которая проходит
    через его руки. Объект конструируется от экземпляра Logger, с помощью которого
     шпион будет сообщать о всех действиях. Он следит только за объектами класса
     MailMessage и пишет в логгер следующие сообщения (в выражениях нужно заменить
      части в фигурных скобках на значения полей почты):
            2.1) Если в качестве отправителя или получателя указан
                  "Austin Powers", то нужно написать в лог сообщение с уровнем
                   WARN: Detected target mail correspondence: from {from} to
                    {to} "{message}"
            2.2) Иначе, необходимо написать в лог сообщение с
            уровнем INFO: Usual correspondence: from {from} to {to}

     */


import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    public final String AUSTIN_POWERS = "Austin Powers";
    private Logger spyLog;


    public Spy(Logger log) {
        spyLog = log;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (mail.getTo().equals(AUSTIN_POWERS) || mail.getFrom().equals(AUSTIN_POWERS)) {
                spyLog.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"", new Object[]{mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()});
            } else {
                spyLog.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[]{((MailMessage) mail).getFrom(), ((MailMessage) mail).getTo()});
            }
        }

        return mail;
    }

}