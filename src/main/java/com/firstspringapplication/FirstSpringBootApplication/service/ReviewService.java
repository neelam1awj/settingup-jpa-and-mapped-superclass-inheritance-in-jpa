package com.firstspringapplication.FirstSpringBootApplication.service;

import com.firstspringapplication.FirstSpringBootApplication.model.Review;
import com.firstspringapplication.FirstSpringBootApplication.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Review Service is running at startup");
        Review review = Review
                .builder()
                .rating(5.0)
                .content("Ride review content")
//                .createdAt(new Date())
//                .updatedAt(new Date())
                .build();//this code creates plain java object
        System.out.println("Saving review: " + review);
        reviewRepository.save(review);//this code executes the insert query

        List<Review> reviews =reviewRepository.findAll();
        for(Review td: reviews){
            System.out.println(td.getContent());


        }
        //reviewRepository.deleteById(252L);//deleting the record with id 252
    }
}
