package com.file.board.service.impl;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.file.board.service.PhotoBoardService;
import com.file.board.vo.PhotoBoardVO;


@Service
public class PhotoBoardServiceImpl implements PhotoBoardService {

	
	
	@Override
	public int insertPhotoBoard(MultipartFile file, PhotoBoardVO pb) {
		System.out.println(file.getOriginalFilename());
		System.out.println(pb);
		return 0;
	}

}
