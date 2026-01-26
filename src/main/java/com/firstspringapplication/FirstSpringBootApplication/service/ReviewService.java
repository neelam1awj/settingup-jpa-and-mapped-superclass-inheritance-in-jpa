package com.firstspringapplication.FirstSpringBootApplication.service;

import com.firstspringapplication.FirstSpringBootApplication.model.Booking;
import com.firstspringapplication.FirstSpringBootApplication.model.Review;
import com.firstspringapplication.FirstSpringBootApplication.repository.BookingRepository;
import com.firstspringapplication.FirstSpringBootApplication.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    ReviewRepository reviewRepository;
    BookingRepository bookingRepository;


    public ReviewService(ReviewRepository reviewRepository,BookingRepository bookingRepository)
    {
        this.reviewRepository = reviewRepository;
        this.bookingRepository= bookingRepository;
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

        Review r=Review.builder()
                .content("Amazing ride ")
                .rating(4.0)
                .build();


        Booking b= Booking.builder()
                .endTime(new Date())
                .driverReview(r)
                .build();
//        reviewRepository.save(r);we have used cascade type all in booking //entity so we dont need to save review separately as review associated with //booking will be saved automatically
        bookingRepository.save(b);//this code executes the insert query


        System.out.println("Saving review: " + review);
        reviewRepository.save(review);

        List<Review> reviews =reviewRepository.findAll();
        for(Review td: reviews){
            System.out.println(td.getContent());


            }

        //used with casacade.type remove so as to remove booking and there assoaciated review
//        Optional<Booking> booking=bookingRepository.findById(2L);
//        if(booking.isPresent())
//        {
//            bookingRepository.delete(booking.get());
 //       }

    }
}
