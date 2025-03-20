package com.dao;

import com.entity.DiscussxuexiziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexiziliaoVO;
import com.entity.view.DiscussxuexiziliaoView;


/**
 * 学习资料评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-18 09:50:21
 */
public interface DiscussxuexiziliaoDao extends BaseMapper<DiscussxuexiziliaoEntity> {
	
	List<DiscussxuexiziliaoVO> selectListVO(@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);
	
	DiscussxuexiziliaoVO selectVO(@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);
	
	List<DiscussxuexiziliaoView> selectListView(@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);

	List<DiscussxuexiziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);
	
	DiscussxuexiziliaoView selectView(@Param("ew") Wrapper<DiscussxuexiziliaoEntity> wrapper);
	

}
