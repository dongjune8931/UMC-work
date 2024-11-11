package UMC.study.repository.ReviewRepository;

import UMC.study.domain.Member;
import UMC.study.domain.Review;
import UMC.study.domain.Store;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepositoryCustom {

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    @Transactional
    public void saveReview(String title, Float score, Long storeId, Long memberId) {
        Store store = entityManager.find(Store.class, storeId);
        Member member = entityManager.find(Member.class, memberId);

        Review review = Review.builder()
                .title(title)
                .score(score)
                .store(store)
                .member(member)
                .build();

        entityManager.persist(review);
    }
}
