package UMC.study.service.MissionService;

import UMC.study.domain.Mission;
import UMC.study.repository.MissionRepository.MissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MissionService {

    private final MissionRepository missionRepository;

    public List<Mission> getChallengingOrCompleteMissions() {
        return missionRepository.findChallengingOrCompleteMissions();
    }


    public List<Mission> getMissionsByRegionAndDeadline(String regionName, int limit, int offset) {
        return missionRepository.findMissionsByRegionAndDeadline(regionName, limit, offset);
    }



}