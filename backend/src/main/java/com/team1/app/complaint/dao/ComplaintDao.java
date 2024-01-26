package com.team1.app.complaint.dao;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.team1.app.complaint.vo.ComplaintImgVo;
import com.team1.app.complaint.vo.ComplaintVo;

@Repository
public class ComplaintDao {

	public List<ComplaintVo> mySumitList(SqlSessionTemplate sst,ComplaintVo vo) {
		return sst.selectList("ComplaintMapper.mySumitList",vo);
	}

	public int complaintSumit(SqlSessionTemplate sst, ComplaintVo vo) {
		return sst.insert("ComplaintMapper.complaintSumit",vo);
	}
	
	public int imgInsertSumit(SqlSessionTemplate sst, List<ComplaintImgVo> imgList) {		
		return sst.insert("ComplaintMapper.imgInsertSumit",imgList);
	}
	
	public List<ComplaintVo> mySumitDetail(SqlSessionTemplate sst, ComplaintVo vo) {
		return sst.selectList("ComplaintMapper.mySumitDetail",vo);
	}

	public List<ComplaintVo> list(SqlSessionTemplate sst) {
		return sst.selectList("ComplaintMapper.adminList");
	}
	
	public List<ComplaintVo> detail(SqlSessionTemplate sst, ComplaintVo vo) {
		return sst.selectList("ComplaintMapper.adminDetail",vo);
	}

	public int clear(SqlSessionTemplate sst, ComplaintVo vo) {
		return sst.update("ComplaintMapper.clear",vo);
	}

	public List<ComplaintVo> select(SqlSessionTemplate sst, ComplaintVo vo) {
		return sst.selectList("ComplaintMapper.adminSelect",vo);
	}
	
	//관리자 메인 페이지 기능
	public List<ComplaintVo> statuseSelect(SqlSessionTemplate sst) {
		return sst.selectList("ComplaintMapper.statuseSelect");
	}
	
}
