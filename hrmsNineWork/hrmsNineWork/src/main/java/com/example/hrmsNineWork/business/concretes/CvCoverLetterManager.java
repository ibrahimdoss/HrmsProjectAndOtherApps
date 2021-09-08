package com.example.hrmsNineWork.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsNineWork.business.abstracts.CvCoverLetterService;
import com.example.hrmsNineWork.core.utilities.results.DataResult;
import com.example.hrmsNineWork.core.utilities.results.Result;
import com.example.hrmsNineWork.core.utilities.results.SuccessDataResult;
import com.example.hrmsNineWork.core.utilities.results.SuccessResult;
import com.example.hrmsNineWork.dataAccess.abstracts.CvCoverLetterDao;
import com.example.hrmsNineWork.entities.concretes.CvCoverLetter;

@Service
public class CvCoverLetterManager implements CvCoverLetterService{
	
	private CvCoverLetterDao cvCoverLetterDao;
	
	
	   @Autowired
		public CvCoverLetterManager(CvCoverLetterDao cvCoverLetterDao) {
			super();
			this.cvCoverLetterDao = cvCoverLetterDao;
		}

		@Override
		public Result add(CvCoverLetter cvCoverLetter) {
			this.cvCoverLetterDao.save(cvCoverLetter);
			return new SuccessResult("önyazı eklendi");
		}

		@Override
		public Result update(CvCoverLetter cvCoverLetter) {
			this.cvCoverLetterDao.save(cvCoverLetter);
			return new SuccessResult("önyazı güncellendi");
		}

		@Override
		public Result delete(int id) {
			this.cvCoverLetterDao.deleteById(id);
	        return new SuccessResult("önyazı silindi");
		}

		@Override
		public DataResult<CvCoverLetter> getById(int id) {
			
			return new SuccessDataResult<CvCoverLetter>(this.cvCoverLetterDao.getById(id));
		}

		@Override
		public DataResult<List<CvCoverLetter>> getAll() {
			
			return new SuccessDataResult<List<CvCoverLetter>>(this.cvCoverLetterDao.findAll());
		}
}
