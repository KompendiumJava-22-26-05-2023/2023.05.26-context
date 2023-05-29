package pl.comarch.szkolenia.context.database;

import org.springframework.stereotype.Component;

@Component
public class Repository2 implements IRepository {
    public void add() {
        System.out.println("new add");
    }

    public void find() {
        System.out.println("new find");
    }
}
