package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Post p = new Post();
        p.setTitle("test");

        Comment c = new Comment();
        c.setComment("테스트1");

        p.addComment(c);

        postRepository.save(p);



        //postRepository.



        /*Iterable<Post> list1 = postRepository.findAll();

        for(Post p : list1){
            System.out.println(p.getTitle().toString());
        }*/

    }
}
