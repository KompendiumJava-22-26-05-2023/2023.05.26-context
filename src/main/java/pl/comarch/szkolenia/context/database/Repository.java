package pl.comarch.szkolenia.context.database;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Repository implements IRepository {
    public void add() {
        System.out.println("add");
    }

    public void find() {
        System.out.println("find");
    }
}
