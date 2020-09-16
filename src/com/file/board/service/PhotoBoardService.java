package com.file.board.service;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.file.board.vo.PhotoBoardVO;

public interface PhotoBoardService {

	int insertPhotoBoard(MultipartFile file,PhotoBoardVO pb);
}
