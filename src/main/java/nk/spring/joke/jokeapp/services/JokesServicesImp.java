package nk.spring.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServicesImp implements JokesService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServicesImp() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    @Override
    public String getJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
