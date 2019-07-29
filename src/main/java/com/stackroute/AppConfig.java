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
        Actor actor=new Actor();
        actor.setName("suresh");
        actor.setGender("Male");
        actor.setAge(22);
        return actor;
    }
    @Bean
    public Movie getMovie()
    {
        Movie movie = new Movie();
        movie.setActor(getActor());
        return movie;
    }
}

