package com.file.board.dao;

import org.springframework.web.multipart.MultipartFile;

import com.file.board.vo.PhotoBoardVO;

public interface PhotoBoardDAO {
	int insertPhotoBoard(MultipartFile file,PhotoBoardVO pb);
	}
