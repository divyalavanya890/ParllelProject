package com.cg.capstore1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.capstore1.beans.WishlistBean;
@Repository
public interface IWishlistBeanRepo extends JpaRepository<WishlistBean, String> {

}
