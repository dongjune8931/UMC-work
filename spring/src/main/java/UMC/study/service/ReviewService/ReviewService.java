package UMC.study.service.ReviewService;

import UMC.study.repository.ReviewRepository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;


    @Transactional
    public void addReview(String title, Float score, Long storeId, Long memberId) {
        reviewRepository.saveReview(title, score, storeId, memberId);
    }
}