package com.stackroute;

        import com.stackroute.domain.Actor;
        import com.stackroute.domain.Movie;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Actor getActor()
    {
        Actor actor=new Actor("gopi","male",22);
        return actor;
    }
    @Bean
    public Actor getActor2()
    {
        Actor actor=new Actor("suresh","male",22);
        return actor;
    }
    @Bean
    public Movie getMovie()
    {
        Movie movie = new Movie(getActor2());
        return movie;
    }
}

