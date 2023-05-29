package pl.comarch.szkolenia.context.authorization;

import org.springframework.stereotype.Component;

@Component
public class Authenticator {
    public void authenticate() {
        System.out.println("authenticate");
    }
}
