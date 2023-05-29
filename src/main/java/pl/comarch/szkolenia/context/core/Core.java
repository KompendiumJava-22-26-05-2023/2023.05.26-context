package pl.comarch.szkolenia.context.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.context.authorization.Authenticator;
import pl.comarch.szkolenia.context.database.IRepository;
import pl.comarch.szkolenia.context.database.Repository;
import pl.comarch.szkolenia.context.database.Repository2;
import pl.comarch.szkolenia.context.gui.GUI;

@Component
public class Core {
    @Autowired
    GUI gui;
    @Autowired
    IRepository repository;
    @Autowired
    Authenticator authenticator;
    public void start() {
        gui.show();
        repository.add();
        repository.find();
        authenticator.authenticate();
        //??
        //??
        //??
        //??
        //??
    }
}
