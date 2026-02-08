package com.firstspringapplication.FirstSpringBootApplication.service;

import com.firstspringapplication.FirstSpringBootApplication.model.Booking;
import com.firstspringapplication.FirstSpringBootApplication.model.Driver;
import com.firstspringapplication.FirstSpringBootApplication.model.Review;
import com.firstspringapplication.FirstSpringBootApplication.repository.BookingRepository;
import com.firstspringapplication.FirstSpringBootApplication.repository.DriverRepository;
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
    DriverRepository driverRepository;

    public ReviewService(ReviewRepository reviewRepository,BookingRepository bookingRepository,DriverRepository driverRepository)
    {
        this.driverRepository=driverRepository;
        this.reviewRepository = reviewRepository;
        this.bookingRepository= bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("Review Service is running at startup");
//        Review review = Review
//                .builder()
//                .rating(5.0)
//                .content("Ride review content")
////                .createdAt(new Date())
////                .updatedAt(new Date())
//                .build();//this code creates plain java object
//
//        Review r=Review.builder()
//                .content("Amazing ride ")
//                .rating(4.0)
//                .build();
//
//
//        Booking b= Booking.builder()
//                .endTime(new Date())
//                .driverReview(r)
//                .build();
////        reviewRepository.save(r);we have used cascade type all in booking //entity so we dont need to save review separately as review associated with //booking will be saved automatically
//        bookingRepository.save(b);//this code executes the insert query
//
//
//        System.out.println("Saving review: " + review);
//        reviewRepository.save(review);
//
//        List<Review> reviews =reviewRepository.findAll();
//        for(Review td: reviews){
//            System.out.println(td.getContent());
//
//
//            }
//
//        //used with casacade.type remove so as to remove booking and there assoaciated review
////        Optional<Booking> booking=bookingRepository.findById(2L);
////        if(booking.isPresent())
////        {
////            bookingRepository.delete(booking.get());
// //       }



        Optional<Driver> drivers= driverRepository.findByIdAndLicenseNumber(1L,"DL121212");
        if(drivers.isPresent())
        {
            System.out.println("Driver found: "+drivers.get().getName());
            List<Booking> b1=drivers.get().getBookings();
//           // List<Booking> bookings=bookingRepository.findAllByDriverId(1L);
            for(Booking booking: b1)
            {
                System.out.println(booking.getId());
               // System.out.println(booking.getBookingStatus());
            }
        }
//        else
//        {
//            System.out.println("Driver not found");
//        }

        //Optional<Driver> driver=driverRepository.findById(1L);

        Optional<Booking> b=bookingRepository.findById(6L);//one to one relationship between booking and review so we can get review from booking   with default fetch type lazy we need to use getDriverReview() method to get review details but if we want to get review details along with booking details then we need to change fetch type to eager in booking entity


    }
}
