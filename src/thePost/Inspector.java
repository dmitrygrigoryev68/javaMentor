package thePost;

/*
         Inspector – Инспектор, который следит за запрещенными и украденными
         посылками и бьет тревогу в виде исключения,
         если была обнаружена подобная посылка. Если он заметил запрещенную
         посылку с одним из запрещенных содержимым
         "weapons" и "banned substance"), то он бросает
         IllegalPackageException. Если он находит посылку, состоящую из
         камней (содержит слово "stones"), то тревога прозвучит в
         виде StolenPackageException. Оба исключения вы должны
         объявить самостоятельно в виде непроверяемых исключений.
        */
public class Inspector implements MailService {
    public final String AUSTIN_POWERS = "Austin Powers";
    public final String WEAPONS = "weapons";
    public final String BANNED_SUBSTANCE = "banned substance";

    public static class IllegalPackageException extends RuntimeException {
    }

    public static class StolenPackageException extends RuntimeException {
    }

    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            MailPackage mail2 = (MailPackage) mail;


            if (mail2.getContent().getContent().contains(WEAPONS) ||
                    mail2.getContent().getContent().contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }

            if (mail2.getContent().getContent().contains("stones"))
                throw new StolenPackageException();
            return mail2;
        }
        return mail;
    }
}