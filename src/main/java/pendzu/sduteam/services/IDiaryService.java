package pendzu.sduteam.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pendzu.sduteam.models.Diary;

import java.util.List;

public interface IDiaryService extends GenericService<Diary> {
    Diary create(Diary diary);

    Page<Diary> findAll(Pageable pageable);

    Page<Diary> findAllByUserIdAndStatus(Pageable pageable,Long id,int status);

    void changeStatus(Long id);

    Iterable<Diary> findDiariesByUserId(Long user_id);

    Page<Diary> findDiariesByUserIdAndStatusAfter(Pageable pageable, Long user_id, int status);

    Iterable<Diary> findDiariesByTagId(Long tag_id);

    Iterable<Diary> findDiariesByTitleContaining(String title);

    Page<Diary> findAllByOrderByCreatedateAsc(Pageable pageable);

    Page<Diary> findAllByOrderByCreatedateDesc(Pageable pageable);

    Iterable<Diary> findDiariesByTitleContainingAndUserId(String title, Long user_id);

    Iterable<Diary> findDiariesByTagIdAndTitleContaining(Long tag_id, String title);

    Iterable<Diary> findByUrl(String url);

    List<Diary> findAllByTitleContainingAndStatusAfter(String title, int status);
}
