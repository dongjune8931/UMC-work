package UMC.study.repository.ReviewRepository;

public interface ReviewRepositoryCustom {
    void saveReview(String title, Float score, Long storeId, Long memberId);
}