package taidtpc00715.service.Impl;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import taidtpc00715.service.UploadService;
@Service
public class UploadServiceImpl implements UploadService{
	@Autowired
	ServletContext app;

	@Override
	public File save(MultipartFile file, String folder) throws IOException {
		File dir = new ClassPathResource("/static/assets/" + folder).getFile();
		if(!dir.exists()) {
			dir.mkdirs();
		}
		String s = file.getOriginalFilename();
		String name = s;
		try {
			File saveFile = new File(dir, name);
			file.transferTo(saveFile);
			System.out.println(saveFile.getAbsolutePath());
			return saveFile;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
