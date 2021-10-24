package app;

import org.junit.Assert;
import org.junit.Test;

public class ChatBotTest {

    @Test
    public void test(){
        var chatBot = ChatBot.getInstance();

        // Se ingresan autores
        chatBot.registrarAutor(1,"Fer A.", "1989-24-08");
        chatBot.registrarAutor(2,"Adam S.", "1969-21-02");

        // Se ingresan libros
        chatBot.registrarLibro(1, "mate1", 2002, "Adam S.");
        chatBot.registrarLibro(2, "mate2", 2003, "Adam S.");
        chatBot.registrarLibro(3, "mate3", 2004, "Fer A.");
        chatBot.registrarLibro(4, "mate4", 2005, "Adam S.");
        chatBot.registrarLibro(5, "mate5", 2006, "Fer A.");
        chatBot.registrarLibro(6, "mate6", 2007, "Adam S.");

        // Test
        Assert.assertEquals("Adam S.",chatBot.busqAutor(1).getAuthor());
        Assert.assertEquals("Fer A.", chatBot.busqAutor(3).getAuthor());



    }

}
