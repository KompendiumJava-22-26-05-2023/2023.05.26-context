package pl.comarch.szkolenia.context.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.context.database.IRepository;
import pl.comarch.szkolenia.context.database.Repository;
import pl.comarch.szkolenia.context.database.Repository2;

@Component
public class GUI {
    @Autowired
    IRepository repository2;
    public void show() {
        System.out.println("show");
        repository2.add();
        repository2.find();
    }
}
