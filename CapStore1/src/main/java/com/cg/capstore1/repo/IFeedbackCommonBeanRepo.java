package com.cg.capstore1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.capstore1.beans.FeedbackCommonBean;
@Repository
public interface IFeedbackCommonBeanRepo extends JpaRepository<FeedbackCommonBean, String> {

}
