package UMC.study.repository.StoreRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import UMC.study.domain.Store;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
}